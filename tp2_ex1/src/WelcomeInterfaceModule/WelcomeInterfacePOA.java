package WelcomeInterfaceModule;

/**
 * Interface definition : WelcomeInterface
 * 
 * @author OpenORB Compiler
 */
public abstract class WelcomeInterfacePOA extends org.omg.PortableServer.Servant
        implements WelcomeInterfaceOperations, org.omg.CORBA.portable.InvokeHandler
{
    public WelcomeInterface _this()
    {
        return WelcomeInterfaceHelper.narrow(_this_object());
    }

    public WelcomeInterface _this(org.omg.CORBA.ORB orb)
    {
        return WelcomeInterfaceHelper.narrow(_this_object(orb));
    }

    private static String [] _ids_list =
    {
        "IDL:WelcomeInterfaceModule/WelcomeInterface:1.0"
    };

    public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte [] objectId)
    {
        return _ids_list;
    }

    public final org.omg.CORBA.portable.OutputStream _invoke(final String opName,
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler)
    {

        if (opName.equals("echoWelcome")) {
                return _invoke_echoWelcome(_is, handler);
        } else {
            throw new org.omg.CORBA.BAD_OPERATION(opName);
        }
    }

    // helper methods
    private org.omg.CORBA.portable.OutputStream _invoke_echoWelcome(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        String arg0_in = _is.read_string();

        String _arg_result = echoWelcome(arg0_in);

        _output = handler.createReply();
        _output.write_string(_arg_result);

        return _output;
    }

}
