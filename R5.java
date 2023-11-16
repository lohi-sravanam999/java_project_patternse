class R5 
{
	public static void main(String[] args) 
	{
		
		for(int i=1;i<=5;i++){
		int num=1;
		char ch='a';
			for(int j=1;j<=5;j++){
				if(i==1||i==5){
					System.out.print(num++);
				}
				else if(i==2||i==4){
					System.out.print(ch++);
				}
				else{
					System.out.print("+");
				}
			}
		System.out.println();
		}
	}
}
