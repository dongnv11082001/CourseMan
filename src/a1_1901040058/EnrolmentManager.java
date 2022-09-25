package a1_1901040058;

import java.util.ArrayList;
import java.util.List;

public class EnrolmentManager {
  public List<Enrolment> enrolments;

  public EnrolmentManager() {
    this.enrolments = new ArrayList<>();
  }

  public void addEnrolment(Enrolment enrolment) {
    if (enrolment != null) {
      this.enrolments.add(enrolment);
    }
  }

  public Enrolment getEnrolment(Student student, Module module) {
    if (!this.enrolments.isEmpty()) {
      for (Enrolment e : enrolments) {
        if (e.getStudent().getId().equals(student.getId())
                && e.getModule().getCode().equals(module.getCode())
                && e.getModule().getName().equals(module.getName())) {
          return e;
        }
      }
    }
    return null;
  }

  public void setMarks(Student student, Module module, double internalMark, double examinationMark) {
    if (!this.enrolments.isEmpty()) {
      for (Enrolment e : enrolments) {
        if (e.getStudent().getId().equals(student.getId())
                && e.getModule().getCode().equals(module.getCode())
                && e.getModule().getName().equals(module.getName())) {
          e.setInternalMark((float) internalMark);
          e.setExaminationMark((float) examinationMark);
        }
      }
    }
  }

  public String report() {
    String report = "";
    for (Enrolment e : enrolments) {
      report += e.getStudent().toString() + ";" + e.getModule().toString() + "\n";
    }

    return report;
  }

  public String reportAssessment() {
    return report();
  }

//  public void sort() {
//    Arrays.quickSort();
//  }
}
