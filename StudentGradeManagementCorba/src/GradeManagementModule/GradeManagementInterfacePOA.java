package GradeManagementModule;

/**
 * Interface definition : GradeManagementInterface
 * 
 * @author OpenORB Compiler
 */
public abstract class GradeManagementInterfacePOA extends org.omg.PortableServer.Servant
        implements GradeManagementInterfaceOperations, org.omg.CORBA.portable.InvokeHandler
{
    public GradeManagementInterface _this()
    {
        return GradeManagementInterfaceHelper.narrow(_this_object());
    }

    public GradeManagementInterface _this(org.omg.CORBA.ORB orb)
    {
        return GradeManagementInterfaceHelper.narrow(_this_object(orb));
    }

    private static String [] _ids_list =
    {
        "IDL:GradeManagementModule/GradeManagementInterface:1.0"
    };

    public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte [] objectId)
    {
        return _ids_list;
    }

    public final org.omg.CORBA.portable.OutputStream _invoke(final String opName,
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler)
    {

        if (opName.equals("getGrades")) {
                return _invoke_getGrades(_is, handler);
        } else if (opName.equals("getStudentGrade")) {
                return _invoke_getStudentGrade(_is, handler);
        } else if (opName.equals("setStudentGrade")) {
                return _invoke_setStudentGrade(_is, handler);
        } else {
            throw new org.omg.CORBA.BAD_OPERATION(opName);
        }
    }

    // helper methods
    private org.omg.CORBA.portable.OutputStream _invoke_getStudentGrade(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        int arg0_in = _is.read_long();
        String arg1_in = _is.read_string();

        double _arg_result = getStudentGrade(arg0_in, arg1_in);

        _output = handler.createReply();
        _output.write_double(_arg_result);

        return _output;
    }

    private org.omg.CORBA.portable.OutputStream _invoke_setStudentGrade(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        int arg0_in = _is.read_long();
        String arg1_in = _is.read_string();
        double arg2_in = _is.read_double();

        setStudentGrade(arg0_in, arg1_in, arg2_in);

        _output = handler.createReply();

        return _output;
    }

    private org.omg.CORBA.portable.OutputStream _invoke_getGrades(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        int arg0_in = _is.read_long();

        GradeManagementModule.SubjectGrade[] _arg_result = getGrades(arg0_in);

        _output = handler.createReply();
        GradeManagementModule.SubjectGradeSeqHelper.write(_output,_arg_result);

        return _output;
    }

}
