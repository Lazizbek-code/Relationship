package has;

public class AggregationTest {
    public static void main(String[] args) {
        Address address = new Address("Uzbekistan", "Qo'qon", "ATX");
        Student student = new Student("Muzaffarov Lazizbek", 26, address);

        System.out.println(student.toString());
    }
}
