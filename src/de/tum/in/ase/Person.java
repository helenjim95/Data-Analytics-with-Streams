package de.tum.in.ase;

import java.util.List;

//don't change anything here
public class Person {
    private String lastName;
    private int age;
    private Profession profession;
    private List<Day> workingDays;
    private int timeForHobbies;

    public Person(String lastName, int age, Profession profession, List<Day> workingDays, int timeForHobbies) {
        this.lastName = lastName;
        this.age = age;
        this.profession = profession;
        this.workingDays = workingDays;
        this.timeForHobbies = timeForHobbies;
    }

    public List<Day> getWorkingDays() {
        return workingDays;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public int getTimeForHobbies() {
        return timeForHobbies;
    }

    public void setTimeForHobbies(int timeForHobbies) {
        this.timeForHobbies = timeForHobbies;
    }

    @Override
    public String toString() {
        return lastName + " | " + age + " | " + profession + " | " + workingDays + " | " + timeForHobbies + "\n";
    }
}
