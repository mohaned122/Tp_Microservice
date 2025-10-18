package GradeManagementModule;

/**
 * Holder class for : SubjectGradeSeq
 * 
 * @author OpenORB Compiler
 */
final public class SubjectGradeSeqHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal SubjectGradeSeq value
     */
    public GradeManagementModule.SubjectGrade[] value;

    /**
     * Default constructor
     */
    public SubjectGradeSeqHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public SubjectGradeSeqHolder(GradeManagementModule.SubjectGrade[] initial)
    {
        value = initial;
    }

    /**
     * Read SubjectGradeSeq from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = SubjectGradeSeqHelper.read(istream);
    }

    /**
     * Write SubjectGradeSeq into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        SubjectGradeSeqHelper.write(ostream,value);
    }

    /**
     * Return the SubjectGradeSeq TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return SubjectGradeSeqHelper.type();
    }

}
