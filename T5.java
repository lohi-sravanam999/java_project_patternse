class T3 
{
	public static void main(String[] args) 
	{
		int star=-1,space=4;
		int num=1;
		for(int i=1;i<=5;i++){
		if(i<=3){
			star+=2;
			space--;
			}
			else{
			star-=2;
			space++;
			}
			
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++){
				System.out.print(num);
			}
			num++;
		System.out.println();
		}
	}
}
