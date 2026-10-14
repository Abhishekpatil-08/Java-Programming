package com.itp.coreclasses;

public class Main {

    public static void main(String[] args) {

        Author a1 = new Author(101, "R. K. Narayan");

        Date1 d1 = new Date1(10, 5, 2012);

        Book b1 = new Book(
                1,
                "Java Programming",
                1000.0f,
                a1,
                d1
        );

        b1.printBookdetails("Java Programming");

        
        float finalPrice = b1.getBookOffer("Java Programming");

        System.out.println("\nFinal Price after Offer: " + finalPrice);
    }
}


