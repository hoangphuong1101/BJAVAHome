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
public class FresherCandidate extends Candidate{
	private Date graduationDate;
	private String graduationRank;
	private String education;
	/**
	 * @return the graduationDate
	 */
	public Date getGraduationDate() {
		return graduationDate;
	}
	/**
	 * @param graduationDate the graduationDate to set
	 */
	public void setGraduationDate(Date graduationDate) {
		this.graduationDate = graduationDate;
	}
	/**
	 * @return the graduationRank
	 */
	public String getGraduationRank() {
		return graduationRank;
	}
	/**
	 * @param graduationRank the graduationRank to set
	 */
	public void setGraduationRank(String graduationRank) {
		this.graduationRank = graduationRank;
	}
	/**
	 * @return the education
	 */
	public String getEducation() {
		return education;
	}
	/**
	 * @param education the education to set
	 */
	public void setEducation(String education) {
		this.education = education;
	}
	/**
	 * @param firstName
	 * @param lastName
	 * @param birthDate
	 * @param address
	 * @param phone
	 * @param mail
	 * @param candidateType
	 * @param graduationDate
	 * @param graduationRank
	 * @param education
	 */
	public FresherCandidate(String firstName, String lastName, Date birthDate, String address, String phone,
			String mail, String candidateType, Date graduationDate, String graduationRank, String education) {
		super(firstName, lastName, birthDate, address, phone, mail, candidateType);
		this.graduationDate = graduationDate;
		this.graduationRank = graduationRank;
		this.education = education;
	}
	
}
