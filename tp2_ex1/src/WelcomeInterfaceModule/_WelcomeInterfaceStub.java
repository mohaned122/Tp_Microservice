package WelcomeInterfaceModule;

/**
 * Interface definition : WelcomeInterface
 * 
 * @author OpenORB Compiler
 */
public class _WelcomeInterfaceStub extends org.omg.CORBA.portable.ObjectImpl
        implements WelcomeInterface
{
    static final String[] _ids_list =
    {
        "IDL:WelcomeInterfaceModule/WelcomeInterface:1.0"
    };

    public String[] _ids()
    {
     return _ids_list;
    }

    private final static Class _opsClass = WelcomeInterfaceModule.WelcomeInterfaceOperations.class;

    /**
     * Operation echoWelcome
     */
    public String echoWelcome(String word)
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("echoWelcome",true);
                    _output.write_string(word);
                    _input = this._invoke(_output);
                    String _arg_ret = _input.read_string();
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("echoWelcome",_opsClass);
                if (_so == null)
                   continue;
                WelcomeInterfaceModule.WelcomeInterfaceOperations _self = (WelcomeInterfaceModule.WelcomeInterfaceOperations) _so.servant;
                try
                {
                    return _self.echoWelcome( word);
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

}
