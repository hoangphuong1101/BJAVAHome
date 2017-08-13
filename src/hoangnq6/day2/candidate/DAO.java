package hoangnq6.day2.candidate;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import statics.SQLServer;

public class DAO {

	public void addCandidate(String candidateID, String fullName, String birthDate, String phone, String email,
			String candidateType) {

		// Open connect
		SQLServer.connect();
		PreparedStatement pr = null;
		try {

			String sql = "insert into CANDIDATE(candidateID,fullName,birthDate,phone,email,candidateType)"
					+ " VALUES(?,?,?,?,?,?)";
			pr = SQLServer.connection.prepareStatement(sql);
			pr.setString(1, candidateID);
			pr.setString(2, fullName);
			pr.setString(3, birthDate);
			pr.setString(4, phone);
			pr.setString(5, email);
			pr.setString(6, candidateType);
			pr.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // Close connect
			try {
				pr.close();
			} catch (Exception e2) {
			}
			SQLServer.disconnect();
		}
	}

	public void addInternCandidate(int canID, String majors, String semester, String universityName) {

		// Open connect
		SQLServer.connect();
		PreparedStatement pr = null;
		try {

			String sql = "insert into InternCandidate(canID, majors, semester, universityName)" + " VALUES(?,?,?,?)";
			pr = SQLServer.connection.prepareStatement(sql);
			pr.setInt(1, canID);
			pr.setString(2, majors);
			pr.setString(3, semester);
			pr.setString(4, universityName);
			pr.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // Close connect
			try {
				pr.close();
			} catch (Exception e2) {
			}
			SQLServer.disconnect();
		}
	}

	public void addExperienceCandidate(int canID, int expInYear, String proSkill) {

		// Open connect
		SQLServer.connect();
		PreparedStatement pr = null;
		try {

			String sql = "insert into InternCandidate(canID, expInYear, proSkill)" + " VALUES(?,?,?)";
			pr = SQLServer.connection.prepareStatement(sql);
			pr.setInt(1, canID);
			pr.setInt(2, expInYear);
			pr.setString(3, proSkill);
			pr.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // Close connect
			try {
				pr.close();
			} catch (Exception e2) {
			}
			SQLServer.disconnect();
		}
	}

	public void addFresherCandidate(int canID, String graduationDate, String graduationRank, String education) {

		// Open connect
		SQLServer.connect();
		PreparedStatement pr = null;
		try {

			String sql = "insert into FresherCandidate(canID, graduationDate, graduationDate, education)"
					+ " VALUES(?,?,?,?)";
			pr = SQLServer.connection.prepareStatement(sql);
			pr.setInt(1, canID);
			pr.setString(2, graduationDate);
			pr.setString(3, graduationDate);
			pr.setString(4, education);
			pr.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // Close connect
			try {
				pr.close();
			} catch (Exception e2) {
			}
			SQLServer.disconnect();
		}
	}

	public void addCertificated(int canID, String certificatedID, String certificateName, String certificateRank,
			String ertificatedDate) {

		// Open connect
		SQLServer.connect();
		PreparedStatement pr = null;
		try {

			String sql = "insert into Certificated( canID,  certificatedID, certificateName, certificateRank, ertificatedDate)"
					+ " VALUES(?,?,?,?,?)";
			pr = SQLServer.connection.prepareStatement(sql);
			pr.setInt(1, canID);
			pr.setString(2, certificatedID);
			pr.setString(3, certificateName);
			pr.setString(4, certificateRank);
			pr.setString(5, ertificatedDate);
			pr.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // Close connect
			try {
				pr.close();
			} catch (Exception e2) {
			}
			SQLServer.disconnect();
		}
	}

	public int getCandidateIDForDatabase() {
		// TODO Auto-generated method stub
		SQLServer.connect();
		ResultSet rs = null;
		PreparedStatement pr = null;
		int canID = 0;
		try {

			String sql = "select top 1 from CANDIDATE order by canID desc";
			pr = SQLServer.connection.prepareStatement(sql);
			rs = pr.executeQuery();
			try {
				if (rs.next()) {
					canID += rs.getInt("canID");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			pr.close();
			SQLServer.connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { 
			// Close connect
			try {
				rs.close();
			} catch (Exception e2) {
			}
			try {
				pr.close();
			} catch (Exception e2) {
			}
			SQLServer.disconnect();
		}
		return canID;
	}

}
