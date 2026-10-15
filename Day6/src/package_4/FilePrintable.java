package package_4;

import Package_1.Printable;

public class FilePrintable implements Printable {

    @Override
    public void Print(String msg) {
        System.out.println("Storing a msg in Files:"+msg);
    }

    public void test(){

        System.out.println("In test");
    }
}
