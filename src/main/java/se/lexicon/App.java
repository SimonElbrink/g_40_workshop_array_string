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
        System.out.println(Arrays.toString(NameRepository.findAll()));

        String[] names = {
                "Manaf A",	"Gvargis Demir","Gvargis A","Gvargis B","Gvargis C", "Heilo A",	"Samaar A",
                "Raghad A", "Tobias A", "Emil A",	"Darwen A"
        };
        NameRepository.setNames(names);
        System.out.println(Arrays.toString(NameRepository.findAll()));
        System.out.println(NameRepository.getSize()); //3

//        NameRepository.clear();
//        System.out.println(Arrays.toString(NameRepository.findAll()));

//        System.out.println(NameRepository.find("Kent"));


        boolean wasAdded = NameRepository.add("Simon asdf");
//
//        System.out.println("wasAdded = " + wasAdded);
//
//        System.out.println(Arrays.toString(NameRepository.findAll()));


//        String[] aAsLastName = NameRepository.findByLastName("a");
//
//        System.out.println(Arrays.toString(aAsLastName));
//

        System.out.println(Arrays.toString(NameRepository.findByFirstName("Simon")));

        boolean isUpdated = NameRepository.update("Simon asdf", "Simon Elbrink");

        System.out.println("isUpdated = " + isUpdated);

        System.out.println(Arrays.toString(NameRepository.findAll()));

    }
}

