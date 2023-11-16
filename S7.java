class S7 
{
	public static void main(String[] args) 
	{
		int star=0,num=1;
		char ch='a';
		for(int i=1;i<=4;i++){
			star++;
			for(int j=1;j<=star;j++){
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
