public class Schedule implements Input {

    private int maxSize =5;
    private String scheduleName;
    private Exercise [] exersices;
    public Schedule(){
        setScheduleName();
        addExersice();
      }

    public String getScheduleName() {
        return scheduleName;
    }

    public void setScheduleName() {
        System.out.println("Set Schedule Name");
        String scheduleName=scan.next();
        this.scheduleName = scheduleName;
    }

    public void addExersice () {
        System.out.println("Add Exercises");
        exersices = new Exercise[5];
        Boolean show = true;
        int i = 0;
        while (show && i<maxSize) {

            System.out.println("Enter exercise name");
            String ex_name = scan.next();
            System.out.println("Enter intensity");
            String ex_intes = scan.next();
            System.out.println("Enter Reps");
            int ex_reps = scan.nextInt();
            System.out.println("Enter number of cycles of reps");
            int ex_sets = scan.nextInt();
            System.out.println("Do you want add another ? 1.yes 2. no");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    i++;
                    break;
                case 2:
                    exersices[i]=new Exercise(ex_intes,ex_reps,ex_sets);
                    show = false;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid Input");

            }}

    }

}



