
public class ComparisonOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Equal to == ('=' is assignment operator, '==' is comparison operator)
		int num1 = 10;
		int num2 = 20;
		
		boolean isNum1EqualtoNum2 = num1 == num2;
		System.out.println("is num1 & num2 are equal: "+isNum1EqualtoNum2);
		
		//Greater than 
		
		int age = 24;
		//either way can be used 
		
		/*boolean canPeoplePlayCasino = age>18;
		System.out.println("People can play casino: "+canPeoplePlayCasino);*/
		
		System.out.println("People can play casino: "+(age>18));
		
		//less than
		
		System.out.println("People can play casino: "+(age<18));  //Any concatenation with the string will
		//only happen with the resultant of any operation 
		
		// >=, <= in any comparison operator the result is 'true' or 'false' 
		
		System.out.println(35>=35);// output is true
		
		// Not equal to '!='
		
		boolean isNum1NotEqualNum2 = num2 != num1;// true
		System.out.println("is num1 & num2 are equal: "+isNum1NotEqualNum2);
		System.out.println(!isNum1NotEqualNum2); //false
		
		// in situation where instead of appending the value we can add ! to the value. eg. !true
		// when consuming the values the variables are not updated in the sout and 
		//when the variable is updated it is applied to the rest of the program.
		
		boolean isLearningJava = !true;
		isLearningJava = !false;
		System.out.println(!isLearningJava);// false
		System.out.println(isNum1NotEqualNum2 == isLearningJava); //true
		
		

	}

}
