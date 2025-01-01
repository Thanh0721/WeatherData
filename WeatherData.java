import java.util.ArrayList;

public class WeatherData 
{
    private ArrayList<Double> temperatures;

    public WeatherData(ArrayList<Double> temperatures) 
    {
        this.temperatures = new ArrayList<>(temperatures);
    }

    public void cleanData(double lower, double upper) 
    {
        for (int i = 0; i < temperatures.size(); i++) 
        {
            double temp = temperatures.get(i);
            if (temp < lower || temp > upper) 
            {
                temperatures.remove(i);
                i--;
            }
        }
    }

    public int longestHeatWave(double threshold) 
    {
        int currentHeatWave = 0;
        int longestHeatWave = 0;

        for (double temp : temperatures) 
        {
            if (temp > threshold) 
            {
                currentHeatWave++;
                if (currentHeatWave > longestHeatWave) 
                {
                    longestHeatWave = currentHeatWave;
                }
            } 
            
            else 
            {
                currentHeatWave = 0;
            }
        }
        return longestHeatWave;
    }

    @Override
    public String toString() 
    {
        return "Temperatures: " + temperatures;
    }
}