public class Athlete extends Person{
    private String sport;

    public Athlete(String f, String l, String p, String s)
    {
        super(f, l ,p);
        sport = s;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String toString()
    {
        return super.toString() + " Sport: " + sport;
    }
}
