package com.example.fakeshopapi.test;

import com.example.fakeshopapi.dto.ResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/test")
public class TestController {
    @GetMapping("")
    public ResponseDto<String> test(){
        List<String> list = new ArrayList<>();
        list.add("aaa");
        ResponseDto<String> asd = ResponseDto.<String>builder()
                .response(list)
                .build();
        return asd;
    }
}
