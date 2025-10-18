package GradeManagementModule;

/**
 * Interface definition : GradeManagementInterface
 * 
 * @author OpenORB Compiler
 */
public class GradeManagementInterfacePOATie extends GradeManagementInterfacePOA
{

    //
    // Private reference to implementation object
    //
    private GradeManagementInterfaceOperations _tie;

    //
    // Private reference to POA
    //
    private org.omg.PortableServer.POA _poa;

    /**
     * Constructor
     */
    public GradeManagementInterfacePOATie(GradeManagementInterfaceOperations tieObject)
    {
        _tie = tieObject;
    }

    /**
     * Constructor
     */
    public GradeManagementInterfacePOATie(GradeManagementInterfaceOperations tieObject, org.omg.PortableServer.POA poa)
    {
        _tie = tieObject;
        _poa = poa;
    }

    /**
     * Get the delegate
     */
    public GradeManagementInterfaceOperations _delegate()
    {
        return _tie;
    }

    /**
     * Set the delegate
     */
    public void _delegate(GradeManagementInterfaceOperations delegate_)
    {
        _tie = delegate_;
    }

    /**
     * _default_POA method
     */
    public org.omg.PortableServer.POA _default_POA()
    {
        if (_poa != null)
            return _poa;
        else
            return super._default_POA();
    }

    /**
     * Operation getStudentGrade
     */
    public double getStudentGrade(int StudentID, String SubjectName)
    {
        return _tie.getStudentGrade( StudentID,  SubjectName);
    }

    /**
     * Operation setStudentGrade
     */
    public void setStudentGrade(int StudentID, String SubjectName, double grade)
    {
        _tie.setStudentGrade( StudentID,  SubjectName,  grade);
    }

    /**
     * Operation getGrades
     */
    public GradeManagementModule.SubjectGrade[] getGrades(int studentID)
    {
        return _tie.getGrades( studentID);
    }

}
