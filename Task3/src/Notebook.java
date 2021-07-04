public class Notebook {

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
        return new String("\tSurname: " + userSurname + "\n\tName: " +
                userName + "\n\tSecond name: " + userSecondName +
                    "\n\tLogin: " + userLogin);
    }
}