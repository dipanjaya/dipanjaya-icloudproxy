package com.ittc.utility;

import org.springframework.stereotype.Component;

/* Uility class for identifying the date and time  */

@Component
public class DateFinderUtility {

	public String getFormatTimeDt(String literal){
		StringBuffer buffer=null;
		
		String[] input=literal.split(" ");
		buffer=new StringBuffer();
		
		buffer.append(input[0]).append(" ").append(input[1]).append(input[2]);
		return buffer.toString();
	}
	
}
