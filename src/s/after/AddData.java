package s.after;

import java.util.Scanner;

public class AddData {
    Scanner reader = new Scanner(System.in);
    s.after.Person person = new Person();

    public void addFirstname(){
        person.setFirstName(reader.next());
        if (person.getFirstName() == null || person.getFirstName().isEmpty()) {
            System.out.println("You did not give us a valid first name!");
        }
    }
    public void addLastName(){
        person.setLastName(reader.next());
        if (person.getLastName() == null || person.getLastName().isEmpty()) {
            System.out.println("You did not give us a valid last name!");
        }
    }
}
