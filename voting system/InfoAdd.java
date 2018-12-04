package Project;
import java.util.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet(urlPatterns = {"/InfoAdd"})
public class InfoAdd extends HttpServlet {

    @Override
    public void service(HttpServletRequest req,HttpServletResponse res) throws IOException ,ServletException
    {
        
            String email = req.getParameter("email");
            String password = req.getParameter("psw");
            RegisterBean Reg = new RegisterBean();
            Reg.setEmail(email);
            Reg.setPassword(password);
            RegisterDao rDao = new RegisterDao();
            Boolean check=rDao.getRegistered(Reg);
            if(check==true)
                req.getRequestDispatcher("/login2.html").forward(req, res);
            else
            {
                req.setAttribute("errMessage", check);
                req.getRequestDispatcher("/signup.html").forward(req, res);
            }
        
    }
    
}
