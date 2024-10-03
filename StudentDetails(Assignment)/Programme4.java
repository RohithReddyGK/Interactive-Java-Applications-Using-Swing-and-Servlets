import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
public class Programme4 extends HttpServlet {
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html");
		String name=request.getParameter("name");
		String usn=request.getParameter("usn");
		String department=request.getParameter("department");
		int sem=Integer.parseInt(request.getParameter("sem"));
		int ada=Integer.parseInt(request.getParameter("ADA"));
		int ds=Integer.parseInt(request.getParameter("DS"));
		int java=Integer.parseInt(request.getParameter("JAVA"));
		int dbms=Integer.parseInt(request.getParameter("DBMS"));
		int dms=Integer.parseInt(request.getParameter("DMS"));
		int biology=Integer.parseInt(request.getParameter("BIOLOGY"));
		int totalMarks=ada+ds+java+dbms+dms+biology;
		double percentage=(totalMarks/600.0)*100.0;
		java.io.PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Student Details.</title>");
		out.println("<style>");
		out.println("table ,th,td{border:1px solid black; border-collapse:collapse;} "
				+ "th,td{padding-top:10px;"
				+ "padding-bottom:5px;"
				+ "padding-left:55px;"
				+ "padding-right:30px;}"
				+ "tr:nth-child(even){background-color:#D6EEEE;}");
		out.println("</style>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>STUDENT DETAILS:</h1>");
		out.println("<p>Student Name:"+name+"</p>");
		out.println("<p>USN:"+usn+"</p>");
		out.println("<p>Department:"+department+"</p>");
		out.println("<p>Semester:"+sem+"</p>");
		out.println("<table style=width:40%>");
		out.println("<caption>6-subjects marks:</caption>");
		out.println("<tr>");
		out.println("<th>Subject Name</th>");
		out.println("<th>Subject Marks</th>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Analysis and Design of Algorithms</td>");
		out.println("<td>"+ada+"</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Data Structures</td>");
		out.println("<td>"+ds+"</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Advanced JAVA</td>");
		out.println("<td>"+java+"</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>DataBase Management Systems</td>");
		out.println("<td>"+dbms+"</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Discrete Mathematical Structures</td>");
		out.println("<td>"+dms+"</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Biology</td>");
		out.println("<td>"+biology+"</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Total Marks:</td>");
		out.println("<td>"+totalMarks+"</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Percentage:</td>");
		out.println("<td>"+percentage+"%</td>");
		out.println("</tr>");
		out.println("</table>");
		if(percentage>=90) {
			out.println("Grade:A+");
		}
		else if(percentage>=80 && percentage<90) {
			out.println("Grade:A");
		}
		else if(percentage>=70 && percentage<80) {
			out.println("Grade:B+");
		}
		else if(percentage>=60 && percentage<70) {
			out.println("Grade:B");
		}
		else {
			out.println("Grade:C");
		}
		out.println("</body>");
		out.println("</html>");
	}
}
