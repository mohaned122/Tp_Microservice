package GradeInterfaceModule;

/**
 * Interface definition : GradeInterface
 * 
 * @author OpenORB Compiler
 */
public class GradeInterfacePOATie extends GradeInterfacePOA
{

    //
    // Private reference to implementation object
    //
    private GradeInterfaceOperations _tie;

    //
    // Private reference to POA
    //
    private org.omg.PortableServer.POA _poa;

    /**
     * Constructor
     */
    public GradeInterfacePOATie(GradeInterfaceOperations tieObject)
    {
        _tie = tieObject;
    }

    /**
     * Constructor
     */
    public GradeInterfacePOATie(GradeInterfaceOperations tieObject, org.omg.PortableServer.POA poa)
    {
        _tie = tieObject;
        _poa = poa;
    }

    /**
     * Get the delegate
     */
    public GradeInterfaceOperations _delegate()
    {
        return _tie;
    }

    /**
     * Set the delegate
     */
    public void _delegate(GradeInterfaceOperations delegate_)
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

}
