package services.message;

public class EmailService implements MessageService {

    public boolean SendMessage(String msg, String receipient) {
        System.out.println("Email message sent to" + receipient + "with msg = " + msg);
        return true;
    }
}
