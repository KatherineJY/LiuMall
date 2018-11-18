package com.ghy.katherinejy.latte_core.delegates;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.yokeyword.fragmentation_swipeback.SwipeBackFragment;

public abstract class BaseDelegate extends SwipeBackFragment{

    private Unbinder mUnbinder = null;

    public abstract Object setlayout();

    @Nullable
    @Override
    public View onCreatView(LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable Bundle savedInstanceState) {
        View rootView = null;
        if (setlayout() instanceof Integer) {
            rootView = inflater.inflate((Integer) setlayout(), parent, false);
        } else if (setlayout() instanceof View) {
            rootView = (View) setlayout();
        }
        if(rootView!=null) {
            mUnbinder = ButterKnife.bind(this, rootView);
        }
        return super.onCreateView(inflater,parent,savedInstanceState);
    }
}
