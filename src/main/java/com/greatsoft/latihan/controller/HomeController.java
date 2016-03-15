/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.greatsoft.latihan.controller;

import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ustadho
 */
@Controller
public class HomeController {

    @RequestMapping("halorest")
    @ResponseBody
    public ModelMap halo() {
        ModelMap mm = new ModelMap();
        mm.addAttribute("salam", "Halo Dunia");
        mm.addAttribute("nama", "Ustadho");
        return mm;
    }
    @RequestMapping("salam")
    public String salam(@RequestParam(value = "nama", required = false, defaultValue = "Dunia") String nama, Model model) {
        model.addAttribute("jam", new Date());
        model.addAttribute("nama", nama);
        return "salam";
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
