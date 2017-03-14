/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itfaculty.progress.dao.Impl;

import com.itfaculty.progress.dao.AbstractDao;
import com.itfaculty.progress.dao.DoctorsDao;
import com.itfaculty.progress.model.Doctors;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Praneeth Madusanka
 */
@Repository("doctorsDao")
public class DoctorsDaoImpl extends AbstractDao<Integer, Doctors> implements DoctorsDao {

    @Override
    public void addDoctors(Doctors doctors) {
        persist(doctors);
    }

}
