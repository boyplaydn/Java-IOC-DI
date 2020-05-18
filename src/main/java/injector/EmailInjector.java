package injector;

import com.google.inject.AbstractModule;
import services.message.EmailService;
import services.message.MessageService;
import services.video.EmailVideoService;
import services.video.VideoService;

public class EmailInjector extends AbstractModule {

    protected void configure() {
        bind(MessageService.class).to(EmailService.class);
        bind(VideoService.class).to(EmailVideoService.class);
    }
}