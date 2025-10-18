package WelcomeClient;

import WelcomeInterfaceModule.WelcomeInterface;
import WelcomeInterfaceModule.WelcomeInterfaceHelper;

public class WelcomeClient {
    public static void main(String[] args) {
        try{
            org.omg. CORBA.ORB orb = org. omg. CORBA.ORB.init(args, null) ;

            org.omg. CORBA. Object distantWelcome = orb.string_to_object("IOR:000000000000003049444C3A57656C636F6D65496E746572666163654D6F64756C652F57656C636F6D65496E746572666163653A312E3000000000010000000000000058000102000000000E3139322E3136382E31302E373000C8BD00000014004F4F01D14C8DF699010000504F41FE9812515200000001000000010000001C00000000050100010000000100010020000101090000000100010100");
            WelcomeInterface welcome = WelcomeInterfaceHelper.narrow(distantWelcome);
            System.out.println("CORBA Client ready ... ");
            System.out.println("\nCORBA Result: "+welcome. echoWelcome( "Welcome to everyone ... "));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
