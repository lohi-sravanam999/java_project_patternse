class R3 
{
	public static void main(String[] args) 
	{
		int num=1;
		char ch='a';
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(j==1||j==5){
					System.out.print(ch++);
				}
				else if(j==2||j==4){
					System.out.print(num++);
				}
				else{
					System.out.print("+");
				}
			}
		System.out.println();
		}
	}
}
