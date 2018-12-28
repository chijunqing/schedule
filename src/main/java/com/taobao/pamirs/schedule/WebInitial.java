package com.taobao.pamirs.schedule;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class WebInitial extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected static transient Logger log = LoggerFactory.getLogger(WebInitial.class);

	public void init() throws ServletException {
		super.init();
		try {
			ConsoleManager.initial();
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}
}
