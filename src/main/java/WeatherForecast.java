public class WeatherForecast {
    private String city;
    private String localDate;
    private String weatherText;
    private Double temperature;

    public WeatherForecast(String city, String localDate, String weatherText, Double temperature) {
        this.city = city;
        this.localDate = localDate;
        this.weatherText = weatherText;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "weatherTextForecast{" +
                "city='" + city + "'" +
                ", localDate='" + localDate + "' " +
                ", weatherText='" + weatherText + "' " +
                ", temperature=" + temperature +
                "}";
    }
}
