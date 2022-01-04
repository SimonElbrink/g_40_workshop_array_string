package se.lexicon;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        int size = NameRepository.getSize();
        System.out.println("size = " + size); //0

        String[] g40 = {"Pär Törnell", "Susanne Cederholm", "Susanne Petersson", "Antoine Rebelo", "Simon Elbrink", "Emil Johansson"};

        NameRepository.setNames(g40);

        size = NameRepository.getSize();
        System.out.println("size = " + size); // 5

//        NameRepository.clear();
//
//        size = NameRepository.getSize();
//        System.out.println("size = " + size); //0

        String[] all = NameRepository.findAll();

        all[3] = "Mehrdad";

        for (String name : all) {
            System.out.println(name);
        }


        System.out.println("find all again");
        String[] all1 = NameRepository.findAll();

        for (String name : all1) {
            System.out.println(name);
        }


        String foundName = NameRepository.find("pär");

        System.out.println("foundName = " + foundName);


        NameRepository.add("Erik Svensson");

        System.out.println(Arrays.toString(NameRepository.findAll()));


        NameRepository.add("Ulf Begntsson");

        System.out.println(Arrays.toString(NameRepository.findAll()));


        System.out.println(Arrays.toString(NameRepository.findByFirstName("Susanne")));

        System.out.println(NameRepository.update("Susanne Petersson", "Susanna Elbrink"));

        System.out.println(Arrays.toString(NameRepository.findByLastName("Elbrink")));

        System.out.println(NameRepository.remove("Simon Elbrink"));

        System.out.println(NameRepository.find("Simon Elbrink"));


    }
}
