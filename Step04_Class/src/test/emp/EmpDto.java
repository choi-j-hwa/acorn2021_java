package test.emp;


	public class EmpDto{
		
		private int empno;
		private String ename;
		private String job;
		private int sal;
		
		public EmpDto() {}
		
		
		public EmpDto(int empno, String ename, String job, int sal) {
			super();
			this.empno = empno;
			this.ename = ename;
			this.job = job;
			this.sal = sal;
		}


		public int getEmpno() {
			return empno;
		}


		public void setEmpno(int empno) {
			this.empno = empno;
		}


		public String getEname() {
			return ename;
		}


		public void setEname(String ename) {
			this.ename = ename;
		}


		public String getJob() {
			return job;
		}


		public void setJob(String job) {
			this.job = job;
		}


		public int getSal() {
			return sal;
		}


		public void setSal(int sal) {
			this.sal = sal;
		}
		
		public void emp() {
			System.out.println("사원번호 :"+this.empno);
			System.out.println("사원이름 :"+this.ename);
			System.out.println("사원직급 :"+this.job);
			System.out.println("사원연봉 :"+this.sal);
		}
		
		public void list() {
			System.out.println("list가 생성되었습니다");
		}
		
		
	}



















/*
public class EmpDto { //사원번호를 담을 필드생성
	private int empno;
	private String ename;
	private String job;
	private int sal;
	
	public EmpDto() {} //기본생성자
	
	// 모든 필드값을 전달받는 생성자
	public EmpDto(int empno, String ename, String job, int sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
	}
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job ) {
		this.job = job;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
} */
