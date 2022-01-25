package test.main;

import test.emp.EmpDto;



public class main10 {
public static void main(String[] args) {
	
	EmpDto dto1=new EmpDto(1111, "rara", "KING", 5000);
	
	EmpDto dto2=new EmpDto();
	dto2.setEmpno(2222);
	dto2.setEname("nana");
	dto2.setJob("QUEEN");
	dto2.setSal(8000);
	
	
	System.out.println(dto1);
	System.out.println(dto2);
	
	dto1.emp();
	dto2.emp();
	dto2.list();
	/*
	EmpDto dto=new EmpDto();
	dto.setEmpno(7839);
	dto.setEname("king");
	dto.setJob("PRESIDENT");
	dto.setSal(5000);
	
	EmpDto dto2= new EmpDto(7839,"king", "PRESIDENT", 5000); */
}
}
