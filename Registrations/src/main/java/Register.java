
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Register extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	PrintWriter out=response.getWriter();
    String uname = request.getParameter("uname");
    String password = request.getParameter("password");
    String email =  request.getParameter("email");
    Integer phone = request.getIntHeader("phone");
    
    Member member = new Member(uname,password,email,phone);
    RegisterDao rDao = new RegisterDao();
    String result = rDao.insert(member);
    

    RequestDispatcher rd = request.getRequestDispatcher("home.html");
    rd.include(request,response);
    }
}
