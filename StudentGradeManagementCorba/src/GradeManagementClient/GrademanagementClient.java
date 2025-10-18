package GradeManagementClient;

import GradeManagementModule.GradeManagementInterface;
import GradeManagementModule.GradeManagementInterfaceHelper;
import GradeManagementModule.SubjectGrade;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

import java.util.Scanner;

public class GrademanagementClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            org. omg. CORBA. ORB orb = org.omg. CORBA. ORB. init(args,  null) ;

            org.omg.CORBA.Object objRef =orb.resolve_initial_references( "NameService");
            NamingContextExt namingContext= NamingContextExtHelper.narrow(objRef);
            String objName="GradeManagementService";

            GradeManagementInterface GClient= GradeManagementInterfaceHelper.narrow(namingContext.resolve_str(objName));

            System.out.println("CORBA Client is ready ... ");
            int choice = 0;

            while(choice != 4){
                System.out.println("hello ,choose your operation please:" +
                        "\n1/save grade subject" +
                        "\n 2/ get grade subject" +
                        "\n 3/ get all grade" +
                        "\n 4/ bye bye");
                choice = sc.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("Enter subject name and grade : ");
                        GClient.setStudentGrade(1, sc.next(), sc.nextInt());
                        break;
                    case 2:
                        System.out.println("Enter subject name: ");
                        double g = GClient.getStudentGrade(1, sc.next());
                        System.out.println("your grade in this subject is "+g);
                        break;
                    case 3:
                        System.out.println("wait ... ");
                        SubjectGrade[] grades = GClient.getGrades(1);
                        for(int i=0;i<grades.length;i++){
                            System.out.println("your grade in this subject "+grades[i].subject+" is "+grades[i].grade);
                        }
                        break;
                }
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
