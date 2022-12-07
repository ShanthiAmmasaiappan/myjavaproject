
public class SubStringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String rajbirName = "Just Rajbir Kaur is 35 years old";
		
		
		//Get a sequence of a string after the index
		String rajbirNameUpdated = rajbirName.substring(5);
		System.out.println(rajbirNameUpdated);
		
		int indexOfRajbirAge = rajbirName.indexOf("35");
		
		//Use Substring with Index
		System.out.println(indexOfRajbirAge);
		System.out.println(rajbirName.substring(rajbirName.indexOf("35")));
		
		//Write your first and Last name and replace Last name with *
		//Print first name
		//Find length of your name
		//Just print your first name
		//Replace all e with another character in your name
		
		String aname = "Jasmeet Kaur";
		
		//replace a with e
		
		String amanFirstName = aname.substring(0, aname.indexOf(" "));
		System.out.println(amanFirstName);
		String lastName = aname.substring(aname.indexOf(" ")+1);
		System.out.println(lastName);

	}

}
