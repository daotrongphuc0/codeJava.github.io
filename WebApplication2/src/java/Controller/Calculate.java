/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author daotr
 */
public class Calculate extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private String cal(String n1,String n2,String op){
        String kq="" ;
        
        try{
            
            float numb1= Float.parseFloat(n1);
            float numb2= Float.parseFloat(n2);
            switch(op){
                case "+":
                    kq= Float.toString(numb2+numb1);
                    break;
                case "-":
                    kq= Float.toString(numb2-numb1);
                    break;
                case "x":
                    kq= Float.toString(numb2*numb1);
                    break;
                case ":":
                    kq= Float.toString(numb2/numb1);
                    break;
            }
            return n1+" "+op+" "+"n2"+" "+"="+" "+kq;
        
        }catch(NumberFormatException ex){
            return kq;
        }
            
        
        
        
    }
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String n1 = request.getParameter("numb1");
        String n2 = request.getParameter("numb2");
        String op = request.getParameter("op");
        PrintWriter out = response.getWriter();
        String s="\n"+
"<html>\n" +
"    <head>\n" +
"        <title>Calculate</title>\n" +
"        <meta charset=\"UTF-8\">\n" +
"        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    </head>\n" +
"    <body>\n" +
"        <div class=\"container\">\n" +
"            <form action=\"calculate\" method=\"post\">\n" +
"                number 1: <input type=\"text\" name=\"numb1\" value=\" "+n1+"   /> <br/>    \n" +
"                number 2: <input type=\"text\" name=\"numb2\" value=\""+n2+"   /> <br/>    \n" +
"                <select name=\"op\">\n" +
"                    <option value=\"+\">+</option>\n" +
"                    <option value=\"-\">-</option>\n" +
"                    <option value=\"*\">*</option>\n" +
"                    <option value=\"/\">/</option>\n" +
"                </select>\n" +
"                <input type=\"submit\" value=\"Tinh\"/>\n" +
"            </form>\n" +
"            \n" +
"            <h2 type:'color:red'>"+cal(n1,n2,op)+"</h2>"+   
"        </div>\n" +
"    </body>\n" +
"</html>";
        out.print(s);
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

}
