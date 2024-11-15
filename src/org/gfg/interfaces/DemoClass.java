package org.gfg.interfaces;

public class DemoClass implements InterfaceDemo,InterfaceDemo2{

    @Override
    public int getA() {
        return 3+4;
    }

//    static String getB(){
//        return "calling getB method of DemoClass";
//    }

    @Override
    public String getDefault(){
        System.out.println("calling getDefault");
        return InterfaceDemo.super.getDefault();

    }

    public static void main(String args[]){
        DemoClass demo=new DemoClass();
        System.out.println(demo.getDefault());
    }

}
