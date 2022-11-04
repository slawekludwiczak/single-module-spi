package pl.javastart.spi;

import pl.javastart.api.MessageProvider;

public class MockMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Mocked message";
    }
}
