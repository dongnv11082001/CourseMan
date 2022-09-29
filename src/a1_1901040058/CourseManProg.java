package a1_1901040058;

public class CourseManProg {
    public static void main(String[] args) throws Exception {
        // Initialise at least 5 modules (3 compulsory and 2 elective) and 5 students
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

        // Initialise and use to create 10 enrolments (containing a mixture of
        //compulsory and elective modules)
        // Initialise and enter marks for 5 enrolments
        EnrolmentManager manager = new EnrolmentManager();

        Enrolment dongnvWprEnrolment = new Enrolment(dong_nv, wpr, (float) 9.2, (float) 7.8);
        Enrolment dongnvSe1Enrolment = new Enrolment(dong_nv, se1, 9, (float) 7.5);
        Enrolment dongnvSs1Enrolment = new Enrolment(dong_nv, ss1, (float) 8.5, (float) 8.5);
        Enrolment dongnvSqaEnrolment = new Enrolment(dong_nv, sqa, 8, (float) 6.5);
        Enrolment dongnvDbsEnrolment = new Enrolment(dong_nv, dbs, 7, (float) 9.1);

        Enrolment phuocntReqEnrolment = new Enrolment(phuocnt, req, 9, 6);
        Enrolment phuocNtDbsEnrolment = new Enrolment(phuocnt, dbs, (float) 8.5, 10);

        Enrolment nghiantCgrEnrolment = new Enrolment(nghiant, cgr, 8, 9);
        Enrolment nghiantMprEnrolment = new Enrolment(nghiant, mpr, (float) 9.5, (float) 7.5);
        Enrolment nghiantReqEnrolment = new Enrolment(nghiant, req, (float) 8.2, (float) 7.5);
        Enrolment nghiaNtDbsEnrolment = new Enrolment(nghiant, dbs, (float) 7.1, (float) 9.3);

        Enrolment chienDqDbsEnrolment = new Enrolment(chiendq, dbs, 8, (float) 7.5);
        Enrolment chienDqSs1Enrolment = new Enrolment(chiendq, ss1, 10, 10);

        Enrolment thanhlmWprEnrolment = new Enrolment(thanhlm, wpr, (float) 7.2, (float) 8.1);
        Enrolment thanhlmSqaEnrolment = new Enrolment(thanhlm, sqa, (float) 8.5, (float) 6.5);
        Enrolment thanhlmDbsEnrolment = new Enrolment(thanhlm, dbs, (float) 7.5, (float) 8.5);
        Enrolment thanhlmMprEnrolment = new Enrolment(thanhlm, mpr, 1, 6);
        Enrolment thanhlmReqEnrolment = new Enrolment(thanhlm, req, (float) 8.5, (float) 5.5);

        manager.addEnrolment(chienDqSs1Enrolment);
        manager.addEnrolment(chienDqDbsEnrolment);

        manager.addEnrolment(dongnvWprEnrolment);
        manager.addEnrolment(dongnvDbsEnrolment);
        manager.addEnrolment(dongnvSe1Enrolment);
        manager.addEnrolment(dongnvSs1Enrolment);
        manager.addEnrolment(dongnvSqaEnrolment);

        manager.addEnrolment(phuocNtDbsEnrolment);
        manager.addEnrolment(phuocntReqEnrolment);

        manager.addEnrolment(nghiantCgrEnrolment);
        manager.addEnrolment(nghiantMprEnrolment);
        manager.addEnrolment(nghiaNtDbsEnrolment);
        manager.addEnrolment(nghiantReqEnrolment);

        manager.addEnrolment(thanhlmWprEnrolment);
        manager.addEnrolment(thanhlmSqaEnrolment);
        manager.addEnrolment(thanhlmDbsEnrolment);
        manager.addEnrolment(thanhlmReqEnrolment);
        manager.addEnrolment(thanhlmMprEnrolment);

        // Print a non-sorted initial report of the enrolments on the standard output
        System.out.println("Non-sorted initial report of the enrolments" + "\n" + "---------------------------------------------------------------------------------------------------");
        String report = manager.report();
        System.out.println(report);

        // Print a sorted initial report of the enrolments on the standard output
        System.out.println("Sorted initial report of the enrolments! " + "\n" + "---------------------------------------------------------------------------------------------------");
        manager.sort();
        System.out.println(manager.report());

        // Print a (sorted) assessment report of the enrolments on the standard output
        System.out.println("Sorted assessment report of the enrolments!" + "\n" + "---------------------------------------------------------------------------------------------------");
        String reportAssessment = manager.reportAssessment();
        System.out.println(reportAssessment);
        System.out.println("End the program" + "\n" + "---------------------------------------------------------------------------------------------------");
    }

}
