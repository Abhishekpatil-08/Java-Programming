package com.itp.pack_1;

import java.util.Scanner;

public class Tester {
       public  static void main(String[]args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Capacity:");
       Fruit[] basket=new Fruit[sc.nextInt()];
           boolean exit=false;
           int counter=0;

       while (!exit){
           System.out.println("Enter choice: ");
           switch(sc.nextInt()) {
               case 1:
                   if(counter<basket.length) {
                       System.out.println("boundry is Available");
                       basket[counter++]=new Apple();
                   }
                   else {
                       System.out.println("boundry is NOt Available");
                   }
                   break;
               case 2:
                   if(counter<basket.length) {
                       System.out.println("boundry is Available");
                       basket[counter++]=new Orange();
                   }
                   else {
                       System.out.println("boundry is NOt Available");
                   }
                   break;
               case 3:
                   if(counter<basket.length) {
                       System.out.println("boundry is Available");
                       basket[counter++]=new Mango();
                   }
                   else {
                       System.out.println("boundry is NOt Available");
                   }
                   break;
               case 4:
                   System.out.println("Print Details:");
                   for (Fruit f:basket) {
                       if (f != null) {
                           f.Teste();
                           if (f instanceof Mango) {
                               ((Mango) f).pulp();

                           }
                       }
                   }
                   break;
               case 5:
                   exit=true;
                   break;
               }
           }
       }

}

