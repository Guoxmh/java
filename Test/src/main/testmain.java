package main;

import com.bit.dao.ISequenceImpl;
import com.bit.dao.MySingleListImpl;
import com.bit.impl.ISequence;
import com.bit.impl.Ilinked;

//包名全部小写
public class testmain {
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
        abs.remove(0);
        abs.remove(1);
        abs.remove(9);
        abs.display();//2
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
