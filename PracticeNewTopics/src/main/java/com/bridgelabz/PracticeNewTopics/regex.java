package com.bridgelabz.PracticeNewTopics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("^abc.[a-z]{0,5}@bl.co.(in)?");
        Matcher m = p.matcher("abc.xyz@bl.co.in");
    
        if(m.matches()){
            System.out.println("it will matches ");
        }
        else{
            System.out.println("It cannot be matches");
        }
	}

}
