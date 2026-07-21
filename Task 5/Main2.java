
interface MessageSender{
    void sendMessage(String message);
}

class EmailSender implements MessageSender{
    public void sendMessage(String message){
        System.out.println(("Sending email: " + message));
    }
}

class SMSSender implements MessageSender{
    public void sendMessage(String message){
        System.out.println("Sending SMS: " + message);
    }
}

class NotificationService{
    private MessageSender messageSender;
    public NotificationService(MessageSender messageSender){
        this.messageSender  = messageSender;
    }

    public void alertUser(String msg) {
        messageSender.sendMessage(msg);
    }
}

public class Main2{
    public static void main(String[] args) {
        MessageSender email = new EmailSender();
        NotificationService emailNotification = new NotificationService(email);
        emailNotification.alertUser("Your order has been shipped!");

        MessageSender sms = new SMSSender();
        NotificationService smNotificationService = new NotificationService(sms);
        smNotificationService.alertUser("Your OTP is 123456.");
    }
}
