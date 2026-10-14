package com.itp.coreclasses;
class Date1 {
    int day;
    int month;
    int year;

    Date1(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    void displayDate() {
        System.out.println("Published Date: " + day + "/" + month + "/" + year);
    }
}