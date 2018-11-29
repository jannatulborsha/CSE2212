package main;

import java.util.*;
public class BulgarianSolitaire {
	
	private ArrayList<Integer> piles;
	public BulgarianSolitaire(){
		
		piles = new ArrayList<Integer>();
		int n = 45;
		Random rand = new Random();
		while(n>0) {
			
			int x = 1+Math.abs(rand.nextInt()%(n));
			piles.add(x);
			n = n-x;
		}
	}
	
	public void  play() {
		
		Collections.sort(piles);
		System.out.println(piles);
		while(true) {
			
			int x = piles.size();
			for(int i = 0; i < piles.size();i++) {
				
				if(piles.get(i)==1) {
					
					piles.remove(i);
					i--;
					continue;
				}
				piles.set(i, piles.get(i)-1);
			}
			piles.add(x);
			boolean f = true;
			Collections.sort(piles);
			System.out.println(piles);
			for(int i = 0; i < piles.size();i++) {
				
				if(piles.get(i)!=i+1) {
					
					f = false;
					break;
				}
			}
			if(f)
				break;
		}
	}

}
