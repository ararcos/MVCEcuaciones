/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import bean.primerGrado;
import bean.segundoGrado;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author alexa
 */
@Controller
public class ecuacionesController {
    @RequestMapping(value = "/ecuaciones/primergrado.htm", method = RequestMethod.GET)
    public String calcularPrimerGrado(Model m) {
        return "/ecuaciones/formPrimerGrado";
    }
    @RequestMapping(value = "/ecuaciones/primergrado.htm", method = RequestMethod.POST)
    public String calcularPrimerGrado(@RequestParam("txtA") double a,
            @RequestParam("txtC") double c,
            Model m) {
        primerGrado p1=new primerGrado(a,c);
        p1.calcularX();
        p1.obtenerTabla();
        m.addAttribute("calculoPrimerGrado", p1);
        m.addAttribute("tabla", p1.getTabla());
        return "/ecuaciones/viewPrimerGrado";
    }
    @RequestMapping(value = "/ecuaciones/segundogrado.htm", method = RequestMethod.GET)
    public String calcularSegundoGrado(Model m) {
        return "/ecuaciones/formSegundoGrado";
    }
    @RequestMapping(value = "/ecuaciones/segundogrado.htm", method = RequestMethod.POST)
    public String calcularSegundoGrado(@RequestParam("txtA") double a,
            @RequestParam("txtB") double b,
            @RequestParam("txtC") double c,
            Model m) {
        segundoGrado s1=new segundoGrado(a,b,c);
        s1.calcularX();
        s1.obtenerTabla();
        m.addAttribute("calculoSegundoGrado", s1);
        m.addAttribute("tabla", s1.getTabla());
        return "/ecuaciones/viewSegundoGrado";
    }
}
