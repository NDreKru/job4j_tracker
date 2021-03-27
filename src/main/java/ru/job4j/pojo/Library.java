package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book lafore = new Book();
        lafore.setName("DS and A on Java");
        lafore.setPageCount(690);
        Book bhargava = new Book();
        bhargava.setName("Grokking A");
        bhargava.setPageCount(288);
        Book martin = new Book();
        martin.setName("Clean code");
        martin.setPageCount(465);
        Book horstmann = new Book();
        horstmann.setName("Core Java");
        horstmann.setPageCount(866);
        Book[] books = new Book[4];
        books[0] = lafore;
        books[1] = bhargava;
        books[2] = martin;
        books[3] = horstmann;
        for (int i = 0; i < books.length; i++) {
            System.out.println("name: " + books[i].getName()
                    + "; page count: " + books[i].getPageCount());
        }
        Book tempBook;
        tempBook = books[0];
        books[0] = books[3];
        books[3] = tempBook;
        System.out.println();
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean code")) {
                System.out.println("name: " + books[i].getName()
                        + "; page count: " + books[i].getPageCount());
            }
        }
    }
}
