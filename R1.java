class R1 
{
	public static void main(String[] args) 
	{
		char ch='A';
			int num=1;
	
		for(int i=1;i<=4;i++){
			
			for(int j=1;j<=4;j++){
			if(j==1||j==3){
				System.out.print(ch++);
				}
				else{
				System.out.print(num++);
				}
			}

		System.out.println();
		}
	}
}