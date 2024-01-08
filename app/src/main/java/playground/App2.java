package playground;

// App.java
import com.google.inject.Inject;
import com.google.inject.name.Named;

public class App2 {
    private final MessageProvider messageProvider;
    private final Integer n;
    private final String domain;
    private final String region;

    @Inject
    public App2(MessageProvider messageProvider, Integer number, @Named("domain") String domain, @Named("region") String region) {
        this.messageProvider = messageProvider;
        this.n = number;
        this.domain = domain;
        this.region = region;
    }

    public String getGreeting() {
        return messageProvider.getMessage(n);
    }
    
    public String getDomain() {
        return this.domain;
    }
    
    public String getRegion() {
        return this.region;
    }
}
