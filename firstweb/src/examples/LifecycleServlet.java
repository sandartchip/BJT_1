package examples;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/LifecycleServlet") 
public class LifecycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public LifecycleServlet() {
    	System.out.println("LifeCycle Servlet 생성!!"); //콘솔에만 출력함. 응답 결과 보내주는건 X
    	//서블릿 요청이 들어왔을 때, 메모리(?)에 해당 서블릿이 없으면 서블릿을 새로 생성 함. 
    }

 	public void init(ServletConfig config) throws ServletException {
 		System.out.println("init 하이룽호출!!");
 		System.out.println("init 하이룽호출!!");
 		System.out.println("init 하이룽호출!!");
 		System.out.println("init 하이룽호출!!");
 		System.out.println("init 하이룽호출!!");
 		System.out.println("init 하이룽호출!!2");
 		System.out.println("init 하이룽호출!!2");
 		System.out.println("init 하이룽호출!!2");
 		System.out.println("init 하이룽호출!!2");
 		System.out.println("init 하이룽호출!!2 SVNSNVSVNSVSNVSNVN");
 		System.out.println("init 하이룽호출!!2 SVNSNVSVNSVSNVSNVN");
 		System.out.println("init 하이룽호출!!2 SVNSNVSVNSVSNVSNVN");
 		System.out.println("init 하이룽호출!!2 SVNSNVSVNSVSNVSNVN");
 		System.out.println("init 하이룽호출!!2 SVNSNVSVNSVSNVSNVN");
 		System.out.println("init 하이룽호출!!2 SVNSNVSVNSVSNssssVSNVN22222222222222");
	}
 
	public void destroy() {
		System.out.println("destroy 호출!!");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Service 호출!! ");
	}

}

