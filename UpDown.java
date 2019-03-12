public class UpDown{
	public static void main(String[] args){
		fun(new Person());
		fun(new Student());
	}
	
public static void fun(Person per){
	per.print();
}
}

class Person{
	public void print(){
		System.out.println("Person类");
	}
}

class  Student extends Person{
	
	public void print(){
		System.out.print("子类方法");
	}
	
}