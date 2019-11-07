package ui;

public class FirstLast6ArraysApp {

	public static void main(String[] args) {

		int nums[] = new int[3];

		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 6;

		System.out.println(firstLast6(nums));
		
		int numsOne[] = new int[4];

		numsOne[0] = 6;
		numsOne[1] = 1;
		numsOne[2] = 2;
		numsOne[2] = 3;

		System.out.println(firstLast6(numsOne));
		
		int numsTwo[] = new int []{13, 6, 1, 2, 3};

		System.out.println(firstLast6(numsTwo));
	}
	
	public static boolean firstLast6(int[] nums) {
		int last = (nums.length) - 1;
		if (nums[0] == 6 || nums[last] == 6) {
			return true;
		} else {
			return false;
		}

	}
}

// DIRECTIONS
//	Given an array of ints, return true if 6 appears as either the first or last
//	element in the array. The array will be length 1 or more.
//	firstLast6([1, 2, 6]) - true
//	firstLast6([6, 1, 2, 3]) - true
//	firstLast6([13, 6, 1, 2, 3]) - false
//	public boolean firstLast6(int[] nums) 
//	{
//	
//	}