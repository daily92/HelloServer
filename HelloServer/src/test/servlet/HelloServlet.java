package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// /hello 요청이 왔을 때 응답할 수 있도록 설정 
//			(annotation/server 가 start 되는 시점에 읽혀짐)
//@Web + ctrl + space
@WebServlet("/hello")
public class HelloServlet extends HttpServlet{
	//service + ctrl + space (서비스 메소드 오버라이드)
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 클라이언트에게 출력하기 위한 객체의 참조값 얻어오기
		PrintWriter pw= response.getWriter();
		// 클라이언트에게 문자열 출력하기 (world! 라는 문자열 응답하기)
		pw.println("world!");
	}
}
