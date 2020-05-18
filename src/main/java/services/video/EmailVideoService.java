package services.video;

public class EmailVideoService implements VideoService{
    public boolean SendVideo(String msg, String receipient) {
        System.out.println("Video sent to Email user" + receipient + "with msg = " + msg);
        return true;
    }
}
