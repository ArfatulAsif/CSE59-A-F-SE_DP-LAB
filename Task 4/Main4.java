interface MessageSender {
    void sendMessage (String message);
}

class EmailSender implements  MessageSender {
    @Override 
    public void sendMessage (String message ){
        System .out.println ( "Sending Email: " + message );
    }
}

class SMSSender implements MessageSender {
    @Override 
    public void sendMessage (String message ){
        System.out.println ( "Sending SMS :" + message);
    }
}

class NotificationService {
    private final MessageSender messageSender;
    
    public NotificationService (MessageSender messageSender ){
        this . messageSender = messageSender ;
    }
    
    public void alertUser ( String msg ){
       messageSender.sendMessage(msg);
    }
}

public class Main {
    public static void main ( String [] args ){
        NotificationService emailservice = new NotificationService (new EmailSender ());
        emailservice . alertUser ("Hello via Email!");
        
        NotificationService smsService = new NotificationService ( new SMSSender());
        smsService . alertUser ( "Hello via SMS!");
        
    }
}
