package com.byteslounge.http;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="myServlet",urlPatterns="/myservlet")
public class MyServlet extends HttpServlet {

	private static final long serialVersionUID = 777357956219353322L;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		StoreResponse.response = response;
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		try {
			// Write some content
			out.println("<html>");
			out.println("<head>");
			out.println("<title>MyFirstServlet</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h2>Servlet MyFirstServlet at "
					+ request.getContextPath() + "</h2>");
			out.println("</body>");
			out.println("</html>");
			out.flush();
			while (true) {
//                out.print("输出更新的内容");
//                out.flush();
//                Thread.sleep(3000);
			}
		} finally {
//			out.close();
		}
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}
}
