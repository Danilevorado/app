package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.WindowManager;

/* loaded from: classes.dex */
final class qm4 implements pm4 {

    /* renamed from: a, reason: collision with root package name */
    private final WindowManager f14407a;

    private qm4(WindowManager windowManager) {
        this.f14407a = windowManager;
    }

    public static pm4 c(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            return new qm4(windowManager);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.pm4
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.pm4
    public final void b(nm4 nm4Var) {
        tm4.b(nm4Var.f12713a, this.f14407a.getDefaultDisplay());
    }
}
