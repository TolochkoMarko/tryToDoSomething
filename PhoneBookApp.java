package something.phoneBook;

import java.util.Scanner;

public class PhoneBookApp {
    public static void main(String[] args) {
      PhoneBook phoneBook = new PhoneBook();
       while (true) {
           Scanner scan = new Scanner(System.in);
           System.out.println("1 - add contact,  2 - edit contact,  3 - delete contact,  4 - find contact,  5 - show all contacts,  6 - exit");
           int userChoice = scan.nextInt();
           switch (userChoice) {
               case 1: {
                   phoneBook.addPhoneNumber();
                   break;
               }
               case 2: {
                   phoneBook.editContact();
                   break;
               }
               case 3: {
                   phoneBook.removeContact();
                   break;
               }
               case 4: {
                   phoneBook.findContact();
                   break;
               }
               case 5: {
                   phoneBook.showAllContacts();
                   break;
               }
               case 6: {
                   System.exit(0);
                   break;
               }
           }
       }

    }
}
