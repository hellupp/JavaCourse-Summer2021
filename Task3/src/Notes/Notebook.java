package Notes;

/**
 * The Notes.Notebook class is an imitation of real notebook with fields with user's info
 */
public class Notebook {

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

    public String getNotesLat() {
       return "\tSurname: " + userSurname + "\n\tName: " +
                userName + "\n\tSecond name: " + userSecondName +                 //Without shortened name and second name
                "\n\tLogin: " + userLogin + "\n\tMobile phone number: "
                + userMobilePhoneNumber1;


//        return "\tFull name: " + shortSurnameName() +                               //With shortened name and second name
//                "\n\tLogin: " + userLogin + "\n\tMobile phone number: "
//                + userMobilePhoneNumber1;
    }

    public String getNotesUkr(){
                return "\tПрізвище: " + userSurname + "\n\tІм'я: " +
                userName + "\n\tПо-батькові: " + userSecondName +                 //Without shortened name and second name
                "\n\tЛогін: " + userLogin + "\n\tНомер мобільного телефону: "
                + userMobilePhoneNumber1;


//        return "\tПовне ім'я: " + shortSurnameName() +                               //With shortened name and second name
//                "\n\tЛогін: " + userLogin + "\n\tНомер мобільного телефону: "
//                + userMobilePhoneNumber1;
    }

    private String shortSurnameName() {
        return userSurname + " " + userName.charAt(0) + "." + userSecondName.charAt(0) + ".";
    }
}