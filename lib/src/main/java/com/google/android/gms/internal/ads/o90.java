package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;

/* loaded from: classes.dex */
public final class o90 {
    private int A;
    private final String B;
    private boolean C;

    /* renamed from: a, reason: collision with root package name */
    private int f13064a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f13065b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f13066c;

    /* renamed from: d, reason: collision with root package name */
    private int f13067d;

    /* renamed from: e, reason: collision with root package name */
    private int f13068e;

    /* renamed from: f, reason: collision with root package name */
    private int f13069f;

    /* renamed from: g, reason: collision with root package name */
    private String f13070g;

    /* renamed from: h, reason: collision with root package name */
    private int f13071h;

    /* renamed from: i, reason: collision with root package name */
    private int f13072i;

    /* renamed from: j, reason: collision with root package name */
    private int f13073j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f13074k;

    /* renamed from: l, reason: collision with root package name */
    private int f13075l;

    /* renamed from: m, reason: collision with root package name */
    private double f13076m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f13077n;

    /* renamed from: o, reason: collision with root package name */
    private String f13078o;

    /* renamed from: p, reason: collision with root package name */
    private String f13079p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f13080q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f13081r;

    /* renamed from: s, reason: collision with root package name */
    private final String f13082s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f13083t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f13084u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f13085v;

    /* renamed from: w, reason: collision with root package name */
    private final String f13086w;

    /* renamed from: x, reason: collision with root package name */
    private final String f13087x;

    /* renamed from: y, reason: collision with root package name */
    private float f13088y;

