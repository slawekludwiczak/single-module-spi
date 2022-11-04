package pl.javastart.app;

import pl.javastart.api.MessageProvider;

import java.util.ServiceLoader;

class MessagePrinter {
    public static void main(String[] args) {
        ServiceLoader<MessageProvider> loader = ServiceLoader.load(MessageProvider.class);
        MessageProvider messageProvider = loader.findFirst().orElseThrow();
        System.out.println(messageProvider.getMessage());
    }
}
