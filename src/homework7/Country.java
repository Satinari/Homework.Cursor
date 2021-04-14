package homework7;

public enum Country {
    UKRAINE("Ukraine", Continent.EUROPE),
    POLAND("Poland", Continent.EUROPE),
    FRANCE("France", Continent.EUROPE),
    CHINA("China", Continent.ASIA),
    INDIA("India", Continent.ASIA),
    ISRAEL("Israel", Continent.ASIA),
    EGYPT("Egypt", Continent.AFRICA),
    ALGERIA("Algeria", Continent.AFRICA),
    ANGOLA("Angola", Continent.AFRICA),
    USA("USA", Continent.NORTH_AMERICA),
    CANADA("Canada", Continent.NORTH_AMERICA),
    MEXICO("Mexico", Continent.NORTH_AMERICA),
    BRAZIL("Brazil", Continent.SOUTH_AMERICA),
    ARGENTINA("Argentina", Continent.SOUTH_AMERICA),
    BOLIVIA("Bolivia", Continent.SOUTH_AMERICA),
    AUSTRALIA("Australia", Continent.OCEANIA),
    FIJI("Fiji", Continent.OCEANIA),
    NEW_ZEALAND("New Zealand", Continent.OCEANIA);

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
