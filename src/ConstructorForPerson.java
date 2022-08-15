import java.util.Comparator;

public class ConstructorForPerson implements Comparator<ConstructorForPerson> {
    private String name;
    private String surname;
    private Integer age;

    public ConstructorForPerson(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "ConstructorForPerson{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compare(ConstructorForPerson o1, ConstructorForPerson o2) {
        return o1.age - o2.age;
    }
}
