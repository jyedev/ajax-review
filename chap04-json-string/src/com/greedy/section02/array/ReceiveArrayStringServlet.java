package com.greedy.section02.array;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/receive/array")
public class ReceiveArrayStringServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		out.print("[{\"type\":\"get\",\"firstName\":\"ppiyong\",\"lastName\":\"kim\",\"age\":22},"
				+ "{\"type\":\"get\",\"firstName\":\"gildong\",\"lastName\":\"hong\",\"age\":20}]");
		
		out.flush();
		out.close();
				
	}

}
