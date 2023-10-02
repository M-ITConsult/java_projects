package POO_wow;

public class Races {

    String name;
    String raceClass;
    String raceName;
    int level;

    public Races(String name, String raceName, String raceClass, int level) {
        this.name = name;
        this.raceClass = raceClass;
        this.level = level;
        this.raceName = raceName;
    }


    public String getRaceName() {
        return raceName;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRaceClass() {
        return raceClass;
    }

    public void setRaceClass(String raceClass) {
        this.raceClass = raceClass;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
