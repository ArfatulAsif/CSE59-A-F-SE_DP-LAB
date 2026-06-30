
interface MessageSender{
    void sendMessage(String message);
}

class EmailSender implements MessageSender{
    @Override
    public void sendMessage(String message) {
        System.out.println("sending email:  "+message);
    }
}

class NotificationServer {
    private MessageSender messageSender;

    public NotificationServer(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void alertUser(String message) {
        messageSender.sendMessage(message);
    }

}

public class Main2 {
    public static void main(String[] args) {
        MessageSender emailSender = new EmailSender();
        NotificationServer notificationServer = new NotificationServer(emailSender);

        notificationServer.alertUser("your order has been shipped");

    }
}
