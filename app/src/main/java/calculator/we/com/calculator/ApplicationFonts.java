package calculator.we.com.calculator;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by Kotchaphan Muangsan on 19/8/2558.
 */
public class ApplicationFonts extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Roboto-Bold.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build());

    }
}
