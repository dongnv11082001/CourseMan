package a1_1901040058;

public class CompulsoryModule extends Module {
  public CompulsoryModule(String name, int semester, int credits) throws Exception {
    super(name, semester, credits);
  }

  @Override
  public String toString() {
    return "Compulsory Module{" +
            "code=" + '\'' + super.getCode() +
            ", name=" + super.getName() + '\'' +
            ", semester=" + super.getSemester() + '\'' +
            ", credits=" + super.getCredits() + '\'' +
            "}";
  }
}
