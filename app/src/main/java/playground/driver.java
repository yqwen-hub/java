package playground;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class driver {

   public static void main(String[] args) {
        // Create Dagger component
        /*
        AppComponent appComponent = DaggerAppComponent.create();

        // Get App instance with injected MessageProvider
        App app = appComponent.getApp();

        // Use the App
        System.out.println(app.getGreeting());       
        */
        
        Injector injector = Guice.createInjector(new AppModule2());
        App2 app2 = injector.getInstance(App2.class);

        System.out.println(app2.getGreeting());
        System.out.println(app2.getDomain());
        System.out.println(app2.getRegion());
   }
}