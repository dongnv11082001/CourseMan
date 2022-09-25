package a1_1901040058;

public class Module {
  private String code;
  private String name;
  private int semester;
  private int credits;
  private final String LETTER_MODULE = "M";

  public Module(String name, int semester, int credits) {
    if (!validateName(name)) {
      System.out.println("Invalid module name");
    } else {
      this.name = name;
    }

    if (!validateSemester(semester)) {
      System.out.println("Invalid module semester");
    } else {
      this.semester = semester;
    }

    if (!validateCredits(credits)) {
      System.out.println("Invalid module credits");
    } else {
      this.credits = credits;
    }

    this.code = generateCode(semester);
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if (!validateName(name)) {
      return;
    }
    this.name = name;
  }

  public int getSemester() {
    return semester;
  }

  public void setSemester(int semester) {
    if (!validateSemester(semester)) {
      return;
    }
    this.semester = semester;
  }

  public int getCredits() {
    return credits;
  }

  public void setCredits(int credits) {
    if (!validateCredits(credits)) {
      return;
    }
    this.credits = credits;
  }

  private boolean validateName(String name) {
    return name.length() > 0;
  }

  private boolean validateSemester(int semester) {
    return semester > 0;
  }

  private boolean validateCredits(int credits) {
    return credits > 0;
  }

  private String generateCode(int semester) {
    return LETTER_MODULE + (100 * semester);
  }

  @Override
  public String toString() {
    return "Module{" +
            "code='" + code  +
            ", name='" + name +
            ", semester=" + semester +
            ", credits=" + credits +
            '}';
  }
}
