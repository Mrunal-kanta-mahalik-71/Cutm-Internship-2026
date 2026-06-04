package LIBRARY_JDBC.SRC;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BookDAO dao = new BookDAO();

        int choice;

        do {

            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Get Book By ID");
            System.out.println("4. Update Book");
            System.out.println("5. Delete Book");
            System.out.println("0. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    Book b1 = new Book();

                    System.out.print("Enter Book ID: ");
                    b1.setId(sc.nextInt());
                    sc.nextLine();

                    System.out.print("Enter Book Name: ");
                    b1.setName(sc.nextLine());

                    System.out.print("Enter Author Name: ");
                    b1.setAuthor(sc.nextLine());

                    System.out.print("Enter Publisher: ");
                    b1.setPublisher(sc.nextLine());

                    System.out.print("Enter Language: ");
                    b1.setLanguage(sc.nextLine());

                    if (dao.addBook(b1) > 0) {
                        System.out.println("Book Added Successfully");
                    }

                    break;

                case 2:

                    dao.displayBooks();
                    break;

                case 3:

                    System.out.print("Enter Book ID: ");
                    dao.getById(sc.nextInt());

                    break;

                case 4:

                    Book b2 = new Book();

                    System.out.print("Enter Book ID to Update: ");
                    b2.setId(sc.nextInt());
                    sc.nextLine();

                    System.out.print("Enter New Book Name: ");
                    b2.setName(sc.nextLine());

                    System.out.print("Enter New Author Name: ");
                    b2.setAuthor(sc.nextLine());

                    System.out.print("Enter New Publisher: ");
                    b2.setPublisher(sc.nextLine());

                    System.out.print("Enter New Language: ");
                    b2.setLanguage(sc.nextLine());

                    if (dao.updateBook(b2) > 0) {
                        System.out.println("Book Updated Successfully");
                    }

                    break;

                case 5:

                    System.out.print("Enter Book ID to Delete: ");

                    if (dao.deleteBook(sc.nextInt())) {
                        System.out.println("Book Deleted Successfully");
                    }

                    break;

                case 0:

                    System.out.println("Exiting...");
                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while (choice != 0);

        sc.close();
    }
}