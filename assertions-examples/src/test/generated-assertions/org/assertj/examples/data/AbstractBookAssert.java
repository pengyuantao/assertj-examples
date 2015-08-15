package org.assertj.examples.data;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link Book} specific assertions - Generated by CustomAssertionGenerator.
 */
public abstract class AbstractBookAssert<S extends AbstractBookAssert<S, A>, A extends Book> extends AbstractAssert<S, A> {

  /**
   * Creates a new <code>{@link AbstractBookAssert}</code> to make assertions on actual Book.
   * @param actual the Book we want to make assertions on.
   */
  protected AbstractBookAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  /**
   * Verifies that the actual Book's title is equal to the given one.
   * @param title the given title to compare the actual Book's title to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Book's title is not equal to the given one.
   */
  public S hasTitle(Book.Title title) {
    // check that actual Book we want to make assertions on is not null.
    isNotNull();


    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting title of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // check
    Book.Title actualTitle = actual.getTitle();
    System.out.println("check Title");
    if (!Objects.areEqual(actualTitle, title)) {
      failWithMessage(assertjErrorMessage, actual, title, actualTitle);
    }

    // return the current assertion for method chaining
    return myself;
  }

}
