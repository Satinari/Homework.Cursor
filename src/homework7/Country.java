package homework7;
import static homework7.Continent.*;

public enum Country {
    UKRAINE("Ukraine", EUROPE),
    POLAND("Poland", EUROPE),
    FRANCE("France", EUROPE),
    CHINA("China", ASIA),
    INDIA("India", ASIA),
    ISRAEL("Israel", ASIA),
    EGYPT("Egypt", AFRICA),
    ALGERIA("Algeria", AFRICA),
    ANGOLA("Angola", AFRICA),
    USA("USA", NORTH_AMERICA),
    CANADA("Canada", NORTH_AMERICA),
    MEXICO("Mexico", NORTH_AMERICA),
    BRAZIL("Brazil", SOUTH_AMERICA),
    ARGENTINA("Argentina", SOUTH_AMERICA),
    BOLIVIA("Bolivia", SOUTH_AMERICA),
    AUSTRALIA("Australia", OCEANIA),
    FIJI("Fiji", OCEANIA),
    NEW_ZEALAND("New Zealand", OCEANIA);

    private final String countryName;
    private final Continent continent;

    Country(String countryName, Continent continent) {
        this.countryName = countryName;
        this.continent = continent;
    }

    public String getCountryName() {
        return countryName;
    }

    public Continent getContinent() {
        return continent;
    }
}
