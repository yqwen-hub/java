// AppModule2.java
package playground;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.name.Named;

public class AppModule2 extends AbstractModule {
    @Override
    protected void configure() {
        // No explicit bindings are required if only using @Provides methods.
    }

    @Provides
    @Singleton
    static MessageProvider provideMessageProvider() {
        return new HelloMessageProvider();
    }

    @Provides
    @Singleton
    static Integer provideNumber() {
        return 37;
    }
    
    @Provides
    @Singleton
    @Named("domain")
    static String provideDomain() {
        // Read the value of the "domain" environment variable
        return System.getenv("domain");
    }

    @Provides
    @Singleton
    @Named("region")
    static String provideRegion() {
        // Read the value of the "region" environment variable
        return System.getenv("region");
    }
}
