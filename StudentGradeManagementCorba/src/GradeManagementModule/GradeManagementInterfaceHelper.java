package GradeManagementModule;

/** 
 * Helper class for : GradeManagementInterface
 *  
 * @author OpenORB Compiler
 */ 
public class GradeManagementInterfaceHelper
{
    /**
     * Insert GradeManagementInterface into an any
     * @param a an any
     * @param t GradeManagementInterface value
     */
    public static void insert(org.omg.CORBA.Any a, GradeManagementModule.GradeManagementInterface t)
    {
        a.insert_Object(t , type());
    }

    /**
     * Extract GradeManagementInterface from an any
     * @param a an any
     * @return the extracted GradeManagementInterface value
     */
    public static GradeManagementModule.GradeManagementInterface extract(org.omg.CORBA.Any a)
    {
        if (!a.type().equal(type()))
            throw new org.omg.CORBA.MARSHAL();
        try {
            return GradeManagementModule.GradeManagementInterfaceHelper.narrow(a.extract_Object());
        } catch (final org.omg.CORBA.BAD_PARAM e) {
            throw new org.omg.CORBA.MARSHAL(e.getMessage());
        }
    }

    //
    // Internal TypeCode value
    //
    private static org.omg.CORBA.TypeCode _tc = null;

    /**
     * Return the GradeManagementInterface TypeCode
     * @return a TypeCode
     */
    public static org.omg.CORBA.TypeCode type()
    {
        if (_tc == null) {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
            _tc = orb.create_interface_tc(id(),"GradeManagementInterface");
        }
        return _tc;
    }

    /**
     * Return the GradeManagementInterface IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:GradeManagementModule/GradeManagementInterface:1.0";

    /**
     * Read GradeManagementInterface from a marshalled stream
     * @param istream the input stream
     * @return the readed GradeManagementInterface value
     */
    public static GradeManagementModule.GradeManagementInterface read(org.omg.CORBA.portable.InputStream istream)
    {
        return(GradeManagementModule.GradeManagementInterface)istream.read_Object(GradeManagementModule._GradeManagementInterfaceStub.class);
    }

    /**
     * Write GradeManagementInterface into a marshalled stream
     * @param ostream the output stream
     * @param value GradeManagementInterface value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, GradeManagementModule.GradeManagementInterface value)
    {
        ostream.write_Object((org.omg.CORBA.portable.ObjectImpl)value);
    }

    /**
     * Narrow CORBA::Object to GradeManagementInterface
     * @param obj the CORBA Object
     * @return GradeManagementInterface Object
     */
    public static GradeManagementInterface narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof GradeManagementInterface)
            return (GradeManagementInterface)obj;

        if (obj._is_a(id()))
        {
            _GradeManagementInterfaceStub stub = new _GradeManagementInterfaceStub();
            stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
            return stub;
        }

        throw new org.omg.CORBA.BAD_PARAM();
    }

    /**
     * Unchecked Narrow CORBA::Object to GradeManagementInterface
     * @param obj the CORBA Object
     * @return GradeManagementInterface Object
     */
    public static GradeManagementInterface unchecked_narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof GradeManagementInterface)
            return (GradeManagementInterface)obj;

        _GradeManagementInterfaceStub stub = new _GradeManagementInterfaceStub();
        stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
        return stub;

    }

}
