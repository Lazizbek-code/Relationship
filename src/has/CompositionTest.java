package has;

public class CompositionTest {
    public static void main(String[] args) {
        Heart heart = new Heart(77);
        Person person = new Person("Lazizbek", heart);
    }
}
