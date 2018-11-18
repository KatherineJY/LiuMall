package com.ghy.katherinejy.latte_core.app;

import android.content.Context;
import android.graphics.Bitmap;

import java.util.WeakHashMap;

public class Latte {
    public static Configurator init(Context context) {
        getConfigurations().put(ConfigType.APPLICATION_CONTEXT.name(), context.getApplicationContext());
        return Configurator.getInstance();
    }

    private static WeakHashMap<String,Object> getConfigurations() {
        return Configurator.getInstance().getLatteConfigs();
    }


}
