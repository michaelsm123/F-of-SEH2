package classes;

import exceptions.emptyArrayException;

public class combining {

	public combining() {
		
	}
	
	/*Requires - a and b arent null
	 *Effects - sums up the value of b and multiplies the sum by a 
	 *Returns - nothing
	 */
	public static void combine (int[] a, int[] b) throws emptyArrayException {
		
		if ((a.length == 0) || (b.length == 0)) {
			throw new emptyArrayException();
		}
		else{
			int sumB = 0;
			for (int i = 0; i<b.length;i++) {
				sumB+=b[i];
			}
			
			for (int i = 0; i<a.length; i++) {
				a[i] = a[i]*sumB;
			}
		}
	}
}
//This method works well because it checks to see if either a or b are null
//and it throws an exception if this is the case. The function sums up b
//easily and then follows the same style to alter a