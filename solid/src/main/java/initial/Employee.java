package initial;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Employee {

    private Long id;
    private String name;
    private String email;

    public Employee(long id, String name, String email) {
        validateEmail(email);
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public void save() {
        System.out.println("Employee " + id + " saved!");
    }

    public String findNewLocation() {
        System.out.println("Employee " + id + " new location is 5-2-1");
        return "5-2-1";
    }

    public void sendEmail(String relocation) {
        String content = "Hi " + name + " you will be relocated on " + relocation;
        System.out.println("Sending email to " + email + " : " + content);
    }

    public void validateEmail(String emailStr) {
        Matcher matcher = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE).matcher(emailStr);
        if (!matcher.find()) {
            throw new RuntimeException("EmailAddress is not valid");
        }
    }

}
