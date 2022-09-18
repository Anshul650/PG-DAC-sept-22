
class P6{

	public static void main(String args[]){
	
		for(int i=1;i<=9;i++)
		{
			for(int j=i;j>1;j--)
			{
				System.out.print(" ");
			}
			
			for(int j=i;j<=9;j++)
			{
				System.out.print(" *");
			}
				System.out.println();
		}
	}
}