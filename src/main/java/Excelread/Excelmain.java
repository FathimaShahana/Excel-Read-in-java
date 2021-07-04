package Excelread;

import java.io.IOException;

public class Excelmain {

	public static void main(String[] args) throws IOException {
	
		String x= Excelcode.readStringData(0, 0);
		System.out.println(x);
		
		String x1= Excelcode.readStringData(1, 0);
		System.out.println(x1);
		
		
		String y=Excelcode.readIntegerData(1, 1);
		System.out.println(y);
		
		String y1=Excelcode.readIntegerData(0, 1);
		System.out.println(y1);
	
		
	}
}
