interface MessageSender {
    void send(String message);
}

class EmailSender implements MessageSender {
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}

class SMSSender implements MessageSender {
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

class NotificationService {
    private MessageSender sender;

    public NotificationService(MessageSender sender) {
        this.sender = sender;
    }

    public void alertUser(String msg) {
        sender.send(msg);
    }
}

public class Main {
    public static void main(String[] args) {

        MessageSender email = new EmailSender();
        NotificationService service1 = new NotificationService(email);
        service1.alertUser("Hello via Email");

        MessageSender sms = new SMSSender();
        NotificationService service2 = new NotificationService(sms);
        service2.alertUser("Hello via SMS");
    }
}
