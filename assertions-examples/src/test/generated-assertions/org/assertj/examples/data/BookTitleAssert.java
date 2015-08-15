package org.assertj.examples.data;


/**
 * {@link Book.Title} specific assertions - Generated by me.
 *
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it, 
 * extend {@link AbstractBookTitleAssert} instead.
 */
public class BookTitleAssert extends AbstractBookTitleAssert<BookTitleAssert, Book.Title> {

  /**
   * Creates a new <code>{@link BookTitleAssert}</code> to make assertions on actual Book.Title.
   * @param actual the Book.Title we want to make assertions on.
   */
  public BookTitleAssert(Book.Title actual) {
    super(actual, BookTitleAssert.class);
  }

  /**
   * factory method for Book.Title assertions.
   * @return a new <code>{@link BookTitleAssert}</code>
   */
  public static BookTitleAssert assertThat(Book.Title actual) {
    return new BookTitleAssert(actual);
  }
}
