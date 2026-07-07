
public class Main4 {
    public static void main(String[] args) {
        
        MessageSender emailService = new EmailSender();
        
        
        NotificationService notificationService = new NotificationService(emailService);
        notificationService.alertUser("Hello! Your order has shipped.");

        
        MessageSender smsService = new SMSSender();
        NotificationService smsNotificationService = new NotificationService(smsService);
        smsNotificationService.alertUser("Your OTP code is 1234.");
    }
}


interface MessageSender {
    void sendMessage(String message);
}


class EmailSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}


class SMSSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS text: " + message);
    }
}


class NotificationService {
    private MessageSender messageSender; 

    
    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void alertUser(String msg) {
        messageSender.sendMessage(msg);
    }
}

