package exam00;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SecondMax {
	
	public static int findSecondMaxInt(int[] arr) {
		boolean allElemetstAreTheSame = false;
		int secondMax = 0;
		
		if (arr.length > 1){
			for (int i = 0; i < arr.length; i++) {
				for (int j = i+1; j < arr.length; j++) {
					if (arr[j] > arr[i]) {
						int tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
						allElemetstAreTheSame = false;
					} else if (arr[j] == arr[i]){
						allElemetstAreTheSame = true;
					}
				} // for j
			} // for i
			
			if (allElemetstAreTheSame) {
				throw new IllegalArgumentException("all elements of array are the same");
			}
			
			for (int k = 0; k < arr.length - 1; k++) {
				if (arr[k] != arr[k + 1]) {
					secondMax = arr[k + 1];
					break;
				}
			} // for k
			
		} else {			
			if (arr.length == 0) {
				throw new IllegalArgumentException("array has no element");	
			} else {
				throw new IllegalArgumentException("array has only one element");
			}
		}
		
		return secondMax;		
	} // findSecondMaxInt
	
	
	
}
