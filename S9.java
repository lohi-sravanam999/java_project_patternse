class S9 
{
	public static void main(String[] args) 
	{
		int star=0,num=1;
		char ch='a';
		for(int i=1;i<=4;i++){
			star++;
			for(int j=1;j<=star;j++){
			if(j==1||j==3){
			System.out.print(num++);
			}
			else{
			System.out.print(ch++);
			}
		}
	
		System.out.println();
		}
	
	}
}