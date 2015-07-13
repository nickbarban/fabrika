package exam00;

public final class SecondMax {
	
	public static int findSecondMaxInt(int[] arr) {
		int allElemetstAreTheSame = 1;
		int firstMax = arr[0];
		int secondMax = 0;
		
		if (arr.length > 1){
			secondMax = arr[1];			
			for (int i = 1; i < arr.length; i++) {				
				if (firstMax == arr[i]) {
					allElemetstAreTheSame *= 1;
				} else if (firstMax < arr[i]) {
					allElemetstAreTheSame *= 0;
					secondMax = firstMax;
					firstMax = arr[i];
					//System.out.println("swapped first and arr[" + i + "]");
				} else {
					if (secondMax < arr[i]) {
						secondMax = arr[i];
						//System.out.println("swapped second and arr[" + i + "]");
					}
					allElemetstAreTheSame *= 0;
				}
				//System.out.println(firstMax + "||" + secondMax + "||" + allElemetstAreTheSame);
				
			} // for i
			
			if (allElemetstAreTheSame == 1) {
				throw new IllegalArgumentException("all elements of array are the same");
			}
			
			
			
			
		} else {			
			if (arr.length == 0) {
				throw new IllegalArgumentException("array has no element");	
			} else {
				throw new IllegalArgumentException("array has only one element");
		}
		
		}
		
		return secondMax;		
	} // findSecondMaxInt

	/*public static void main(String[] args) {
		System.out.println(findSecondMaxInt(new int[]{8,8,15,15,9,8,10,1,50,65}));
	}*/
	
	
	
}
