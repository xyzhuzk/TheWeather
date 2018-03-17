package android.example.com.theweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by User on 2018/3/16.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }

}
