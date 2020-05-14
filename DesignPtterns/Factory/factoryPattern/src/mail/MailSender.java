package mail;

public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("This is from mail");
    }
}
