package GradeInterfaceModule;

/** 
 * Helper class for : GradeInterface
 *  
 * @author OpenORB Compiler
 */ 
public class GradeInterfaceHelper
{
    /**
     * Insert GradeInterface into an any
     * @param a an any
     * @param t GradeInterface value
     */
    public static void insert(org.omg.CORBA.Any a, GradeInterfaceModule.GradeInterface t)
    {
        a.insert_Object(t , type());
    }

    /**
     * Extract GradeInterface from an any
     * @param a an any
     * @return the extracted GradeInterface value
     */
    public static GradeInterfaceModule.GradeInterface extract(org.omg.CORBA.Any a)
    {
        if (!a.type().equal(type()))
            throw new org.omg.CORBA.MARSHAL();
        try {
            return GradeInterfaceModule.GradeInterfaceHelper.narrow(a.extract_Object());
        } catch (final org.omg.CORBA.BAD_PARAM e) {
            throw new org.omg.CORBA.MARSHAL(e.getMessage());
        }
    }

    //
    // Internal TypeCode value
    //
    private static org.omg.CORBA.TypeCode _tc = null;

    /**
     * Return the GradeInterface TypeCode
     * @return a TypeCode
     */
    public static org.omg.CORBA.TypeCode type()
    {
        if (_tc == null) {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
            _tc = orb.create_interface_tc(id(),"GradeInterface");
        }
        return _tc;
    }

    /**
     * Return the GradeInterface IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:GradeInterfaceModule/GradeInterface:1.0";

    /**
     * Read GradeInterface from a marshalled stream
     * @param istream the input stream
     * @return the readed GradeInterface value
     */
    public static GradeInterfaceModule.GradeInterface read(org.omg.CORBA.portable.InputStream istream)
    {
        return(GradeInterfaceModule.GradeInterface)istream.read_Object(GradeInterfaceModule._GradeInterfaceStub.class);
    }

    /**
     * Write GradeInterface into a marshalled stream
     * @param ostream the output stream
     * @param value GradeInterface value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, GradeInterfaceModule.GradeInterface value)
    {
        ostream.write_Object((org.omg.CORBA.portable.ObjectImpl)value);
    }

    /**
     * Narrow CORBA::Object to GradeInterface
     * @param obj the CORBA Object
     * @return GradeInterface Object
     */
    public static GradeInterface narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof GradeInterface)
            return (GradeInterface)obj;

        if (obj._is_a(id()))
        {
            _GradeInterfaceStub stub = new _GradeInterfaceStub();
            stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
            return stub;
        }

        throw new org.omg.CORBA.BAD_PARAM();
    }

    /**
     * Unchecked Narrow CORBA::Object to GradeInterface
     * @param obj the CORBA Object
     * @return GradeInterface Object
     */
    public static GradeInterface unchecked_narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof GradeInterface)
            return (GradeInterface)obj;

        _GradeInterfaceStub stub = new _GradeInterfaceStub();
        stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
        return stub;

    }

}
