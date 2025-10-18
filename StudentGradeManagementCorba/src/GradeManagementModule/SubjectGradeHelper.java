package GradeManagementModule;

/** 
 * Helper class for : SubjectGrade
 *  
 * @author OpenORB Compiler
 */ 
public class SubjectGradeHelper
{
    private static final boolean HAS_OPENORB;
    static {
        boolean hasOpenORB = false;
        try {
            Thread.currentThread().getContextClassLoader().loadClass("org.openorb.CORBA.Any");
            hasOpenORB = true;
        }
        catch(ClassNotFoundException ex) {
        }
        HAS_OPENORB = hasOpenORB;
    }
    /**
     * Insert SubjectGrade into an any
     * @param a an any
     * @param t SubjectGrade value
     */
    public static void insert(org.omg.CORBA.Any a, GradeManagementModule.SubjectGrade t)
    {
        a.insert_Streamable(new GradeManagementModule.SubjectGradeHolder(t));
    }

    /**
     * Extract SubjectGrade from an any
     * @param a an any
     * @return the extracted SubjectGrade value
     */
    public static GradeManagementModule.SubjectGrade extract(org.omg.CORBA.Any a)
    {
        if (!a.type().equal(type()))
            throw new org.omg.CORBA.MARSHAL();
        if (HAS_OPENORB && a instanceof org.openorb.CORBA.Any) {
            // streamable extraction. The jdk stubs incorrectly define the Any stub
            org.openorb.CORBA.Any any = (org.openorb.CORBA.Any)a;
            try {
                org.omg.CORBA.portable.Streamable s = any.extract_Streamable();
                if(s instanceof GradeManagementModule.SubjectGradeHolder)
                    return ((GradeManagementModule.SubjectGradeHolder)s).value;
            } catch (org.omg.CORBA.BAD_INV_ORDER ex) {
            }
            GradeManagementModule.SubjectGradeHolder h = new GradeManagementModule.SubjectGradeHolder(read(a.create_input_stream()));
            a.insert_Streamable(h);
            return h.value;
        }
        return read(a.create_input_stream());
    }

    //
    // Internal TypeCode value
    //
    private static org.omg.CORBA.TypeCode _tc = null;
    private static boolean _working = false;

    /**
     * Return the SubjectGrade TypeCode
     * @return a TypeCode
     */
    public static org.omg.CORBA.TypeCode type()
    {
        if (_tc == null) {
            synchronized(org.omg.CORBA.TypeCode.class) {
                if (_tc != null)
                    return _tc;
                if (_working)
                    return org.omg.CORBA.ORB.init().create_recursive_tc(id());
                _working = true;
                org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
                org.omg.CORBA.StructMember []_members = new org.omg.CORBA.StructMember[2];

                _members[0] = new org.omg.CORBA.StructMember();
                _members[0].name = "subject";
                _members[0].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_string);
                _members[1] = new org.omg.CORBA.StructMember();
                _members[1].name = "grade";
                _members[1].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_double);
                _tc = orb.create_struct_tc(id(),"SubjectGrade",_members);
                _working = false;
            }
        }
        return _tc;
    }

    /**
     * Return the SubjectGrade IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:GradeManagementModule/SubjectGrade:1.0";

    /**
     * Read SubjectGrade from a marshalled stream
     * @param istream the input stream
     * @return the readed SubjectGrade value
     */
    public static GradeManagementModule.SubjectGrade read(org.omg.CORBA.portable.InputStream istream)
    {
        GradeManagementModule.SubjectGrade new_one = new GradeManagementModule.SubjectGrade();

        new_one.subject = istream.read_string();
        new_one.grade = istream.read_double();

        return new_one;
    }

    /**
     * Write SubjectGrade into a marshalled stream
     * @param ostream the output stream
     * @param value SubjectGrade value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, GradeManagementModule.SubjectGrade value)
    {
        ostream.write_string(value.subject);
        ostream.write_double(value.grade);
    }

}
