import java.util.ArrayList;
import java.util.List;

public class Question2 {
    public static class Student {
        private String FirstName;
        private String LastName;
        private int Age;

        public String getFirstName() {
            return FirstName;
        }

        public void setFirstName(String firstName) {
            FirstName = firstName;
        }

        public String getLastName() {
            return LastName;
        }

        public void setLastName(String lastName) {
            LastName = lastName;
        }

        public int getAge() {
            return Age;
        }

        public void setAge(int age) {
            Age = age;
        }

        public Student(String firstName, String lastName, int age) {
            FirstName = firstName;
            LastName = lastName;
            Age = age;
        }

        public Student() {
        }


        public static void main(String[] args) {
            Student student1 = new Student("Josh", "Hilton", 20);
            Student student2 = new Student("John", "Doe", 54);
            Student student3 = new Student("John", "Hancock", 28);
            Student student4 = new Student("Frank", "Murphy", 47);
            List<Student> students = new ArrayList<>();
            students.add(student1);
            students.add(student2);
            students.add(student3);
            students.add(student4);
            int averageAge = 0;
            for (var student : students) {
                System.out.println("the student " + student.FirstName + " " + student.LastName + " has enrolled and is " + student.Age + " years old");
                averageAge += student.Age;
                averageAge = averageAge / 2;
            }
            System.out.println("The average age of students is: " + averageAge);
        }
    }
}
