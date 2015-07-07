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
			
			//System.out.println(Arrays.toString(arr));
			
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
	
	
	/*public static int findSecondMaxIntVar2(int[] arr) {
		int secondMax = arr[0];
		if (arr.length > 1){
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
			for (int k = 0; k < arr.length - 1; k++) {
				if (arr[k] != arr[k + 1]) {
					secondMax = arr[k + 1];
					break;
				}
			} // for i
		} else secondMax = -1;
		return secondMax;		
	} // findSecondMaxIntVar1
	
	public static int findSecondMaxIntVar3(Integer[] arr) {
		int secondMax = arr[0];
		if (arr.length > 1){
			Set<Integer> treeSet = new TreeSet<>(Arrays.asList(arr));
		} else secondMax = -1;
		return secondMax;		
	} // findSecondMaxIntVar1
*/	
	
	
	

	/*public static void main(String[] args) {
		System.out.println(findSecondMaxIntVar1(new int[] {1, 2, 3, 4, 5}));
		System.out.println(findSecondMaxIntVar1(new int[] {1, 6, 6, 4, 5}));
		System.out.println(findSecondMaxIntVar1(new int[] {-1, 6, -6, 4, 5}));
		System.out.println(findSecondMaxIntVar1(new int[] {Integer.MIN_VALUE, 6, -6, Integer.MAX_VALUE, 5}));
		System.out.println(findSecondMaxIntVar1(new int[] {5, 5, 5, 5, 5, 5, 5}));
		System.out.println(findSecondMaxIntVar1(new int[] {5, 8}));
		System.out.println(findSecondMaxIntVar1(new int[] {5}));
		System.out.println(findSecondMaxIntVar1(new int[] {}));

	} // main
*/
}
