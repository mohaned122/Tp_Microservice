package GradeManagementModule;

/**
 * Holder class for : SubjectGrade
 * 
 * @author OpenORB Compiler
 */
final public class SubjectGradeHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal SubjectGrade value
     */
    public GradeManagementModule.SubjectGrade value;

    /**
     * Default constructor
     */
    public SubjectGradeHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public SubjectGradeHolder(GradeManagementModule.SubjectGrade initial)
    {
        value = initial;
    }

    /**
     * Read SubjectGrade from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = SubjectGradeHelper.read(istream);
    }

    /**
     * Write SubjectGrade into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        SubjectGradeHelper.write(ostream,value);
    }

    /**
     * Return the SubjectGrade TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return SubjectGradeHelper.type();
    }

}
