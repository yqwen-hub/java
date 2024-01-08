// GoodbyeMessageProvider.java
package playground;

public class GoodbyeMessageProvider implements MessageProvider {
    @Override
    public String getMessage(Integer i) {
        return "Goodbye, Dagger!";
    }
}
