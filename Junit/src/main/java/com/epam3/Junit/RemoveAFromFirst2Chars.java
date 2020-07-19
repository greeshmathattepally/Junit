package com.epam3.Junit;

public class RemoveAFromFirst2Chars {

	public String remove(String string) {
		int length=string.length();
		String result="";
		if(length>0 && string.charAt(0)!='A') result+=string.charAt(0);
		if(length>1)
		{
			if(string.charAt(1)!='A') result+=string.charAt(1);
		}
		if(length>2)
		{
			for(int i=2;i<length;i++) result+=string.charAt(i);
		}
		return result;
	}
     
}
