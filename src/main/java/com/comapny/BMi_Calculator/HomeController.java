package com.comapny.BMi_Calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.text.DecimalFormat;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(ModelMap modelMap) {
        modelMap.addAttribute("result","");
        return "home";
    }

    @RequestMapping (method = RequestMethod.POST)
    public String getResult( ModelMap modelMap, @RequestParam Integer weight, @RequestParam Integer height){
        DecimalFormat df = new DecimalFormat("#.##");
        if (weight==null) return "home";
        if (height==null) return "home";
        BMI_Calculation c = new BMI_Calculation();
        float r = c.calc(weight,height);
        modelMap.addAttribute("result",df.format(r));
        modelMap.addAttribute("result_info",c.bmi_info(r));
        return "home";

    }
}