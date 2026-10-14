package com.itp.coreclasses;

class Book {
    int bookId;
    String bookName;
    float bookPrice;

    Author author;
    Date1 publishedDate;

    Book(int bookId, String bookName, float bookPrice,
         Author author, Date1 publishedDate) {

        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.author = author;
        this.publishedDate = publishedDate;
    }

    float getBookOffer(String bookname) {

        if (bookName.equalsIgnoreCase(bookname)
                && publishedDate.year >= 2010
                && publishedDate.year <= 2015) {
            float discount = bookPrice * 25 / 100;
            return bookPrice - discount;
        }

        return bookPrice;
    }


    void printBookdetails(String bookname) {

        if (bookName.equalsIgnoreCase(bookname)) {

            System.out.println("Book Details");
            System.out.println("Book ID: " + bookId);
            System.out.println("Book Name: " + bookName);
            System.out.println("Book Price: " + bookPrice);
            System.out.println("\nAuthor Details");
            author.displayAuthor();
            System.out.println("\nPublished Date");
            publishedDate.displayDate();

        } else {
            System.out.println("Book does not exist");
        }
    }
}


