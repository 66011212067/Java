class calrender 
{
	public static void main(String[] args) 
	{	
		int number = 31,start=7;
		System.out.println("SUN\tMON\tTUE\tWED\tTHR\tFRI\tSAT");
		for(int i=1;i<start;i++){
			System.out.print("\t");
		}
		//System.out.println(7-start);
		for(int index=0;index<number;index++){
			int date = index+1;
			//System.out.print(date);
			if(date%1==7-(7-start)){
				System.out.print((index+1)+"\n");
			}else{
				System.out.print(index+1+"\t");
			}
			/*if(index+1 <= 5){
				if((index+1)%(7-start)==0){
					System.out.print((index+1)+"\n");
				}else{
					System.out.print((index+1)+"\t");
				}
			}else{
				if((index+1)%7==0){
					System.out.print((index+1)+"\n");
				}else{
					System.out.print((index+1)+"\t");
				}
			}*/
		}
		System.out.print("\n");
	}
}
