package clienteservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import soap.ConversorService;

@WebServlet(name = "ClienteConversor", urlPatterns = {"/ClienteConversor"})
public class ClienteConversor extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8000/conversor.wsdl")
    private ConversorService service;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String moeda = request.getParameter("moeda");
        String valorS = request.getParameter("valor");
        double valorD = Double.parseDouble(valorS);
        double result;
        DecimalFormat df = new DecimalFormat("###,###.00");
        
        switch(moeda) {
            case "RD":
                result = realToDolar(valorD);
                break;
            case "DR":
                result = dolarToReal(valorD);
                break;
            case "RE":
                result = realToEuro(valorD);
                break;
            case "ER":
                result = euroToReal(valorD);
                break;
            case "RL":
                result = realToLibra(valorD);
                break;
            case "LR":
                result = libraToReal(valorD);
                break;
            default:
                result = 0.0;
        }
              
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Resultado Conversão</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h3>Resultado: " + df.format(result) + "</h3>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private double dolarToReal(double arg0) {
        soap.Conversor port = service.getConversorPort();
        return port.dolarToReal(arg0);
    }

    private double euroToReal(double arg0) {
        soap.Conversor port = service.getConversorPort();
        return port.euroToReal(arg0);
    }

    private double libraToReal(double arg0) {
        soap.Conversor port = service.getConversorPort();
        return port.libraToReal(arg0);
    }

    private double realToDolar(double arg0) {
        soap.Conversor port = service.getConversorPort();
        return port.realToDolar(arg0);
    }

    private double realToEuro(double arg0) {
        soap.Conversor port = service.getConversorPort();
        return port.realToEuro(arg0);
    }

    private double realToLibra(double arg0) {
        soap.Conversor port = service.getConversorPort();
        return port.realToLibra(arg0);
    }

}
