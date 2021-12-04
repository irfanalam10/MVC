/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasbulananapp.webcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import kasbulananapp.model.LoginModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author IRFAN ALAM
 */
@Controller
public class LoginController {
 @RequestMapping(value="/Login")
 public ModelAndView login(HttpServletRequest req,HttpServletResponse res) {
     if(req.getParameter("message")!= null){
         ModelAndView modelAndView= new ModelAndView();
         modelAndView.addObject("message",req.getParameter("message"));
         return modelAndView;
     }
     return new ModelAndView();
 }
 
 @RequestMapping(value="/login/save", method = RequestMethod.GET)
 public ModelAndView save(@ModelAttribute("emp") LoginModel emp) {
     ModelAndView modelAndView= new ModelAndView("redirect:/login.htm");
     if(emp.getUsername()!=null && emp.getPassword()!=null){
            if(emp.getUsername().equalsIgnoreCase("alam") &&
                emp.getPassword().equalsIgnoreCase("alam")){
                return new ModelAndView("redirect:/home");
            }else{
                modelAndView.addObject("message", "Username atau password salah");
                }
            }else{
                modelAndView.addObject("message", "Username & password tidak boleh kosong");
            }
            return modelAndView;
        }
    }
