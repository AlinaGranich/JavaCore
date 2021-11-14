import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String cityId = RequestHandler.getCityId("Saint-Petersburg");
        System.out.println(RequestHandler.getForecast(cityId));
    }
}
