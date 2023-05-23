package w2Promineo;

public class BooleanOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1
		int a = 105;
		int b = 101;
	       boolean x = ((a < b) && (b > 100));
	System.out.println("1. " + x);	
//2
	boolean a2 = true;
	boolean b2 = false;
	boolean c2 = false;
    boolean result = (a2 && b2) || (a2 && c2) || (b2 && c2);
	System.out.println("2. " + result);	
		
//3
	int num1 = 14;
	int num2 = 8;
	int num3 = 25;
	int num4 = 11;
    boolean x3 = ((num1 > num2) || (num3 < num4));
	System.out.println("3. " + x3);	
		
//4
    boolean x4 = false || false;
	System.out.println("4. " + x4);	
		
//5
	   boolean z = 1 < 2;
	System.out.println("5. " + !z);	
		
//6
	boolean a6 = true;
	boolean b6 = true;
	boolean c6 = true;
	System.out.println("6. " + ((a6 && b6) || (c6) || (!(b6))));	
		
//7
	int age = 22;
	boolean isStudent = true;
    if ((age < 18) || (isStudent)) {
        System.out.println("7. " + "You get a discount!");
    } else {
        System.out.println("Sorry, no discount for you.");
    }
//8
    int billSum = 1250 + 580 + 350;
    if (2350 > billSum){
        System.out.println("8. " + "You have enough money this week.");
    } else {
        System.out.println("You may need to borrow some money.");
    }
		
//9		
    int assignment1 = 95;
    int assignment2 = 80;
    int assignment3 = 89;
    int assignment4 = 65;
	 if (((assignment1 + assignment2) > 150.0) && ((assignment3 > 70.0) || (assignment4 > 70.0))){
    System.out.println("9. " + "You passed the class.");
} else {
    System.out.println("You failed the class.");
}
//10
    char letter = 'a';
    if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
        System.out.println("10. " + "It's a vowel!");
    } else {
        System.out.println("It's a consonant!");
    }
	}

}
