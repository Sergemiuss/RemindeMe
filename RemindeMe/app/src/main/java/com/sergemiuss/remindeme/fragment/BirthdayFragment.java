package com.sergemiuss.remindeme.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sergemiuss.remindeme.R;

public class BirthdayFragment extends AbstractTabFragment {

    private static int LAYOUT = R.layout.fragment_example;

    public void setContext(Context context) {
        this.context = context;
    }

    public static BirthdayFragment getInstance(Context context) {
        Bundle args = new Bundle();
        BirthdayFragment fragment = new BirthdayFragment();
        fragment.setArguments(args);

        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_birthdays));

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(LAYOUT, container, false);

        return view;
    }
}
