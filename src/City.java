
public class City {
    private int Id;
    private String Name;
    private String countryCode;
    private String district;
    private int population;

    public City(int Id, String Name, String countryCode, String district, int population) {
        this.Id = Id;
        this.Name = Name;
        this.countryCode = countryCode;
        this.district = district;
        this.population = population;
    }
    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }


    
}
