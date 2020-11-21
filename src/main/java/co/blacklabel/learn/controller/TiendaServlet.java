package co.blacklabel.learn.controller;

import co.blacklabel.learn.DAO.ClienteDAO;
import co.blacklabel.learn.DAO.SeguirDAO;
import co.blacklabel.learn.DAO.ServicioDAO;
import co.blacklabel.learn.DAO.TiendaDAO;
import co.blacklabel.learn.model.Tienda;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "TiendaServlet", urlPatterns = {"/"})
public class TiendaServlet extends HttpServlet {
  private final TiendaDAO tiendaDAO;
  private ClienteDAO clienteDAO;
  private SeguirDAO seguirDAO;
  private ServicioDAO servicioDAO;
  public TiendaServlet(){
    super();
    tiendaDAO = new TiendaDAO();
    clienteDAO = new ClienteDAO();
    seguirDAO = new SeguirDAO();
    servicioDAO = new ServicioDAO();
  }
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doGet(request, response);
  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String action = request.getServletPath();
    try{
      switch (action){
        case "/":
          listStores(request, response);
          break;
        case "/login":
          showLoginForm(request, response);
          break;
        case "/signup":
          showSignUpForm(request, response);
          break;
        case "/access":
          accessToPlatform(request, response);
          break;
        default:listStores(request, response);
      }
    } catch (IOException e){
      throw new ServletException(e);
    }
  }

  private void accessToPlatform(HttpServletRequest request, HttpServletResponse response) {
    String email = request.getParameter("email");
    String password = request.getParameter("password");

  }

  private void showSignUpForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    RequestDispatcher rd = request.getRequestDispatcher("signup");
    rd.forward(request, response);
  }

  private void showLoginForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    RequestDispatcher rd = request.getRequestDispatcher("signin.jsp");
    rd.forward(request, response);
  }

  private void listStores(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    List<Tienda> stores = tiendaDAO.list();
    request.setAttribute("stores", stores);
    RequestDispatcher rd = request.getRequestDispatcher("store-list.jsp");
    rd.forward(request, response);
  }
}
