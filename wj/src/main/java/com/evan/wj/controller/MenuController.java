package com.evan.wj.controller;

import com.evan.wj.pojo.AdminMenu;
import com.evan.wj.result.Result;
import com.evan.wj.result.ResultFactory;
import com.evan.wj.service.AdminMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MenuController {

    @Autowired
    AdminMenuService adminMenuService;


    @CrossOrigin
    @GetMapping("/api/menu")
    @ResponseBody
    public List<AdminMenu> menu() {
        return adminMenuService.getMenusByCurrentUser();
    }
}
