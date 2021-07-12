package model;

public enum NotebookDB {
    NOTE_ONE("Taras", "taras123"),
    NOTE_TWO("Nikola","nik12345"),
    NOTE_THREE ("Petro","shoko123");

    private final String userName;
    private final String userLogin;

    NotebookDB(String userName, String userLogin) {
        this.userName = userName;
        this.userLogin = userLogin;
    }

    public String getUserName() {
        return userName;
    }
    public String getUserLogin() {
        return userLogin;
    }

    public static boolean checkLogin (String loginData){
        for (NotebookDB note : NotebookDB.values()){
            if (note.getUserLogin().equals(loginData)){return true;}
        }
        return  false;
    }
}
