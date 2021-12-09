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

        String[] names = {"Erik Svensson", "Simon Elbrink", "Ulf Bengtsson"};
        NameRepository.setNames(names);
        System.out.println(Arrays.toString(NameRepository.findAll()));
        System.out.println(NameRepository.getSize()); //3

//        NameRepository.clear();
//        System.out.println(Arrays.toString(NameRepository.findAll()));

//        System.out.println(NameRepository.find("Kent"));


        boolean wasAdded = NameRepository.add("Emil Johansson");

        System.out.println("wasAdded = " + wasAdded);

        System.out.println(Arrays.toString(NameRepository.findAll()));



    }
}

