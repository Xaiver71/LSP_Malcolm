/**
 * Name: Malcolm Gray 
 */
package org.howard.edu.lsp.assignment5;

public class IntegerSet {
	private List<Integer> set = new ArrayList<Integer>();
	
	public void clear() {…};
	
	public int length() {…};
	
	public boolean equals(IntegerSet b) {…}; 
	
	public boolean contains(int value) {…}; 
	
	public int largest() throws IntegerSetException {…}; 
	
	public int smallest() throws IntegerSetException;
	
 	public void add(int item) {…};
 	
 	public void union(IntegerSet intSetb) {…};
}
