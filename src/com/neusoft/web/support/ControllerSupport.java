package com.neusoft.web.support;

import java.util.Map;

public abstract class ControllerSupport implements BaseController {

	protected Map<String, Object> dto=null;
	
	@Override
	public void setMapDto(Map<String, Object> dto) 
	{
		this.dto=dto;
	}

}
