/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Clima;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author angiem.vargas
 */
@WebServlet(name = "GenerarPrediccion", urlPatterns = {"/GenerarPrediccion"})
public class GenerarPrediccion extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            Tablita tabla=new Tablita();
            List <Clima> prediccion =getAll();
            //Clima estado=new Clima();
            float humedad=0;
            float temperatura=0;
            float viento=0;
            float nubosidad=0;
            float presionAtmosferica=0;
            for(Clima j: prediccion){
                humedad+=j.getHumedad();
                temperatura+=j.getTemperatura();
                viento+=j.getViento();
                nubosidad+=j.getNubosidad();
                presionAtmosferica+=j.getPresiónAtmosferica();
            }
            humedad=humedad/prediccion.size();
            temperatura=temperatura/prediccion.size();
            viento=viento/prediccion.size();
            nubosidad=nubosidad/prediccion.size();
            presionAtmosferica=presionAtmosferica/prediccion.size();
            
            float[]j=new float[5];
            j[0]=humedad;
            j[1]=temperatura;
            j[2]=viento;
            j[3]=nubosidad;
            j[4]=presionAtmosferica;
                    
            request.setAttribute("cositas", j);
            request.getRequestDispatcher("grafica.jsp").forward(request, response);
            
        }
    }
     private List<Clima> getAll()
    {
        EntityManager em;
        EntityManagerFactory emf;
        emf=Persistence.createEntityManagerFactory("PracticaF1.2PU");
        em=emf.createEntityManager();
        em.getTransaction().begin();
        List<Clima> estados=em.createNamedQuery("Clima.findAll").getResultList();
        em.getTransaction().commit();
        em.close();
        return estados;
    
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
