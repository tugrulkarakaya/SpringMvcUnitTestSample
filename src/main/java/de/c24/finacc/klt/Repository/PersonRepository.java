package de.c24.finacc.klt.Repository;

import de.c24.finacc.klt.payload.Person;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

// Because of time limit I could not implemented internat H2 Database yet.
// But the best singleton implementation is Enums. So I will uise an enum as singleton object.
public enum PersonRepository {
    Instance;
    private List<Person> persons = new ArrayList<>();
    public void addPerson(Person person){
        persons.add(person);
    }
    public Person getPersonByName(String name){
        return persons.stream().filter(p -> p.getFirstName().equals(name)).findFirst().orElseGet(null);
    }
    public List<Person> GetAllRecords(){
        return Collections.unmodifiableList(persons);
    }
}
