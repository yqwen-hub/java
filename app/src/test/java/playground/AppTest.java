package playground;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void getGreeting() {
        // Create Dagger component
        AppComponent appComponent = DaggerAppComponent.create();

        // Get App instance with injected MessageProvider
        App classUnderTest = appComponent.getApp();

        // Use the App
        String greeting = classUnderTest.getGreeting();

        assertEquals("Hello, Dagger, 37, !", greeting);
    }
}
