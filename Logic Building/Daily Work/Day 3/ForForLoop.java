class ForForLoop{
	public static void main(String args[]){
		/*
		for(int i=0; i<5; i++){
				for(int j=0; j<5; j++){
					System.out.println("Inner Loop");
				}
			System.out.println("Outer Loop");
		}
		*/
		
		/*
		for(int i=0; i<5; i++){
				for(int j=0; j<5; j++){
					System.out.print("*");
				}
			System.out.println("+");
		}
		*/
		
		/*
		for(int i=0; i<5; i++){
				for(int j=0; j<i; j++){
					System.out.print("* ");
				}
			System.out.println(" ");
		}
		*/
		
		/*
		int count = 0;
		
		for(int i=0; i<5; i++){
				for(int j=0; j<=i; j++){
					System.out.print(++count+ " ");
				}
			System.out.println(" ");
		}
		*/
		
		
		int count = 64;
		for(int i=0; i<5; i++){
				for(int j=0; j<=i; j++){
					System.out.print((char)++count+ " ");
				}
			System.out.println(" ");
		}
	}
}