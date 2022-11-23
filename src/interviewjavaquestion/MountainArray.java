/* Write a program to find if an array is moutain array or not?*/
package interviewjavaquestion;

public class MountainArray {
	
	static boolean isMountainArray(int[]array) {
		if(array.length < 3){
			return false;
		}
		int i = 0;
	    for (i = 1; i < array.length; i++)
	        if (array[i] <= array[i - 1])
	            break;
	 
	    if (i == array.length || i == 1)
	        return false;
	 
	    for (; i < array.length; i++)
	        if (array[i] >= array[i - 1])
	            break;
	    return i == array.length;
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]array = { 1, 2, 3, 4, 9,
	            8, 7, 6, 5 };
		
		System.out.println(isMountainArray(array));
		
	}

}
