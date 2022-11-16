
public class practiceJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 5;
		int max = 15;
		int range = max - min + 1;
		for(int i=0; i<10; i++)
			System.out.println( (int)(Math.random() * range) + min); 
	}

}
