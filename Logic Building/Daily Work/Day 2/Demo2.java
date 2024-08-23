class Demo2{
	public static void main(String args[]){
		
		System.out.println("..............Statements.............");
		System.out.println("..............if else.............");
		int age = 18;
		if(age>=18){
			System.out.println("Eligible for Voting");
		}
		else{
			System.out.println("Not Eligible for Voting");
		}
		
		
		System.out.println("..............nested if else.............");
		int marks = 90;
		if(marks>=90){
			System.out.println("Grade A+");
		}
		else if(marks>=80){
			System.out.println("Grade A");
		}
		else if(marks>=70){
			System.out.println("Grade B");
		}
		else if(marks>=60){
			System.out.println("Grade C");
		}
		else{
			System.out.println("Grade D");
		}
		
		System.out.println("..............switch.............");
		int day = 9;
		
		switch(day){
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Invalid Day");
				break;

		}
	
	
	}
}