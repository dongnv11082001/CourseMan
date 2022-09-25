package a1_1901040058;

public class CourseManProg {
  public static void main(String[] args) {

    Student dong_nv = new Student("Nguyen Van Dong", "11/08/2001", "Hung Yen", "dong_nv@flinters.vn");
    Student thanhlm = new Student("Le Minh Thanh", "14/02/2001", "Vinh Phuc", "thanh_lm@flinters.vn");
    Student phuocnt = new Student("Nguyen Trong Phuoc", "13/07/2001", "Ha Noi", "phuoc_nt@flinters.vn");
    Student chiendq = new Student("Dao Quyet Chien", "13/09/2001", "Ha Noi", "chien_dq@flinters.vn");
    Student nghiant = new Student("Nguyen Tuan Nghia", "27/09/2001", "Ha Noi", "nghia_nt@flinters.vn");

    CompulsoryModule wpr = new CompulsoryModule("WPR", 1, 3);
    CompulsoryModule sqa = new CompulsoryModule("SQA", 2, 3);
    CompulsoryModule dbs = new CompulsoryModule("DBS", 1, 3);
    CompulsoryModule se1 = new CompulsoryModule("SE1", 1, 3);
    CompulsoryModule ss1 = new CompulsoryModule("SS1", 1, 3);
    CompulsoryModule cgr = new CompulsoryModule("CGR", 1, 3);

    ElectiveModule mpr = new ElectiveModule("MPR", 2, 3, "FIT");
    ElectiveModule req = new ElectiveModule("REQ", 2, 3, "FIT");

    EnrolmentManager manager = new EnrolmentManager();

    Enrolment dongnvWprEnrolment = new Enrolment(dong_nv, wpr, (float) 9.2, (float) 7.8);
    Enrolment dongnvSe1Enrolment = new Enrolment(dong_nv, se1, 9, (float) 7.5);
    Enrolment dongnvSs1Enrolment = new Enrolment(dong_nv, ss1, (float) 8.5, (float) 8.5);
    Enrolment dongnvCgrEnrolment = new Enrolment(dong_nv, cgr,  8, 9);
    Enrolment dongnvSqaEnrolment = new Enrolment(dong_nv, sqa, (float) 8.0, (float) 6.5);
    Enrolment dongnvDbsEnrolment = new Enrolment(dong_nv, dbs,  8,  9);
    Enrolment dongnvMprEnrolment = new Enrolment(dong_nv, mpr, (float) 9.5, (float) 7.5);
    Enrolment dongnvReqEnrolment = new Enrolment(dong_nv, req, (float) 6.5, (float) 6.5);

    Enrolment thanhlmWprEnrolment = new Enrolment(thanhlm, wpr,  1,  2);
    Enrolment thanhlmSqaEnrolment = new Enrolment(thanhlm, sqa,  1,  4);
    Enrolment thanhlmDbsEnrolment = new Enrolment(thanhlm, dbs,  2,  2);
    Enrolment thanhlmMprEnrolment = new Enrolment(thanhlm, mpr,  3,  3);
    Enrolment thanhlmReqEnrolment = new Enrolment(thanhlm, req,  4,  6);

    // 1st semester
    manager.addEnrolment(dongnvWprEnrolment);
    manager.addEnrolment(dongnvDbsEnrolment);
    manager.addEnrolment(dongnvCgrEnrolment);
    manager.addEnrolment(dongnvSe1Enrolment);
    manager.addEnrolment(dongnvSs1Enrolment);
    manager.addEnrolment(dongnvSqaEnrolment);
    manager.addEnrolment(thanhlmDbsEnrolment);
    manager.addEnrolment(thanhlmWprEnrolment);
    manager.addEnrolment(thanhlmSqaEnrolment);

    // 2nd semester
    manager.addEnrolment(dongnvMprEnrolment);
    manager.addEnrolment(dongnvReqEnrolment);
    manager.addEnrolment(thanhlmReqEnrolment);
    manager.addEnrolment(thanhlmMprEnrolment);



    String data = manager.reportAssessment();
    System.out.println(data);
  }

}
