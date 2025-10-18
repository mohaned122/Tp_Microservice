package GradeServer;

import GradeInterfaceModule.GradeInterfaceHelper;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

public class GradeServer {
    public static void main(String[] args){
        try{
            org.omg.CORBA.ORB orb = org.omg. CORBA. ORB.init(args,  null) ;
            POA rootPOA = POAHelper.narrow(orb.resolve_initial_references(  "RootPOA"));
            rootPOA.the_POAManager().activate();
            GradeImpl obj = new GradeImpl();

            org.omg.CORBA.Object ref= rootPOA.servant_to_reference(/*reponce*/ obj);
            Object objRef= GradeInterfaceHelper.narrow(ref);

            org.omg. CORBA. Object refServ=orb.resolve_initial_references( "NameService");
            NamingContextExt namingContext= NamingContextExtHelper.narrow(refServ);
            System.out.println("Naming service trouvé!");

            String objName="WelcomeService";
            NameComponent path[] = namingContext.to_name (objName);
            namingContext.rebind(path,ref);
            System.out.println("WelcomeService est prêt et enregistré dans le Naming Service!");
            orb.run();


        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
