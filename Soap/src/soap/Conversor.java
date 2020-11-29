package soap;

import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public class Conversor {
    
    @WebMethod
    public double realToDolar(double valor) {
        double dolar = 5.34;
        return valor / dolar;
    }
    
    @WebMethod
    public double dolarToReal(double valor) {
        double real = 0.19;
        return valor / real;
    }
    
    @WebMethod
    public double realToEuro(double valor) {
        double euro = 6.39;
        return valor / euro;
    }
    
    @WebMethod
    public double euroToReal(double valor) {
        double real = 0.16;
        return valor / real;
    }
    
    @WebMethod
    public double realToLibra(double valor) {
        double libra = 7.11;
        return valor / libra;
    }
    
    @WebMethod
    public double libraToReal(double valor) {
        double real = 0.14;
        return valor / real;
    }
    
}
