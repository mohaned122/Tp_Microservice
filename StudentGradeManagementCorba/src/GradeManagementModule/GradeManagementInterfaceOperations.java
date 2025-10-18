package GradeManagementModule;

/**
 * Interface definition : GradeManagementInterface
 * 
 * @author OpenORB Compiler
 */
public interface GradeManagementInterfaceOperations
{
    /**
     * Operation getStudentGrade
     */
    public double getStudentGrade(int StudentID, String SubjectName);

    /**
     * Operation setStudentGrade
     */
    public void setStudentGrade(int StudentID, String SubjectName, double grade);

    /**
     * Operation getGrades
     */
    public GradeManagementModule.SubjectGrade[] getGrades(int studentID);

}
