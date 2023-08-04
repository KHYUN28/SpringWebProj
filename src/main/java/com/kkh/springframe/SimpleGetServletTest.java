package com.kkh.springframe;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import javax.servlet.ServletException;

import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

public class SimpleGetServletTest {
	
	@Test
	public void DeathTest() throws ServletException, IOException {
		
		MockHttpServletRequest req = new MockHttpServletRequest("GET", "/hello");
		req.addParameter("name", "Spring");	
		
		MockHttpServletResponse res = new MockHttpServletResponse();
		
		SimpleGetServlet servlet = new SimpleGetServlet();
		servlet.service(req, res);
		
		assertEquals(res.getContentAsString(), 
				"<HTML><BODY>Hello Spring</BODY></HTML>");				
	}

}
