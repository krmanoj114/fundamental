package consumerdemo;

public class Movie {
    String name;
    String hero;
    String heroiene;
    String result;

    public Movie(String name, String hero, String heroiene, String result) {
        this.name = name;
        this.hero = hero;
        this.heroiene = heroiene;
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHero() {
        return hero;
    }

    public void setHero(String hero) {
        this.hero = hero;
    }

    public String getHeroiene() {
        return heroiene;
    }

    public void setHeroiene(String heroiene) {
        this.heroiene = heroiene;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
