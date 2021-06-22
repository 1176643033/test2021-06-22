package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @RequestMapping("/query.do")
    public ModelAndView queryTeacher(){
        System.out.println("teacherController is running");
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","teacherController");
        mv.setViewName("show");
        return mv;
    }
}
