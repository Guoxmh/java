/*
package www.bao;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface IFruit {
    void eat();
}


class apple implements IFruit{

    @Override
    public void eat() {
        System.out.println("吃苹果");
    }
}

class orange implements IFruit{

    @Override
    public void eat() {
        System.out.println("吃苹果");
    }
}

class Factory{
    private Factory(){}

    public  static IFruit getInstance(String name){
        IFruit fruit = null;
        try {
            fruit =  (IFruit)Class.forName(name).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return fruit;
    }
}

class Teat{
    public static void main(String[] args) {
      Supplier<String> sup = "hellow"::toUpperCase;
      sup.get();
      Function<Integer,String> fun = String::valueOf;
      fun.apply(111);
        Consumer<String> con = System.out::println;
        con.accept("屈狗");
        Predicate<String> pre = "adssa"::startsWith;

        System.out.println( pre.test("ad"));

    }

}

class Test<R,P>{
    P eat(R t){
        return (P) t;
    }
}


*/
