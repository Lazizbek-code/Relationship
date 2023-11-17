package has;

public class AssociationTest {
    public static void main(String[] args) {
        Citizen citizen = new Citizen("Muzaffarov Lazizbek");
        Passport passport = new Passport("AA", "5955011");
        String message = "%s %s%s".formatted(citizen.getFullName(), passport.getSerial(), passport.getNumber());
        System.out.print(message);
    }
}
