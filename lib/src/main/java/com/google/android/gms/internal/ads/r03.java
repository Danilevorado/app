package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* loaded from: classes.dex */
final class r03 extends k13 {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f14569a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14570b;

    /* renamed from: c, reason: collision with root package name */
    private final int f14571c;

    /* renamed from: d, reason: collision with root package name */
    private final float f14572d;

    /* renamed from: e, reason: collision with root package name */
    private final int f14573e;

    /* renamed from: f, reason: collision with root package name */
    private final String f14574f;

    /* synthetic */ r03(IBinder iBinder, boolean z10, String str, int i10, float f5, int i11, String str2, int i12, String str3, q03 q03Var) {
        this.f14569a = iBinder;
        this.f14570b = str;
        this.f14571c = i10;
        this.f14572d = f5;
        this.f14573e = i12;
        this.f14574f = str3;
    }

    @Override // com.google.android.gms.internal.ads.k13
    public final float a() {
        return this.f14572d;
    }

    @Override // com.google.android.gms.internal.ads.k13
    public final int b() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.k13
    public final int c() {
        return this.f14571c;
    }

    @Override // com.google.android.gms.internal.ads.k13
    public final int d() {
        return this.f14573e;
    }

    @Override // com.google.android.gms.internal.ads.k13
    public final IBinder e() {
        return this.f14569a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k13) {
            k13 k13Var = (k13) obj;
            if (this.f14569a.equals(k13Var.e())) {
                k13Var.i();
                String str = this.f14570b;
                if (str != null ? str.equals(k13Var.g()) : k13Var.g() == null) {
                    if (this.f14571c == k13Var.c() && Float.floatToIntBits(this.f14572d) == Float.floatToIntBits(k13Var.a())) {
                        k13Var.b();
                        k13Var.h();
                        if (this.f14573e == k13Var.d()) {
                            String str2 = this.f14574f;
                            String strF = k13Var.f();
                            if (str2 != null ? str2.equals(strF) : strF == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.k13
    public final String f() {
        return this.f14574f;
    }

    @Override // com.google.android.gms.internal.ads.k13
    public final String g() {
        return this.f14570b;
    }

    @Override // com.google.android.gms.internal.ads.k13
    public final String h() {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.f14569a.hashCode() ^ 1000003;
        String str = this.f14570b;
        int iHashCode2 = ((((((((((iHashCode * 1000003) ^ 1237) * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f14571c) * 1000003) ^ Float.floatToIntBits(this.f14572d)) * 583896283) ^ this.f14573e) * 1000003;
        String str2 = this.f14574f;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.k13
    public final boolean i() {
        return false;
    }

    public final String toString() {
        return "OverlayDisplayShowRequest{windowToken=" + this.f14569a.toString() + ", stableSessionToken=false, appId=" + this.f14570b + ", layoutGravity=" + this.f14571c + ", layoutVerticalMargin=" + this.f14572d + ", displayMode=0, sessionToken=null, windowWidthPx=" + this.f14573e + ", adFieldEnifd=" + this.f14574f + "}";
    }
}
