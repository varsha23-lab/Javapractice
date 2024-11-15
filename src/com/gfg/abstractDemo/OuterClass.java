package org.gfg.abstractDemo;

public class OuterClass {
    private int a=10;
    public int c=30;
    public static int d =40;

    public static interface interfaceDemo{

    }

    public static class InnerClass{
        private int b=20;

        private void printInnerData(){
            System.out.println(OuterClass.d);
            OuterClass out =new OuterClass();
            System.out.println(out.a);
            System.out.println(out.c);

        }
    }

    public static void main(String args[]){

        OuterClass outer=new OuterClass();
        System.out.println(outer.a);
        InnerClass inner=new OuterClass.InnerClass();
        inner.printInnerData();

    }
}
