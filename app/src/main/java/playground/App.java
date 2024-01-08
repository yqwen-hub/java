// App.java
package playground;

import javax.inject.Inject;

public class App {
    private final MessageProvider messageProvider;
    private final Integer n;

    @Inject
    public App(MessageProvider messageProvider, Integer number) {
        this.messageProvider = messageProvider;
        this.n = number;
    }

    public String getGreeting() {
        return messageProvider.getMessage(n);
    }
}
