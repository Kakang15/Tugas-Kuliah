package Session6;
import java.util.Stack;

public class SampleStack {
    public static void main(String[] args) {
        Stack <String> students = new Stack<String>();
        students.push("Arwa");
        students.push("Maryam");
        students.push("Yusuf");
        students.push("Joseph");
        students.push("Neva");

        System.out.print(students.pop()); //get the specific value by index
        System.out.print(students.peek()); //get the top element
        System.out.print(students.size()); //Length of stack

        for (String name:students) { //foreach in JAVA
            System.out.println(name);
        }

        students.pop(); //remove the top element
        for (String name:students) { //foreach in JAVA
            System.out.println(name);
        }

        students.set(1,"Dalia");
        for (String name:students) { //foreach in JAVA
            System.out.println(name);
        }

        students.clear();
        System.out.print(students.size());
    }
}