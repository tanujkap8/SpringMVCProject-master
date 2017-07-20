package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;


//Question 1
/*
public class StudentController  extends AbstractController {

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        ModelAndView modelAndView = new ModelAndView("myindex");
        modelAndView.addObject("message","Hello from index.jsp");
        return modelAndView;
    }
}*/

//Question 2
/*
public class StudentController  extends MultiActionController {


    public ModelAndView pageRenderController(HttpServletRequest httpServletRequest,
                       HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView("myindex");
        pageShowController(httpServletRequest,httpServletResponse);
        return modelAndView;
    }

    public void pageShowController(HttpServletRequest httpServletRequest,
                       HttpServletResponse httpServletResponse) throws Exception {
        httpServletResponse.setContentType("text/html");
        httpServletResponse.getWriter().println("<b>HELLO World</b>");
    }
}*/

//Question 3
@Controller
public class StudentController{

/*    @RequestMapping(value = "/")
    public ModelAndView callIndexJsp(){

        ModelAndView modelAndView = new ModelAndView("myindex");
        modelAndView.addObject("message","Hello from index.jsp");
        return modelAndView;
    }

    //Question 4
    @RequestMapping("/index")
    @ResponseBody
    String hello(){
        return "Hello World";
    }

    //Question 5
    @RequestMapping("/page")
    public ModelAndView callJsp(){

        ModelAndView modelAndView = new ModelAndView("myindex");
        modelAndView.addObject("message","Hello World");
        return modelAndView;
    }

    //Question 6
    @RequestMapping(value = "/{fname}/{lname}" )
    public ModelAndView submit(@PathVariable("fname")String fname,@PathVariable("lname") String lname){
        ModelAndView modelAndView = new ModelAndView("myindex");
        modelAndView.addObject("message","First Name: "+fname+"\n Last Name: "+lname);
        return  modelAndView;

    }

    //Question 7
    @RequestMapping(value = "/index/{firstname}/{lastname}" )
    public ModelAndView newsubmit(@PathVariable Map<String,String> name){
        String fname = name.get("firstname");
        String lname = name.get("lastname");
        ModelAndView modelAndView = new ModelAndView("myindex");
        modelAndView.addObject("message","First Name: "+fname+" Last Name: "+lname);
        return  modelAndView;

    }

    //Question 8
    @RequestMapping("/form")
    public ModelAndView callFormJsp(){

        ModelAndView modelAndView = new ModelAndView("form");
        return modelAndView;
    }

*//*    @RequestMapping(value = "/submitForm" ,method = RequestMethod.POST)
    public ModelAndView submitForm(@RequestParam("firstName")String fname, @RequestParam("lastName") String lname){
        ModelAndView modelAndView = new ModelAndView("myindex");
        modelAndView.addObject("message","First Name: "+fname+"\nLast Name: "+lname);
        return  modelAndView;

    }*//*

    //Question 9
    @RequestMapping(value = "/submitForm" ,method = RequestMethod.POST)
    public ModelAndView submitForm(StudentCO studentCO){
        String fname = studentCO.getFirstName();
        String lname = studentCO.getLastName();
        ModelAndView modelAndView = new ModelAndView("myindex");
        modelAndView.addObject("message","First Name: "+fname+"\nLast Name: "+lname);
        return  modelAndView;

    }*/

    //Question 10
    @ModelAttribute
    public void defaultAction(Model model){
        model.addAttribute("message","Spring MVC Demo");
    }

    @RequestMapping("/index")
    public ModelAndView callIndexJsp(){

        ModelAndView modelAndView = new ModelAndView("myindex");
        return modelAndView;
    }

}