package Excelread;

import java.io.IOException;

public class Excelmain {

	public static void main(String[] args) throws IOException {
	
		String x= Excelcode.readStringData(0, 0);
		System.out.println(x);
		
		String x1= Excelcode.readStringData(1, 0);
		System.out.println(x1);
		
		
		
	}
}
