package package_4;

import Package_1.ConsolePrintable;
import Package_1.Printable;

public class Tester_1 {
    public static void main(String[] args){
        Printable p=new FilePrintable();
        p.Print("soma Msg");
        //p.test();//this is not allow
        ((FilePrintable)p).test();//downCasting

        p=new ConsolePrintable();
        //p.test() // test() method in not available in Printable
        //((FilePrintable)p).test(); //classCastException Occures

        if(p instanceof FilePrintable){
            ((FilePrintable)p).test();
        }
        else {
            System.out.println("Invalid type of object");
        }


    }
}
