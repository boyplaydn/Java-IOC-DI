package consumer;

import com.google.inject.Inject;
import services.message.MessageService;
import services.video.VideoService;

public class MyApplication {
    private MessageService messageService;
    private VideoService videoService;

    @Inject
	public MyApplication(MessageService messageService, VideoService videoService){
		this.messageService=messageService;
		this.videoService=videoService;
	}

    @Inject
    public void SetMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    @Inject
    public void SetVideoService(VideoService videoService) {
        this.videoService = videoService;
    }

    public  boolean SendMessage(String msg, String rec) {
        return messageService.SendMessage(msg, rec);
    }

    public boolean SendVideo(String msg, String rec) {
        return videoService.SendVideo(msg, rec);
    }
}
