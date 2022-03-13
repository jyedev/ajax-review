package com.greedy.section01.jsonstring;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/receive/json")
public class ReceiveJsonStringServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		
		out.print("{\"type\":\"get\",\"firstName\":\"gwansoon\",\"lastName\":\"yoo\",\"age\":20}");
		
		out.flush();
		out.close();
	}


}
