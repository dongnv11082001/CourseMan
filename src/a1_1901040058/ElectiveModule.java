package a1_1901040058;

public class ElectiveModule extends Module{
  private String departmentName;

  public ElectiveModule(String name, int semester, int credits, String departmentName) {
    super(name, semester, credits);
    if (!validateDepartmentName(departmentName)) {
      System.out.println("Invalid departmentName!");
    } else {
      this.departmentName = departmentName;
    }
  }

  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    if (!validateDepartmentName(departmentName)) {
      return;
    }
    this.departmentName = departmentName;
  }

  private boolean validateDepartmentName(String departmentName) {
    return departmentName.length() > 0;
  }
}
