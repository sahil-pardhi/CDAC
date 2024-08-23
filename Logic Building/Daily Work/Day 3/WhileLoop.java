class WhileLoop{
	public static void main(String args[]){
		/*
		--------------unreachable error--------------
		while(false){
			System.out.println("While Loop");
		}
		*/
		
		/*
		-------------No Error / not print the output
		boolean b = false;
		while(b){
			System.out.println("While Loop");
		}
		*/
		
		/*
		int i=0;
		while(i<5){
			System.out.println("While Loop");
			i++;
		}
		*/
		
		boolean b = true;
		while(b){
			System.out.println("While Loop");
			b=false;
		}
		
		
	}
}