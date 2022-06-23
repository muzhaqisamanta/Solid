package d.after;

public class Email implements SendMessage{
    @Override
    public void sendMessage(Person person, String message) {
        System.out.println(String.format("Simulating sending an email to %s", person.email));
    }
}
