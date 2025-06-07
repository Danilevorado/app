package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class lx implements gy {
    lx() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.gy
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        nk0 nk0Var = (nk0) obj;
        WindowManager windowManager = (WindowManager) nk0Var.getContext().getSystemService("window");
        j3.t.r();
        DisplayMetrics displayMetricsM = m3.b2.M(windowManager);
        int i10 = displayMetricsM.widthPixels;
        int i11 = displayMetricsM.heightPixels;
        int[] iArr = new int[2];
        HashMap map2 = new HashMap();
        ((View) nk0Var).getLocationInWindow(iArr);
        map2.put("xInPixels", Integer.valueOf(iArr[0]));
        map2.put("yInPixels", Integer.valueOf(iArr[1]));
        map2.put("windowWidthInPixels", Integer.valueOf(i10));
        map2.put("windowHeightInPixels", Integer.valueOf(i11));
        nk0Var.c("locationReady", map2);
        ze0.g("GET LOCATION COMPILED");
    }
}
