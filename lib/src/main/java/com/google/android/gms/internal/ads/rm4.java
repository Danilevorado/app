package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* loaded from: classes.dex */
final class rm4 implements DisplayManager.DisplayListener, pm4 {

    /* renamed from: a, reason: collision with root package name */
    private final DisplayManager f14846a;

    /* renamed from: b, reason: collision with root package name */
    private nm4 f14847b;

    private rm4(DisplayManager displayManager) {
        this.f14846a = displayManager;
    }

    public static pm4 c(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            return new rm4(displayManager);
        }
        return null;
    }

    private final Display d() {
        return this.f14846a.getDisplay(0);
    }

    @Override // com.google.android.gms.internal.ads.pm4
    public final void a() {
        this.f14846a.unregisterDisplayListener(this);
        this.f14847b = null;
    }

    @Override // com.google.android.gms.internal.ads.pm4
    public final void b(nm4 nm4Var) {
        this.f14847b = nm4Var;
        this.f14846a.registerDisplayListener(this, sv2.A(null));
        tm4.b(nm4Var.f12713a, d());
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i10) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        nm4 nm4Var = this.f14847b;
        if (nm4Var == null || i10 != 0) {
            return;
        }
        tm4.b(nm4Var.f12713a, d());
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i10) {
    }
}
