public class Meal implements Input {

    private String name;
    private PortionSize portionSize;
    private Time time;

    public Meal(){

        inputMeal();
    }

    public void inputMeal(){
        System.out.println("Enter meal name");
        String meal_name = scan.next();
        System.out.println("Enter portion size ? 1.small 2.medium 3.large");
        int choice= scan.nextInt();
        switch (choice){
            case 1:
                portionSize=PortionSize.SMALL;
                break;
            case 2:
                portionSize=PortionSize.MEDIUM;
                break;
            case 3:
                portionSize=PortionSize.LARGE;
                break;
            default:
                throw new IllegalArgumentException("Invalid input");
        }

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PortionSize getPortionSize() {
        return portionSize;
    }

    public void setPortionSize(PortionSize portionSize) {
        this.portionSize = portionSize;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
