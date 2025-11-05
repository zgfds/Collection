import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.Stream;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student a = new Student(2025014, "이민규", 20, true);
        Student b = new Student(2021011, "홍길동", 80, true);
        Student c = new Student(2025014, "이민규", 20, true);


        System.out.println(a);
        System.out.println(b);

        students.add(a);
        students.add(b);
        students.add(c);

        Object clone = students.clone();
        System.out.println(clone);

        final var parallel = students.stream().isParallel();

        students.addAll(students);

        Spliterator<Student> spliterator = students.spliterator();
        spliterator.forEachRemaining(System.out::println);

        Iterator<Student> iterator = students.iterator();
        iterator.forEachRemaining(System.out::println);


        HashSet<Student> set = new HashSet<>();
        set.add(a);
        set.add(b);
        set.add(c);
        System.out.println(set);

    }
}

class Student{
    int no;
    String name;
    int age;
    boolean isMale;

    public Student(int no, String name, int age, boolean isMale) {
        this.no = no;
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }

    public String toString(){
        return "no:" + no + ", name:" + name + ", age:" + age + ", isMale:" + isMale;
    }
}
