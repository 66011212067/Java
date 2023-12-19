class w5_work_1
{
	public static void main(String[] args) 
	{
		int x=10,i=0;
		for (i=1;i<=x;i++){
			if(i==x){
				System.out.print("="+i+"\n");
			}else{
				if(i!=x-1){
					System.out.print(i+"+");
				}else{
					System.out.print(i);
				}
			}
		}
		//System.out.println(i);
	}
}
