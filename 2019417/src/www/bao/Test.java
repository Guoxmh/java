package www.bao;


import jdk.internal.dynalink.beans.StaticClass;

import java.lang.reflect.Constructor;
import java.sql.SQLOutput;
import java.util.Date;

public class Test {
    public static void main1(String[] args) throws Exception {
/*        synchronized (Test.class){
            //全局锁
        }
        //正向处理
        Date data =  new Date();
        System.out.println(data.getClass());
        System.out.println(Date.class);
        System.out.println(Class.forName("java.util.Date"));

        System.out.println(int.class);
        System.out.println(Integer.class);
        //通过反射实例化Date类对象
        //相当于Date date = new Date();

        Class<Date> cls =  Date.class;
        Date date1 = cls.newInstance();*/
/*        Class<Person> cls1 = Person.class;
        Constructor constructor = cls1.getDeclaredConstructor();
        constructor.setAccessible(true);
        Person person = (Person) constructor.newInstance();
        System.out.println(person);


        String str = "emp.name:xxxx|emp.job:Coder";
        EmpAction empAction = new EmpAction();
        empAction.setEmp(str);
        empAction.getEmp();*/



    }
}
class Person{
    private  Person(){

    }
}
class Single{

    private final static Single single1 = new Single();
    private Single(){}
    public static Single getInstance(){
        return single1;
    }
    public void print(){
        System.out.println("单列");
    }
}
//懒汉
class Sington{
    private static Sington sington ;
    private Sington(){}

    public static Sington getInstance(){
        if(sington == null){
            sington = new Sington();
        }
        return sington;
    }
    public void print(){
        System.out.println("懒汉式");
    }

}

