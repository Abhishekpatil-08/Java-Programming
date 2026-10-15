package package_3;

import Package_1.ConsolePrintable;
import Package_1.Printable;
import package_4.FilePrintable;

public class Tester_1 {
    public static void main(String[] args){
        Printable[] printables={new FilePrintable(),new ConsolePrintable()};
        for(Printable p:printables){
            p.Print("msg");
        }
    }
}
