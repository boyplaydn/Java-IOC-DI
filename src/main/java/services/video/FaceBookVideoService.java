package services.video;

public class FaceBookVideoService implements VideoService{
    public boolean SendVideo(String msg, String receipient) {
        System.out.println("Video sent to Fb user" + receipient + "with msg = " + msg);
        return true;
    }
}
