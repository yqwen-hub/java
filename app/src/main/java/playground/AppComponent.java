// AppComponent.java
package playground;

import dagger.Component;
import javax.inject.Singleton;

@Component(modules = AppModule.class)
@Singleton
public interface AppComponent {
    App getApp();
}
