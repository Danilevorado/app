package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
public final class j4 {

    /* renamed from: a, reason: collision with root package name */
    final w4 f20086a;

    j4(n9 n9Var) {
        this.f20086a = n9Var.c0();
    }

    final boolean a() {
        try {
            k4.b bVarA = k4.c.a(this.f20086a.a());
            if (bVarA != null) {
                return bVarA.f("com.android.vending", 128).versionCode >= 80837300;
            }
            this.f20086a.b().t().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e5) {
            this.f20086a.b().t().b("Failed to retrieve Play Store version for Install Referrer", e5);
            return false;
        }
    }
}
