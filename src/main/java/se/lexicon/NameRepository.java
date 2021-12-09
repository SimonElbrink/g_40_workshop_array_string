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
        String[] newArray = Arrays.copyOf(names, names.length + 1);
        newArray[newArray.length - 1] = fullName;
        NameRepository.names = newArray;
        return true;
    }


}
