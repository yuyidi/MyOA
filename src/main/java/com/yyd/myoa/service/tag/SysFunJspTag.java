package com.yyd.myoa.service.tag;

import java.io.IOException;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import com.yyd.myoa.dto.Menu;
import com.yyd.myoa.model.SysFun;

public class SysFunJspTag extends TagSupport{
	private List<Menu> sysfun;
	@Override
	public int doStartTag() throws JspException {
		JspWriter out = this.pageContext.getOut();
		try {
	        if(sysfun == null) {
				out.println("No Menu Found...");
			    return SKIP_BODY;
	        }
	        for (int i=0;i<sysfun.size();i++) {
	        	Menu menu = sysfun.get(i);
	        	if(i==0){
	        		out.println("<li class='start active open'>");
	        	}else{
	        		out.println("<li class='start open'>");
	        	}
	        	out.print("<a href='javascript:;'>");
	        	out.println("<i class='"+menu.getIcon()+"'></i>");
	        	out.println("<span class='title'>"+menu.getDisplayName()+"</span>");
	        	out.println("<span class='arrow'></span>");
	        	out.println("</a>");
	        	out.println("<ul class='sub-menu'>");
	        	for (int j=0;j<menu.getChilds().size();j++) {
	        		SysFun child = menu.getChilds().get(j);
					if(j==0){
						out.println("<li class='active'>");
					}else{
						out.println("<li class=''>");
					}
					out.println("<a href='"+child.getNodeUrl()+"'>");
					out.println("<i class='"+child.getIcon()+"'></i>"+child.getDisplayName()+"</a>");
					out.println("</li>");
				}
	        	out.println("</ul>");
	        	out.println("</li>");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}
	
	@Override
	public int doEndTag() throws JspException {
		return EVAL_PAGE;
	}
	
	public void release() {
        super.release();
        this.sysfun = null;
    }

	public List<Menu> getSysfun() {
		return sysfun;
	}

	public void setSysfun(List<Menu> sysfun) {
		this.sysfun = sysfun;
	}
	
}
