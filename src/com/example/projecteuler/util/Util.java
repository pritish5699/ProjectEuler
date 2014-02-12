package com.example.projecteuler.util;

import java.io.BufferedReader;
import java.io.File;
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
	
	public String[] readFile(String path)
	{
		String[] strBuilder =null;
		BufferedReader br = null;
		try {
 
			String sCurrentLine;
			File file = new File(path);
			br = new BufferedReader(new FileReader(path));
			strBuilder = new String[(int) file.length()];
			int i =0;
			while ((sCurrentLine = br.readLine()) != null) {
				//System.out.println(sCurrentLine);
				strBuilder[i] = sCurrentLine;
				i++;
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
