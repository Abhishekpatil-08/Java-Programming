package com.itp.coreclasses;

class Author {
    int authorId;
    String authorName;

    Author(int authorId, String authorName) {
        this.authorId = authorId;
        this.authorName = authorName;
    }

    void displayAuthor() {
        System.out.println("Author ID: " + authorId);
        System.out.println("Author Name: " + authorName);
    }
}
