import java.util.*;

public class ArrayL {
    public static void main(String[] args) {

        // TODO: displaystudents, sort method(butun studentleri sort),
        //  find student by id, contains student by id, clear all students,
        //  isempty method, update student, remove students by id, add student

        // name, id, age, double grade,
        //Integer wrapper class
        // add, remove, set, remove, add, collections sort, equals
        List<String> friendName = new ArrayList<>();
        friendName.add("Elturan");
        friendName.add("Elshad");
        friendName.add("Reshad");
        friendName.add(2, "Ali");


        List<String> friendName2 = new ArrayList<>();
        friendName2.add("Elturan");
        friendName2.add("Elshad");
        friendName2.add("Reshad");
        friendName2.add(2, "Ali");

        System.out.println(friendName.equals(friendName2));

        //friendName.remove();
        friendName.remove("Elturan");

        Collections.sort(friendName);


        // String[] familyArray = friendName.toArray(new String[0]);


        System.out.println(friendName.size());
        System.out.println(friendName.get(2));
        //System.out.println(Arrays.toString(friendName));
        System.out.println(friendName.set(1, "Elchin"));

        System.out.println(friendName);


    }
}
