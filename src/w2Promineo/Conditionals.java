package w2Promineo;

public class Conditionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//1
		int age = 13;
        if (age >= 18){
            System.out.println("You are old enough to vote.");
        } else {
            System.out.println("1. " + "You are not old enough to vote.");
        }
//2
        String randomWord = "exceptionally";
        if (randomWord.length() >= 10){
            System.out.println("2. " + "That is a really long word!");
        } else {
            System.out.println("Your word is not that long.");
        }

//3
        int num1 = 156;
        int myNumber = 125;
        if (num1 < myNumber){
            System.out.println(num1 + " is smaller than my number, " + myNumber);           
        } else if (num1 > myNumber){
            System.out.println("3. " + num1 + " is larger than my number, " + myNumber);           
        } else {
            System.out.println(num1 + " is equal to my number, " + myNumber);
        }
//4
        int sundayTemp = 97;
        int mondayTemp = 95;
        int tuesdayTemp = 93;
        if ((sundayTemp > mondayTemp) && (sundayTemp > tuesdayTemp)){
            System.out.println("4. " + "Sunday" );
        } else if ((sundayTemp < mondayTemp) && (mondayTemp > tuesdayTemp)){
            System.out.println( "Monday" );            
        } else {
            System.out.println( "Tuesday" );
        }
//5
        int personOneAge = 19;
        int personTwoAge = 20;
        int personThreeAge = 21;
		if (personOneAge > personTwoAge && personOneAge > personThreeAge) {
		    System.out.println("Person one is older.");
		} else if (personTwoAge > personOneAge && personTwoAge > personThreeAge) {
		    System.out.println("Person two is older.");
		} else {
		    System.out.println("5. " + "Person three is older.");
		}
//6
		int wins = 7;
		int losses = 3;
		boolean isFall = true;
		if ((wins > losses) && (isFall == true)){
		System.out.println("6. " + "It's looking good for your team to make the playoffs.");		    
		} else if ((wins > losses) && (isFall == false)){
		System.out.println("Your favorite team has promise, but it's too early to tell.");		    
		} else {
		System.out.println("It's not looking too good.");
		}
//7
		int num71 = 5;
		int num72 = 5;
		int num73 = 5;
		int num74 = 5;
        if (num71 >= num72){
            if (num73 >= num74){
                System.out.println("7. " + "both statements are true" );
            }
        }
        System.out.println("   " + "program ended");
//8
        int monthNumber = 4;
        switch (monthNumber) {
        case (1) :
            System.out.println("January");
            break;
        case (2) :
            System.out.println("February");
            break;
        case (3) :
            System.out.println("March");
            break;
        case (4) :
            System.out.println("8. " + "April");
            break;
        case (5) :
            System.out.println("May");
            break;
        case (6) :
            System.out.println("June");
            break;
        case (7) :
            System.out.println("July");
            break;
        case (8) :
            System.out.println("August");
            break;
        case (9) :
            System.out.println("September");
            break;
        case (10) :
            System.out.println("October");
            break;
        case (11) :
            System.out.println("November");
            break;
        case (12) :
            System.out.println("December");
            break;
        default :
            System.out.println("Invalid Month");

    }

//9
        int days = 0;
        String month = "May";
        switch( month.toLowerCase() ) {
        case "january":
        case "march":
        case "may":
        case "july":
        case "august":
        case "october":
        case "december":
            days = 31;
            break;
        case "april":
        case "june":
        case "september":
        case "november":
            days = 30;
            break;
        case "february":
            days = 28;
            break;
    }
        if (days == -1) {
            System.out.println("Invalid month");
        } else {
            System.out.println("9. " + "Has " + days + " days");
        }
//10
        String day = "Saturday";
        switch(day.toLowerCase()) {
        case "monday":
        case "tuesday":
        case "wednesday":
        case "thursday":
        case "friday":
            System.out.println(day + " is a weekday.");
            break;
        case "saturday":
        case "sunday":
            System.out.println("10. " + day + " is a weekend day.");
            break;
        default:
            System.out.println("Invalid day!");
	}

}
	}
