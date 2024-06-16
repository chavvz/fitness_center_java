import java.util.Scanner;

public abstract class Member implements Input {

    private String name;
    private String dob;
    private Gender gender;
    private double height;
    private double weight;
    private double fatPercentage;
    private double BMI;
    private MemberType type;
    private Boolean isPaid;
    private DietPlan dietPlan;
    private Schedule schedule;


    public Member(MemberType type){
        this.type=type;
    }

    public void calBMI(){
        this.BMI = weight/(height*height);
    }

    public DietPlan getDietPlan() {
        return dietPlan;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", gender=" + gender +
                ", height=" + height +
                ", weight=" + weight +
                ", BMI=" + BMI +
                '}';
    }

    public void setDietPlan() {
        this.dietPlan = new DietPlan();
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule() {
        this.schedule = new Schedule();
    }

    public static Member getRegisterInput(){
        Member newMember;
        System.out.println("Type of Membership ? 1.Ordinary 2.Platinum");
        int choice_1=scan.nextInt();
        switch (choice_1){
            case 1:
                newMember = new Ordinary();
                break;
            case 2:
                newMember = new Premium();
                break;
            default:
                throw new IllegalArgumentException("Invalid option has given");
        }
        System.out.println("Enter Member Name ?");
        String name =scan.next();
        System.out.println("Enter Member Date of Birth (dd-mm-yyyy) ?");
        String dob=scan.next();
        System.out.println("Gender ? 1. Male 2.Female");
        int choice = scan.nextInt();
        switch (choice){
         case 1:
             newMember.setGender(Gender.MALE);
             break;
         case 2:
             newMember.setGender(Gender.FEMALE);
             break;
         default:
             throw new IllegalArgumentException("Invalid option has given");
         }
         System.out.println("Enter Height(m) ?");
         double height = scan.nextDouble();
         System.out.println("Enter Weight(kg) ?");
         double weight = scan.nextDouble();

         if(height>0 && weight>0){
             newMember.setHeight(height);
             newMember.setWeight(weight);
             newMember.setName(name);
             newMember.setDob(dob);
             newMember.calBMI();

         }
         else {
             throw new IllegalArgumentException("Invalid Inputs. Height and Weight must be greater than zero");
         }


         return newMember;
    }

    public Boolean getPaid() {
        return isPaid;
    }

    public void setPaid(Boolean paid) {
        isPaid = paid;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public double getBMI() {
        return BMI;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getFatPercentage() {
        return fatPercentage;
    }

    public void setFatPercentage(Double fatPercentage) {
        this.fatPercentage = fatPercentage;
    }



}
