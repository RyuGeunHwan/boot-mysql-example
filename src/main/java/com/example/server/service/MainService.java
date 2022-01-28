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
	 
	 //���� ��� �޿� ���ϱ� (�Ҽ��� ����)
	 public int getEmpAvgSal(){
		 List<EmpVO> empList = mainMapper.getEmpInfo(); //emp ����Ʈ ȣ��
		 int sum = 0;
		 int len = empList.size();
		 int result = 0;
		 for(int i=0; i<len; i++){
			 int sal = empList.get(i).getSal(); //���� �޿�
			 //�Ʒ� �ҽ��ۼ�
			 
		 }
		 return result;
	 }
	 
	 //�����޿� ��� ���ϱ�
	 public int getEmpSumSal(){
		 List<EmpVO> empList = mainMapper.getEmpInfo(); //emp ����Ʈ ȣ��
		 int sum = 0;
		 int len = empList.size();
		 for(int i=0; i<len; i++){
			 int sal = empList.get(i).getSal(); //���� �޿�
			 sum += sal;
		 }
		 return sum;
	 }
	 
	 //emp ȣ�� (��, empno�� 7000~8000���� ������)
	 public EmpVO getEmp(int empNo){
		 EmpVO vo = mainMapper.getEmp(empNo);
		 return vo;
	 }
	 
}