package servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import function.GetInfo;

/**
 * Servlet implementation class GetTrail
 */
@WebServlet("/GetTrail")
public class GetTrail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetTrail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		final HttpSession session = request.getSession();
		String username,token;
		String result;
		GetInfo getinfo = new GetInfo();
		username = (String) session.getAttribute("username");
		token = (String) session.getAttribute("token");
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		date.format(new Date());
		result = getinfo.getTrail(username, token,date.format(new Date().getTime()-1728000000).toString(), date.format(new Date()).toString());
		response.getWriter().print(result);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
