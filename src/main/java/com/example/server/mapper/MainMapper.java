package com.example.server.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.server.vo.EmpVO;

@Repository
public interface MainMapper {

	List<EmpVO> getEmpInfo();
	EmpVO getEmp(@Param("empNo") int empno);
	
}
