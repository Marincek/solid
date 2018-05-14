package srp_first;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Employee {

    private Long id;
    private String name;
    private String email;
    private String phone;

    public Employee(long id, String name, String email, String phone) {
        validateEmail(email);
        validatePhone(phone);
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String findNewLocation() {
        System.out.println("Employee " + id + " new location is 5-2-1");
        return "5-2-1";
    }

    public void sendEmail(String relocation) {
        System.out.println("Sending email to " + email + " : Hi " + name + " you will be relocated on " + relocation);
    }

    public void sendSms(String relocation) {
        System.out.println("Sending sms to " + phone + ": Hi " + name + " you will be relocated on " + relocation);
    }

    public void validateEmail(String emailStr) {
        Matcher matcher = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE).matcher(emailStr);
        if (!matcher.find()) {
            throw new RuntimeException("EmailAddress is not valid");
        }
    }

    public void validatePhone(String phone) {
        if (phone.length() < 9) {
            throw new RuntimeException("Sms is not valid");
        }
    }

    public Long getId() {
        return id;
    }

}
