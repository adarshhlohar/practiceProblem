package com.bridgelabz.PracticeNewTopics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexMobileNoEaxample {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("^91 [789][0-9]{9}$");
        Matcher m = p.matcher("91 9746535352");
    
        if(m.matches()){
            System.out.println("Its valid");
        }
        else{
            System.out.println("It Invalid Mobile no");
        }

	}

}
