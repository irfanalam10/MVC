/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasbulananapp.webcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author IRFAN ALAM
 */
@Controller
public class HomeController {
    @RequestMapping(value="/home")
    public ModelAndView home(HttpServletRequest req,HttpServletResponse res) {
        
        return new ModelAndView();
    }
    
}
