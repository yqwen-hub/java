// AppModule.java
package playground;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module
public class AppModule {
    @Provides
    @Singleton
    static MessageProvider provideMessageProvider(Integer number) {
        // You can change this to provide a different implementation
        System.out.println("number = " + number.toString());
        return new HelloMessageProvider();
    }
    
    @Provides
    @Singleton
    static Integer provideNumber() {
        return 37;
    }    
}
