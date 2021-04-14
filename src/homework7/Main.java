package homework7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>(List.of(
                new Person("Petro", 25, Gender.MALE, Country.UKRAINE),
                new Person("Olena", 19, Gender.FEMALE, Country.UKRAINE),
                new Person("Marek", 50, Gender.MALE, Country.POLAND),
                new Person("Rasine", 65, Gender.FEMALE, Country.POLAND),
                new Person("Cherina", 42, Gender.FEMALE, Country.FRANCE),
                new Person("Bridgett", 18, Gender.FEMALE, Country.FRANCE),
                new Person("Jaron", 42, Gender.MALE, Country.ISRAEL),
                new Person("Namir", 18, Gender.MALE, Country.ISRAEL),
                new Person("John", 10, Gender.MALE, Country.USA),
                new Person("Jane", 78, Gender.FEMALE, Country.USA),
                new Person("Alonzo", 12, Gender.MALE, Country.ARGENTINA),
                new Person("Azael", 43, Gender.FEMALE, Country.ARGENTINA),
                new Person("Thomas", 12, Gender.MALE, Country.AUSTRALIA),
                new Person("Brittney", 43, Gender.FEMALE, Country.AUSTRALIA)

        ));

        Set<String> filteredStreamSet = list.stream() .filter(person -> person.getAge() >= 18 && person.getAge() < 60).collect(
                HashSet::new,
                (set, person) -> set.add(person.getName() + " - " + (person.getGender() == Gender.MALE ? "m" : "f")),
                HashSet::addAll
        );

        filteredStreamSet.forEach(System.out::println);

    }
}


