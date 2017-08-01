package com.assignments.lesson7_1;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sumSalary = 0;
		
		DeptEmployee prof1 = new Professor("Bob","Marley",2500,LocalDate.now(), 10);
		DeptEmployee prof2 = new Professor("Rob","Marley",3500,LocalDate.now(), 10);
		DeptEmployee prof3 = new Professor("Hob","Marley",1500,LocalDate.now(), 10);
		
		DeptEmployee secr1 = new Secretary("Bobin","Wilson",1300,LocalDate.now(),200);
		DeptEmployee secr2 = new Secretary("Robin","Wilson",1400,LocalDate.now(),200);

		DeptEmployee[] department = new DeptEmployee[5];
		department[0] = prof1;
		department[1] = prof2;
		department[2] = prof3;
		department[3] = secr1;
		department[4] = secr2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Do you want to see sum of salaries in the department? (y/n) ");
		String answer = sc.next();
		sc.close();
		if(answer.equalsIgnoreCase("Y")){
//			for(int i=0; i<department.length;i++){
//				sumSalary += department[i].computeSalary();
//			} 
			for(DeptEmployee de : department){
				sumSalary += de.computeSalary();
			}
			System.out.println(sumSalary);
		}
		
		
	}

}
