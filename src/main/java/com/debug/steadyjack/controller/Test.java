package com.debug.steadyjack.controller;

/**
 * @author: Zhaoyongheng
 * @date: 2019/10/18
 */
public class Test {

//
//    public static void main(String[] args) {
//        Thread t = new Thread() {
//            public void run() {
//                pong();
//            }
//        };
//        //启动线程
//        //t.start();
//        //运行run方法
//        t.run();
//        System.out.print("ping");
//
//    }
//
//    static void pong() {
//        System.out.print("pong");
//    }
public static void main(String[] args) {
//    String s1 = "runoob";
//    String s2 = "runoob";
//    System.out.println(s1 == s2);
//    int a=0;
//    System.out.println(a++);
//    System.out.println(a++);
    StringBuffer a = new StringBuffer("Runoob");
    StringBuffer b = new StringBuffer("Google");
    a.delete(1,3);
    a.append(b);
    System.out.println(a);

}

    }
//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(Thread.currentThread().getName() + "  " + i);
//            if (i == 2) {
//                Cat c1 = new Cat();
//                Cat c2 = new Cat();
//                c1.start();
//                c2.start();
//            }
//        }
//    }
//}
//
//class Cat extends Thread {
//    private int i;
//
//    public void run() {
//        for (; i < 10; i++) {
//            System.out.println(getName() + "  " + i);
//        }
//    }
//}
