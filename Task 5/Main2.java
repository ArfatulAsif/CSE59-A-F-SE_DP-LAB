interface MessageSender {
    void sendMessage(String message);
    
}

class EmailSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        SAystem.out.println("Sending email: " + message):
    }
}

class NotificationService {
    private messageSender;
    
    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }
    
    public void alertUser(String msg) {
        messageSender.sendMessage(msg);
    }
}
