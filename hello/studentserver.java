package com.sathya.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/studentserver")
public class studentserver extends HttpServlet {                      
	private static final long serialVersionUID = 1L;

    public studentserver() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     int rollNumber=Integer.parseInt(request.getParameter("num"));
	     String studentName=request.getParameter("sname");
	     int sub1=Integer.parseInt(request.getParameter("sub1"));
	     int sub2=Integer.parseInt(request.getParameter("sub2"));
	     int sub3=Integer.parseInt(request.getParameter("sub3"));
	     int sub4=Integer.parseInt(request.getParameter("sub4"));
	     int sub5=Integer.parseInt(request.getParameter("sub5"));
	     int sub6=Integer.parseInt(request.getParameter("sub6"));
	      int marks=sub1+sub2+sub3+sub4+sub5+sub6;
	     float avg=marks/6;
	     float cgpa=(avg/100)*10;
	     char grade;
	     String result;
		if((sub1<35)&&(sub2<35)&&(sub3<35)&&(sub4<35)&&(sub5<35)&&(sub6<35))
	     {
	    	   result="Fail";   
	     }
		else
		{
			    result="Pass";
		}
		
		if((cgpa<=10)&&(cgpa>=7.5))
		{
			  grade='A';
		}
		else if((cgpa<7.5)&&(cgpa>=6))
		{
			  grade='B';
		}
		else if((cgpa<6)&&(cgpa>=5))
		{
			  grade='C';
		}
		else if((cgpa<5)&&(cgpa>4))
		{
			  grade='D';
		}
		else
		{
			grade='E';
		}
				
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
        writer.println("Studentid:"+rollNumber+"<br>");
        writer.println("StudentName:"+studentName+"<br>");
        writer.println("sub1:"+sub1+"<br>");
        writer.println("sub2:"+sub2+"<br>");
        writer.println("sub3:"+sub3+"<br>");
        writer.println("sub4:"+sub4+"<br>");
        writer.println("sub5:"+sub5+"<br>");
        writer.println("sub6:"+sub6+"<br>");
        writer.println("marks:"+marks+"<br>");
        writer.println("cgpa:"+cgpa+"<br>");
        writer.println("grade:"+grade+"<br>");
        writer.println("result:"+result+"<br>");
	}



}
