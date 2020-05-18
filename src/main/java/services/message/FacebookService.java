package services.message;

public class FacebookService implements MessageService {

    public boolean SendMessage(String msg, String receipient) {
        System.out.println("Message sent to Fb user" + receipient + "with msg = " + msg);
        return true;
    }
}
