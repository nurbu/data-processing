package com.pluralsight;

import com.pluralsight.loops.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    private static List<Person> people = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Person person1 = new Person("Liam", "Carter", 22);
        Person person2 = new Person("Sophia", "Nguyen", 31);
        Person person3 = new Person("Ethan", "Martinez", 27);
        Person person4 = new Person("Olivia", "Patel", 19);
        Person person5 = new Person("Noah", "Kim", 45);
        Person person6 = new Person("Ava", "Robinson", 38);
        Person person7 = new Person("Mason", "Hernandez", 29);
        Person person8 = new Person("Isabella", "Thompson", 24);
        Person person9 = new Person("Lucas", "Singh", 33);
        Person person10 = new Person("Mia", "Anderson", 41);
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);
        people.add(person7);
        people.add(person8);
        people.add(person9);
        people.add(person10);

        List<Person> matchingPeople = findMatchPeople(scan);


    }

    private static List<Person> findMatchPeople(Scanner scan) {
        List<Person> matchingPeople = new ArrayList<>();
        System.out.print("Enter the name your looking for: ");
        String userInput = scan.nextLine();

        for (Person person : people) {
            if (userInput.equalsIgnoreCase(person.getFirstName()) || userInput.equalsIgnoreCase(person.getLastName())) {
                matchingPeople.add(person);
                System.out.println(person);
            }
        }
        return matchingPeople;
    }
}
