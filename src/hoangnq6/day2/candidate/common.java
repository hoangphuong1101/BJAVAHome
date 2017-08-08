package hoangnq6.day2.candidate;

import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * FresherCandidate
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
public class common {

	/**
	 * Hàm format date theo yyyy/mm/dd
	 * 
	 * @param inDate
	 * @return
	 */
	public String convertDate(String inDate) {
		SimpleDateFormat mFormat1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat mFormat2 = new SimpleDateFormat("dd-MM-yyyy");
		try {
			return mFormat1.format(mFormat2.parse(inDate));
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	/**
	 * 
	 */
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);

	/**
	 * kiểm tra định dạng mail
	 * 
	 * @param emailStr
	 * @return
	 */
	public static boolean validate(String emailStr) {
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
		return matcher.find();
	}

	public static void phone() {
		String sPhoneNumber = "0988023213";

		Pattern pattern = Pattern.compile("[0]{1}[1-9]{1}[0-9]{8}");
		Matcher matcher = pattern.matcher(sPhoneNumber);

		if (matcher.matches()) {
			System.out.println("Phone Number Valid");
		} else {
			System.out.println("Phone Number must be in the form XXX-XXXXXXX");
		}
		System.out.println(sPhoneNumber);
	}
	
	public static void main(String[] args) {
		phone();
	}
}
