package GradeClient;

import GradeInterfaceModule.GradeInterface;
import GradeInterfaceModule.GradeInterfaceHelper;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

public class GradeClient {
    public static void main(String[] args) {
        try{
            org. omg. CORBA. ORB orb = org.omg. CORBA. ORB. init(args,  null) ;

            org.omg.CORBA.Object objRef =orb.resolve_initial_references( "NameService");
            NamingContextExt namingContext= NamingContextExtHelper.narrow(objRef);
            String objName="WelcomeService";

            GradeInterface welcome= GradeInterfaceHelper.narrow(namingContext.resolve_str(objName));

            System.out.println("CORBA Client is ready ... ");
            System.out.println("\n CORBA Result:"+welcome.getStudentGrade(15,"math"));

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
