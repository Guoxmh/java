public class Car{
	private  String brand;
	private  boolean  autoType;
	public String getbrand(){
		return this.brand;
	}
	public Car(String brand){//为什么不定义返回类型  为什么要用Car 不用gewxxxx  先定义get 再定义set是因为栈的原因吗
		this.brand = brand;
	}
	public boolean  isautoType(){
		return this.autoType;
	}
	public void setAutoType(boolean  autoType){
		this.autoType = autoType;
	}
	
	 public  void drive(){
		 System.out.println("喝酒不开车");
		 if(this.isautoType()){
			 System.out.println("自动挡");
		 }
		 else{
			 System.out.println("手动挡");
		 }
	 }
	public  void get(){
		System.out.println("牌子  "+brand);
	}


public static void main(String[] args){
   Car bc = new Car("asdas");
   //bc.brand = "qqwedqw";
   bc.setAutoType(true);
   bc.drive();
   bc.get(); 
   
   
}
}