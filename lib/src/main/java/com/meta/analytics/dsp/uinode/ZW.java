package com.meta.analytics.dsp.uinode;

import android.view.View;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public class ZW implements MC {
    public static String[] A01 = {"JdxG2e87fiw1QxhKtyp6wy4hCZ34K54h", "5l6PiVFmWkFi4LSRmzN6ZIbVVY4PyA16", "qh41B7qjlQhNnOsbjTqj3JtjZfsrgLHf", "L6JKyztUTZrhaC2oSi2AGhNMneOalgfU", "mLvzPn8zSeH", "6Oneq6t5dYPlbDhRy7qxaYTJsizasisX", "J8", "lXMgpjBtmdYXVX4s4nwhe"};
    public final WeakReference<C5V> A00;

    public ZW(C5V c5v) {
        this.A00 = new WeakReference<>(c5v);
    }

    public /* synthetic */ ZW(C5V c5v, C5R c5r) {
        this(c5v);
    }

    private void A00(C5V c5v) {
        C0853Px c0853Px = c5v.A0B;
        if (c0853Px != null) {
            c5v.A06.bringChildToFront(c0853Px);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.MC
    public final void A3T(View view, int i10, RelativeLayout.LayoutParams layoutParams) {
        C5V c5v = this.A00.get();
        if (c5v != null) {
            c5v.A06.addView(view, i10, layoutParams);
            A00(c5v);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.MC
    public final void A3U(View view, RelativeLayout.LayoutParams layoutParams) {
        C5V c5v = this.A00.get();
        if (c5v != null) {
            c5v.A06.addView(view, layoutParams);
            A00(c5v);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.MC
    public void A43(String str) {
        if (this.A00.get() != null) {
            this.A00.get().A0G(str);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.MC
    public void A44(String str, C04338q c04338q) {
        if (this.A00.get() != null) {
            this.A00.get().A0P(str, c04338q);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.MC
    public final void A9M(String str, C02481a c02481a) {
        if (this.A00.get() != null) {
            C5V c5v = this.A00.get();
            String[] strArr = A01;
            if (strArr[0].charAt(19) != strArr[1].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[0] = "LaehfLm13EgRqqa58La6JsJDVjNkKsjm";
            strArr2[1] = "U7opStToMRhy5hKGwjx6Oh4Ofub1lgfJ";
            c5v.A0H(str, c02481a);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.MC
    public final void AB0(int i10) {
        C5V activityApi = this.A00.get();
        if (activityApi != null) {
            activityApi.finish(i10);
        }
    }
}
