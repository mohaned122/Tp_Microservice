package GradeManagementModule;

/**
 * Interface definition : GradeManagementInterface
 * 
 * @author OpenORB Compiler
 */
public class _GradeManagementInterfaceStub extends org.omg.CORBA.portable.ObjectImpl
        implements GradeManagementInterface
{
    static final String[] _ids_list =
    {
        "IDL:GradeManagementModule/GradeManagementInterface:1.0"
    };

    public String[] _ids()
    {
     return _ids_list;
    }

    private final static Class _opsClass = GradeManagementModule.GradeManagementInterfaceOperations.class;

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
                GradeManagementModule.GradeManagementInterfaceOperations _self = (GradeManagementModule.GradeManagementInterfaceOperations) _so.servant;
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

    /**
     * Operation setStudentGrade
     */
    public void setStudentGrade(int StudentID, String SubjectName, double grade)
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("setStudentGrade",true);
                    _output.write_long(StudentID);
                    _output.write_string(SubjectName);
                    _output.write_double(grade);
                    _input = this._invoke(_output);
                    return;
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("setStudentGrade",_opsClass);
                if (_so == null)
                   continue;
                GradeManagementModule.GradeManagementInterfaceOperations _self = (GradeManagementModule.GradeManagementInterfaceOperations) _so.servant;
                try
                {
                    _self.setStudentGrade( StudentID,  SubjectName,  grade);
                    return;
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

    /**
     * Operation getGrades
     */
    public GradeManagementModule.SubjectGrade[] getGrades(int studentID)
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("getGrades",true);
                    _output.write_long(studentID);
                    _input = this._invoke(_output);
                    GradeManagementModule.SubjectGrade[] _arg_ret = GradeManagementModule.SubjectGradeSeqHelper.read(_input);
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("getGrades",_opsClass);
                if (_so == null)
                   continue;
                GradeManagementModule.GradeManagementInterfaceOperations _self = (GradeManagementModule.GradeManagementInterfaceOperations) _so.servant;
                try
                {
                    return _self.getGrades( studentID);
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

}
