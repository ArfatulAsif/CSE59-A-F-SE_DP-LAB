interface MessageSender {
    void sendMessage(String message);
}

class EmailSender implements MessageSender {
    @Override
    public void sendMessage(String message){
        System.out.println("Sending email: " + message);
  }}
class SmsSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
class NotificationService {
    private final MessageSender messageSender;

    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void alertUser(String msg) {
        messageSender.sendMessage(msg);
    }
}

public class Main {
    public static void main(String[] args) {
        String alertMessage = "Your package has arrived!";

       MessageSender email = new EmailSender();
      NotificationService emailService = new NotificationService(email);
emailService.alertUser(alertMessage);

        System.out.println("--- Switch channel dynamically ---");
    MessageSender sms = new SmsSender();
         NotificationService smsService =
         new NotificationService(sms);
        smsService.alertUser(alertMessage);
    }
}
