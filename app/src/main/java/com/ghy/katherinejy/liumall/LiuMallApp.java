package com.ghy.katherinejy.liumall;

import android.app.Application;

import com.ghy.katherinejy.latte.ec.FontEcModule;
import com.ghy.katherinejy.latte_core.app.Latte;
import com.joanzapata.iconify.fonts.FontAwesomeModule;

public class LiuMallApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withApiHost("http://127.0.0.1/")
                .withIcon(new FontAwesomeModule())
                .withIcon(new FontEcModule())
                .configure();
    }
}
