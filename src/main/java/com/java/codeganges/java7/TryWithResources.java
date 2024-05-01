package com.java.codeganges.java7;

import java.io.FileInputStream;

public class TryWithResources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try( FileInputStream fin = new FileInputStream("java7.txt")){
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
			
		

	}

}
