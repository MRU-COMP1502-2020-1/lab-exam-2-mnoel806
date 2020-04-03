package lsystems;

import java.util.List;
import java.util.Set;

public class LLine {

	
	char line[];
	Set<LRule> rules;
	
	public LLine (char[] start, Set<LRule> rules) {
		this.rules = rules;
		this.line = start;
	}
	
	public void process() throws LSystemSymbolException, LSystemLengthException {
		/**
		 * How the documentation reads:
		 * 
		 * take in char array (Why not ArrayLists?)
		 * take in rulesSet (Something that would've been cool to...)
		 * for each char: if char = rule, getBody, add to nuList?
		 * replace line with nuList
		**/
		
		
		/**
		 * Look, it works. Aside from the exception handling, something else that...,
		 * it passes 5/7 testing
		 * **/
		char workingLine[] = new char[300];
		int i = 0;
		for(char p : line) {
			for(LRule ruled : rules) {
				if (ruled.getMatch() == p) {
					char[] charBody = ruled.getBody();
					for(char j : charBody) {
						workingLine[i] = j;
						i++;
					}
					
				}
				
			}
			
		}
		
		/**
		 * This exists to make an array of the correct length as these
		 * limited arrays can't handle resizing
		 * **/
		
		int g = 0;
		for(int k = 0; k < workingLine.length; k++)
		{
	
			if (workingLine[k] == 0) {
				g++;
			}
		}
		int t = workingLine.length - g;
		char[] returnableLine = new char[t];
		//System.out.println(newbieLine.length);
		returnableLine = workingLine;
		line = returnableLine;
	}
	
	


	private char[] listToArray(List<Character> list) {
		char[] newChars = new char[list.size()];
		for (int i = 0; i < list.size(); i++) {
			newChars[i] = list.get(i);
		}
		return newChars;
	}

	public String toString() {
		
		return new String(line).trim();
	}
	
}
