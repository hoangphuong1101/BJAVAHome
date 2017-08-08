package hoangnq6.day2.candidate;

import java.util.Date;

/**			
 * FresherCandidate			
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
public class InternCandidate extends Candidate{
	private String majors;
	private String semester;
	private String universityName;
	/**
	 * @return the majors
	 */
	public String getMajors() {
		return majors;
	}
	/**
	 * @param majors the majors to set
	 */
	public void setMajors(String majors) {
		this.majors = majors;
	}
	/**
	 * @return the semester
	 */
	public String getSemester() {
		return semester;
	}
	/**
	 * @param semester the semester to set
	 */
	public void setSemester(String semester) {
		this.semester = semester;
	}
	/**
	 * @return the universityName
	 */
	public String getUniversityName() {
		return universityName;
	}
	/**
	 * @param universityName the universityName to set
	 */
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	/**
	 * @param firstName
	 * @param lastName
	 * @param birthDate
	 * @param address
	 * @param phone
	 * @param mail
	 * @param candidateType
	 * @param majors
	 * @param semester
	 * @param universityName
	 */
	public InternCandidate(String firstName, String lastName, Date birthDate, String address, String phone, String mail,
			String candidateType, String majors, String semester, String universityName) {
		super(firstName, lastName, birthDate, address, phone, mail, candidateType);
		this.majors = majors;
		this.semester = semester;
		this.universityName = universityName;
	}
	
}
