import java.util.Objects;

public class WorldCup {
    private String year;
    private String city;

    public WorldCup() {
    }

    public WorldCup(String year, String city) {
        this.year = year;
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorldCup worldCup = (WorldCup) o;
        return Objects.equals(year, worldCup.year) &&
                Objects.equals(city, worldCup.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, city);
    }

    @Override
    public String toString() {
        return "WorldCup{" +
                "年份：'" + year + '\'' +
                ", 城市：'" + city + '\'' +
                '}';
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
