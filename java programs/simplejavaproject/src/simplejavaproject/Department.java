package simplejavaproject;

import java.util.ArrayList;

public class Department {
	private int id;
	private String name;
	private int studentcount;
	private int professorcount;
	private String hodname;
	ArrayList StudentList = new ArrayList();
	Student[] reena = new Student[10];
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getStudentcount() {
		return studentcount;
	}



	public void setStudentcount(int studentcount) {
		this.studentcount = studentcount;
	}



	public int getProfessorcount() {
		return professorcount;
	}



	public void setProfessorcount(int professorcount) {
		this.professorcount = professorcount;
	}



	public String getHodname() {
		return hodname;
	}



	public void setHodname(String hodname) {
		this.hodname = hodname;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Department v = new Department();
       v.setId(1);
       v.setName("CSE");
       v.setStudentcount(100);
       v.setProfessorcount(25);
       v.setHodname("shanthi");
       
       
       Department obj = new Department();
       obj.setId(2);
       obj.setName("ECE");
       obj.setStudentcount(250);
       obj.setProfessorcount(27);
       obj.setHodname("REENA");
       
       ArrayList departmentArrayList = new ArrayList();
       departmentArrayList.add(v);
       departmentArrayList.add(obj);
       
       Student s = new Student();
       s.setId(1);
       s.setName("varrun");
       
       Student s1 = new Student();
       s1.setId(2);
       s1.setName("vikram");
       
       
       ArrayList StudentList = new ArrayList();
       StudentList.add(s);
       StudentList.add(s1);
       v.setStudentList(StudentList);
	}



	public ArrayList getStudentList() {
		return StudentList;
	}



	public void setStudentList(ArrayList studentList) {
		StudentList = studentList;
	}
	
	
	

}
