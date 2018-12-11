/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import grafospeso.Grafo;
import grafospeso.GrafoSingleton;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author xavier
 */
public class Inicio extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Inicio</title>");
            out.println("</head>");
            out.println("<body>");

            out.println("<div>");
            out.println("<div>");
            out.println("<div>");
            out.println("<form method=\"get\" action=\"/Proyecto4/Adicionar\">");
            out.println("<table>");
            out.println("<tr>");
            out.println("<td>");
            out.println("Nueva Ciudad:");
            out.println("</td>");
            out.println("<td>");
            out.println("<input id=\"nombre\" name=\"nombre\" type=\"text\" placeholder=\"Ingrese nombre de la ciudad\" required=\"false\"/>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td colspan=\"2\">");
            out.println("<input id= \nuevo\" type=\"submit\" value=\"Crear\"/>");
            out.println("</td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</form>");
            out.println("</div>");

            out.println("<br>");

            out.println("<div>");
            out.println("<label>");
            out.println("Puntos:");
            out.println("</label>");
            out.println("<label>");
            out.println(GrafoSingleton.instanciaCosto().mostrarVertices());
            out.println("</label>");
            out.println("</div>");

            out.println("<br>");

            out.println("<div>");
            out.println("<form method=\"get\" action=\"/Proyecto4/AdicionarRuta\">");
            out.println("<table");
            out.println("<tr>");
            out.println("<td>");
            out.println("<label>");
            out.println("Origen:");
            out.println("</label>");
            out.println("</td>");
            out.println("<td>");
            out.println("<select name= \"origen\">");
            Grafo grafo = GrafoSingleton.instanciaCosto();
            List<String> vertices = grafo.getIdsVertices();
            for (String vertice : vertices) {
                out.println("<option value=\"" + vertice + "\">" + vertice + "</option>");
            }
            out.println("</select>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<label>");
            out.println("Destino:");
            out.println("</label>");
            out.println("</td>");
            out.println("<td>");
            out.println("<select name=\"destino\">");
            for (String vertice : vertices) {
                out.println("<option value=\"" + vertice + "\">" + vertice + "</option>");
            }
            out.println("</select>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<label>");
            out.println("Costo:");
            out.println("</label>");
            out.println("</td>");
            out.println("<td>");
            out.println("<input id=\"costo\" name=\"costo\" type=\"int\" placeholder=\"Ingrese costo destino\" required=\"true\"/>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<label>");
            out.println("Tiempo de viaje:");
            out.println("</label>");
            out.println("</td>");
            out.println("<td>");
            out.println("<input id=\"tiempo\" name=\"tiempo\" type=\"int\" placeholder=\"Ingrese el tiempo de viaje\" required=\"true\"/>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td colspan=\"2\">");
            out.println("<input id=\"ruta\" type=\"submit\" value=\"Guardar Ruta\" name=\"pulsado\"/>");
            out.println("</td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</form>");
            out.println("</div>");
            out.println("</div>");

            out.println("<br>");

            out.println("<div>");
            out.println("<label>");
            out.println("Destinos:");
            out.println("</label>");
            String pulsado = request.getParameter("submit");
            if (pulsado.equals("Guardar Ruta")) {
                out.println("<label>");
                out.println(GrafoSingleton.instanciaCosto().mostrarAristas());
                out.println("</label>");
            }
            out.println("</div>");
            out.println("</div>");
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

}


/*
out.println("<div>");
            out.println("<form method=\"get\" action=\"/Proyecto4/Adicionar\">");
            out.println("Nuevo Punto: <input id=\"nombre\" name=\"nombre\" type=\"text\" placeholder=\"Ingrese nombre de nuevo punto\" required=\"false\"/>");
            out.println("<input id=\"nuevo\" type=\"submit\" value=\"Añadir nuevo punto\"/>");
            out.println("</form>");

            out.println("</div>");
            out.println("<H1></H1>");
            out.println("<div>");
            out.println("<form method=\"get\" action=\"/Proyecto4/AdicionarRuta\">");
            out.println("<div>");
            out.println("<label>");
            out.println("Origen:");
            out.println("</label>");
Grafo grafo = GrafoSingleton.instanciaCosto();
            List<String> vertices = grafo.getIdsVertices();
            out.println("<select name=\"origen\" >");
            for (String vertice : vertices) {
                out.println("<option value=\"" + vertice + "\">" + vertice + "</option>");
            }
            out.println("</select>");
            out.println("<H1></H1>");
            out.println("<div>");
            out.println("<label>");
            out.println("Destino:");
            out.println("</label>");
            out.println("<select name=\"destino\">");
            for (String vertice : vertices) {
                out.println("<option value=\"" + vertice + "\">" + vertice + "</option>");
            }
            out.println("</select>");
            out.println("<H1></H1>");
            out.println("Costo: <input id=\"costo\" name=\"costo\" type=\"int\" placeholder=\"Ingrese el precio\" required=\"true\"/>");
            out.println("<H1></H1>");
            out.println("Tiempo de viaje: <input id=\"tiempo\" name=\"tiempo\" type=\"int\" placeholder=\"Ingrese el tiempo de demora\" required=\"true\"/>");
            out.println("<H1></H1>");
            out.println("<input id=\"ruta\" type=\"submit\" value=\"Añadir ruta\"/>");
            out.println("</form>");
            out.println("</div>");

            out.println("<div>");
            out.println("<label>");
            out.println(GrafoSingleton.instanciaCosto().mostrarVertices());
            out.println("</label>");
            out.println("<br/>");
            out.println("<label>");
            out.println(GrafoSingleton.instanciaCosto().mostrarAristas());
            out.println("</label>");
            out.println("</div>");


 */
