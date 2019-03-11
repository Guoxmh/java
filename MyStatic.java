public class MyStatic{
	public static void main(String[] args){
		Person per = Person.getInstance();
		per.print();
	}
}

abstract  class Person {
	//抽象方法
	public abstract void print();
	
	public static Person getInstance(){
		//局部内部类
		//封装具体实现子类
		class Student extends Person{
			public void print(){
				System.out.println("hello i am student ");
			}
		}
		return new Student();
	}
}





/*public class MyStatic{
	public static void main(String[] args){
			A.B  te =  new A.B();
	       te.c();
	}

}


class A{
	int a = 1;
	static class B{
		public void c(){
			System.out.print(a);
		}
	}
}*/