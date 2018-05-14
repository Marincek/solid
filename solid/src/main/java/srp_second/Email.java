package srp_second;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Email {

    private String email;

    public Email(String email) {
        validateEmail(email);
        this.email = email;
    }

    public void validateEmail(String email) {
        Matcher matcher = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE).matcher(email);
        if (!matcher.find()) {
            throw new RuntimeException("EmailAddress is not valid");
        }
    }

    public String getValue() {
        return email;
    }
}
