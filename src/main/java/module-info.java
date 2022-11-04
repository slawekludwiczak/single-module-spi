module spi.dependency {
    exports pl.javastart.api;
    provides pl.javastart.api.MessageProvider with pl.javastart.spi.MockMessageProvider;
    uses pl.javastart.api.MessageProvider;
}
