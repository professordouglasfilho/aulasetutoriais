package br.com.fuctura.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import br.com.fuctura.utils.Logs;

/**
 * Intercepta solicitações (requests) antes de entregar ao controller
 * @author douglas.f.filho
 *
 */
public class MainInterceptor  extends HandlerInterceptorAdapter{

	@Override
	  public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object controller) throws Exception
	 {
		  String uri = request.getRequestURI();
	      
		  Logs.info("[MainInterceptor INFO]: URL("+uri+")");
		  
	      return true;
	 }
	
}
