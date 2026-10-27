package Session6;
import java.util.ArrayDeque;

public class SampleQueue {
    public static void main(String[] args) {
        ArrayDeque <String> students = new ArrayDeque<String>();
        students.add("Arwa");
        students.add("Maryam");
        students.add("Yusuf");
        students.add("Joseph");
        students.add("Neva");

        System.out.print(students.poll()); //Removes the front element and returns the return value.
        System.out.print(students.size()); //Length of array list
        System.out.print(students.pollLast()); //Removes the end element and returns the return value.

        for (String name:students) { //foreach in JAVA
            System.out.println(name);
        }

        students.remove(); //remove Arwa
        for (String name:students) { //foreach in JAVA
            System.out.println(name);
        }

        for (String name:students) { //foreach in JAVA
            System.out.println(name);
        }
    }
}