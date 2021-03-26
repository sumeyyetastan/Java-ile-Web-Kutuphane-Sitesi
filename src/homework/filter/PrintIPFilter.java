package homework.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class PrintIPFilter implements Filter {

    
    public PrintIPFilter() {
      
    }

	
	public void destroy() {
		
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("IP: " + request.getRemoteAddr());
	
		chain.doFilter(request, response);
	}

	
	public void init(FilterConfig fConfig) throws ServletException {

	}

}
