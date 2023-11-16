class R4 
{
	public static void main(String[] args) 
	{
		int num=1;
		char ch='a';
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(j==1||j==5||j==3){
					System.out.print(ch++);
				}
				else if(i==5&&j==3){
					System.out.print("+");
				}
				else {
					System.out.print(num++);
				}
			}
		System.out.println();
		}
	}
}
