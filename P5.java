class P5
 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(j==4&&i==1){
		System.out.print("a");
				}
				else if(j==3&&i==2){
		System.out.print("1");
				}
				else if(j==2&&i==3){
		System.out.print("@");
				}
				else if(j==1&&i==4){
		System.out.print("!");
				}
				
				
				else{
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}
}
