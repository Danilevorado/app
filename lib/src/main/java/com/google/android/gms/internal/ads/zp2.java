package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zp2 extends f4.a {
    public static final Parcelable.Creator<zp2> CREATOR = new aq2();

    /* renamed from: m, reason: collision with root package name */
    private final wp2[] f18682m;

    /* renamed from: n, reason: collision with root package name */
    public final Context f18683n;

    /* renamed from: o, reason: collision with root package name */
    private final int f18684o;

    /* renamed from: p, reason: collision with root package name */
    public final wp2 f18685p;

    /* renamed from: q, reason: collision with root package name */
    public final int f18686q;

    /* renamed from: r, reason: collision with root package name */
    public final int f18687r;

    /* renamed from: s, reason: collision with root package name */
    public final int f18688s;

    /* renamed from: t, reason: collision with root package name */
    public final String f18689t;

    /* renamed from: u, reason: collision with root package name */
    private final int f18690u;

    /* renamed from: v, reason: collision with root package name */
    private final int f18691v;

    /* renamed from: w, reason: collision with root package name */
    private final int[] f18692w;

    /* renamed from: x, reason: collision with root package name */
    private final int[] f18693x;

    /* renamed from: y, reason: collision with root package name */
    public final int f18694y;

    public zp2(int i10, int i11, int i12, int i13, String str, int i14, int i15) {
        wp2[] wp2VarArrValues = wp2.values();
        this.f18682m = wp2VarArrValues;
        int[] iArrA = xp2.a();
        this.f18692w = iArrA;
        int[] iArrA2 = yp2.a();
        this.f18693x = iArrA2;
        this.f18683n = null;
        this.f18684o = i10;
        this.f18685p = wp2VarArrValues[i10];
        this.f18686q = i11;
        this.f18687r = i12;
        this.f18688s = i13;
        this.f18689t = str;
        this.f18690u = i14;
        this.f18694y = iArrA[i14];
        this.f18691v = i15;
        int i16 = iArrA2[i15];
    }

    private zp2(Context context, wp2 wp2Var, int i10, int i11, int i12, String str, String str2, String str3) {
        this.f18682m = wp2.values();
        this.f18692w = xp2.a();
        this.f18693x = yp2.a();
        this.f18683n = context;
        this.f18684o = wp2Var.ordinal();
        this.f18685p = wp2Var;
        this.f18686q = i10;
        this.f18687r = i11;
        this.f18688s = i12;
        this.f18689t = str;
        int i13 = 2;
        if ("oldest".equals(str2)) {
            i13 = 1;
        } else if (!"lru".equals(str2) && "lfu".equals(str2)) {
            i13 = 3;
        }
        this.f18694y = i13;
        this.f18690u = i13 - 1;
        "onAdClosed".equals(str3);
        this.f18691v = 0;
    }

    public static zp2 f(wp2 wp2Var, Context context) {
        if (wp2Var == wp2.Rewarded) {
            return new zp2(context, wp2Var, ((Integer) k3.w.c().b(ir.f9888a6)).intValue(), ((Integer) k3.w.c().b(ir.f9952g6)).intValue(), ((Integer) k3.w.c().b(ir.f9974i6)).intValue(), (String) k3.w.c().b(ir.f9996k6), (String) k3.w.c().b(ir.f9910c6), (String) k3.w.c().b(ir.f9931e6));
        }
        if (wp2Var == wp2.Interstitial) {
            return new zp2(context, wp2Var, ((Integer) k3.w.c().b(ir.f9899b6)).intValue(), ((Integer) k3.w.c().b(ir.f9963h6)).intValue(), ((Integer) k3.w.c().b(ir.f9985j6)).intValue(), (String) k3.w.c().b(ir.f10007l6), (String) k3.w.c().b(ir.f9921d6), (String) k3.w.c().b(ir.f9941f6));
        }
        if (wp2Var != wp2.AppOpen) {
            return null;
        }
        return new zp2(context, wp2Var, ((Integer) k3.w.c().b(ir.f10039o6)).intValue(), ((Integer) k3.w.c().b(ir.f10061q6)).intValue(), ((Integer) k3.w.c().b(ir.f10072r6)).intValue(), (String) k3.w.c().b(ir.f10018m6), (String) k3.w.c().b(ir.f10028n6), (String) k3.w.c().b(ir.f10050p6));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.k(parcel, 1, this.f18684o);
        f4.c.k(parcel, 2, this.f18686q);
        f4.c.k(parcel, 3, this.f18687r);
        f4.c.k(parcel, 4, this.f18688s);
        f4.c.q(parcel, 5, this.f18689t, false);
        f4.c.k(parcel, 6, this.f18690u);
        f4.c.k(parcel, 7, this.f18691v);
        f4.c.b(parcel, iA);
    }
}
