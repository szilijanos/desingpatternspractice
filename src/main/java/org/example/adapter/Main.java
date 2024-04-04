package org.example.adapter;/*
* Give me a simple example exercise idea to be practice Adapter design pattern in Java. don't give the solution, just the idea
* ChatGPT
*
* Sure! Here's a simple exercise idea to practice the Adapter design pattern in Java:
*
* Imagine you have an existing class adapter.OldLibraryImpl with a method doSomethingOld() that you
* want to use in your new project.
* However, your project requires a different interface NewInterface with a method doSomethingNew().
* Design an adapter class OldLibraryAdapter that adapts the adapter.OldLibraryImpl class
* to implement the NewInterface interface,
* allowing you to use adapter.OldLibraryImpl's functionality through the NewInterface.
*
* This exercise will require you to create the adapter class, implement the NewInterface,
* and make sure that adapter.OldLibraryImpl's functionality is correctly adapted and accessible
* through the adapter class.
* */

public class Main {
    public static void main(String[] args) {
        final NewLib foo = new OldLibAdapter(new OldLibraryImpl());
        foo.doSomethingNew("this is 1st arg", "this is 2nd arg");
    }
}