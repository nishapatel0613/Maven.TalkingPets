package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Console {
    ArrayList<Pet> pets = new ArrayList<Pet>();
    String petName = "";
    Scanner scanner = new Scanner(System.in);

    public Integer getNumberOfPets(){
        Integer noOfPetsAccepted = 0;
        System.out.print("How many pets you have?");
        if(scanner.hasNextInt()){
            noOfPetsAccepted = scanner.nextInt();
        }
        return noOfPetsAccepted;
    }

    public void acceptName(Integer noOfPetsCount){
        int petType;
        String passNewLine;
        for (int i = 0; i < noOfPetsCount; i++) {
            System.out.print("\n What kind of pet you have? 1.Cat 2.Dog 3.Pig :");
            petType = scanner.nextInt();
            passNewLine = scanner.nextLine();

            switch (petType){
                case 1:
                    System.out.print("Cat's name:");
                    petName = scanner.nextLine();
                    Cat cat = new Cat(petName);
                    this.pets.add(cat);
                    break;

                case 2:
                    System.out.print("Dog's name:");
                    petName = scanner.nextLine();
                    Dog dog = new Dog(petName);
                    this.pets.add(dog);
                    break;

                case 3:
                    System.out.print("Pig's name:");
                    petName = scanner.nextLine();
                    Pig pig = new Pig(petName);
                    this.pets.add(pig);
                    break;
                default:
                    System.out.print("The End");
                    System.exit(0);
                    break;

            }

        }
    }


    public void printResults(ArrayList<Pet> petsPassed){

        Pet p = new Pet();

        System.out.println("/n************ Display Using Comparator ***************");
        Pet.NameComparator<Pet> nameComparator = new Pet.NameComparator<Pet>();
        Collections.sort(petsPassed,nameComparator);
        for (Pet pet : petsPassed) {
            System.out.println("/nPet's Name :" + String.valueOf(pet.getPetName()));
            System.out.print(p.speak()+"/n");
        }

        System.out.println("/n ************ Display Using Comparable Interface ***************");
        Collections.sort(petsPassed);
        for(Pet p1 : petsPassed){
            System.out.println("/nPet's Name :" + String.valueOf(p1.getPetName()));
            System.out.print(p.speak()+"/n");
        }
    }


}
