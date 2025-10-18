package WelcomeServer;

import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;


public class WelcomeServer {
    public static void main(String[] args) {
        try {
            org.omg. CORBA.ORB orb = org.omg.CORBA.ORB.init(args,  null) ;

            POA rootPOA = POAHelper.narrow(orb.resolve_initial_references( "RootPOA"));
            rootPOA.the_POAManager().activate();

            WelcomeImpl server = new WelcomeImpl();

            String IORServant = orb.object_to_string(rootPOA.servant_to_reference(server));

            System.out.println("Object reference: \n"+ IORServant);
            System.out.println("\nCORBA Server ready and waiting ... ");
            orb.run();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
