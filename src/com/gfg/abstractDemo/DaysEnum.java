package org.gfg.abstractDemo;

public enum DaysEnum {


    SUNDAY(1, "SUN"),
    MONDAY(2, "MON"),
    TUESDAY(3, "TUES"),
    WEDNESDAY(4, "WED"),
    THRUSDAY(5, "THR"),
    FRIDAY(6, "FRI"),
    SATURDAY(7, "SAT");

    public int id;
    public String val;

    DaysEnum(int id, String val){
        this.id=id;
        this.val=val;
    }


    public static void main(String args[]){
        for(DaysEnum denum: DaysEnum.values()){
            System.out.println(denum);
        }
        System.out.println(DaysEnum.valueOf("MONDAY").val);
        System.out.println(DaysEnum.valueOf("MONDAY").id);
        System.out.println(DaysEnum.valueOf("MONDAY").ordinal());
        System.out.println(DaysEnum.valueOf("MONDAY"));
    }
}
