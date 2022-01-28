package com.example.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.server.service.MainService;
import com.example.server.vo.EmpVO;

@RestController
public class MainController {

	@Autowired
	private MainService mainService;
	
	@GetMapping("/sum")
	public int callEmpSalSum(){
		return mainService.getEmpSumSal();
	}
	@GetMapping("/avg")
	public int callEmpSalAvg(){
		return mainService.getEmpSumSal();
	}

	@GetMapping("/emp/{empNo}")
	public EmpVO callEmp(@PathVariable("empNo") int empNo){
		return mainService.getEmp(empNo);
	}
}
