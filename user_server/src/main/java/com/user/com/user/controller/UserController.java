package com.user.com.user.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.user.com.user.pojo.ResultMsg;
import com.user.com.user.pojo.UserPo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/sayHello/{name}")
    public String sayHello(@PathVariable String name){
        return "hello"+name;

    }

    @GetMapping("/getAllUser")
    public List<ResultMsg> getAllUser(){
        List<ResultMsg> list=new ArrayList<ResultMsg>();
        list.add(new ResultMsg("0","成功",new UserPo("黄志001","123456",34)));
        list.add(new ResultMsg("0","成功",new UserPo("黄志002","123456",34)));
        list.add(new ResultMsg("0","成功",new UserPo("黄志003","123456",34)));

        return list;
    }

    @GetMapping("/getUserById")
    public List<ResultMsg> getUserById(@PathVariable int id){
        List<ResultMsg> list=new ArrayList<ResultMsg>();
        list.add(new ResultMsg("0","成功",new UserPo("黄志001","123456",34)));
        list.add(new ResultMsg("0","成功",new UserPo("黄志002","123456",34)));
        list.add(new ResultMsg("0","成功",new UserPo("黄志003","123456",34)));
        return list;

    }
}
