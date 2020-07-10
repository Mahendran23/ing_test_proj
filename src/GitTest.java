class GitTest {

  int aField;

  @MyAnnotation
  public void aMethod() {

  }

  @Zuper // Noncompliant {{Avoid using annotation @Zuper}}
  public void aMethod() {

  }

}
