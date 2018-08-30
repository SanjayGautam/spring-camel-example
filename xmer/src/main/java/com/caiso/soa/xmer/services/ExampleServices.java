package com.caiso.soa.xmer.services;

import com.caiso.soa.xmer.domain.MyBean;

public class ExampleServices {

	  public static void example(MyBean bodyIn) {
	        bodyIn.setName( "Hello, " + bodyIn.getName() );
	        bodyIn.setId(bodyIn.getId()*10);
	    }
	  
}
