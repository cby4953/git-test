public class Student implements Comparable<Student> {

    private String name;

    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int num = this.getName().length() - o.getName().length();
        int num1 = num == 0 ? this.getAge() - o.getAge() : num;
        return num1;
    }

    public static void sum(int... number) {
        int[] array = new int[10];
        for (int i : number) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Student student = new Student();
        Student.sum(1, 2, 3, 4, 5);
    }
}