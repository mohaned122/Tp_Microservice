package WelcomeInterfaceModule;

/**
 * Holder class for : WelcomeInterface
 * 
 * @author OpenORB Compiler
 */
final public class WelcomeInterfaceHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal WelcomeInterface value
     */
    public WelcomeInterfaceModule.WelcomeInterface value;

    /**
     * Default constructor
     */
    public WelcomeInterfaceHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public WelcomeInterfaceHolder(WelcomeInterfaceModule.WelcomeInterface initial)
    {
        value = initial;
    }

    /**
     * Read WelcomeInterface from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = WelcomeInterfaceHelper.read(istream);
    }

    /**
     * Write WelcomeInterface into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        WelcomeInterfaceHelper.write(ostream,value);
    }

    /**
     * Return the WelcomeInterface TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return WelcomeInterfaceHelper.type();
    }

}
