/**
 * The Notebook class is an imitation of real notebook with fields with user's info
 */
public class Notebook {
    public static final int NUMBER_OF_GAPS = 4;


    private String userSurname;
    private String userName;
    private String userSecondName;

    private String userLogin;


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public void setUserSecondName(String userSecondName) {
        this.userSecondName = userSecondName;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getNotes() {
        return "\tSurname: " + userSurname + "\n\tName: " +
                userName + "\n\tSecond name: " + userSecondName +
                "\n\tLogin: " + userLogin;
    }
}