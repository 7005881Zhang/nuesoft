package com.neusoft.web.support;

import java.util.Map;

public interface BaseController 
{
	String execute()throws Exception;
	void setMapDto(Map<String,Object> dto);
}
