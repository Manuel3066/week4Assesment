package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.SubtractionConverter;

/**
 * Servlet implementation class getSubtractionServlet
 */
@WebServlet("/getSubtractionServlet")
public class getSubtractionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getSubtractionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userSubtraction= request.getParameter("userNumber");
		SubtractionConverter userSub = new SubtractionConverter(Integer.parseInt(userSubtraction));
		
		
		request.setAttribute("userSubtractionResult", userSub);
		getServletContext().getRequestDispatcher("/subtractionResult.jsp").forward(request, response);
	}

}
