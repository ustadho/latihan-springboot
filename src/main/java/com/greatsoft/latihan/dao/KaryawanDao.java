/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.greatsoft.latihan.dao;

import com.greatsoft.latihan.domain.Karyawan;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author ustadho
 */
public interface KaryawanDao extends PagingAndSortingRepository<Karyawan, Integer>{
    
}
