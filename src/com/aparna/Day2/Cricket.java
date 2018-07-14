package com.aparna.Day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Cricket {
	public static String runs;
	public static String name;
	public static float pavg;

  	
  	static void dispaly()
  	{
  		
  		
  	}
	
	public static void main(String[] args) throws NumberFormatException  {
		
		Cricket C=new Cricket();
		BufferedReader reader= new BufferedReader(new InputStreamReader (System.in));
		name=reader.readLine();
		System.out.println(name);
		BufferedReader reader1= new BufferedReader(new InputStreamReader (System.in));
		runs=reader1.readLine();
		
		int num=3;int a[] = null;
  		StringTokenizer st1 = new StringTokenizer(runs, " ");
  		int i=0;
  			 while (st1.hasMoreTokens()) {
  		String r=st1.nextToken();
  		 a[i]=Integer.parseInt(r);
  		if(r.lastIndexOf('*')>0)
  		{
  			num--;
  		}
  		
  		System.out.println(r);
  	  
  	   i++;
  	}
  		
  		pavg=(a[0]+a[1]+a[3])/num;
		// TODO Auto-generated method stub
  		System.out.println("Player name :"+name+" Average : "+pavg);

	}

}
