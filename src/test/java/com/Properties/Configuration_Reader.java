package com.Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;
public Configuration_Reader() throws Throwable {
	File f = new File("C:\\Users\\PRIYABALA\\eclipse-workspace\\AdactinCucumber\\src\\test\\java\\com\\Properties\\Adactin.properties");
	FileInputStream fis = new FileInputStream(f);
	 p= new Properties();
		p.load(fis);
}	
	
	
private String getUrl() throws Throwable {
	String url = p.getProperty("url");
	return url;
	
}
private String getUsername() throws Throwable {
	File f = new File("C:\\Users\\PRIYABALA\\eclipse-workspace\\AdactinCucumber\\src\\test\\java\\com\\Properties\\Adactin.properties");
	FileInputStream fis = new FileInputStream(f);
	Properties p= new Properties();
		p.load(fis);
		String username = p.getProperty("username");
		return username;
	
}
private String getPassword() throws IOException {
	File f = new File("C:\\Users\\PRIYABALA\\eclipse-workspace\\AdactinCucumber\\src\\test\\java\\com\\Properties\\Adactin.properties");
	FileInputStream fis = new FileInputStream(f);
	Properties p= new Properties();
		p.load(fis);
	String password = p.getProperty("password");
	return password;
}
	
	
	
	
	
}
