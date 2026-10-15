abstract class Notification {
    protected final String recipient;
    protected final String message;

    public Notification(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    public abstract void send();
}

class SMSNotification extends Notification {
    private final String phoneNumber;

    public SMSNotification(String recipient, String message, String phoneNumber) {
        super(recipient, message);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void send() {
        System.out.println("Sending SMS to " + recipient + " (" + phoneNumber + ") with message: " + message);
    }
}

class EmailNotification extends Notification {
    private final String emailAddress;

    public EmailNotification(String recipient, String message, String emailAddress) {
        super(recipient, message);
        this.emailAddress = emailAddress;
    }

    @Override
    public void send() {
        System.out.println("Sending Email to " + recipient + " <" + emailAddress + "> with message: " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        Notification sms = new SMSNotification("John Doe", "Hello, how are you?", "+1234567890");
        Notification email = new EmailNotification("Jane Smith", "Meeting at 3 PM", "jane.smith@example.com");
        sms.send();
        email.send();
    }
}