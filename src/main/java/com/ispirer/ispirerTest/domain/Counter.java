package com.ispirer.ispirerTest.domain;

public class Counter {
    private int id;
    private static int count = 0;

    //Thymeleaf didn't see my id for some reason, so i add copy of it. Bad
    public int idCopy;

    public Counter() {
        this.count++;
        this.id = count;
        this.idCopy = count;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Counter.count = count;
    }
}
