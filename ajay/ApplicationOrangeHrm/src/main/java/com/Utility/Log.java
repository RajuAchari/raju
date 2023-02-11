package com.Utility;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;

import com.google.j2objc.annotations.Property;

public class Log {
	public static Logger Log=Logger.getLogger("Log");
	public static void info(String messege)
	{
		PropertyConfigurator.configure("Log4j.Properties");
		Log.info(messege);
	}

}
