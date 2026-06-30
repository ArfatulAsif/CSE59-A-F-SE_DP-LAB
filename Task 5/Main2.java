interface MessageSender {
    void sendMessage(String message);
}

class EmailSender implements MessageSender{
    public void sendMessage(String message) {
        System.out.println("Sending Email : "+message );
    }
}
class SMSSender implements MessageSender {
    public void sendMessage(String message) {
        System.out.println("Sending SMS: "+message);
    }
}

class NotificationService{
    private MessageSender messageSender;

    public NotificationService(MessageSender messageSender){
        this.messageSender = messageSender;
    }

    public void alertUser(String msg){
        messageSender.sendMessage(msg);
    }
}

public class Main2{
    public static void main(String[] args){
        MessageSender email = new EmailSender();

        NotificationService service1 = new NotificationService(email);
        service1.alertUser("Your order hasa been shipped");

        System.out.println();

        MessageSender sms = new SMSSender();
        NotificationService service2 = new NotificationService(sms);
        service2.alertUser("your OTP is 1234");
    }
}
