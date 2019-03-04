import java.util.Arrays;

public class ArrayUtils{
	
	public static void main(String[] args){
		int[] date = new int[]{1,24,34,45,5,6};
		int[] dest = new int[]{77,44,44,5,5};
		System.out.print("原数组date是 ");
		 printArray(date);
		 System.out.print("目标数组dest是 ");
		 printArray(dest);
		 arryMaxElement(date);
		 arrayMinElement(date);
		 arrayElementSum(date);
		 arrayJoin(date, dest);
		  System.out.print("start = 2 ;  end = 5  输出是  ");
		 arraySub( date, 2 , 5);
		  System.out.print("反转原数组后 ");
		 printReversal(date);
		 
		
	}
	//1.计算数组中最大指
	public static int arryMaxElement(int[] date){
		int[] tmpArray = new int[date.length];

		System.arraycopy(date,0,tmpArray,0,date.length);
		java.util.Arrays.sort(tmpArray);
		System.out.print("原数组最大值是");
		System.out.println(tmpArray[tmpArray.length-1]);
		return -1;
	}
    //2.计算数组中最小值
    public static int arrayMinElement(int[] date){
		int[] tmpArray = new int[date.length];
		System.arraycopy(date,0,tmpArray,0,date.length);
       java.util.Arrays.sort(tmpArray);
		System.out.print("原数组最小值是");
		System.out.println(tmpArray[0]);
		return -1;
    }
    //3.计算数组值之和
    public static int arrayElementSum(int[] date){
		int sum = 0;
        for(int i = 0; i < date.length;i++){
			sum += date[i];
		}
		System.out.print("原数组和是");
		System.out.println(sum);
			
        return -1;
    }
    //4.数组拼接
    public static int[] arrayJoin(int[] a, int[] b){
		
	 int[] tmpArray = new int[a.length];
		System.arraycopy(a,0,tmpArray,0,a.length);
	   tmpArray = Arrays.copyOf(tmpArray,(tmpArray.length+b.length));
       System.arraycopy(b,0,tmpArray,a.length,b.length);
	   System.out.print("两数组拼接后");
	   printArray(tmpArray);
        return null;
    }
	
    //[start, end)5.数组截取
    public static int[] arraySub(int[] date, int start , int end){
       int[] tmpArray = new int[end-start];
	   int j = 0;
		/*for(int i = start; i < end;i++){
			tmpArray[j] = date[i];
			j++;
		}*/
		System.arraycopy(date,start,tmpArray,0,end-start);
		printArray(tmpArray);
        return null;
    }
	
	//数组打印
	public static void printArray(int[] temp) {
		for (int i = 0 ; i<temp.length; i++) {
			System.out.print(temp[i]+" ");
			}
	System.out.println();
	}
	//7.数组反转
    // 比如：[1,2,3,4] => [4,3,2,1]
    public static void printReversal(int[] date){
		int[] tmpArray = new int[date.length];
		for(int i = 0; i < date.length;i++){
			tmpArray[date.length-i-1] = date[i];
		}
		 printArray(tmpArray);
		
    }

}
