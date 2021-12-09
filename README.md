# Workshop - Arrays & String

## Part 1

1. Create a Maven project.
2. Create a new class called **``NameRepository``**.
3. Inside **`NameRepository`** create a private static empty array of String called **``names``**.
4. Define following methods:

**``public static int getSize()``** - Returns number of elements in the array.

**``public static void setNames(String[] names)``** - Sends in an array that set the private static array.

**``public static void clear()``** - Should completely empty the array.

**``public static String[] findAll()``** - Returns all names in a new array.

---

## Part 2
1. Define the following methods in NameRepository:
*`public static String find(final String fullName)`* - name if found and null if not found.
*`public static boolean add(final String fullName)`* - Should add a new name to the array. Returns true when name was added and false when the array contains the name.

---

## Part 3
Define the following methods in NameRepository:
*`public static String[] findByFirstName(final String firstName)`*
Searches the array trying to find all names that has passed in first name. Returns a String array containing all
matches.

*`public static String[] findByLastName(final String lastName)`*
Searches the array trying to find all names that has passed in last name. Returns a String array containing all
matches.

*`public static boolean update(final String original, final String updatedName)`*
Should find a name and replace it with new fullName if available. Returns true if name was found and updated
with the new name. False if name could not be updated because name wasn’t found or name was found but an
existing name matching the updatedName already exists.







