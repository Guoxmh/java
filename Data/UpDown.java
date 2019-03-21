public class UpDown{
	public static void main(String[] args){
	
		fun(new Student());
	}
	
public static void fun(Person per){
	per.print();
}
}

abstract class Person{
	public abstract void print();

}

class  Student extends Person{
	
	public void print(){
		System.out.print("子类方法");
	}
	
}