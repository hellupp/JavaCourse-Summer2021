package controller;

public interface RegexConstants {

    String REGEX_SURNAME_LAT = "^[A-Z][a-z]{1,20}$";
    String REGEX_SURNAME_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";

    String REGEX_NAME_LAT = "^[A-Z][a-z]{1,20}$";
    String REGEX_NAME_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";

    String REGEX_SECOND_NAME_LAT = "^[A-Z][a-z]{1,20}$";
    String REGEX_SECOND_NAME_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";

    String REGEX_LOGIN = "^[A-Za-z]([\\\\.A-Za-z0-9-_]{1,18})([A-Za-z0-9])$";

    String REGEX_COMMENT_LAT = "^[A-Za-z]+$";
    String REGEX_COMMENT_UKR = "^[А-ЩЬЮЯҐІЇЄа-щьюяґіїє']+$";

    String REGEX_GROUP = "";

    String REGEX_HOME_PHONE_NUMBER = "\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}";
    String REGEX_MOBILE_PHONE_NUMBER_1 = "\\d{10}|(?:\\d{3}[-\\s]){2}\\d{4}|(?:\\d{3}[-\\s]){2}\\d{2}[-\\s]\\d{2}|\\(\\d{3}\\)\\d{3}[\\s-?]\\d{4}|\\(\\d{3}\\)\\d{3}[\\s-?]\\d{2}[\\s-?]\\d{2}";
    String REGEX_MOBILE_PHONE_NUMBER_2 = "\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}";

    String REGEX_EMAIL = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    String REGEX_SKYPE = "^[a-zA-Z][a-zA-Z0-9_.,-]{5,31}$";

}
