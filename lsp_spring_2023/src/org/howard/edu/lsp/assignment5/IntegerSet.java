/**
 * Name: Malcolm Gray 
 */
package org.howard.edu.lsp.assignment5;
import java.util.ArrayList;
import java.util.List;

public class IntegerSet {
	private List<Integer> set = new ArrayList<Integer>();
	
	public void clear(){
		set.clear();
	}
	
	public int length(){
		return set.size();
	}
	
	public boolean equals(IntegerSet b) {…}; 
	
	public boolean contains(int value) {…}; 
	
	public int largest() throws IntegerSetException {…}; 
	
	public int smallest() throws IntegerSetException;
	
 	public void add(int item) {…};
 	
 	public void remove(int item) {…}; 
 	
 	public void union(IntegerSet intSetb) {…};
 	
 	public void intersect(IntegerSet intSetb) {…}; 
 	
 	public void diff(IntegerSet intSetb); 
 	
 	boolean isEmpty(); 
 	
 	public String toString() {…};
 	
}

