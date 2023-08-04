package com.kkh.springframe;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.Controller;
//import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

@Controller
public class HelloController {
	@Autowired HelloSpring helloSpring;

	@RequestMapping("/hello")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String name = request.getParameter("name");
		
		System.out.println("handleRequest called");
		
		String message = this.helloSpring.sayHello(name);
		
		Map<String, Object> model = new HashMap<>();
		model.put("message", message);
		// /WEB-INF/view/hello.jsp
		return new ModelAndView("/WEB-INF/view/hello.jsp", model);
	}

}


//public class HelloController implements Controller{
//	@Autowired HelloSpring helloSpring;
//
//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		String name = request.getParameter("name");
//		
//		System.out.println("handleRequest called");
//		
//		String message = this.helloSpring.sayHello(name);
//		
//		Map<String, Object> model = new HashMap<String, Object>();
//		model.put("message", message);
//		// /WEB-INF/view/hello.jsp
//		return new ModelAndView("/WEB-INF/view/hello.jsp", model);
//	}
//
//}
