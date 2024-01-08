// HelloMessageProvider.java
package playground;

import javax.inject.Singleton;

@Singleton
public class HelloMessageProvider implements MessageProvider {
    @Override
    public String getMessage(Integer i) {
        return "Hello, Dagger, " + i.toString() + ", !";
    }
}
