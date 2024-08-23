class DoWhileLoop{
	public static void main(String args[]){
	/*
	int i=0;
	do{
		System.out.println("Do-While Loop");
		i++;
	}while(i<5);
	*/
	
	int i=10;
	do{
		System.out.println("Do-While Loop");
		i--;
	}while(i>0);
		
	for(int j=0; j<5; j++)	{
		if(j==2){
			j++;
			continue;
		}
		System.out.println(j);

	}
	}
}