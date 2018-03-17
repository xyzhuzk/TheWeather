package android.example.com.theweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by User on 2018/3/16.
 */

public class Weather {
    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastsList;
}
