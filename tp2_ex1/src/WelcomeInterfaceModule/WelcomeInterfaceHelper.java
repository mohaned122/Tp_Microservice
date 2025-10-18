package WelcomeInterfaceModule;

/** 
 * Helper class for : WelcomeInterface
 *  
 * @author OpenORB Compiler
 */ 
public class WelcomeInterfaceHelper
{
    /**
     * Insert WelcomeInterface into an any
     * @param a an any
     * @param t WelcomeInterface value
     */
    public static void insert(org.omg.CORBA.Any a, WelcomeInterfaceModule.WelcomeInterface t)
    {
        a.insert_Object(t , type());
    }

    /**
     * Extract WelcomeInterface from an any
     * @param a an any
     * @return the extracted WelcomeInterface value
     */
    public static WelcomeInterfaceModule.WelcomeInterface extract(org.omg.CORBA.Any a)
    {
        if (!a.type().equal(type()))
            throw new org.omg.CORBA.MARSHAL();
        try {
            return WelcomeInterfaceModule.WelcomeInterfaceHelper.narrow(a.extract_Object());
        } catch (final org.omg.CORBA.BAD_PARAM e) {
            throw new org.omg.CORBA.MARSHAL(e.getMessage());
        }
    }

    //
    // Internal TypeCode value
    //
    private static org.omg.CORBA.TypeCode _tc = null;

    /**
     * Return the WelcomeInterface TypeCode
     * @return a TypeCode
     */
    public static org.omg.CORBA.TypeCode type()
    {
        if (_tc == null) {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
            _tc = orb.create_interface_tc(id(),"WelcomeInterface");
        }
        return _tc;
    }

    /**
     * Return the WelcomeInterface IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:WelcomeInterfaceModule/WelcomeInterface:1.0";

    /**
     * Read WelcomeInterface from a marshalled stream
     * @param istream the input stream
     * @return the readed WelcomeInterface value
     */
    public static WelcomeInterfaceModule.WelcomeInterface read(org.omg.CORBA.portable.InputStream istream)
    {
        return(WelcomeInterfaceModule.WelcomeInterface)istream.read_Object(WelcomeInterfaceModule._WelcomeInterfaceStub.class);
    }

    /**
     * Write WelcomeInterface into a marshalled stream
     * @param ostream the output stream
     * @param value WelcomeInterface value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, WelcomeInterfaceModule.WelcomeInterface value)
    {
        ostream.write_Object((org.omg.CORBA.portable.ObjectImpl)value);
    }

    /**
     * Narrow CORBA::Object to WelcomeInterface
     * @param obj the CORBA Object
     * @return WelcomeInterface Object
     */
    public static WelcomeInterface narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof WelcomeInterface)
            return (WelcomeInterface)obj;

        if (obj._is_a(id()))
        {
            _WelcomeInterfaceStub stub = new _WelcomeInterfaceStub();
            stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
            return stub;
        }

        throw new org.omg.CORBA.BAD_PARAM();
    }

    /**
     * Unchecked Narrow CORBA::Object to WelcomeInterface
     * @param obj the CORBA Object
     * @return WelcomeInterface Object
     */
    public static WelcomeInterface unchecked_narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof WelcomeInterface)
            return (WelcomeInterface)obj;

        _WelcomeInterfaceStub stub = new _WelcomeInterfaceStub();
        stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
        return stub;

    }

}
