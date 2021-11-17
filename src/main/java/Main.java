import dto.*;
import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        String cityId = RequestHandler.getCityId("Saint-Petersburg");
        WeatherForecastRepository repository = new WeatherForecastRepository();

        WeatherResponse weatherResponse = RequestHandler.getForecasts(cityId);
        for(DailyForecast dailyForecast: weatherResponse.getDailyForecasts()) {
            System.out.printf(
                    "Weather in Saint-Petersburg: %s, %s, %.1f - %.1f %s \n",
                    dailyForecast.getDate(),
                    dailyForecast.getDay().getIconPhrase(),
                    dailyForecast.getTemperature().getMinimum().getValue(),
                    dailyForecast.getTemperature().getMaximum().getValue(),
                    dailyForecast.getTemperature().getMaximum().getUnit()
            );
            repository.save(
                    cityId, dailyForecast.getDate(), dailyForecast.getDay().getIconPhrase(),
                    dailyForecast.getTemperature().getMaximum().getValue()
            );
        }

        repository.read();
    }
}
