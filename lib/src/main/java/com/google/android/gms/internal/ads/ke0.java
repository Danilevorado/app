package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class ke0 {

    /* renamed from: g, reason: collision with root package name */
    final String f11002g;

    /* renamed from: h, reason: collision with root package name */
    private final m3.p1 f11003h;

    /* renamed from: a, reason: collision with root package name */
    long f10996a = -1;

    /* renamed from: b, reason: collision with root package name */
    long f10997b = -1;

    /* renamed from: c, reason: collision with root package name */
    int f10998c = -1;

    /* renamed from: d, reason: collision with root package name */
    int f10999d = -1;

    /* renamed from: e, reason: collision with root package name */
    long f11000e = 0;

    /* renamed from: f, reason: collision with root package name */
    private final Object f11001f = new Object();

    /* renamed from: i, reason: collision with root package name */
    int f11004i = 0;

    /* renamed from: j, reason: collision with root package name */
    int f11005j = 0;

    public ke0(String str, m3.p1 p1Var) {
        this.f11002g = str;
        this.f11003h = p1Var;
    }

    private final void g() {
        if (((Boolean) kt.f11213a.e()).booleanValue()) {
            synchronized (this.f11001f) {
                this.f10998c--;
                this.f10999d--;
            }
        }
    }

    public final Bundle a(Context context, String str) {
        Bundle bundle;
        String str2;
        synchronized (this.f11001f) {
            bundle = new Bundle();
            if (!this.f11003h.S()) {
                bundle.putString("session_id", this.f11002g);
            }
            bundle.putLong("basets", this.f10997b);
            bundle.putLong("currts", this.f10996a);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.f10998c);
            bundle.putInt("preqs_in_session", this.f10999d);
            bundle.putLong("time_in_session", this.f11000e);
            bundle.putInt("pclick", this.f11004i);
            bundle.putInt("pimp", this.f11005j);
            Context contextA = y90.a(context);
            int identifier = contextA.getResources().getIdentifier("Theme.Translucent", "style", "android");
            boolean z10 = false;
            if (identifier == 0) {
                str2 = "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.";
            } else {
                try {
                    if (identifier == contextA.getPackageManager().getActivityInfo(new ComponentName(contextA.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                        z10 = true;
                    } else {
                        ze0.f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    ze0.g("Fail to fetch AdActivity theme");
                    str2 = "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.";
                }
                bundle.putBoolean("support_transparent_background", z10);
            }
            ze0.f(str2);
            bundle.putBoolean("support_transparent_background", z10);
        }
        return bundle;
    }

    public final void b() {
        synchronized (this.f11001f) {
            this.f11004i++;
        }
    }

    public final void c() {
        synchronized (this.f11001f) {
            this.f11005j++;
        }
    }

    public final void d() {
        g();
    }

    public final void e() {
        g();
    }

    public final void f(k3.c4 c4Var, long j10) {
        Bundle bundle;
        synchronized (this.f11001f) {
            long jF = this.f11003h.f();
            long jA = j3.t.b().a();
            if (this.f10997b == -1) {
                if (jA - jF > ((Long) k3.w.c().b(ir.P0)).longValue()) {
                    this.f10999d = -1;
                } else {
                    this.f10999d = this.f11003h.d();
                }
                this.f10997b = j10;
            }
            this.f10996a = j10;
            if (!((Boolean) k3.w.c().b(ir.f9960h3)).booleanValue() && (bundle = c4Var.f24616o) != null && bundle.getInt("gw", 2) == 1) {
                return;
            }
            this.f10998c++;
            int i10 = this.f10999d + 1;
            this.f10999d = i10;
            if (i10 == 0) {
                this.f11000e = 0L;
                this.f11003h.B(jA);
            } else {
                this.f11000e = jA - this.f11003h.c();
            }
        }
    }
}
