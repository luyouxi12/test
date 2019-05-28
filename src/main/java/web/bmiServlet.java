package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class bmiServlet extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String weight=request.getParameter("weight");
		String height=request.getParameter("height");
		double bmi=Double.parseDouble(weight)/Double.parseDouble(height)/Double.parseDouble(height);
		out.println("BMI:"+bmi);
		out.close();
	}
}
