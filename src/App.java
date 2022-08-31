import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<ConstructorForPerson> ListOfPeople = new ArrayList<>();
        ListOfPeople.add(new ConstructorForPerson("Dima", "Petrov", 21));
        ListOfPeople.add(new ConstructorForPerson("Oleg", "Karpov", 25));
        ListOfPeople.add(new ConstructorForPerson("Sveta", "Feadyakina", 20));
        ListOfPeople.add(new ConstructorForPerson("Tanya", "Chapaeva", 18));
        ListOfPeople.sort(new SortByAge());
        System.out.println(ListOfPeople);
        ListOfPeople.sort(new SortReverse());
        System.out.println(ListOfPeople);
        ListOfPeople.sort(Comparator.comparing(ConstructorForPerson::getName));
        System.out.println(ListOfPeople);
        ListOfPeople.sort(Comparator.comparing(ConstructorForPerson::getSurname));
        System.out.println(ListOfPeople);
        ListOfPeople.sort(Comparator.comparing(ConstructorForPerson::getSurname));
    }
}
