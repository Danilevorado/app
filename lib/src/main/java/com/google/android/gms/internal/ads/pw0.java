package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class pw0 extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: m, reason: collision with root package name */
    private final Context f14068m;

    /* renamed from: n, reason: collision with root package name */
    private View f14069n;

    private pw0(Context context) {
        super(context);
        this.f14068m = context;
    }

    public static pw0 a(Context context, View view, hn2 hn2Var) {
        Resources resources;
        DisplayMetrics displayMetrics;
        pw0 pw0Var = new pw0(context);
        if (!hn2Var.f9274v.isEmpty() && (resources = pw0Var.f14068m.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f5 = ((in2) hn2Var.f9274v.get(0)).f9810a;
            float f10 = displayMetrics.density;
            pw0Var.setLayoutParams(new FrameLayout.LayoutParams((int) (f5 * f10), (int) (r1.f9811b * f10)));
        }
        pw0Var.f14069n = view;
        pw0Var.addView(view);
        j3.t.z();
        bg0.b(pw0Var, pw0Var);
        j3.t.z();
        bg0.a(pw0Var, pw0Var);
        JSONObject jSONObject = hn2Var.f9253i0;
        RelativeLayout relativeLayout = new RelativeLayout(pw0Var.f14068m);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        if (jSONObjectOptJSONObject != null) {
            pw0Var.c(jSONObjectOptJSONObject, relativeLayout, 10);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("footer");
        if (jSONObjectOptJSONObject2 != null) {
            pw0Var.c(jSONObjectOptJSONObject2, relativeLayout, 12);
        }
        pw0Var.addView(relativeLayout);
        return pw0Var;
    }

    private final int b(double d10) {
        k3.t.b();
        return se0.z(this.f14068m, (int) d10);
    }

    private final void c(JSONObject jSONObject, RelativeLayout relativeLayout, int i10) {
        TextView textView = new TextView(this.f14068m);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int iB = b(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, iB, 0, iB);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, b(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i10);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.f14069n.setY(-r0[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.f14069n.setY(-r0[1]);
    }
}
