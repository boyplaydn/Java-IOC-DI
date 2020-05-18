package consumer;

import services.message.MessageService;

public interface MessageConsumer {
    void SetMessageService(MessageService messageService);
}
