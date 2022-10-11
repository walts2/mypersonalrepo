// Java program to demonstrate working of HashTable 

import java.util.*;

public class HashTable {
    public static void main(String args[]) {
        Hashtable<String, String> contactlist = new Hashtable<String, String>();

        // Put
        // Inserts key-value pairs in a hash table.
        contactlist.put("Walt", "09263820015");
        contactlist.put("Benet", "09324874720");
        contactlist.put("Icarus", "09392955668");
        contactlist.put("Grey", "09475245786");
        contactlist.put("Gerlu", "09774528744");

        // Remove
        // Removes key-value pairs in a hash table.
        contactlist.remove("Benet");

        // Get
        // Retrieves a value in a hash table using a key.
        System.out.println(contactlist.get("Grey"));

        // Size
        // Returns the total number of key-value pairs in the hash table.
        System.out.println(contactlist.size());

        // Show all content of hash table
        System.out.println(contactlist);

        // Clear
        // Resets and empties the hash table.
        contactlist.clear();
    }
}
