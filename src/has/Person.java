package has;

public class Person {
    private String name;
    private final Heart heart;

    public Person(String name, Heart heart) {
        this.name = name;
        this.heart = heart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Heart getHeart() {
        return heart;
    }
}
