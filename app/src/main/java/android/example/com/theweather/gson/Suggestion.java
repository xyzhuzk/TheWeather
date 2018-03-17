package android.example.com.theweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by User on 2018/3/16.
 */

public class Suggestion {
    @SerializedName("comg")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

    public class CarWash{
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
