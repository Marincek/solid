package srp_third;

class EmployeeLocator {

    public String findLocation(Employee employee) {
        System.out.println("Employee " + employee.getId() + " new location is 5-2-1");
        return "5-2-1";
    }

}
