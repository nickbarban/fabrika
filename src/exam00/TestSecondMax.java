package exam00;



import org.junit.Assert;
import org.junit.Test;

public class TestSecondMax {

	
	
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
	
	

}
