package com.neusoft.web.impl;

import com.neusoft.web.support.ControllerSupport;

public class AddStudentServlet extends ControllerSupport
{
	@Override
	public String execute() throws Exception 
	{
		System.out.println("添加学生信息"+this.dto);
		return "test";
	}
}
