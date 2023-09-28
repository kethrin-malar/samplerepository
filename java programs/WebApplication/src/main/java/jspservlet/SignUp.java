package jspservlet;

public class SignUp {

	public void doSignUp(String userid, String firstname, String lastname, String password) {
		String userID = userid;
		String firstName = firstname;
		String lastName = lastname;
		String passWord = password;
		
		SignUpDAO dao = new SignUpDAO();
		dao.saveSignUp(userID, firstName, lastName, password);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
