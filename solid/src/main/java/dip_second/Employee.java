package dip_second;

class Employee {

    private Long id;
    private String name;
    private Email email;

    public Employee(long id, String name, Email email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Email getEmail() {
        return email;
    }
}
