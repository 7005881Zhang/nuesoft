package com.neusoft.web.impl;

import com.neusoft.services.StudentServicesImpl;
import com.neusoft.web.support.ControllerSupport;

public class AddStudentServlet extends ControllerSupport
{

	@Override
	public String execute() throws Exception 
	{
		StudentServicesImpl services=new StudentServicesImpl();
		
		String msg=services.addStudent()?"��ӳɹ�!":"���ʧ��!";
		this.saveAttribute("msg", msg);
		
		return "test";
	}
}
