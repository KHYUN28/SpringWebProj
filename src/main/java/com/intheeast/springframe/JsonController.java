package com.intheeast.springframe;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JsonController {

    // produces 속성을 "application/json"으로 설정한 @ResponseBody 컨트롤러 메서드
    @GetMapping(value = "/json-data", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public MyData getJsonData() {
        MyData data = new MyData();
        data.setId(1);
        data.setName("John Doe");
        return data;
    }

    // JSON 데이터를 표현하는 클래스
    public static class MyData {
        private int id;
        private String name;

        public int getId() {
        	return id;
        }
        
        public String getName() {
        	return name;
        }
        
        public void setId(int id) {
        	this.id = id;
        }
        
        public void setName(String name) {
        	this.name = name;
        }
    }
}
