import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import consumer.EmailConsumer;
import consumer.FaceBookConsumer;
import consumer.MyApplication;
import injector.EmailInjector;
import injector.FaceBookInjector;
import services.video.EmailVideoService;

import java.util.Scanner;

public class ClientApplication {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter service number");
        String str = myObj.nextLine();
        MyApplication app = null;
        
        if(str.equalsIgnoreCase("0")) {
            Injector injector = Guice.createInjector(new EmailInjector());
            app = injector.getInstance(MyApplication.class);
            app.SendMessage("Hi Pankaj", "pankaj@abc.com");
            app.SendVideo("Hi Pankaj", "pankaj@abc.com");
            EmailConsumer emailConsumer = injector.getInstance(EmailConsumer.class);
            emailConsumer.SendMessage("Hi Polo", "Polo@abc.com");
            emailConsumer.SendVideo("Hi Polo", "Polo@abc.com");
        }
        if(str.equalsIgnoreCase("1")) {
            Injector injector = Guice.createInjector(new FaceBookInjector());
            app = injector.getInstance(MyApplication.class);
            app.SendMessage("Hi Pankaj", "pankaj@abc.com");
            app.SendVideo("Hi Pankaj", "pankaj@abc.com");
            FaceBookConsumer faceBookConsumer = injector.getInstance(FaceBookConsumer.class);
            faceBookConsumer.SendMessage("Hi Polo", "Polo@abc.com");
            faceBookConsumer.SendVideo("Hi Polo", "Polo@abc.com");
        }


    }

}
