package com.example.server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.server.mapper.MainMapper;
import com.example.server.vo.EmpVO;

@Service
public class MainService {
	 @Autowired
	 private MainMapper mainMapper;
	 
	 //직원 평균 급여 구하기 (소수점 제외)
	 public int getEmpAvgSal(){
		 List<EmpVO> empList = mainMapper.getEmpInfo(); //emp 리스트 호출
		 int sum = 0;
		 int len = empList.size();
		 int result = 0;
		 for(int i=0; i<len; i++){
			 int sal = empList.get(i).getSal(); //직원 급여
			 //아래 소스작성
			 
		 }
		 return result;
	 }
	 
	 //직원급여 모두 더하기
	 public int getEmpSumSal(){
		 List<EmpVO> empList = mainMapper.getEmpInfo(); //emp 리스트 호출
		 int sum = 0;
		 int len = empList.size();
		 for(int i=0; i<len; i++){
			 int sal = empList.get(i).getSal(); //직원 급여
			 sum += sal;
		 }
		 return sum;
	 }
	 
	 //emp 호출 (단, empno가 7000~8000이하 정수만)
	 public EmpVO getEmp(int empNo){
		 EmpVO vo = mainMapper.getEmp(empNo);
		 return vo;
	 }
	 
}