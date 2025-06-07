package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes.dex */
class g extends BaseAdapter {

    /* renamed from: p, reason: collision with root package name */
    private static final int f20916p;

    /* renamed from: m, reason: collision with root package name */
    private final Calendar f20917m;

    /* renamed from: n, reason: collision with root package name */
    private final int f20918n;

    /* renamed from: o, reason: collision with root package name */
    private final int f20919o;

    static {
        f20916p = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public g() {
        Calendar calendarK = s.k();
        this.f20917m = calendarK;
        this.f20918n = calendarK.getMaximum(7);
        this.f20919o = calendarK.getFirstDayOfWeek();
    }

    private int b(int i10) {
        int i11 = i10 + this.f20919o;
        int i12 = this.f20918n;
        return i11 > i12 ? i11 - i12 : i11;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i10) {
        if (i10 >= this.f20918n) {
            return null;
        }
        return Integer.valueOf(b(i10));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f20918n;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(c5.h.f4777l, viewGroup, false);
        }
        this.f20917m.set(7, b(i10));
        textView.setText(this.f20917m.getDisplayName(7, f20916p, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(c5.i.f4793j), this.f20917m.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
