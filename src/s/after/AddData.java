package s.after;

import java.util.Scanner;

public class PersonData {
    public static Person addData() {
        Scanner reader = new Scanner(System.in);
        s.after.Person person = new Person();

        System.out.println("What is your first name: ");
        person.setFirstName(reader.next());

        System.out.println("What is your last name: ");
        person.setLastName(reader.next());
        return person;
    }
}
