public class Main {
    public static void main(String[] args)  {
        try {
            Employee employee = new Employee("first name", "itmustbemorethan16symbolslmao", 123);
        } catch (FieldLengthLimitException | IncorrectSalaryException e) {
            System.out.println(e.getMessage());
        }

        try {
            Employee employee = new Employee("first name must be more than 16", "sdf", 123);
        } catch (FieldLengthLimitException | IncorrectSalaryException e) {
            System.out.println(e.getMessage());
        }

        try {
            Employee employee = new Employee("first", "second", -123);
        } catch (FieldLengthLimitException | IncorrectSalaryException e) {
            System.out.println(e.getMessage());
        }
    }
}
