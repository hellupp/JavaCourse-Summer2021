package model;

import controller.InputNotes;

/**
 * The Notes.Notebook class is an imitation of real notebook with fields with user's info
 */
public class Notebook {

    private String userSurname;
    private String userName;
    private String userSecondName;

    private String userLogin;

    private String userMobilePhoneNumber1;

//    public Notebook(){
//
//    }

//    public Notebook(String userSurname, String userLogin)
//            throws NotUniqueLoginException{
//        if (NotebookDB.checkLogin(userLogin)){
//            throw new NotUniqueLoginException("Not Unique Login",
//                    userLogin);
//        }
//        this.userSurname = userSurname;
//        this.userLogin = userLogin;
//    }



    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public void setUserSecondName(String userSecondName) {
        this.userSecondName = userSecondName;
    }

    public void setUserLogin(String userLogin, InputNotes inputNotes) {
        while(true) {
            try {
                if (NotebookDB.checkLogin(userLogin)){
                    throw new NotUniqueLoginException("Not Unique Login",
                            userLogin);
                } else {
                    this.userLogin = userLogin;
                }
                break;
            } catch (NotUniqueLoginException e) {
                e.printStackTrace();
                System.out.println("Not Unique Login " + e.getLoginData());
                inputNotes.inputLogin();
                break;
            }
        }
    }

    public void setUserMobilePhoneNumber1(String userMobilePhoneNumber1) {
        this.userMobilePhoneNumber1 = userMobilePhoneNumber1;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSecondName() {
        return userSecondName;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public String getUserMobilePhoneNumber1() {
        return userMobilePhoneNumber1;
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