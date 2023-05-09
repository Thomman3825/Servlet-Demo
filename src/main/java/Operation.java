import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Operation extends HttpServlet{

	public void service(HttpServletRequest req, HttpServletResponse res ) throws IOException {
		int n1 =Integer.parseInt( req.getParameter("n1"));
		int n2 =Integer.parseInt(req.getParameter("n2"));
		//String op = req.getParameter("operator");
		
		int sum = n1+n2;
		
//		PrintWriter p = res.getWriter();
//		 p.println("result is " + sum);
		 System.out.print(sum);
				
	}
}
