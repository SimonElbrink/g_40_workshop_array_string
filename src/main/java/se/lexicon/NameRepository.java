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
        return Arrays.copyOf(names, names.length);
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

        //Create an Array.
        String[] matches = new String[0];

        //Loop through names
        for (String fullName: names) {

            //Separate firstName from lastName " "
            String fName = fullName.substring(0, fullName.indexOf(" "));
            //if match add to array.
            if (firstName.equalsIgnoreCase(fName)){
                matches = addToArray(matches, fullName);
            }
        }

        return matches;
    }

    public static String[] findByLastName(final String lastName){
        String[] matches = new String[0];

        for (String fullName: names) {
            String lName = fullName.split(" ")[1];

            if (lastName.equalsIgnoreCase(lName)){
                matches = addToArray(matches, fullName);
            }

        }
        return matches;
    }

    public static boolean update(final String original, final String updatedName){
        int originalIndex = arrayIndexOf(names, original);

        //if name not found return false.
        if (originalIndex == -1){
            return false;
        }

        int updatedIndex = arrayIndexOf(names, updatedName);
        // If new name exists don't allow it to be added. (No Duplicates.)
        if (updatedIndex != -1){
            return false;
        }

        names[originalIndex] = updatedName;
        return true;
    }


    public static boolean remove(final String fullName){
        int index = arrayIndexOf(names, fullName);
        if(index < 0){
            return false;
        }
        names = removeByIndex(names, index);
        return true;
    }

    private static String[] removeByIndex(final String[] strings, final int index) {
        String[]first = Arrays.copyOfRange(strings, 0, index);
        String[]last = Arrays.copyOfRange(strings, index + 1, strings.length);
        String[]combined = Arrays.copyOf(first, first.length + last.length);
        for(int writePos = first.length, readPos=0; readPos<last.length; writePos++, readPos++){
            combined[writePos] = last[readPos];
        }

        /*
        System.arraycopy(
                last,           //source array
                0,       //copy from index
                combined,       //target array
                first.length,   //starting position in the destination data
                last.length     //number of elements to copy from last array
        );
         */
        return combined;
    }

    /**
     *
     * @param array to search inside.
     * @param string element to find in array.
     * @return index of element if found. else -1 if not found.
     */
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
