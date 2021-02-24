package org.wlt;

public class Array {
	
	public static void main(String[] args) {
		
//		String s[] = new String[6];
//		s[0]="Vicky";
//		s[1]="Sam";
//		s[4]="Ban";
//		s[5]="Dan";
//		
//		System.out.println(s[3]);
//		System.out.println(s.length);
//		
//		
//		for (String l : s) {
//			System.out.println(l);
//			
//		}
		
		int a[][]= new int[2][2];
		 a [0][1]=99;
		 a[1][1]=77;
		 
		 
		 for (int i = 0; i < a.length; i++) {
			 
			 for (int j = 0; j < a.length; j++) {
				 System.out.println(a[i][j]);
				
			}
			
		}
		 
		
		
		
		
	}

}
