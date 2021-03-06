package java.nio.file;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link Path} specific assertions - Generated by CustomAssertionGenerator.
 */
public abstract class AbstractPathAssert<S extends AbstractPathAssert<S, A>, A extends Path> extends AbstractAssert<S, A> {

  /**
   * Creates a new <code>{@link AbstractPathAssert}</code> to make assertions on actual Path.
   * @param actual the Path we want to make assertions on.
   */
  protected AbstractPathAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  /**
   * Verifies that the actual Path's fileName is equal to the given one.
   * @param fileName the given fileName to compare the actual Path's fileName to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Path's fileName is not equal to the given one.
   */
  public S hasFileName(Path fileName) {
    // check that actual Path we want to make assertions on is not null.
    isNotNull();


    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting fileName of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // check
    Path actualFileName = actual.getFileName();
    System.out.println("check FileName");
    if (!Objects.areEqual(actualFileName, fileName)) {
      failWithMessage(assertjErrorMessage, actual, fileName, actualFileName);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Path's fileSystem is equal to the given one.
   * @param fileSystem the given fileSystem to compare the actual Path's fileSystem to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Path's fileSystem is not equal to the given one.
   */
  public S hasFileSystem(FileSystem fileSystem) {
    // check that actual Path we want to make assertions on is not null.
    isNotNull();


    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting fileSystem of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // check
    FileSystem actualFileSystem = actual.getFileSystem();
    System.out.println("check FileSystem");
    if (!Objects.areEqual(actualFileSystem, fileSystem)) {
      failWithMessage(assertjErrorMessage, actual, fileSystem, actualFileSystem);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Path's nameCount is equal to the given one.
   * @param nameCount the given nameCount to compare the actual Path's nameCount to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Path's nameCount is not equal to the given one.
   */
  public S hasNameCount(int nameCount) {
    // check that actual Path we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting nameCount of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // check
    int actualNameCount = actual.getNameCount();
    if (actualNameCount != nameCount) {
      failWithMessage(assertjErrorMessage, actual, nameCount, actualNameCount);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Path's parent is equal to the given one.
   * @param parent the given parent to compare the actual Path's parent to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Path's parent is not equal to the given one.
   */
  public S hasParent(Path parent) {
    // check that actual Path we want to make assertions on is not null.
    isNotNull();


    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting parent of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // check
    Path actualParent = actual.getParent();
    System.out.println("check Parent");
    if (!Objects.areEqual(actualParent, parent)) {
      failWithMessage(assertjErrorMessage, actual, parent, actualParent);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Path's root is equal to the given one.
   * @param root the given root to compare the actual Path's root to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Path's root is not equal to the given one.
   */
  public S hasRoot(Path root) {
    // check that actual Path we want to make assertions on is not null.
    isNotNull();


    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting root of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // check
    Path actualRoot = actual.getRoot();
    System.out.println("check Root");
    if (!Objects.areEqual(actualRoot, root)) {
      failWithMessage(assertjErrorMessage, actual, root, actualRoot);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Path is absolute.
   * @return this assertion object.
   * @throws AssertionError - if the actual Path is not absolute.
   */
  public S isAbsolute() {
    // check that actual Path we want to make assertions on is not null.
    isNotNull();

    // check
    if (!actual.isAbsolute()) {
      failWithMessage("\nExpecting that actual Path is absolute but is not.");
    }
    
    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Path is not absolute.
   * @return this assertion object.
   * @throws AssertionError - if the actual Path is absolute.
   */
  public S isNotAbsolute() {
    // check that actual Path we want to make assertions on is not null.
    isNotNull();

    // check
    if (actual.isAbsolute()) {
      failWithMessage("\nExpecting that actual Path is not absolute but is.");
    }
    
    // return the current assertion for method chaining
    return myself;
  }

}
