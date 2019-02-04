/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Mark Leotti
 * @version 2/4/2019
 */
class Book
{
     // The fields.
    private String author;
    private String title;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }

    // Add the methods here ...
    
    // provide access to the author
    public String getAuthor()
    { 
        return author;
    }
    
    //provide access to title
    public String getTitle()
    {
        return title;
    }
    
    //provide print utility for the author
    public void printAuthor()
    {
        System.out.println("Author: " + author);
        return;
    }
    
    //provide print utility for the title
    public void printTitle()
    {
        System.out.println("Title: " + title);
        return;
    }
    
    
}
