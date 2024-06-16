public class Exercise {
    private String intensity;
    private int reps;
    private int sets;

    public Exercise(String intensity,int reps,int sets){


        setIntensity(intensity);
        setReps(reps);
        setSets(sets);
    }



    public String getIntensity() {
        return intensity;
    }

    public void setIntensity(String intensity) {
        this.intensity = intensity;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }
}
