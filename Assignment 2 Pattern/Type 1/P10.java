
class P10{

	public static void main(String args[]){
		
		
		for(char i='E';i>='A';i--)
		{	
			for(char j=i;j>'A';j--)
			{
				System.out.print(" ");
			}
		
			for(char j=i;j<='E';j++)
			{ 
				System.out.print(j+" ");
			}
				System.out.println();
		}
	}
}