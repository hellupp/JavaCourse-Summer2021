public interface RegexConstants {

    String REGEX_SURNAME = "^[а-яёА-ЯЁA-Za-z]+$";
    String REGEX_NAME = "^[а-яёА-ЯЁA-Za-z]+$";
    String REGEX_SECOND_NAME = "^[а-яёА-ЯЁA-Za-z]+$";

    String REGEX_LOGIN = "^[A-Za-z]([\\\\.A-Za-z0-9-]{1,18})([A-Za-z0-9])$";

    String REGEX_COMMENT = "^[а-яёА-ЯЁA-Za-z]+$";

    String REGEX_GROUP = "";

    String REGEX_HOME_PHONE_NUMBER = "\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}";
    String REGEX_MOBILE_PHONE_NUMBER_1 = "\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}";
    String REGEX_MOBILE_PHONE_NUMBER_2 = "\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}";

    String REGEX_EMAIL = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    String REGEX_SKYPE = "^[a-zA-Z][a-zA-Z0-9_.,-]{5,31}$";

    String REGEX_ADDRESS = "";

}
