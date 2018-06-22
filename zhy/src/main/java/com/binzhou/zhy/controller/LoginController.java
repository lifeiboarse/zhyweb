package com.binzhou.zhy.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.binzhou.zhy.model.dto.basic.UserDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/loginapi")
public class LoginController {

    @RequestMapping("/login")
    public String login(@RequestParam(defaultValue = "test", required = false) String username, @RequestParam(defaultValue = "123456", required = false) String password) {
        JSONObject map = new JSONObject();
        JSONObject object = new JSONObject();
        List<UserDTO> data=new ArrayList<UserDTO>();
        UserDTO user=new UserDTO();
        user.setMemberName("memberName");
        user.setMemberAvatar("memberAvatar");
        data.add(user);
        object.put("result", "1");
        object.put("msg", "username/password ok");
        object.put("data", data);
        map.put("data", object);
        String result = JSONObject.toJSONString(map);
        return result;
    }

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<String, Object>();
        JSONObject object = new JSONObject();
        object.put("result", "1");
        map.put("data", object);
        String s = JSONObject.toJSONString(map);

        System.out.println("args = [" + s + "]");
    }
}
