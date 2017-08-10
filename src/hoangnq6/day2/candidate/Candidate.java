package hoangnq6.day2.candidate;

import java.util.Date;

/**
 * Candidate
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
public class Candidate {
	private String candidateID;
	private String fullName;
	private Date birthDate;
	private String phone;
	private String email;
	private String candidateType;
	static int canidateCount;

	/**
	 * @return the candidateID
	 */
	public String getCandidateID() {
		return candidateID;
	}

	/**
	 * @param candidateID
	 *            the candidateID to set
	 */
	public void setCandidateID(String candidateID) {
		this.candidateID = candidateID;
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName
	 *            the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * @return the birthDate
	 */
	public Date getBirthDate() {
		return birthDate;
	}

	/**
	 * @param birthDate
	 *            the birthDate to set
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone
	 *            the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the candidateType
	 */
	public String getCandidateType() {
		return candidateType;
	}

	/**
	 * @param candidateType
	 *            the candidateType to set
	 */
	public void setCandidateType(String candidateType) {
		this.candidateType = candidateType;
	}

	/**
	 * @return the canidateCount
	 */
	public int getCanidateCount() {
		return canidateCount;
	}

	/**
	 * @param candidateID
	 * @param fullName
	 * @param birthDate
	 * @param phone
	 * @param email
	 * @param candidateType
	 * @param canidateCount
	 */
	public Candidate(String candidateID, String fullName, Date birthDate, String phone, String email,
			String candidateType, int canidateCount) {
		super();
		this.candidateID = candidateID;
		this.fullName = fullName;
		this.birthDate = birthDate;
		this.phone = phone;
		this.email = email;
		this.candidateType = candidateType;
	}

	/**
	 * đếm số lượng ứng viên nhập vào
	 * @param candidateCount
	 */
	public void numberCadidate(int candidateCount){
		canidateCount++;
	}
	public String showInfo () {
		// TODO Auto-generated method stub
		return "candidateID: " + this.getCandidateID() + "\n fullName: " + this.getFullName() + "\n birthDate: "
				+ this.getBirthDate() + "\n phone: " + this.getPhone()
				+ "\n email: " + this.getEmail() + "\n candidateType: " + this.getCandidateType() + "\n canidateCount: "
				+ this.getCanidateCount();
	}
}
