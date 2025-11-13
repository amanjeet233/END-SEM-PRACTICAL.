class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }
}

class Student extends Person {
    int rollNumber;

    Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    void display() {
        super.display();
        System.out.println("Roll Number: " + rollNumber);
    }
}

class Teacher extends Person {
    String subjectCode;

    Teacher(String name, int age, String subjectCode) {
        super(name, age);
        this.subjectCode = subjectCode;
    }

    void display() {
        super.display();
        System.out.println("Subject Code: " + subjectCode);
    }
}

 class Main {
     public static void main(String[] args) {

        Student s1 = new Student("Aman", 20, 102);
        Teacher t1 = new Teacher("Dr. Sharma", 45, "CS101");

        System.out.println("=== Student Details ===");
        s1.display();

        System.out.println("\n=== Teacher Details ===");
        t1.display();
    }
}
