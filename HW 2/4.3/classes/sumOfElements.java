package classes;

import exceptions.emptyArrayException;

public class sumOfElements {

	public sumOfElements() {
		
	}
	
	/*Requires - empty array
	 * Effects - Reads through the values in the array and 
	 * sums up its value
	 * Returns - the sum of the integers in the array
	 */
	public int sum(int[] x) throws emptyArrayException{
		
		if (x.length == 0) {
			throw new emptyArrayException();
		}
		else{
			int sum = 0;
			for (int i = 0; i<x.length;i++) {
				sum+=x[i];
			}
			return sum;
		}
	}
}

//Throwing an exceptions is better because an array could not be empty but also
//have a sum of zero