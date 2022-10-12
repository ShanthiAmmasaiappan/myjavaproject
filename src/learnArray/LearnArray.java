package learnArray;

public class LearnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numList = {5,8,9,2,7};
		numList[1]=4;
		String[] nameList = {"x","y","w","n","Shanthi","z","i"};
		System.out.println("array output");
		for(int i=0; i<=nameList.length-1;i++) {
			
			System.out.println(nameList[i]);
		}
		System.out.println("Reverse array");
		
		for (int i=nameList.length-1; i>=0; i--) {
			
			System.out.println( nameList[i]);
		}
		
//		int sum = numList[0]+numList[4]+numList[2];
//		System.out.println("Age of "+nameList[4] + " is " +sum);
//		for(int i=0; i<numList.length;i++) {
//			System.out.println(numList.length);
//		}

	}

}
