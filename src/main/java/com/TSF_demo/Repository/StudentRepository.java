package com.TSF_demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.TSF_demo.StudentModel.StudModel;

@Repository
public interface StudentRepository extends JpaRepository <StudModel, Long> {
	
}