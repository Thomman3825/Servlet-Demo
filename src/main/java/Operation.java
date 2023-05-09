import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Operation extends HttpServlet{

	public void service(HttpServletRequest req, HttpServletResponse res ) throws IOException {
		int n1 =Integer.parseInt( req.getParameter("n1"));
		int n2 =Integer.parseInt(req.getParameter("n2"));
		char op = req.getParameter("operator").charAt(0);
		
		
		
		
		
		
		PrintWriter p = res.getWriter();
		/* p.println(op); */
		if (op=='+') {
			int sum = n1+n2;
			p.println("Sum is " + sum);
		}
		else if (op=='*') {
			int product = n1*n2;
			p.println("Product is " + product);
		}
		else if (op=='-') {
			int diff=n1-n2;
			p.println("Difference is " + diff);
		}
		else if (op=='/') {
			float quo=n1/n2;
			p.println("Quotient is " + quo);
		}
		else {
			p.print("No result");
		}
		 
//		 System.out.print(sum);
				
	}
}
