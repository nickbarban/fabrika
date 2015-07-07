package exam00;



import org.junit.Assert;
import org.junit.Test;

public class TestSecondMax {

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
	//SecondMax sm = new SecondMax();
	
	@Test
	public void testArray() {
		int[] arr = {1, 2, 3, 4, 5};
		Assert.assertTrue("Array tested", SecondMax.findSecondMaxInt(arr) == 4);
	}
	
	@Test
	public void testArrayWithSomeSameNumbers() {
		int[] arr = {1, 6, 6, 4, 5};
		Assert.assertTrue("Array tested", SecondMax.findSecondMaxInt(arr) == 5);
	}
	
	@Test
	public void testArrayWithAllSameNumbers() {
		int[] arr = {5, 5, 5, 5, 5, 5, 5};
		boolean flag = false;
		String message = "";
		
		try {
			SecondMax.findSecondMaxInt(arr);
		} catch (Exception e) {
			flag = true;
			message = e.getMessage();
		}
		
		Assert.assertTrue(message, flag);
	}
	
	@Test
	public void testArrayWithTwoElements() {
		int[] arr = {8, 15};
		Assert.assertTrue("Array tested", SecondMax.findSecondMaxInt(arr) == 8);
	}
	
	@Test
	public void testArrayWithOneElement() {
		boolean flag = false;
		String message = "";
		int[] arr = {8};
		
		try {
			SecondMax.findSecondMaxInt(arr);
		} catch (Exception e) {
			flag = true;
			message = e.getMessage();
		}
		
		Assert.assertTrue(message, flag);
	}
	
	@Test
	public void testEmptyArray() {
		boolean flag = false;
		String message = "";
		int[] arr = {};
		
		try {
			SecondMax.findSecondMaxInt(arr);
		} catch (Exception e) {
			flag = true;
			message = e.getMessage();
		}
		
		Assert.assertTrue(message, flag);
	}
	
	
	
	
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestSecondMax().testEmptyArray();
	}*/

}
