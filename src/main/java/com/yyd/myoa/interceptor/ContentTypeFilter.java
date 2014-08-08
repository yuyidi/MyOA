package com.yyd.myoa.interceptor;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

/**
 * 解决IE浏览器下，请求json时提示下载的问题
 * 
 * @author Lenovo
 * 
 */
public class ContentTypeFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request,
			HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		filterChain.doFilter(request, response);
		if(response.getContentType() != null){
				if(response.getContentType().indexOf("application/json")!=-1){
					response.setContentType("text/html");
				}
		}
	}
}
