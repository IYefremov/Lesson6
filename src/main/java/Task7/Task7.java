// In the Example class, correct a couple of equals / hashCode methods in accordance with the rules for implementing
// these methods (check details with your favorite search engine).
//        Both the first and last strings should participate in the comparison using the equals method and the hashcode
// calculation.
//public class Example {
//    private final String first, last;
//
//    public Example(String first, String last) {
//        this.first = first;
//        this.last = last;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        return false;
//    }
//
//    @Override
//    public int hashCode() {
//        return 0;
//    }
//
//    public static void main(String[] args) {
//        Set<Example> s = new HashSet<>();
//        s.add(new Example("Donald", "Duck"));
//        System.out.println(s.contains(new Example("Donald", "Duck")));
//    }
//}
//1) The result should be true;
//        2) Do not change the main method;


package Task7;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Task7 {

    private final String first, last;

    public Task7(String first, String last) {
        this.first = first;
        this.last = last;
    }

//    @Override
//    public boolean equals(Object o) {
//        return false;
//    }
//
//    @Override
//    public int hashCode() {
//        return 0;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task7 task7 = (Task7) o;
        return Objects.equals(first, task7.first) &&
                Objects.equals(last, task7.last);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, last);
    }

    public static void main(String[] args) {
        Set<Task7> s = new HashSet<Task7>();

        s.add(new Task7("Donald", "Duck"));
        System.out.println(s.contains(new Task7("Donald", "Duck")));

    }
}
