import com.caucho.hessian.client.HessianProxyFactory;
import com.hhl.service.IHello;

import java.net.MalformedURLException;

/**
 * Created by admin on 2014/10/16.
 */
public class ClientTest {


    //前提：
    /*
    web.xml
    <servlet>
    <servlet-name>Hello</servlet-name>
    <servlet-class>com.caucho.hessian.server.HessianServlet</servlet-class>
    <init-param>
    <param-name>home-class</param-name>
    <param-value>com.hhl.service.IHelloImpl</param-value>
    </init-param>
    <init-param>
    <param-name>home-api</param-name>
    <param-value>com.hhl.service.IHello</param-value>
    </init-param>
    <load-on-startup>1</load-on-startup>
    </servlet>
    <servlet-mapping>
    <servlet-name>Hello</servlet-name>
    <url-pattern>/Hello</url-pattern>
    </servlet-mapping>
    打包部署
    */
    public static String url = "http://127.0.0.1:8888/Hello";

    public static void  main(String[] args){
        HessianProxyFactory factory = new HessianProxyFactory();
        try {
            IHello iHello = (IHello) factory.create(IHello.class, url);
            System.out.println(iHello.sayHello());
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
