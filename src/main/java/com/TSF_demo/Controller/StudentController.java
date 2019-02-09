package com.TSF_demo.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TSF_demo.StudentModel.*;
import com.TSF_demo.Repository.*;

@RestController
@RequestMapping("/")
public class StudentController {

	StudModel stuMod;
	
	@Autowired
	StudentRepository studRep;
	//GET - Reads the Database
	@GetMapping("showAll")
	private List<StudModel> getAll(){
		return studRep.findAll();
	}
	
	//POST - Creates new students
	@PostMapping("addStudent")
	private StudModel createStud(@Valid @RequestBody StudModel studM) {
		return studRep.save(studM);
	}
	
	//Updates the existing data
	@PutMapping("/updateStudent/{id}")
	private StudModel updateStudent(@PathVariable(value="id") long id, @RequestBody StudModel st) {
			StudModel s = new StudModel(); 
			s = studRep.findById(id).orElse(new StudModel());
			s.setName(st.getName());
			s.setPointer(st.getPointer());
            return studRep.save(s);
	}

	//Deletes by ID
	@DeleteMapping("delete")
	private void deleteStudent(@Valid @RequestBody StudModel studM) {
		studRep.delete(studM);
	}
}
