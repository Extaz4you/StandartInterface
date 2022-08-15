import java.util.Comparator;
public class SortByAge implements Comparator<ConstructorForPerson>{
    @Override
    public int compare(ConstructorForPerson o1, ConstructorForPerson o2) {
        return o1.getAge() - o2.getAge();
    }
}
