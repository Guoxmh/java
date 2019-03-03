
public class ArrayUtils{
	
	public static void main(String[] args){
		int[] date = new int[]{1,24,34,45,5,6};
		int ret = arryMaxElement(date);
		System.out.println(ret);
	}
	//1.计算数组中最大指
	public static int arryMaxElement(int[] date){
		java.util.Arrays.sort(date);
		return   date[date.length-1];
	}



}
