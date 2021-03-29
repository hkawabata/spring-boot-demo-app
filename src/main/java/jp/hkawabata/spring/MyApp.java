package jp.hkawabata.spring;

import jp.hkawabata.spring.model.MyDictItem;
import jp.hkawabata.spring.model.MyResponse;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
@EnableAutoConfiguration
public class MyApp {

    /**
     * @return Hello World
     */
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    /**
     * @return 適当に作ったJSON文字列
     */
    @RequestMapping("/json")
    MyResponse myResponse() {
        MyResponse res = new MyResponse(10, "str", new ArrayList<MyDictItem>(
                Arrays.asList(
                        new MyDictItem("Taro", 20),
                        new MyDictItem("Jiro", 24))));
        return res;
    }

    /**
     * @param contentType レスポンス形式
     * @return 指定されたContent-Typeのレスポンス
     */
    @RequestMapping("/responseEntity")
    ResponseEntity<String> responseEntity(@RequestParam("contentType") String contentType) {
        String body = "<html>Hello, World!</html>";
        if (contentType.equals("html")) {
            HttpHeaders headers = new HttpHeaders();
            headers.add(HttpHeaders.CONTENT_TYPE, "text/html");
            return new ResponseEntity<>(body, headers, HttpStatus.OK);
        } else {
            HttpHeaders headers = new HttpHeaders();
            headers.add(HttpHeaders.CONTENT_TYPE, "text/plain");
            return new ResponseEntity<>(body, headers, HttpStatus.OK);
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(MyApp.class, args);
    }

}