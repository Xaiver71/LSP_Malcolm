package org.howard.edu.lsp.midterm.problem51;

public class IntegerRange implements Range {
	private int lower;
	private int upper;
	
	public IntegerRange(int lower, int upper) {
		this.lower=lower;
		this.upper=upper;
	}
	
	public int recievelower() {
		return lower;
	}
	
	public int recieveupper() {
		return upper;
	}
	
	public boolean contains(int value) {
		return value >= lower && value <= upper;
	}
	
	public boolean overlaps() {  
	}
	
	public int size() {
		return upper-lower+1;
	}
}
