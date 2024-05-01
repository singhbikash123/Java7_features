package com.java.codeganges.java7;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MultiCatchException {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
      try{
    	  throw new FileNotFoundException("FileNotFoundException");
      }catch (FileNotFoundException | NullPointerException fnfo) {
    	  
          fnfo.printStackTrace();

    	
      }
	}

}
