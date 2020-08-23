package com.example.first;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @RequestMapping("home")
   /* public String home(HttpServletRequest req, HttpServletResponse res){
        HttpSession session= req.getSession();
        String name = req.getParameter("name");
        System.out.println("heyo "+ name);
        session.setAttribute("name", name);
        return "home";
    } */

    public ModelAndView home(@RequestParam("name") String myname) {
        ModelAndView mv= new ModelAndView();
        mv.addObject("name", myname);
        mv.setViewName("home");
        System.out.println("heyo " + myname);

        return mv;
    }
}
