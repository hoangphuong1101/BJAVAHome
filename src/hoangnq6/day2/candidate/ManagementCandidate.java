package hoangnq6.day2.candidate;

import java.util.Date;
import java.util.Scanner;

/**			
 * ManagementCandidate			
 *			
 * Version 1.0			
 *			
 * Date: 08-08-2017			
 *			
 * Copyright 			
 *			
 * Modification Logs:			
 * DATE                 AUTHOR          DESCRIPTION			
 * -----------------------------------------------------------------------			
 * 08-08-2017         HoangNQ6            Create			
 */
public class ManagementCandidate {
	
	public static void management(){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("First Name : ");
		String firstName= scanner.nextLine();
		System.out.println("--------^-^----------");
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Last Name : ");
		String lastName= scanner1.nextLine();
		System.out.println("--------^-^----------");
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("BirthDate : ");
		String ns= scanner2.nextLine();
		Date birthDate= new Date(ns);
		System.out.println("--------^-^----------");
		
		Scanner scanner3 = new Scanner(System.in);
		System.out.println("Address : ");
		String address= scanner3.nextLine();
		System.out.println("--------^-^----------");
		
		Scanner scanner4 = new Scanner(System.in);
		System.out.println("Phone : ");
		String phone= scanner4.nextLine();
		System.out.println("--------^-^----------");
		
		Scanner scanner5 = new Scanner(System.in);
		System.out.println("Email : ");
		String email= scanner5.nextLine();
		System.out.println("--------^-^----------");
		
		int type;
		while (true) {
		Scanner scanner6 = new Scanner(System.in);
		System.out.println("Candidate_type có giá trị tương ứng là "
				+ "0: Experience_, 1: Fresher_ candidate , 2: Intern_ candidate\n"
				+ "Vui lòng nhập 1 hoặc 2 hoặc 3");
		type= scanner6.nextInt();
		if(type==1||type==2||type==3)break;
		else System.out.println("Thông tin nhập vào "
				+ "không chính xác, vui lòng nhập lại\n");
		}
		
		String candidateType="";
		int expInYear=0;
		String proSkill="";
		
		Date graduationDate=null;
		String graduationRank="";
		String education="";
		
		String majors="";
		String semester="";
		String universityName="";
		
		switch (type) {
		case 1:
			candidateType="Experience Candidate";
			System.out.println("--------^-^----------");
			
			Scanner scanner7 = new Scanner(System.in);
			System.out.println("Số năm kinh nghiệm : ");
			expInYear=scanner7.nextInt();
			System.out.println("--------^-^----------");
			
			System.out.println("Kỹ năng chuyên môn  : ");
			proSkill=scanner7.nextLine();
			System.out.println("--------^-^----------");
			break;
			
		case 2:
			candidateType="Fresher Candidate";
			
			Scanner scanner8 = new Scanner(System.in);
			System.out.println("Thời gian tốt nghiệp  : ");
			String dateTN=scanner8.nextLine();
			graduationDate= new Date(dateTN);
			System.out.println("--------^-^----------");
			
			System.out.println("Xếp loại tốt nghiệp  : ");
			graduationRank=scanner8.nextLine();
			System.out.println("--------^-^----------");
			
			System.out.println("trường tốt nghiệp : ");
			education=scanner8.nextLine();
			System.out.println("--------^-^----------");
			break;
			
		case 3:
			candidateType="Intern Candidate";
			
			Scanner scanner9 = new Scanner(System.in);
			System.out.println("Chuyên ngành đang học : ");
			majors=scanner9.nextLine();
			System.out.println("--------^-^----------");
			
			System.out.println("Học kì đang học : ");
			semester=scanner9.nextLine();
			System.out.println("--------^-^----------");
			
			System.out.println("tên trường đang học : ");
			universityName=scanner9.nextLine();
			System.out.println("--------^-^----------");
			break;

		default:
			break;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
