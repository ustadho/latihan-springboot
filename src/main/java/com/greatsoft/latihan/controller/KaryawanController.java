/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.greatsoft.latihan.controller;

import com.greatsoft.latihan.dao.KaryawanDao;
import com.greatsoft.latihan.domain.Karyawan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ustadho
 */
@Controller
@RequestMapping("karyawan")
public class KaryawanController {
    @Autowired
    KaryawanDao karyawanDao;
    
    @RequestMapping("/findAll")
    @ResponseBody
    public Iterable<Karyawan> findAll(){
        return karyawanDao.findAll();
    }
    
}
