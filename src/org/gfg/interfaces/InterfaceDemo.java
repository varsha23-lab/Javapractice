package org.gfg.interfaces;

public interface InterfaceDemo {
    int a=10;// public static final
    public abstract int getA(); // abstract methods

    static String getB(){
        return "calling getB method of InterfaceDemo";
    }

    default String getDefault(){
        System.out.println(getC());
        return "calling getC method of InterfaceDemo";
    }

    private String getC(){
        return "dummy";
    }


}
