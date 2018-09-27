/**
 * Java 1-2-3. Lesson 5. Homework
 *
 * @author Pushkarev Mikhail
 * @version dated Sept 27, 2018
 */

class HomeWork5 {

    public static void main(String[] args) {


        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Ivanov Ivan Ivanovich","Cleaner", "ivanov@mailbox.ru", "89141984848", 20000, 41);
        employee[1] = new Employee("Sergeev Sergey Sergeevich","Manager", "sergeev@mailbox.ru", "89148884557", 29000, 32);
        employee[2] = new Employee("Mikhailov Mikhail Mikhailovich","Designer", "mikhailov@mailbox.ru", "89145538452", 34000, 23);
        employee[3] = new Employee("Tamarova Tamara Stepanovna","Accountant", "tamarova@mailbox.ru", "89149942352", 40000, 55);
        employee[4] = new Employee("Vladimirov Vladimir Vladimirovich","CEO", "vladimirov@mailbox.ru", "89199999999", 100000, 35);
        for (int i = 0; i < employee.length; i++)
            if (employee[i].age > 40)
                System.out.println(employee[i]);


}
    static class Employee {
        private String fullname;
        private String position;
        private String email;
        private String phonenumber;
        private double salary;
        private int age;

        Employee(String fullname, String position, String email, String phonenumber, double salary, int age) {
            this.fullname = fullname;
            this.position = position;
            this.email = email;
            this.phonenumber = phonenumber;
            this.salary = salary;
            this.age = age;
        }

        public String getFullname() {
            return fullname;
        }

        public String getPosition() {
            return position;
        }

        public String getEmail() {
            return email;
        }

        public String getPhonenumber() {
            return phonenumber;
        }

        public double getSalary() {
            return salary;
        }

        public int getAge() {
            return age;
        }

        public String toString() {
            return this.fullname + ", " + this.position + ", " + this.email + ", " + this.phonenumber + ", "
                    + this.salary + ", " + this.age;
        }
    }
}

