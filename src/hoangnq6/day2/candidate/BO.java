package hoangnq6.day2.candidate;


public class BO {
	DAO dao = new DAO();
	
	/**
	 * add one candidate for database
	 * @param candidateID
	 * @param fullName
	 * @param birthDate
	 * @param phone
	 * @param email
	 * @param candidateType
	 */
	public void addCandidate(String candidateID, String fullName, String birthDate, String phone, String email,
			String candidateType){
		dao.addCandidate(candidateID,fullName,birthDate,phone,email,candidateType);
	}
	
	
	/**
	 * add one intern candidate for database
	 * @param canID
	 * @param majors
	 * @param semester
	 * @param universityName
	 */
	public void addInternCandidate(int canID, String majors, String semester, String universityName){
		dao.addInternCandidate(canID, majors, semester, universityName);
	}
	
	/**
	 * add one Experience Candidate for database
	 * @param canID
	 * @param expInYear
	 * @param proSkill
	 */
	public void addExperienceCandidate(int canID, int expInYear, String proSkill){
		dao.addExperienceCandidate( canID, expInYear, proSkill);
	}
	
	
	/**
	 * add one Fresher Candidate for database
	 * @param canID
	 * @param graduationDate
	 * @param graduationRank
	 * @param education
	 */
	public void addFresherCandidate(int canID, String graduationDate, String graduationRank, String education){
		dao.addFresherCandidate(canID, graduationDate, graduationRank, education);
	}
	
	/**
	 * add Certificated for database
	 * @param canID
	 * @param certificatedID
	 * @param certificateName
	 * @param certificateRank
	 * @param ertificatedDate
	 */
	public void addCertificated(int canID, String certificatedID, String certificateName, String certificateRank,
			String ertificatedDate){
		dao.addCertificated( canID,  certificatedID, certificateName, certificateRank, ertificatedDate);
	}
	
	public int getCandidateIDForDatabase(){
		return dao.getCandidateIDForDatabase();
	}
}
