/**
 * The Notebook class is an imitation of real notebook with fields with user's info
 */
public class Notebook {
    public static final int NUMBER_OF_GAPS = 5;


    private String userSurname;
    private String userName;
    private String userSecondName;

    private String userLogin;

    private String userMobilePhoneNumber1;


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

    public void setUserMobilePhoneNumber1(String userMobilePhoneNumber1) {
        this.userMobilePhoneNumber1 = userMobilePhoneNumber1;
    }

    public String getNotes() {
//        return "\tSurname: " + userSurname + "\n\tName: " +
//                userName + "\n\tSecond name: " + userSecondName +       //Without shortened name and second name
//                "\n\tLogin: " + userLogin;


        return "\tFull name: " + shortSurnameName() +                     //With shortened name and second name
                "\n\tLogin: " + userLogin + "\n\tnum: " + userMobilePhoneNumber1;
    }

    private String shortSurnameName() {
        return userSurname + " " + userName.charAt(0) + "." + userSecondName.charAt(0) + ".";
    }
}