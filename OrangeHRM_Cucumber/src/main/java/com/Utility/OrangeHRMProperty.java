package com.Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class OrangeHRMProperty {
	public static Properties loadproperty() throws IOException {
		FileInputStream OHRmApplicationPropertiesfile=new FileInputStream("C:\\Users\\rajua\\Desktop\\eclipse-workspace\\ajay\\ApplicationOrangeHrm\\src\\main\\java\\com\\Config\\orangeHRMApplication.properties");
		Properties properties=new Properties();
		properties.load(OHRmApplicationPropertiesfile);
		return properties;


}}
