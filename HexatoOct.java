package com.pack1;

public class HexatoOct {

	public static void main(String[] args) {
		String hex = "2b2ef";
		Integer i = Integer.valueOf(hex,16);
		System.out.println(Integer.toOctalString(i));
		
	}

}
