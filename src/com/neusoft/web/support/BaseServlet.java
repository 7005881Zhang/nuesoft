package com.neusoft.web.support;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.html")
public class BaseServlet extends HttpServlet
{
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String toPath=null;
		try
		{
			/*String  uri=request.getRequestURI();
			String baseName=uri.substring(uri.lastIndexOf("/")+1).replace(".html","");
			String packageName="com.neusoft.web.impl.";
			String controllerName=baseName.substring(0,1).toUpperCase()+baseName.substring(1)+"Servlet";
			BaseController controller=(BaseController)Class.forName(controllerName).newInstance();
			controller.setMapDto(this.createDto(request));
     		toPath=controller.execute();*/
			String  uri=request.getRequestURI();
     		//��ȡ������Դ�����ļ���
     		String baseName=uri.substring(uri.lastIndexOf("/")+1).replace(".html", "");
     		
     		//�������,��������ҵ��������Ļ���������
     		String basePackageName="com.neusoft.web.impl.";
     		//��ȡ��������ǰ׺��
     		String controllerFirstName=baseName.substring(0,1).toUpperCase()+baseName.substring(1);
     		
     		//ʵ����ҵ�������
     		BaseController controller=(BaseController)Class.forName(basePackageName+controllerFirstName+"Servlet").newInstance();
     		
     		//Ϊҵ�������֯��DTO��Ƭ
     		controller.setMapDto(this.createDto(request));
     		
     		//�������̿��Ʒ���
     		toPath=controller.execute();
		}
		catch (Exception e) 
		{
			request.setAttribute("msg", "��ʾ:�������");
		}
		request.getRequestDispatcher("/"+toPath+".jsp").forward(request, response);
	}

	private  Map<String,Object> createDto(HttpServletRequest request)
	{
		//1.��ȡҳ������
		Map<String,String[]> tem=request.getParameterMap();
		int initSize=((int)(tem.size()/0.75))+1;
		//2.�������м�ֵ��,�γɼ�ֵ�Լ���
		Set<Entry<String,String[]>> entrySet=tem.entrySet();
		//3.��������,��ʾEnetry��value����
		String value[]=null;
		
		//4.����DTO����
		Map<String,Object> dto=new HashMap<>(initSize);
		//5.ѭ����ȡentrySet,��ȡÿ����ֵ��
		for(Entry<String,String[]> entry :entrySet)
		{
			//��ȡvalue���ֵ�����
			value=entry.getValue();
			//���ݳ����ж�ҳ��ؼ������
			if(value.length==1)  //��checkbox��ؼ�
			{
		        //���˵�ҳ��δ�����Ŀ
				if(value[0]!=null && !value[0].equals(""))
				{
					dto.put(entry.getKey(), value[0]);
				}
			}
			else     //checkbox��ؼ�
			{
				dto.put(entry.getKey(), value);
			}	
		}
		//System.out.println(dto);
		return dto;
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
