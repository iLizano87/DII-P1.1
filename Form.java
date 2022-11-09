package webPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Form
 */
@WebServlet("/Form")
public class Form extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Form() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("nombre");
		String password = request.getParameter("pass");
		String password2 = request.getParameter("pass2");
		
		//Si usuario no esta vacio y contraseñas son iguales
		if (username != "" && password.equals(password2) && password != "") {

			System.out.println("Usuario: " + username);
			System.out.println("Pass: " + password);

			// Usuario registrado=new Usuario(username, password, password2);

			//Accede a form.jsp
			request.getRequestDispatcher("form.jsp").forward(request, response);
		} else if (username == "") { //Si el nombre esta vacio
			request.setAttribute("error_name", "Introduce nombre válido"); //Muestra error
			request.getRequestDispatcher("index.jsp").forward(request, response); //Vuelve a cargar index(mostrando error)
		} else {
			request.setAttribute("error_pass", "Contraseñas deben ser iguales y no estar vacías");//Muestra error
			request.setAttribute("user_old", username);//Conserva el antiguo usuario
			request.getRequestDispatcher("index.jsp").forward(request, response);//Vuelve a cargar index(mostrando error)
		}

	}

}
