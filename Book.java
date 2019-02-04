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
    // Add new field variable.
    private String publisher;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    
    // Add new parameter to correspond with new field variable within the constructor method.
    public Book(String bookAuthor, String bookTitle, String bookPublisher)
    {
        author = bookAuthor;
        title = bookTitle;
        // Equate new field variable to the new parameter.
        publisher = bookPublisher;
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
    
    // Provide access to the publisher.
    public String getPublisher()
    {
        return publisher;
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
    
    // Provide print utility for the publisher.
    public void printPublisher()
    {
        System.out.println("Publisher: " + publisher);
        return;
    }
    
    
}
