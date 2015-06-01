package com.yyd.myoa.tool;


import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.resource.Resource;
import org.eclipse.jetty.webapp.WebAppContext;
import org.eclipse.jetty.xml.XmlConfiguration;

public class XmlJettyServer {
	
	public static void main(String[] args) throws Exception {
		Server server = buildNormalServer(8081, "/myoa");
		server.setAttribute("org.eclipse.jetty.util.URI.charset", "UTF-8");
		server.start();
	}
	/**
	 * 创建用于正常调试的jettyServer 以src/main/webapp为应用程序目录
	 * @param port
	 * @param contextPath
	 * @return
	 * @throws Exception
	 */
	public static Server buildNormalServer(int port,String contextPath) throws Exception{
		Resource resourceXML = Resource.newClassPathResource("jetty.xml");
		XmlConfiguration configuration = new XmlConfiguration(resourceXML.getInputStream());
		WebAppContext webContext = (WebAppContext)configuration.configure();
		Server server = new Server(port);
		server.setHandler(webContext);
		server.setStopAtShutdown(true);
		return server;
	}
}
