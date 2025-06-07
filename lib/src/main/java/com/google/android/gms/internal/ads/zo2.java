package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class zo2 {
    public static void a(Context context, boolean z10) {
        String str;
        if (z10) {
            str = "This request is sent from a test device.";
        } else {
            k3.t.b();
            str = "Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + se0.A(context) + "\")) to get test ads on this device.";
        }
        ze0.f(str);
    }

    public static void b(int i10, Throwable th, String str) {
        ze0.f("Ad failed to load : " + i10);
        m3.n1.l(str, th);
        if (i10 == 3) {
            return;
        }
        j3.t.q().t(th, str);
    }
}
