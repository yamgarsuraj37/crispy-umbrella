package com.p1;

public class ProgramName1 {



		public static void main(String[] args) {
			//object class equals method : doing Reference comparison
			

			//String class overriding equals method : doing content(data)comparison 
			String str1= "omkar";
			String str2= "omkar";

			System.out.println(str1.equals(str2));//true
			System.out.println(str1==str2);       //true

			String s1 = new String("omkar");
			String s2 = new String("omkar");

			System.out.println(s1.equals(s2));//true
			System.out.println(s1==s2);       //false

			//string buffer class can not overriding equals method of object class : it uses object class equals method
			StringBuffer sb1 = new StringBuffer("omkar");
			StringBuffer sb2 = new StringBuffer("omkar");

			System.out.println(sb1.equals(sb2));//false
			System.out.println(sb1==sb2);//false //false

          System.out.println("practice string programs");
		System.out.println("New push from me");
		System.out.println("'Git branch' - to check on which branch you are");
		}

	}


