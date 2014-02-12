package com.example.projecteuler.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Util {

	
	private static Util instance = null;
	
	private Util()
	{
		
	}
	
	public static Util getInstance()
	{
		if(instance == null)
			instance = new Util();
		return instance;
	}
	
	private StringBuilder readFile(String path)
	{
		StringBuilder strBuilder = new StringBuilder();
		BufferedReader br = null;
		try {
 
			String sCurrentLine;
 
			br = new BufferedReader(new FileReader(path));
 
			while ((sCurrentLine = br.readLine()) != null) {
				//System.out.println(sCurrentLine);
				strBuilder.append(sCurrentLine);
				strBuilder.append("\n");
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return strBuilder;
	}
	
	/*public static void main(String[] args) {
		 
		System.out.println(Util.getInstance().readFile("data/problem13.txt").toString());
 
	}
*/
}
