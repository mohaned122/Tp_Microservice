package GradeInterfaceModule;

/**
 * Holder class for : GradeInterface
 * 
 * @author OpenORB Compiler
 */
final public class GradeInterfaceHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal GradeInterface value
     */
    public GradeInterfaceModule.GradeInterface value;

    /**
     * Default constructor
     */
    public GradeInterfaceHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public GradeInterfaceHolder(GradeInterfaceModule.GradeInterface initial)
    {
        value = initial;
    }

    /**
     * Read GradeInterface from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = GradeInterfaceHelper.read(istream);
    }

    /**
     * Write GradeInterface into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        GradeInterfaceHelper.write(ostream,value);
    }

    /**
     * Return the GradeInterface TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return GradeInterfaceHelper.type();
    }

}
