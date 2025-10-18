package GradeManagementModule;

/**
 * Holder class for : GradeManagementInterface
 * 
 * @author OpenORB Compiler
 */
final public class GradeManagementInterfaceHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal GradeManagementInterface value
     */
    public GradeManagementModule.GradeManagementInterface value;

    /**
     * Default constructor
     */
    public GradeManagementInterfaceHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public GradeManagementInterfaceHolder(GradeManagementModule.GradeManagementInterface initial)
    {
        value = initial;
    }

    /**
     * Read GradeManagementInterface from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = GradeManagementInterfaceHelper.read(istream);
    }

    /**
     * Write GradeManagementInterface into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        GradeManagementInterfaceHelper.write(ostream,value);
    }

    /**
     * Return the GradeManagementInterface TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return GradeManagementInterfaceHelper.type();
    }

}
