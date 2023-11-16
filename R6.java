class R6
{
	public static void main(String[] args) 
	{
		int num=1;
		char ch='z';
		for(int i=1;i<=5;i++){
			
			for(int j=1;j<=4;j++){
				if(j==1||j==3){
					System.out.print(num++);
				}
				else{
					System.out.print(ch--);
				}
			}
		System.out.println();
		}
	}
}
