package GradeInterfaceModule;

/**
 * Interface definition : GradeInterface
 * 
 * @author OpenORB Compiler
 */
public class _GradeInterfaceStub extends org.omg.CORBA.portable.ObjectImpl
        implements GradeInterface
{
    static final String[] _ids_list =
    {
        "IDL:GradeInterfaceModule/GradeInterface:1.0"
    };

    public String[] _ids()
    {
     return _ids_list;
    }

    private final static Class _opsClass = GradeInterfaceModule.GradeInterfaceOperations.class;

    /**
     * Operation getStudentGrade
     */
    public double getStudentGrade(int StudentID, String SubjectName)
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("getStudentGrade",true);
                    _output.write_long(StudentID);
                    _output.write_string(SubjectName);
                    _input = this._invoke(_output);
                    double _arg_ret = _input.read_double();
                    return _arg_ret;
                }
                catch(org.omg.CORBA.portable.RemarshalException _exception)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _exception)
                {
                    String _exception_id = _exception.getId();
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: "+ _exception_id);
                }
                finally
                {
                    this._releaseReply(_input);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("getStudentGrade",_opsClass);
                if (_so == null)
                   continue;
                GradeInterfaceModule.GradeInterfaceOperations _self = (GradeInterfaceModule.GradeInterfaceOperations) _so.servant;
                try
                {
                    return _self.getStudentGrade( StudentID,  SubjectName);
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

}
