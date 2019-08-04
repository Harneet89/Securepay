package com.automation.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {
	 public Properties getProperty() throws IOException
	  {
		  Properties properties = new Properties();
		  try{
			  properties.load(new FileInputStream("resource/browser-config.properties"));
		  }
		  catch(Exception e) {
			  System.out.println("Exception"+ e);
		  }
		  return properties;
	  }
}
