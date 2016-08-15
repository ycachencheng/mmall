package com.mmall.own;

import java.util.Calendar;

import org.springframework.stereotype.Component;

@Component
public class Tools {
	
	public String getTime(){
		Calendar cal=Calendar.getInstance();
		return String.valueOf(cal.get(Calendar.MILLISECOND));
	}
}
