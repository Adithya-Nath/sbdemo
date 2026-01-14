package com.sample.springbootdemo.repository;

import com.sample.springbootdemo.model.StudentModel;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface StudentRepository extends JpaRepository <StudentModel,Integer>{

}
