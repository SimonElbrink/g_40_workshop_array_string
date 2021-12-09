package se.lexicon;

import java.util.Arrays;

public class NameRepository {

    private static String[] names = new String[0];

    public static int getSize() {
        return names.length;
    }

    public static void setNames(String[] names) {
        NameRepository.names = names;
    }

    public static void clear() {
        names = new String[0];
    }

    public static String[] findAll() {
        return names;
    }

    public static String find(final String fullName) {
        for (String name : names) {
            if (name.equalsIgnoreCase(fullName)) {
                return name;
            }
        }
        return null;
    }

    public static boolean add(final String fullName) {
        //1. Does it exist?
        if (find(fullName) != null) {
            return false;
        }

        //2. if not add to existing array.
        NameRepository.names = addToArray(names, fullName);
        return true;
    }

    public static String[] findByFirstName(final String firstName){

        String[] matches = new String[0];

        for (String fullName : names) {

            String fName = fullName.substring(0, fullName.indexOf(' '));
            if (fName.equalsIgnoreCase(firstName)){
                matches = addToArray(matches, fullName);
            }
        }

        return matches;
    }

    public static String[] findByLastName(final String lastName){

        String[] result = new String[0];

        for (String fullName : names){

            String lName = fullName.substring(fullName.indexOf(' ') +1);

            if (lName.equalsIgnoreCase(lastName)){
                result = addToArray(result, fullName);
            }
        }
        return result;
    }

    public static boolean update(final String original, final String updatedName){
        int originalIndex = arrayIndexOf(names, original);
        if (originalIndex == -1){
            return false;
        }

        int updatedIndex = arrayIndexOf(names, updatedName);
        if (updatedIndex != -1){
            return false;
        }

        names[originalIndex] = updatedName;
        return true;
    }

    private static int arrayIndexOf(String[] array, String string){
        for (int i = 0; i < array.length; i++){

            String temp = array[i];

            if (temp.equalsIgnoreCase(string)){
                return i;
            }
        }
        return -1;
    }

    private static String[] addToArray(String[] source, String stringToAdd){
        String[] temp = Arrays.copyOf(source, source.length +1);
        temp[temp.length -1] = stringToAdd;
        return temp;
    }

}