    /* renamed from: z, reason: collision with root package name */
    private int f13089z;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o90(android.content.Context r7) {
        /*
            r6 = this;
            r6.<init>()
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            com.google.android.gms.internal.ads.ir.a(r7)
            r6.c(r7)
            r6.e(r7)
            r6.d(r7)
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r2 = "geo:0,0?q=donuts"
            android.content.pm.ResolveInfo r2 = b(r0, r2)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L23
            r2 = r3
            goto L24
        L23:
            r2 = r4
        L24:
            r6.f13080q = r2
            java.lang.String r2 = "http://www.google.com"
            android.content.pm.ResolveInfo r2 = b(r0, r2)
            if (r2 == 0) goto L2f
            goto L30
        L2f:
            r3 = r4
        L30:
            r6.f13081r = r3
            java.lang.String r2 = r1.getCountry()
            r6.f13082s = r2
            j3.t.r()
            k3.t.b()
            boolean r2 = com.google.android.gms.internal.ads.se0.t()
            r6.f13083t = r2
            boolean r2 = i4.i.c(r7)
            r6.f13084u = r2
            boolean r2 = i4.i.d(r7)
            r6.f13085v = r2
            java.lang.String r1 = r1.getLanguage()
            r6.f13086w = r1
            java.lang.String r1 = "market://details?id=com.google.android.gms.ads"
            android.content.pm.ResolveInfo r0 = b(r0, r1)
            java.lang.String r1 = "."
            r2 = 0
            if (r0 != 0) goto L63
        L61:
            r0 = r2
            goto L8a
        L63:
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            if (r0 != 0) goto L68
            goto L61
        L68:
            k4.b r3 = k4.c.a(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.lang.String r5 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            android.content.pm.PackageInfo r3 = r3.f(r5, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            if (r3 == 0) goto L61
            int r3 = r3.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.lang.String r0 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r4.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r4.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r4.append(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r4.append(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.lang.String r0 = r4.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
        L8a:
            r6.f13087x = r0
            k4.b r0 = k4.c.a(r7)     // Catch: java.lang.Exception -> Lb0
            java.lang.String r3 = "com.android.vending"
            r4 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r0 = r0.f(r3, r4)     // Catch: java.lang.Exception -> Lb0
            if (r0 == 0) goto Lb0
            int r3 = r0.versionCode     // Catch: java.lang.Exception -> Lb0
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Exception -> Lb0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb0
            r4.<init>()     // Catch: java.lang.Exception -> Lb0
            r4.append(r3)     // Catch: java.lang.Exception -> Lb0
            r4.append(r1)     // Catch: java.lang.Exception -> Lb0
            r4.append(r0)     // Catch: java.lang.Exception -> Lb0
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> Lb0
        Lb0:
            r6.B = r2
            android.content.res.Resources r7 = r7.getResources()
            if (r7 != 0) goto Lb9
            return
        Lb9:
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            if (r7 != 0) goto Lc0
            return
        Lc0:
            float r0 = r7.density
            r6.f13088y = r0
            int r0 = r7.widthPixels
            r6.f13089z = r0
            int r7 = r7.heightPixels
            r6.A = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o90.<init>(android.content.Context):void");
    }

    public o90(Context context, p90 p90Var) {
        ir.a(context);
        c(context);
        e(context);
        d(context);
        this.f13078o = Build.FINGERPRINT;
        this.f13079p = Build.DEVICE;
        this.C = ks.g(context);
        this.f13080q = p90Var.f13642a;
        this.f13081r = p90Var.f13643b;
        this.f13082s = p90Var.f13645d;
        this.f13083t = p90Var.f13646e;
        this.f13084u = p90Var.f13647f;
        this.f13085v = p90Var.f13648g;
        this.f13086w = p90Var.f13649h;
        this.f13087x = p90Var.f13650i;
        this.B = p90Var.f13651j;
        this.f13088y = p90Var.f13654m;
        this.f13089z = p90Var.f13655n;
        this.A = p90Var.f13656o;
    }

    private static ResolveInfo b(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            j3.t.q().u(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    private final void c(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.f13064a = audioManager.getMode();
                this.f13065b = audioManager.isMusicActive();
                this.f13066c = audioManager.isSpeakerphoneOn();
                this.f13067d = audioManager.getStreamVolume(3);
                this.f13068e = audioManager.getRingerMode();
                this.f13069f = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                j3.t.q().u(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.f13064a = -2;
        this.f13065b = false;
        this.f13066c = false;
        this.f13067d = 0;
        this.f13068e = 2;
        this.f13069f = 0;
    }

    private final void d(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent intentRegisterReceiver = (!((Boolean) k3.w.c().b(ir.f10075r9)).booleanValue() || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
        if (intentRegisterReceiver == null) {
            this.f13076m = -1.0d;
            this.f13077n = false;
        } else {
            int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
            this.f13076m = intentRegisterReceiver.getIntExtra("level", -1) / intentRegisterReceiver.getIntExtra("scale", -1);
            this.f13077n = intExtra == 2 || intExtra == 5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void e(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r6.getSystemService(r1)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            java.lang.String r2 = r0.getNetworkOperator()
            r5.f13070g = r2
            boolean r2 = i4.m.l()
            r3 = 0
            if (r2 == 0) goto L31
            com.google.android.gms.internal.ads.zq r2 = com.google.android.gms.internal.ads.ir.T7
            com.google.android.gms.internal.ads.gr r4 = k3.w.c()
            java.lang.Object r2 = r4.b(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L31
            r2 = r3
            goto L35
        L31:
            int r2 = r0.getNetworkType()
        L35:
            r5.f13072i = r2
            int r0 = r0.getPhoneType()
            r5.f13073j = r0
            r0 = -2
            r5.f13071h = r0
            r5.f13074k = r3
            r0 = -1
            r5.f13075l = r0
            j3.t.r()
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r6 = m3.b2.S(r6, r2)
            if (r6 == 0) goto L6f
            android.net.NetworkInfo r6 = r1.getActiveNetworkInfo()
            if (r6 == 0) goto L67
            int r0 = r6.getType()
            r5.f13071h = r0
            android.net.NetworkInfo$DetailedState r6 = r6.getDetailedState()
            int r6 = r6.ordinal()
            r5.f13075l = r6
            goto L69
        L67:
            r5.f13071h = r0
        L69:
            boolean r6 = r1.isActiveNetworkMetered()
            r5.f13074k = r6
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o90.e(android.content.Context):void");
    }

    public final p90 a() {
        return new p90(this.f13064a, this.f13080q, this.f13081r, this.f13070g, this.f13082s, this.f13083t, this.f13084u, this.f13085v, this.f13065b, this.f13066c, this.f13086w, this.f13087x, this.B, this.f13067d, this.f13071h, this.f13072i, this.f13073j, this.f13068e, this.f13069f, this.f13088y, this.f13089z, this.A, this.f13076m, this.f13077n, this.f13074k, this.f13075l, this.f13078o, this.C, this.f13079p);
    }
}
