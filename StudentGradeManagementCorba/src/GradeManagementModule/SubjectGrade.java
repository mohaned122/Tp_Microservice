package GradeManagementModule;

/**
 * Struct definition : SubjectGrade
 * 
 * @author OpenORB Compiler
*/
public final class SubjectGrade implements org.omg.CORBA.portable.IDLEntity
{
    /**
     * Struct member subject
     */
    public String subject;

    /**
     * Struct member grade
     */
    public double grade;

    /**
     * Default constructor
     */
    public SubjectGrade()
    { }

    /**
     * Constructor with fields initialization
     * @param subject subject struct member
     * @param grade grade struct member
     */
    public SubjectGrade(String subject, double grade)
    {
        this.subject = subject;
        this.grade = grade;
    }

}
