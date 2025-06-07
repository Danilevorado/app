package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class h extends p5 {

    /* renamed from: b, reason: collision with root package name */
    private Boolean f19954b;

    /* renamed from: c, reason: collision with root package name */
    private g f19955c;

    /* renamed from: d, reason: collision with root package name */
    private Boolean f19956d;

    h(w4 w4Var) {
        super(w4Var);
        this.f19955c = new g() { // from class: com.google.android.gms.measurement.internal.f
            @Override // com.google.android.gms.measurement.internal.g
            public final String c(String str, String str2) {
                return null;
            }
        };
    }

    public static final long I() {
        return ((Long) i3.f20011e.a(null)).longValue();
    }

    public static final long g() {
        return ((Long) i3.E.a(null)).longValue();
    }

    private final String h(String str, String str2) {
        q3 q3VarP;
        String str3;
        try {
            String str4 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            e4.p.l(str4);
            return str4;
        } catch (ClassNotFoundException e5) {
            e = e5;
            q3VarP = this.f20269a.b().p();
            str3 = "Could not find SystemProperties class";
            q3VarP.b(str3, e);
            return "";
        } catch (IllegalAccessException e10) {
            e = e10;
            q3VarP = this.f20269a.b().p();
            str3 = "Could not access SystemProperties.get()";
            q3VarP.b(str3, e);
            return "";
        } catch (NoSuchMethodException e11) {
            e = e11;
            q3VarP = this.f20269a.b().p();
            str3 = "Could not find SystemProperties.get() method";
            q3VarP.b(str3, e);
            return "";
        } catch (InvocationTargetException e12) {
            e = e12;
            q3VarP = this.f20269a.b().p();
            str3 = "SystemProperties.get() threw an exception";
            q3VarP.b(str3, e);
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A(java.lang.String r4, com.google.android.gms.measurement.internal.h3 r5) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto Le
        L3:
            java.lang.Object r4 = r5.a(r0)
        L7:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        Le:
            com.google.android.gms.measurement.internal.g r1 = r3.f19955c
            java.lang.String r2 = r5.b()
            java.lang.String r4 = r1.c(r4, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L1f
            goto L3
        L1f:
            java.lang.String r0 = "1"
            boolean r4 = r0.equals(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r4 = r5.a(r4)
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.h.A(java.lang.String, com.google.android.gms.measurement.internal.h3):boolean");
    }

    public final boolean C(String str) {
        return "1".equals(this.f19955c.c(str, "gaia_collection_enabled"));
    }

    public final boolean D() {
        Boolean boolR = r("google_analytics_automatic_screen_reporting_enabled");
        return boolR == null || boolR.booleanValue();
    }

    public final boolean E() {
        this.f20269a.x();
        Boolean boolR = r("firebase_analytics_collection_deactivated");
        return boolR != null && boolR.booleanValue();
    }

    public final boolean F(String str) {
        return "1".equals(this.f19955c.c(str, "measurement.event_sampling_enabled"));
    }

    final boolean G() {
        if (this.f19954b == null) {
            Boolean boolR = r("app_measurement_lite");
            this.f19954b = boolR;
            if (boolR == null) {
                this.f19954b = Boolean.FALSE;
            }
        }
        return this.f19954b.booleanValue() || !this.f20269a.q();
    }

    public final boolean H() {
        if (this.f19956d == null) {
            synchronized (this) {
                if (this.f19956d == null) {
                    ApplicationInfo applicationInfo = this.f20269a.a().getApplicationInfo();
                    String strA = i4.o.a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z10 = false;
                        if (str != null && str.equals(strA)) {
                            z10 = true;
                        }
                        this.f19956d = Boolean.valueOf(z10);
                    }
                    if (this.f19956d == null) {
                        this.f19956d = Boolean.TRUE;
                        this.f20269a.b().p().a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f19956d.booleanValue();
    }

    public final double i(String str, h3 h3Var) {
        if (str != null) {
            String strC = this.f19955c.c(str, h3Var.b());
            if (!TextUtils.isEmpty(strC)) {
                try {
                    return ((Double) h3Var.a(Double.valueOf(Double.parseDouble(strC)))).doubleValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Double) h3Var.a(null)).doubleValue();
    }

    final int j(String str) {
        return n(str, i3.I, 500, AdError.SERVER_ERROR_CODE);
    }

    public final int k() {
        u9 u9VarN = this.f20269a.N();
        Boolean boolJ = u9VarN.f20269a.L().J();
        if (u9VarN.o0() < 201500) {
            return (boolJ == null || boolJ.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    public final int l(String str) {
        return n(str, i3.J, 25, 100);
    }

    public final int m(String str, h3 h3Var) {
        if (str != null) {
            String strC = this.f19955c.c(str, h3Var.b());
            if (!TextUtils.isEmpty(strC)) {
                try {
                    return ((Integer) h3Var.a(Integer.valueOf(Integer.parseInt(strC)))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Integer) h3Var.a(null)).intValue();
    }

    public final int n(String str, h3 h3Var, int i10, int i11) {
        return Math.max(Math.min(m(str, h3Var), i11), i10);
    }

    public final long o() {
        this.f20269a.x();
        return 68000L;
    }

    public final long p(String str, h3 h3Var) {
        if (str != null) {
            String strC = this.f19955c.c(str, h3Var.b());
            if (!TextUtils.isEmpty(strC)) {
                try {
                    return ((Long) h3Var.a(Long.valueOf(Long.parseLong(strC)))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Long) h3Var.a(null)).longValue();
    }

    final Bundle q() {
        try {
            if (this.f20269a.a().getPackageManager() == null) {
                this.f20269a.b().p().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoC = k4.c.a(this.f20269a.a()).c(this.f20269a.a().getPackageName(), 128);
            if (applicationInfoC != null) {
                return applicationInfoC.metaData;
            }
            this.f20269a.b().p().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e5) {
            this.f20269a.b().p().b("Failed to load metadata: Package name not found", e5);
            return null;
        }
    }

    final Boolean r(String str) {
        e4.p.f(str);
        Bundle bundleQ = q();
        if (bundleQ == null) {
            this.f20269a.b().p().a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleQ.containsKey(str)) {
            return Boolean.valueOf(bundleQ.getBoolean(str));
        }
        return null;
    }

    public final String s() {
        return h("debug.firebase.analytics.app", "");
    }

    public final String t() {
        return h("debug.deferred.deeplink", "");
    }

    final String u() {
        this.f20269a.x();
        return "FA";
    }

    public final String v(String str, h3 h3Var) {
        return (String) h3Var.a(str == null ? null : this.f19955c.c(str, h3Var.b()));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.util.List w(java.lang.String r4) throws android.content.res.Resources.NotFoundException {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            e4.p.f(r4)
            android.os.Bundle r0 = r3.q()
            r1 = 0
            if (r0 != 0) goto L1d
            com.google.android.gms.measurement.internal.w4 r4 = r3.f20269a
            com.google.android.gms.measurement.internal.s3 r4 = r4.b()
            com.google.android.gms.measurement.internal.q3 r4 = r4.p()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L1b:
            r4 = r1
            goto L2c
        L1d:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L24
            goto L1b
        L24:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L2c:
            if (r4 == 0) goto L58
            com.google.android.gms.measurement.internal.w4 r0 = r3.f20269a     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.Context r0 = r0.a()     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L48
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L48
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            if (r4 != 0) goto L43
            return r1
        L43:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            return r4
        L48:
            r4 = move-exception
            com.google.android.gms.measurement.internal.w4 r0 = r3.f20269a
            com.google.android.gms.measurement.internal.s3 r0 = r0.b()
            com.google.android.gms.measurement.internal.q3 r0 = r0.p()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.b(r2, r4)
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.h.w(java.lang.String):java.util.List");
    }

    final void y(g gVar) {
        this.f19955c = gVar;
    }

    public final boolean z() {
        Boolean boolR = r("google_analytics_adid_collection_enabled");
        return boolR == null || boolR.booleanValue();
    }
}
