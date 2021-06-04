package something.phoneBook;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
    ArrayList<Integer> contactNumber = new ArrayList<>();
    ArrayList<String> contactName = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    private String name;
    private Integer number;


    public void addPhoneNumber(){
        System.out.println("enter number");
        int scanNumber = scan.nextInt();
        if (contactNumber.contains(scanNumber)){
            System.out.println("the contact was added before");
            addPhoneNumber();
        }
        contactNumber.add(scanNumber);
        System.out.println("enter name");
        String scanName = scan.next();
        if (contactName.contains(scanName)) {
            System.out.println("the contact was added before");
            addPhoneNumber();
        }
        contactName.add(scanName);
        System.out.println("you added new contact " + scanName + " - " + scanNumber);
    }

    public void removeContact(){
        System.out.println("remove by name - press 1, by number - press - 2");
        int scanUserChoice = scan.nextInt();
        if (scanUserChoice == 1) {
            System.out.println("Enter name to delete");
            String scanNameToDel = scan.next();
            int indexOfNameToDel = contactName.indexOf(scanNameToDel);
            contactName.remove(indexOfNameToDel);
            contactNumber.remove(indexOfNameToDel);
        }
        else if (scanUserChoice == 2){
            System.out.println("Enter number to delete");
            int scanNumberToDel = scan.nextInt();
            int indexOfNumberToDel = contactNumber.indexOf(scanNumberToDel);
            contactNumber.remove(indexOfNumberToDel);
            contactName.remove(indexOfNumberToDel);
        }
        else{
            System.out.println("Wrong choice");
        }
    }
    public void editContact(){
        System.out.println("edit name - press 1, number - press 2");
        int userChoice = scan.nextInt();
        if (userChoice == 1){
            System.out.println("Enter name which you wanna edit");
            String nameUserWantEdit = scan.next();
            int indexOfNameUserWantEdit = contactName.indexOf(nameUserWantEdit);
            contactName.remove(indexOfNameUserWantEdit);
            System.out.println("Enter right contact name");
            String changedName = scan.next();
            contactName.add(indexOfNameUserWantEdit, changedName);
        } else if (userChoice == 2) {
            System.out.println("Enter number which you want edit");
            int scanNumberUserWantEdit = scan.nextInt();
            int indexOfNumberUserWantEdit = contactNumber.indexOf(scanNumberUserWantEdit);
            contactNumber.remove(indexOfNumberUserWantEdit);
            System.out.println("Enter right contact number");
            int changedNumber = scan.nextInt();
            contactNumber.add(indexOfNumberUserWantEdit, changedNumber);
        }
        else {
            System.out.println("Wrong choice");
        }
    }
    public void findContact(){
        System.out.println("Find by name - press 1, by number - 2");
        int userChoice = scan.nextInt();

        if (userChoice == 1){
            System.out.println("Enter name which you wanna find");
            String findName = scan.next();
            int indexLookedName = contactName.indexOf(findName);
            System.out.println("Contact: " + contactName.get(indexLookedName) + " - " + contactNumber.get(indexLookedName));
        }
        else if (userChoice == 2){
            System.out.println("Enter number which you wanna find");
            int findNumber = scan.nextInt();
            int indexLookedNumber = contactNumber.indexOf(findNumber);
            System.out.println("Contact: " + contactName.get(indexLookedNumber) + " - " + contactNumber.get(indexLookedNumber));

        }
    }
    public void showAllContacts() {

        Outer:
        for (int i = 0; i < contactName.size(); i++) {
            for (int j = 0; j < contactNumber.size(); j++)
            {
                System.out.println("Contact: " + contactName.get(i) + " - " + contactNumber.get(i));
                continue Outer;
            }

        }
    }


    public PhoneBook() {

    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
