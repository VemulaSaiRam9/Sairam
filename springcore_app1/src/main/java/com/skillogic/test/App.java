package com.skillogic.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.skillogic.beans.Employee;


public class App 
{
    public static void main( String[] args )
    {
    	FileSystemResource resource = new FileSystemResource("src/main/java/com/skillogic/resources/applicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		Employee e = (Employee) factory.getBean("emp");
		e.displayEmployee();
    }
}
