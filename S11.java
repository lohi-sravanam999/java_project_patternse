class S11 
{
	public static void main(String[] args) 
	{
		int star=6;
		
		for(int i=1;i<=5;i++){
			star--;
			int num=5;
			char ch='a';
			for(int j=1;j<=star;j++){
			if(i==1||i==3){
			
			System.out.print(num--);
			}
			
			else{
			
			System.out.print(ch++);
			}
		
			}
		System.out.println();
		}
	
	}
}