package GradeManagementServer;

import GradeManagementModule.GradeManagementInterfacePOA;
import GradeManagementModule.SubjectGrade;

import java.util.ArrayList;
import java.util.List;

public class GradeManagementImpl extends GradeManagementInterfacePOA {

    public  static List<SubjectGrade> subjectGradeList = new ArrayList<SubjectGrade>();

    @Override
    public double getStudentGrade(int StudentID, String SubjectName) {
        for(SubjectGrade subjectGrade:subjectGradeList){
            if (subjectGrade.subject == SubjectName){
                System.out.println(subjectGrade.grade);
                return subjectGrade.grade;
            }
        }
        return 0;
    }

    @Override
    public void setStudentGrade(int StudentID, String SubjectName, double grade) {
        subjectGradeList.add(new SubjectGrade(SubjectName,grade));
        System.out.println("setStudentGrade(StudentID, String SubjectName, double grade) called");
    }

    @Override
    public SubjectGrade[] getGrades(int studentID) {
        //presentation in the server
        for(SubjectGrade subjectGrade:subjectGradeList){
            System.out.println(subjectGrade.subject + ": " + subjectGrade.grade);
        }
        return subjectGradeList.toArray(new SubjectGrade[0]);
    }
}
