package com.example.demo.controller;

enum WeekDay {

    Mon("Monday", 1, "tired1"),
    Tue("Tuesday", 2, "tired2"),
    Wed("Wednesday", 3, "tired3"),
    Thu("Thursday", 4, "tired4"),
    Fri("Friday", 5, "tired5"),
    Sat("Saturday", 6, "tired6"),
    Sun("Sunday", 7, "tired7");

    private String day;
    private Integer index;
    private String status;
    WeekDay(String day, int index, String status) {
        this.day = day;
        this.index = index;
        this.status = status;
    }
    public static void printDay(int i) {
        switch(i) {
            case 1:
                System.out.println(WeekDay.Mon);
                break;
            case 2:
                System.out.println(WeekDay.Tue);
                break;
            case 3:
                System.out.println(WeekDay.Wed);
                break;
            case 4:
                System.out.println(WeekDay.Thu);
                break;
            case 5:
                System.out.println(WeekDay.Fri);
                break;
            case 6:
                System.out.println(WeekDay.Sat);
                break;
            case 7:
                System.out.println(WeekDay.Sun);
                break;
            default:
                System.out.println("wrong number!");
        }
    }
    public String getDay() {
        return day;
    }
    public String getStatus() {
        return status;
    }
    public Integer getIndex() {
        return index;
    }

    public static void main(String[] args) {
        for(WeekDay day : WeekDay.values()) {
            System.out.println(day+"====>" + day.getDay());
            System.out.println(day+"====>" + day.getIndex() + "======>" + day.getStatus());
        }
        WeekDay.printDay(5);
    }

}
