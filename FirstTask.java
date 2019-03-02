public class FirstTask{
	public static void main(String[] args){
		long ret = fatorial(6);
		System.out.println(ret);
	
    }
		public static long fatorial(int n){
		  if(n < 1){
            return 1;		  
		  }
		  else{
			  
		   return fatorial(n-1)*n;
		  }
		  
		}
 public static void star1(String[] args){
	 
	for(int i = 0; i <= 255; i++){
          System.out.println((char)i);
	}
}
public static void star2(String[] args){
	for(int i = 1; i<= 9;i++){
		for(int j = 1; j <=i; j++){
			int c= i*j;
		   System.out.print(i+"*"+j+"="+c+"\t" );
		}
		System.out.println();
	  }
	
}
}
