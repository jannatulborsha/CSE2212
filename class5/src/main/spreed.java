package main;

import java.util.Scanner;



public class spreed {
		public static void main(String[] args) {
			double T,ans=0,m;
			System.out.println("Enter the Mass:");
			Scanner in =new Scanner(System.in);
			m= in.nextDouble();
			int[] ara=new int[]{1,10,20,40};
			for(int i=0;i<4;i++) {
				T=m*ara[i]*ara[i];
				T=T/3.0;
				if(T>60) break;
				ans=T;
			}
			System.out.println(ans);
			in.close();
		}
	}


