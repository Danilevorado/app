package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class s92 implements je2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f15157a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15158b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15159c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15160d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15161e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15162f;

    /* renamed from: g, reason: collision with root package name */
    public final int f15163g;

    /* renamed from: h, reason: collision with root package name */
    public final int f15164h;

    /* renamed from: i, reason: collision with root package name */
    public final float f15165i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f15166j;

    public s92(int i10, boolean z10, boolean z11, int i11, int i12, int i13, int i14, int i15, float f5, boolean z12) {
        this.f15157a = i10;
        this.f15158b = z10;
        this.f15159c = z11;
        this.f15160d = i11;
        this.f15161e = i12;
        this.f15162f = i13;
        this.f15163g = i14;
        this.f15164h = i15;
        this.f15165i = f5;
        this.f15166j = z12;
    }

    @Override // com.google.android.gms.internal.ads.je2
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putInt("am", this.f15157a);
        bundle.putBoolean("ma", this.f15158b);
        bundle.putBoolean("sp", this.f15159c);
        bundle.putInt("muv", this.f15160d);
        if (((Boolean) k3.w.c().b(ir.f10064q9)).booleanValue()) {
            bundle.putInt("muv_min", this.f15161e);
            bundle.putInt("muv_max", this.f15162f);
        }
        bundle.putInt("rm", this.f15163g);
        bundle.putInt("riv", this.f15164h);
        bundle.putFloat("android_app_volume", this.f15165i);
        bundle.putBoolean("android_app_muted", this.f15166j);
    }
}
