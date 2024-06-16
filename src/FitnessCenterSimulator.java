import java.util.ArrayList;

public class FitnessCenterSimulator implements Input {
    static ArrayList<Member> memberList;
    public static void main(String[] args) {

        memberList = new ArrayList<Member>();
        menuAction();

    }
    public static int displayMainMenu(){
        System.out.println("1.Register a new member\n" +
                "2.Search for a member\n" +
                "3.Edit member details\n" +
                "4.Unregister a member\n" +
                "5.Add schedule (gym routine) Plan\n" +
                "6.Add a diet plan\n" +
                "7.Update payments\n" +
                "8.Exit");
        int choice = scan.nextInt();
        return choice;
    }

    public static void menuAction(){
        int choice = displayMainMenu();
        switch (choice){
            case 1:
                addMember();
                break;
            case 2:
                getMemberDetailsSearchByName();
                break;
            case 3:
                break;
            case 4:
                removeMember();
                break;
            case 5:


        }
    }
    public static void addMember(){
        Member m = Member.getRegisterInput();
        memberList.add(m);
        System.out.println(m);
        System.out.println("Do you want add another member 1.yes 2.no");
        int choice = scan.nextInt();
        switch (choice){
            case 1:
                addMember();
                break;
            case 2:
                menuAction();
                return;
            default:
                throw new IllegalArgumentException("Invalid input");
        }

    }
    public  static void getMemberDetailsSearchByName(){
        Member m = searchByName();
        if(m!=null){
            System.out.println(m);
        }
        else {
            System.out.println("Member couldn't found");
        }
        menuAction();
    }

    public static Member searchByName(){
        Member found_member=null;
        System.out.println("Enter member's name for search");
        String name = scan.next();
        for(Member member :memberList){
            if(member.getName().matches(name)){
                found_member=member;
                break;
            }
        }
       return found_member;
    }
    public static void addSchedule(){
        Member m = searchByName();
        if(m!=null){
            m.setSchedule();
            System.out.println("Schedule added Successfully");

        }
        else {
            System.out.println("Member couldn't found");
        }
        menuAction();
    }
    public static void addDietPlan(){
        Member m = searchByName();
        if(m!=null){
            m.setDietPlan();
            System.out.println("Diet Plan added Successfully");

        }
        else {
            System.out.println("Member couldn't found");
        }
        menuAction();
    }
    public static void removeMember(){
        System.out.println("Delete Member using search by name");
        Member m =  searchByName();
        if(m!=null){
           memberList.remove(m);
            System.out.println("Member removed successfully");
        }
       else {
           System.out.println("Member couldn't delete");
       }
       menuAction();
    }

}
