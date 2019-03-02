public class Task1{
	public static void main(String[] args){
		int sun = 0;
		int[] date = new int[]{1,4,,3,4,55,77,6,9,8};
		for(int i = 0; i<date.length;i++){
              for(int j = 0; j<date.length-i;j++){
                 if(date[j]>date[j+1]){
				 int tmp = date[j];
				 date[j] = date[j+1];
				 date[j+1] = date[j];
				 }					 
			  }				 
		}
			
		System.out.print("输出最小值");
		System.out.println(date[0])；
		System.out.print("输出最大值");
		System.out.println(date[date.length-1]);
		for(int i = 0;i<date.legth;i++){
		   sum +=date[i];
		}
		System.out.print("和是");
		System.out.println(sum);
	int  average = sum/(double)date.length
	System.out.println(average);
    }
	public static void star1(){
		int[] intarry = new int[5];
		intarry[1] = 1;
		intarry[2] = 2;
		System.out.println(intarry[1]);
		
		int[] intarry1 = {1,2,3};
		int[] intarry1 = new int[]{1,2,3};
		System.out.println(intarry1[1]);
		for(int i = 0; i <= 255; i++){
           System.out.println(i);		
		}
	}
}

