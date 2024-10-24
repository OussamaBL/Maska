package org.example.Controller;

import org.example.Model.Member;
import org.example.Repository.MemberRepository;
import org.example.Service.MemberService;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "home",urlPatterns = {"/home"})
public class HomeController extends HttpServlet {

    @Override
    public void init() throws ServletException {

        super.init();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Get the Spring WebApplicationContext
        WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());

        // Get the MemberService bean from the Spring context
        MemberService memberService = context.getBean(MemberService.class);

        // Use the service to retrieve the list of members
        List<Member> listMembers = memberService.listMembers();

        // Set the list of members as an attribute to pass to the JSP
        req.setAttribute("listMembers", listMembers);

        // Forward the request to the JSP
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("listMembre.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }


}
