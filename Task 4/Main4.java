
interface MessageSender {
    void sendMessage(String message);
}

class EmailSender implements MessageSender{
    public void sendMessage(String message){
        System.out.println("Sending email: "+ message);

    }
}

public class SMSSender implements MessageSender{
    public void sendMessag(String message){
        System.out.println("Sending SMS: " + message);
    }
}

public class NotificationService{
    private MessageSender messageSender;

    public NotificationService(MessageSender messageSender){
        this.messageSender = messageSender;
    }

    public void alertUser(String msg){
        messageSender.sendMessage(msg);
    }
}

public class Main{
    public static void main(String[] args){
        MessageSender email = new EmailSender();
        NotificationService emailService = new NotificationService(email);
        emailService.alertUser("Welcome to our platform!");

        System.out.println("------------------");

        MessageSender sms = new SMSSender();
        NotificationService smsService = new NotificationService(sms);
        smsService.alertUser("Your OTP code is 3242");
    }
    }
}
