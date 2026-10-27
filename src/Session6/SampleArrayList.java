package Session6;
import java.util.ArrayList;

public class SampleArrayList {
    public static void main(String[] args) {
        ArrayList <String> students = new ArrayList<String>();
        students.add("Arwa");
        students.add("Maryam");
        students.add("Yusuf");
        students.add("Joseph");
        students.add("Neva");

        System.out.print(students.get(2)); //get the specific value by index
        System.out.print(students.size()); //Length of array list

        for (String name:students) { //foreach in JAVA
            System.out.println(name);
        }

        students.remove(2); //remove joseph, and Neva will replace his index
        for (String name:students) { //foreach in JAVA
            System.out.println(name);
        }

        students.set(3,"Dalia");
        for (String name:students) { //foreach in JAVA
            System.out.println(name);
        }

        students.clear();
        System.out.print(students.size());
    }
}