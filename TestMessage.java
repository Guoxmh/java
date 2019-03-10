public class TestMessage{
		public static void main(String[]  args){
		Message p ;
			
     if(args.length == 1){
             p = new ChinaMessage("jack","经理");
        }else{
            p =  new Message("jack","经理");
        }
	
		//message.setName("jack");
		//message.setPost("dasda31231");
	p.setSex(true);
		p.setAge(100);
		p.setTel(17723105);
		p.setAddress("dsadasdasd"); 
		p.myPrint();
		System.out.println();
		//message.myPrint1();
		
	}
}

 class  Message{
	private  String name;
	private   String post;
	private  boolean  sex;
	private  int  age;
	private  long tel;
	private  String address;
	//1
	public   Message(String name ,String post){
		this.name = name;
		this.post = post;
	}
	public  String getName(){
		return this.name;
	}
	
	//2
	public  String getPost(){
		return this.post;
	}
	
	//3
	public boolean getSex(){
		return this.sex;
	}
	public void setSex(boolean sex){
		this.sex = sex;
	}
	//4
		public int getAge(){
		return this.age;
	}
	public void setAge(int age){
		this.age = age;
	}	
	//5
	public long getTel(){
		return this.tel;
	}
	public void setTel(long tel){
		this.tel = tel;
	}	
	//6
	public String getAddress(){
		return this.address;
	}
	public void setAddress(String address){
		this.address = address;
	}
	
//fangfa
    public void myPrint(){
		System.out.print( "Name: "+this.name+"\t"+"Post: "+ this.post +"\n"
		                  +"Sex: "+this.sex+"\t"+"Age: "+this.age +"\n"
						  +"Tel: "+this.tel+"\t"+"Address:"+this.address+"\n");
	}
	/*//这样写太丑陋了 用继承  再用args【】来判断要的环境  然后就不用改了
	public void myPrint1(){
		System.out.print("姓名: "+this.name()+"\t"+"职位: "+ this.post() +"\n"
		                  +"性别: "+this.sex()+"\t"+"年龄: "+this.age() +"\n"
						  +"电话: "+this.tel()+"\t"+"地址:"+this.address()+"\n");
	}
	*/

}


class  ChinaMessage extends Message {
	public ChinaMessage(String name,String post){
		super(name,post);
	}
	
	public void myPrint(){
		System.out.print("姓名: "+this.getName()+"\t"+"职位: "+ this.getPost() +"\n"
		                  +"性别: "+this.getSex()+"\t"+"年龄: "+this.getAge() +"\n"
						  +"电话: "+this.getTel()+"\t"+"地址:"+this.getAddress()+"\n");
	}
}