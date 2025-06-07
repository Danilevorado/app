package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class hk1 {

    /* renamed from: a, reason: collision with root package name */
    private Context f9160a;

    /* renamed from: b, reason: collision with root package name */
    private PopupWindow f9161b;

    public final void a(Context context, View view) {
        PopupWindow popupWindow;
        if (!i4.m.d() || i4.m.f()) {
            return;
        }
        Window window = context instanceof Activity ? ((Activity) context).getWindow() : null;
        if (window == null || window.getDecorView() == null || ((Activity) context).isDestroyed()) {
            popupWindow = null;
        } else {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.addView(view, -1, -1);
            popupWindow = new PopupWindow((View) frameLayout, 1, 1, false);
            popupWindow.setOutsideTouchable(true);
            popupWindow.setClippingEnabled(false);
            ze0.b("Displaying the 1x1 popup off the screen.");
            try {
                popupWindow.showAtLocation(window.getDecorView(), 0, -1, -1);
            } catch (Exception unused) {
            }
        }
        this.f9161b = popupWindow;
        if (popupWindow == null) {
            context = null;
        }
        this.f9160a = context;
    }

    public final void b() {
        Context context = this.f9160a;
        if (context == null || this.f9161b == null) {
            return;
        }
        if ((!(context instanceof Activity) || !((Activity) context).isDestroyed()) && this.f9161b.isShowing()) {
            this.f9161b.dismiss();
        }
        this.f9160a = null;
        this.f9161b = null;
    }
}
