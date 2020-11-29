package soap;

import javax.xml.ws.Endpoint;

public class PublishWS {

    public static void main(String[] args) {

        Conversor conversor = new Conversor();
        Endpoint.publish("http://localhost:8000/conversor", conversor);
        
        System.out.println("Server Started");
    }
    
}
