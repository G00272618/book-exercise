/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Mark Leotti
 * @version 2/4/2019
 */

import java.util.Scanner;
class Book
{
     // The fields.
    private String author;
    private String title;
    // Add new field variable.
    private boolean courseText;
    // Add new field variable. (2)
    private int pages;
    // Add new field variable. (3)
    private boolean borrowed;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    
    // Add new parameter to correspond with new field variable within the constructor method. (2)
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean bookIsCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        // Equate new field variables to the new parameters.
        courseText = bookIsCourseText;
        pages = bookPages;
    }

    // Add the methods here ...
    
    // Provide access to the author.
    public String getAuthor()
    { 
        return author;
    }
    
    // Provide access to title.
    public String getTitle()
    {
        return title;
    }
    
    // Provide access to the isCourseText boolean.
    public boolean isCourseText()
    {
        return courseText;
    }
    
    // Provide access to the number of pages.
    public int getPages()
    {
        return pages;
    }
    
    // Provide access to the borrowed boolean.
    public boolean isBorrowed()
    {
        return borrowed;
    }
    
    // Provide mutator access to the borrowed boolean.
    public boolean getBorrowed()
    {
        if (!borrowed) {
            borrowed = true;
        } else if (borrowed) {
            borrowed = false;
        }
        return;
    }
    
    // Provide print utility for the author.
    public void printAuthor()
    {
        System.out.println("Author: " + author);
        return;
    }
    
    // Provide print utility for the title.
    public void printTitle()
    {
        System.out.println("Title: " + title);
        return;
    }
    
    // Provide print utility for the isCourseText boolean.
    public void printPublisher()
    {
        if (courseText) {
            System.out.println("Course text?\t*YES*");
        } else {
            System.out.println("Course text?\t*NO*");
        }
        return;
    }
    
    // Provide print utility for the number of pages.
    public void printPages()
    {
        System.out.println("Pages:\t\t" + pages);
    }
    
    // Provide formatted print utility for all field variables.
    public void printDetails()
    {
        System.out.println("Author:\t\t" + author);
        System.out.println("Title:\t\t" + title);
        if (courseText) {
            System.out.println("Course text?\t*YES*");
        } else {
            System.out.println("Course text?\t*NO*");
        }
        System.out.println("Pages:\t\t" + pages);
        if (borrowed) {
            System.out.println("Borrowed Status:\t*IN*");
        } else {
            System.out.println("Borrowed Status:\t*OUT*");
        }
        return;
    }
}
