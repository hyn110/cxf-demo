import com.fmi110.cxf.service.HelloWorld;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by huangyunning on 2017/12/20.
 */
public class HelloClient {

    public static void main(String args[]) throws Exception {
        // START SNIPPET: client
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("client-beans.xml");

        HelloWorld client = (HelloWorld)context.getBean("client");

        String response = client.sayHi("Joe");
        System.out.println("Response: " + response);



        System.exit(0);
        // END SNIPPET: client
    }
}
