public class DietPlan {

    private Meal[] main_meals;
    private Meal[] sub_meals;

    public DietPlan() {
        System.out.println("Add Diet plan");
        addMain_meals();
        addSub_meals();
    }

    public Meal[] getMain_meals() {
        return main_meals;
    }

    public void addMain_meals() {

        System.out.println("Add main meals");
        main_meals = new Meal[3];
        Boolean show = true;
        int i = 0;
        while (show && i < 3) {
            System.out.println("Add Main meal #" + (i + 1));
            main_meals[i] = new Meal();
            i++;
        }
    }

    public void addSub_meals() {

        System.out.println("Add sub meals");
        sub_meals = new Meal[2];
        Boolean show = true;
        int i = 0;
        while (show && i < 2) {
            System.out.println("Add Main meal #" + (i + 1));
            sub_meals[i] = new Meal();
            i++;
        }
    }


    public Meal[] getSub_meals() {
        return sub_meals;
    }

}
