package week2day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintUnique {
	
	public void ch(String s) {
		char[] charArray = s.toCharArray();
		
		List<Character> v=new ArrayList<Character>();
		for (Character character : charArray) {
			v.add(character);
		}
			
		Set<Character> s1=new LinkedHashSet<Character>();
		for (Character character : v) {
			s1.add(character);
		}
		
		for (Character character : s1) {
			System.out.print(character);
		}

	}
	public void m2(String s) {
		char[] charArray = s.toCharArray();					
		Set<Character> s1=new LinkedHashSet<Character>();
		Set<Character> s2=new LinkedHashSet<Character>();

		for (Character character : charArray) {
			boolean add = s1.add(character);
			if(!add) {
				s2.add(character);
			}
			}
					
		for (Character character : s1) {
			System.out.print(character);
		}
		System.out.println();

		for (Character character : s2) {
			System.out.print(character);
		}
		
		
	}
		
		
	public static void main(String[] args) {
	
		
		String s1="google";
		PrintUnique unique=new PrintUnique();
		unique.ch(s1);
		System.out.println();
		unique.m2(s1);

	
		
		}
		
		
		
		
	
}
