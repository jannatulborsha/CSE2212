package main;

import java.util.Scanner;

public class ticketseller {
	
		public static void main(String[] args) {
			int total=100,ans=0,m;
			Scanner in =new Scanner(System.in);
			while(total>=0) {
				System.out.println("Enter the Number of Tickets:");
				m= in.nextInt();
				if(m>4 && m<total) {
					System.out.println("Invalid Number of Tickets:");
				}
				else total=total-m;
			}
			System.out.println(ans);
			in.close();
		}
	}



