public class Task10{

	public static void getPerson(Person person){
		person.printPersonInfo();
	}
	public static void main(String[] args){
           getPerson(new SchoolChild());
	}
}
interface Person{

	public abstract void printPersonInfo();


}

class Student implements Person{
	public void printPersonInfo(){
		System.out.println("I am a student");
	}

  }
  class SchoolChild implements Person{
	public void printPersonInfo(){
		System.out.println("我是小学生");
	}
}
