package com.greedy.section03.jsonarray;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/receive/jsonarray")
public class ReceiveJsonArrayServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/* 응답 헤더의 content-type 설정을 application/json으로 한다. */
		response.setContentType("application/json; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		out.print("[{\"type\":\"get\",\"firstName\":\"gwansoon\",\"lastName\":\"yoo\",\"age\":20},"
				+ "{\"type\":\"get\",\"firstName\":\"gildong\",\"lastName\":\"hong\",\"age\":22}]");
		
		out.flush();
		out.close();
	}

}
