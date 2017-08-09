package hoangnq6.day2.candidate;

import java.util.Date;

/**
 * ExperienceCandidate
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
public class ExperienceCandidate extends Candidate {
	private int expInYear;
	private String proSkill;

	/**
	 * @return the expInYear
	 */
	public int getExpInYear() {
		return expInYear;
	}

	/**
	 * @param expInYear
	 *            the expInYear to set
	 */
	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}

	/**
	 * @return the proSkill
	 */
	public String getProSkill() {
		return proSkill;
	}

	/**
	 * @param proSkill
	 *            the proSkill to set
	 */
	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param birthDate
	 * @param address
	 * @param phone
	 * @param mail
	 * @param candidateType
	 * @param expInYear
	 * @param proSkill
	 */
	public ExperienceCandidate(String firstName, String lastName, Date birthDate, String address, String phone,
			String mail, String candidateType, int expInYear, String proSkill) {
		super(firstName, lastName, birthDate, address, phone, mail, candidateType);
		this.expInYear = expInYear;
		this.proSkill = proSkill;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "firstName: " + this.getFirstName() + "\n lastName: " + this.getLastName() + "\n birthDate: "
				+ this.getBirthDate() + "\n address: " + this.getAddress() + "\n phone: " + this.getPhone()
				+ "\n email: " + this.getMail() + "\n candidateType: " + this.getCandidateType() + "\n expInYear: "
				+ this.getExpInYear() + "\n proSkill: " + this.getProSkill();
	}

}
