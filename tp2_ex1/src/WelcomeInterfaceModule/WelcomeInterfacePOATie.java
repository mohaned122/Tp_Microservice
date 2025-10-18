package WelcomeInterfaceModule;

/**
 * Interface definition : WelcomeInterface
 * 
 * @author OpenORB Compiler
 */
public class WelcomeInterfacePOATie extends WelcomeInterfacePOA
{

    //
    // Private reference to implementation object
    //
    private WelcomeInterfaceOperations _tie;

    //
    // Private reference to POA
    //
    private org.omg.PortableServer.POA _poa;

    /**
     * Constructor
     */
    public WelcomeInterfacePOATie(WelcomeInterfaceOperations tieObject)
    {
        _tie = tieObject;
    }

    /**
     * Constructor
     */
    public WelcomeInterfacePOATie(WelcomeInterfaceOperations tieObject, org.omg.PortableServer.POA poa)
    {
        _tie = tieObject;
        _poa = poa;
    }

    /**
     * Get the delegate
     */
    public WelcomeInterfaceOperations _delegate()
    {
        return _tie;
    }

    /**
     * Set the delegate
     */
    public void _delegate(WelcomeInterfaceOperations delegate_)
    {
        _tie = delegate_;
    }

    /**
     * _default_POA method
     */
    public org.omg.PortableServer.POA _default_POA()
    {
        if (_poa != null)
            return _poa;
        else
            return super._default_POA();
    }

    /**
     * Operation echoWelcome
     */
    public String echoWelcome(String word)
    {
        return _tie.echoWelcome( word);
    }

}
