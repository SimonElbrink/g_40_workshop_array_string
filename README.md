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

