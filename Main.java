import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args) 
    {
        ArrayList<Double> tempData = new ArrayList<>();
        tempData.add(85.0);
        tempData.add(90.0);
        tempData.add(121.0);
        tempData.add(84.0);
        tempData.add(110.0);
        tempData.add(95.0);

        WeatherData weatherData = new WeatherData(tempData);

        System.out.println("Before cleaning: " + weatherData);
        weatherData.cleanData(85.0, 120.0);
        System.out.println("After cleaning: " + weatherData);

        int heatWaveLength = weatherData.longestHeatWave(95.0);
        System.out.println("Longest Heat Wave Length: " + heatWaveLength);
    }
}