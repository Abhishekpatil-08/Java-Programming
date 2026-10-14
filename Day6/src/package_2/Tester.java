package package_2;

import Package_1.ConsolePrintable;
import Package_1.Printable;

public class Tester {
    public static void main(String[]args){
        Printable p=new ConsolePrintable();// this called as indirect referancing
        p.Print("HI abhishek print your name using Printable referance");
    }
}
