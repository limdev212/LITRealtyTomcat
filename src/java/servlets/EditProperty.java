/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;
import db.Agents;
import db.Properties;
import db.Propertytypes;
import db.Garagetypes;
import db.Styles;
import db.StylesDB;
import db.PropertiesDB;
import db.PropertytypesDB;
import db.AgentsDB;
import db.GarageDB;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "EditProperty", urlPatterns = {"/EditProperty"})
public class EditProperty extends HttpServlet {

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
        
            Integer propertyId = Integer.parseInt(request.getParameter("id"));
            
            Properties p = PropertiesDB.getPropertyByID(propertyId);
            request.setAttribute("property", p);
            
            Agents a = AgentsDB.getAgentByID(p.getAgentId());
            
            request.setAttribute("agent", a);
            
            Garagetypes g = GarageDB.getGarageTypeByID(p.getGarageId());
            
            request.setAttribute("garagetype", g);
            
            Propertytypes pt = PropertytypesDB.getPropertytypesByID(p.getTypeId());
            
            request.setAttribute("propertytype", pt);
            
            Styles s = StylesDB.getStyleByID(p.getStyleId());
            
            request.setAttribute("style", s);
            
            RequestDispatcher rd = request.getRequestDispatcher("edit-property.jsp");
            rd.forward(request, response);
        
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
