package main;

import com.bit.dao.DoubleLinkedImple;
import com.bit.dao.ISequenceImpl;
import com.bit.dao.MySingleListImpl;
import com.bit.impl.ISequence;
import com.bit.impl.Ilinked;

import static java.lang.Integer.parseInt;

//包名全部小写
public class testmain {
    public static void main5(String[] args) {
        DoubleLinkedImple abs = new DoubleLinkedImple();

        Integer num1 = new Integer(10) ;
        Integer num2 = new Integer(10) ;
        System.out.println(num1 == num2);
        System.out.println(num1 == new Integer(10));
        System.out.println(num1.equals(new Integer(10)));




/*        String str = "Hello Bit";
        System.out.println(str);
        String str1 = new String("Hello Bit");*/
        //"Hell0" 本质就是匿名的String类的对象，匿名对象一定保存在堆内存中
        //String str = "hello" 本质就是给匿名的String类对象设置有名字
        //在日后的开发中，如果要判断用户输入的字符串是否等同于特定的字符串，
        //一定要  用户输入.equals("字符串")； 防止用户没有输入内容，造成
        //空指针问题；
    }

    public static void main(String[] args) {
        MySingleListImpl  abs = new MySingleListImpl();
        abs.addFirst(18);
        abs.addFirst(8);
        abs.addLast(10);
        abs.addFirst(1);
        abs.addFirst(8);
        abs.addindex(0,0);
        abs.addindex(5,9);
        abs.display();//1
        System.out.println();
/*        abs.remove(0);
        abs.remove(1);
        abs.remove(10);
        abs.remove(9);
        abs.display();//2*/
        System.out.println();
        abs.removeAllKey(8);
        abs.display();
        System.out.println();
        boolean b = abs.contains(0);
        boolean c = abs.contains(40);
        System.out.println(b);
        System.out.println(c);
        int a = abs.getLength();
        System.out.println("-----------");
        System.out.println(a);
        abs.clear();
    }
    public static void main1(String[] args) {
        ISequenceImpl abs = new ISequenceImpl();
        for(int i = 0; i < 10; i++){
            abs.elemData[i] = i;
        }
        abs.usedSize = 10;
        abs.add(-1,10);
        abs.add(9,3);
        abs.add(10,4);
        abs.add(11,"sss");
        abs.display();
        System.out.println("得下标  --------------");
        int index = abs.search("sss");
        System.out.println(index);
        System.out.println("包含--------------");
         boolean a= abs.contains("sss");
         System.out.println(a);
        System.out.println("得数据 4--------------");
        Object b = abs.getPos(4);
        System.out.println(b);
        System.out.println("得长度--------------");
        int c = abs.size();
        System.out.println(c);
        System.out.println("清空--------------");
        abs.clear();
        abs.display();



    }

}





