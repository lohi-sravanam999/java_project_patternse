class Q9 
{
	public static void main(String[] args) 
	{
	
		for(int i=1;i<=4;i++){
			char ch='a';
			int num=1;
			for(int j=1;j<=4;j++){
			if(i==1||i==3){
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