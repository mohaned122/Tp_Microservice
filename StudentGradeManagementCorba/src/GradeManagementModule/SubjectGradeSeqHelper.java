package GradeManagementModule;

/** 
 * Helper class for : SubjectGradeSeq
 *  
 * @author OpenORB Compiler
 */ 
public class SubjectGradeSeqHelper
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
     * Insert SubjectGradeSeq into an any
     * @param a an any
     * @param t SubjectGradeSeq value
     */
    public static void insert(org.omg.CORBA.Any a, GradeManagementModule.SubjectGrade[] t)
    {
        a.insert_Streamable(new GradeManagementModule.SubjectGradeSeqHolder(t));
    }

    /**
     * Extract SubjectGradeSeq from an any
     * @param a an any
     * @return the extracted SubjectGradeSeq value
     */
    public static GradeManagementModule.SubjectGrade[] extract(org.omg.CORBA.Any a)
    {
        if (!a.type().equal(type()))
            throw new org.omg.CORBA.MARSHAL();
        if(HAS_OPENORB && a instanceof org.openorb.CORBA.Any) {
            // streamable extraction. The jdk stubs incorrectly define the Any stub
            org.openorb.CORBA.Any any = (org.openorb.CORBA.Any)a;
            try {
                org.omg.CORBA.portable.Streamable s = any.extract_Streamable();
                if(s instanceof GradeManagementModule.SubjectGradeSeqHolder)
                    return ((GradeManagementModule.SubjectGradeSeqHolder)s).value;
            } catch (org.omg.CORBA.BAD_INV_ORDER ex) {
            }
            GradeManagementModule.SubjectGradeSeqHolder h = new GradeManagementModule.SubjectGradeSeqHolder(read(a.create_input_stream()));
            a.insert_Streamable(h);
            return h.value;
        }
        return read(a.create_input_stream());
    }

    //
    // Internal TypeCode value
    //
    private static org.omg.CORBA.TypeCode _tc = null;

    /**
     * Return the SubjectGradeSeq TypeCode
     * @return a TypeCode
     */
    public static org.omg.CORBA.TypeCode type()
    {
        if (_tc == null) {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
            _tc = orb.create_alias_tc(id(),"SubjectGradeSeq",orb.create_sequence_tc(0,GradeManagementModule.SubjectGradeHelper.type()));
        }
        return _tc;
    }

    /**
     * Return the SubjectGradeSeq IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:GradeManagementModule/SubjectGradeSeq:1.0";

    /**
     * Read SubjectGradeSeq from a marshalled stream
     * @param istream the input stream
     * @return the readed SubjectGradeSeq value
     */
    public static GradeManagementModule.SubjectGrade[] read(org.omg.CORBA.portable.InputStream istream)
    {
        GradeManagementModule.SubjectGrade[] new_one;
        {
        int size7 = istream.read_ulong();
        new_one = new GradeManagementModule.SubjectGrade[size7];
        for (int i7=0; i7<new_one.length; i7++)
         {
            new_one[i7] = GradeManagementModule.SubjectGradeHelper.read(istream);

         }
        }

        return new_one;
    }

    /**
     * Write SubjectGradeSeq into a marshalled stream
     * @param ostream the output stream
     * @param value SubjectGradeSeq value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, GradeManagementModule.SubjectGrade[] value)
    {
        ostream.write_ulong(value.length);
        for (int i7=0; i7<value.length; i7++)
        {
            GradeManagementModule.SubjectGradeHelper.write(ostream,value[i7]);

        }
    }

}
