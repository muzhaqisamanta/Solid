package s.after;

public class main {
    public static void main(String[] args) {
        AddData addData = new AddData();

        System.out.println("Welcome to my application");

        System.out.println("What is your first name: ");
        addData.addFirstname();

        System.out.println("What is your last name: ");
        addData.addLastName();

        System.out.println(String.format("Your username is %s %s",
                addData.person.getFirstName(),
                addData.person.getLastName()));

        System.out.println("End of application");

    }
}
