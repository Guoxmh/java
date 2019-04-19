package www;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Reflect {

        public Reflect(){
            System.out.println("我是无参构造");
        }
        public void  print(){
            System.out.println("你是傻逼");
        }
        public void print1(String A){
            System.out.println(A);
        }
    }



class Test{
    public static void main(String[] args) throws Exception {
        Class<Reflect> cls = Reflect.class;
        Constructor constructor = cls.getDeclaredConstructor();
        constructor.newInstance();//获取构造方法主要就是用来实例化对象的；
        Method method = cls.getMethod("print1", String.class);
        // Reflect abs =  cls.newInstance();
        // Reflect abs = new Reflect();
        // method.invoke(abs,"sadasd");
        //invoke(是对象，要传入的参数)

        int abs1 = 10;
        Object abs2 = abs1;
        System.out.println(abs2);


    }

}


class  UpUtil{
    public static String toUp(String str){
        if(str.length() > 1){
            return str.substring(0,1).toUpperCase()+str.substring(1);
        }else{
            return str.substring(0,1).toUpperCase();
        }

    }
}