package injector;

import com.google.inject.AbstractModule;
import services.message.FacebookService;
import services.message.MessageService;
import services.video.FaceBookVideoService;
import services.video.VideoService;

public class FaceBookInjector extends AbstractModule {

    protected void configure() {
        bind(MessageService.class).to(FacebookService.class);
        bind(VideoService.class).to(FaceBookVideoService.class);
    }
}
