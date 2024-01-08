// MyModule.java
package playground;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

public class guiceModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(App2.class).in(Singleton.class);
    }
}
