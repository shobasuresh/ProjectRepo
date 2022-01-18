package com.fidelity.countrypack;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class CountryMain {
	
	public static void main(String args[])
	
	{
		
		ApplicationContext context=new
				ClassPathXmlApplicationContext("Countries.xml");
		
		Countries myBean = (Countries) context.getBean("Counta");
	
		List<Address>  adds= myBean.getAddressList();
		System.out.println(adds);
		for (Address l:adds)
			System.out.println(l.getCity());
		
		
		System.out.println("Map : "+myBean.getSampleMap());
		System.out.println("Property : "+myBean.getSampleProp());
	     myBean.getSampleSet() ;
	     
	     
		
	}

}


