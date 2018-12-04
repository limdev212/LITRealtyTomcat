/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;
import db.Agents;
import db.AgentsDB;
import db.Properties;
import db.PropertiesDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author James
 */
@WebServlet(name = "SaveEditServlet", urlPatterns = {"/SaveEditServlet"})
public class SaveEditServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        
            String street = request.getParameter("street");
            String description = request.getParameter("description");
            String listingnum = request.getParameter("listingnum");
            String city = request.getParameter("city");
            String price = request.getParameter("price");
            String bedrooms = request.getParameter("bedrooms");
            String bathrooms = request.getParameter("bathrooms");
            String squarefeet = request.getParameter("squarefeet");
            String ber = request.getParameter("ber");
            String lotsize = request.getParameter("lotsize");
            String garagesize = request.getParameter("garagesize");
            String garagetype = request.getParameter("garagetype");
            String propertytype = request.getParameter("propertytype");
            String style = request.getParameter("styletype");
            String propertyid = request.getParameter("propertyid");
            String agent = request.getParameter("agent");
            
            Agents a = AgentsDB.getAgentByID(Integer.valueOf(agent));
            
            Properties p = new Properties();
            p.setId(Integer.valueOf(propertyid));
            p.setAgentId(a.getAgentId());
            p.setStreet(street);
            p.setCity(city);
            p.setListingNum(Integer.valueOf(listingnum));
            p.setStyleId(Integer.valueOf(style));
            p.setTypeId(Integer.valueOf(propertytype));
            p.setBedrooms(Integer.valueOf(bedrooms));
            p.setBathrooms(Float.valueOf(bathrooms));
            p.setSquarefeet(Integer.valueOf(squarefeet));
            p.setBerRating(ber);
            p.setDescription(description);
            p.setLotsize(lotsize);
            p.setGaragesize(Short.valueOf(garagesize));
            p.setGarageId(Integer.valueOf(garagetype));
            p.setPhoto(listingnum + ".jpg");
            p.setPrice(Double.valueOf(price));
            Date d = new Date();

            p.setDateAdded(d);

            PropertiesDB.updateProperty(p);
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("AdminIndex?agentid=" + a.getAgentId());
            dispatcher.forward(request, response);
            
            
        
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
