package model;

public class NotUniqueLoginException extends Exception{
    private String userLogin;

    public String getLoginData() {
        return userLogin;
    }

    public NotUniqueLoginException(String message, String loginData) {
        super(message);
        this.userLogin = loginData;
    }
}
