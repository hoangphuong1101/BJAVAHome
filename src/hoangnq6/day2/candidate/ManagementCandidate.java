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
 * Modification Logs: DATE AUTHOR DESCRIPTION
 * -----------------------------------------------------------------------
 * 08-08-2017 HoangNQ6 Create
 */
public class ManagementCandidate {

	/**
	 * 
	 */
	public void management() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("First Name : ");
		String firstName = scanner.nextLine();
		System.out.println();
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Last Name : ");
		String lastName = scanner1.nextLine();
		System.out.println();

		Scanner scanner2 = new Scanner(System.in);
		Date birthDate;

		while (true) {
			System.out.println("BirthDate : ");
			String ns = scanner2.nextLine();

			try {
				birthDate = new Date(ns);
				if (common.formatDateYear(birthDate))
					break;
				else
					System.out.println("vui lòng nhập lại ngày sinh");
			} catch (Exception e) {
				System.out.println("vui lòng nhập lại ngày sinh");
			}
			System.out.println();
		}

		Scanner scanner3 = new Scanner(System.in);
		System.out.println("Address : ");
		String address = scanner3.nextLine();
		System.out.println();

		Scanner scanner4 = new Scanner(System.in);
		String phone;

		while (true) {
			System.out.println("Phone : ");
			phone = scanner4.nextLine();
			if (common.checkIsPhone(phone))
				break;
			System.out.println("vui lòng nhập lại số điện thoại ");
		}

		System.out.println();
		Scanner scanner5 = new Scanner(System.in);
		String email;
		while (true) {
			System.out.println("Email : ");
			email = scanner5.nextLine();
			if (common.validate(email))
				break;
			System.out.println("vui lòng nhập lại email đúng định dạng");
		}
		int type;
		while (true) {
			Scanner scanner6 = new Scanner(System.in);
			System.out.println("Candidate_type có giá trị tương ứng là " + "1: Experience \n"
					+ "2: Fresher_ candidate\n" + "3: Intern_ candidate\n" + "Vui lòng nhập 1 hoặc 2 hoặc 3");
			try {
				type = scanner6.nextInt();
				if (type == 1 || type == 2 || type == 3)
					break;
				else
					System.out.println("Thông tin nhập vào " + "không chính xác, vui lòng nhập lại\n");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Thông tin nhập vào " + "không chính xác, vui lòng nhập lại\n");
			}
		}

		String candidateType = "";
		int expInYear = 0;
		String proSkill = "";

		Date graduationDate = null;
		String graduationRank = "";
		String education = "";

		String majors = "";
		String semester = "";
		String universityName = "";

		switch (type) {
		case 1:
			candidateType = "Experience Candidate";
			System.out.println();

			Scanner scanner7 = new Scanner(System.in);
			System.out.println("Số năm kinh nghiệm : ");
			try {
				expInYear = scanner7.nextInt();
				if (common.checkExpInYear(expInYear))
					break;
				System.out.println("vui lòng nhập lại năm kinh nghiêm:");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("vui lòng nhập lại năm kinh nghiêm bằng số nguyên:");
			}

			Scanner scanner70 = new Scanner(System.in);
			System.out.println("Kỹ năng chuyên môn  : ");
			proSkill = scanner70.nextLine();
			System.out.println();
			break;

		case 2:
			candidateType = "Fresher Candidate";
			System.out.println();
			Scanner scanner8 = new Scanner(System.in);
			System.out.println("Thời gian tốt nghiệp  : ");
			String dateTN = scanner8.nextLine();
			try {
				graduationDate = new Date(dateTN);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("vui lòng nhập lại graduationDate: ");
			}

			System.out.println();
			Scanner scanner81 = new Scanner(System.in);
			while (true) {
				System.out.println("Xếp loại tốt nghiệp  : ");
				graduationRank = scanner81.nextLine();
				if (common.checkGraduationRank(graduationRank))
					break;
				System.out.println(" nhập xếp loại theo 4 giá trị Excellence, Good, Fair, Poor");
			}

			System.err.println();
			System.out.println("trường tốt nghiệp : ");
			education = scanner8.nextLine();
			System.out.println("--------^-^----------");
			break;

		case 3:
			candidateType = "Intern Candidate";

			Scanner scanner9 = new Scanner(System.in);
			System.out.println("Chuyên ngành đang học : ");
			majors = scanner9.nextLine();
			System.out.println("--------^-^----------");

			System.out.println("Học kì đang học : ");
			semester = scanner9.nextLine();
			System.out.println("--------^-^----------");

			System.out.println("tên trường đang học : ");
			universityName = scanner9.nextLine();
			System.out.println("--------^-^----------");
			break;

		default:
			break;
		}
		/*
		 * 1: Experience Candidate
		 * 2: Fresher Candidate
		 * 3: Intern Candidate
		 */
		switch (type) {
		case 1:
			ExperienceCandidate candidate = new ExperienceCandidate(firstName, lastName, birthDate, address, phone,
					email, candidateType, expInYear, proSkill);
			System.out.println(candidate.toString());
			break;
		case 2:
			FresherCandidate candidate2 = new FresherCandidate(firstName, lastName, birthDate, address, phone, email,
					candidateType, graduationDate, graduationRank, education);
			System.out.println(candidate2.toString());
			break;
		case 3:
			InternCandidate candidate3 = new InternCandidate(firstName, lastName, birthDate, address, phone, email,
					candidateType, majors, semester, universityName);
			System.out.println(candidate3.toString());
			break;
		default:
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManagementCandidate candidate = new ManagementCandidate();
		candidate.management();

	}

}
