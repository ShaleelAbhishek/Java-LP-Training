import mail.SendFactory;
import mail.Sender;

public class Main {
    public static void main(String[] args) {

        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");
        sender.send();
        
}
}
