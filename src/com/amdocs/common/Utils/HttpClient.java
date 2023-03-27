package com.amdocs.common.Utils;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class HttpClient {
	
		
	Map<String,List<String>> map;
	static String serverHttpUrl = "http://mramitb.virtual.vps-host.net:8080";
	
	
	
	public HttpClient ()
	{		
		
		
	}
	
	public InputStream sendHttpReq(String req, Object[] objects)
	{	
		
			List<Object> objArr = new ArrayList<Object>();
			
			
			if(objects != null)
				for(int i=0; i < objects.length; i++)
				{
					objArr.add(URLEncoder.encode(objects[i].toString()));
				}
			objects = objArr.toArray();
				
		 return getHttpData(serverHttpUrl+MessageFormat.format(req, objects));
	}
	
	public InputStream getHttpData(String str)
	{
		InputStream is = null;
		String tmp = "";
		try {
			URL url = new URL(str);
			URLConnection conn = url.openConnection();
			conn.setConnectTimeout(5000);
			is = conn.getInputStream();
		} catch (Exception e) {
			e.printStackTrace();	
		}
		
	
		return is;		
	}
	
   
   
}

