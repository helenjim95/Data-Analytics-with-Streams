package de.tum.in.ase;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//actual Streams tasks
public class DataAnalytics {
    private static final String[] LASTNAMES = {"Stark", "Smith", "Davis", "Parker", "Miller", "Brown", "Williams", "Johnson", "Jones", "Garcia"};
    private List<Person> data;

    /**
     * Constructor creates dataset with random people
     */
    public DataAnalytics(int dataSetSize) {
        data = Stream.generate(String::new)
                .limit(dataSetSize)
                .map(s -> createRandomPerson())
                .collect(Collectors.toList());
    }

    //TODO: Implement the following tasks using Streams

    //Task 1: Find out how many people work on Mondays
    /**
     * getPeopleCountMonday() finds out how many people are working on mondays
     *
     * @return long
     */

    //Task 2: Find out all people that have the name "Smith", "Brown" or "Johnson" and are 30 or above. Return the average age
    /**
     * getAverageAge() finds out the average age of the people with name "Smith", "Brown", "Johnson" that are above 30
     *
     * @return double
     */

    //Task 3: Now everyone should spend two more hours on their hobbies.
    /**
     * shiftTimeForHobbies() adds two to every persons timeForHobbies
     *
     * @return void
     */

    //Task 4: Due to the development of autonomous vehicles, all drivers now have to learn something new.
    //Therefore all drivers should have the profession student now.
    /**
     * changeProfessionToStudent() changes the profession attribute to student for all people that have the profession driver
     *
     * @return void
     */


    /**
     * @return this.data
     */
    public List<Person> getData() {
        return data;
    }

    /**
     * Returns a String with every Persons name + profession
     *
     * @return String
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        data.stream().forEach(person -> {
            if (person != null) {
                result.append(person.getLastName()).append(" ").append(person.getAge()).append(": ").append(person.getProfession());
                result.append("\n");
            }
        });
        return result.toString();
    }

    //you don't have to do anything here
    /**
     * createRandomPerson() creates a Random Person
     * uses the Random Class to create random working days, lastName, timeForHobbies and profession
     *
     * @return Person
     */
    private Person createRandomPerson() {
        Random dice = new Random();
        Day[] days = Day.values();
        List<Day> workingDays = new ArrayList<>();

        //set random lastName and age
        String lastName = LASTNAMES[dice.nextInt(LASTNAMES.length)];
        int age = 16 + dice.nextInt(70);

        //set workingHours
        int timeForHobbies = dice.nextInt(20);

        //set random profession
        int randomInt = dice.nextInt(Profession.values().length);
        Profession profession = Profession.values()[randomInt];

        IntStream.range(0, 7).forEach(i -> {
            int randomInt2 = dice.nextInt(Profession.values().length);
            randomInt2 = dice.nextInt(2);
            if (randomInt2 == 1) {
                workingDays.add(days[i]);
            }
        });

        return new Person(lastName, age, profession, workingDays, timeForHobbies);
    }

    /**
     * Can be used for testing purposes
     */
    public static void main(String[] args) {
        //use this method for testing
    }
}
