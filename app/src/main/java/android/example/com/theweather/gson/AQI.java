package android.example.com.theweather.gson;

/**
 * Created by User on 2018/3/16.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
