import java.util.Comparator;
public class SortReverse implements Comparator<ConstructorForPerson> {

    public int compare(ConstructorForPerson o1, ConstructorForPerson o2) {
        return o2.getAge() - o1.getAge();
    }
}
