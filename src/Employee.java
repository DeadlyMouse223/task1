public class Employee {

    private int id;
    private static Integer nextId = 0;
    private String name;
    private String surname;
    private double salary;

    public Employee(String name, String surname, double salary)
            throws FieldLengthLimitException, IncorrectSalaryException {
        if(name.length() > 16) throw new FieldLengthLimitException("Incorrect name length");
        if(surname.length() > 16) throw new FieldLengthLimitException("Incorrect surname length");
        if(salary < 0) throw new IncorrectSalaryException("Incorrect salary");
        this.id = ++nextId;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public void setName(String name) throws FieldLengthLimitException {
        if(name.length() > 16) throw new FieldLengthLimitException("Incorrect name length");
        this.name = name;
    }

    public void setSurname(String surname) throws FieldLengthLimitException {
        if(surname.length() > 16) throw new FieldLengthLimitException("Incorrect surname length");
        this.surname = surname;
    }

    public void setSalary(double salary) throws IncorrectSalaryException {
        if(salary < 0) throw new IncorrectSalaryException("Incorrect salary");
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static Integer getNextId() {
        return nextId;
    }

    public static void setNextId(Integer nextId) {
        Employee.nextId = nextId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

}
