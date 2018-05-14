package dip_second;

class CarEmployeeLocator implements EmployeeLocator {

    public String findLocation(Employee employee) {
        System.out.println("Employee " + employee.getId() + " car plate is BT382DN");
        return "BT382DN";
    }

}
