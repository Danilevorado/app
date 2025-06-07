package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l82 implements je2 {

    /* renamed from: a, reason: collision with root package name */
    public final k3.h4 f11402a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11403b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11404c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11405d;

    /* renamed from: e, reason: collision with root package name */
    public final float f11406e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11407f;

    /* renamed from: g, reason: collision with root package name */
    public final int f11408g;

    /* renamed from: h, reason: collision with root package name */
    public final String f11409h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f11410i;

    public l82(k3.h4 h4Var, String str, boolean z10, String str2, float f5, int i10, int i11, String str3, boolean z11) {
        e4.p.m(h4Var, "the adSize must not be null");
        this.f11402a = h4Var;
        this.f11403b = str;
        this.f11404c = z10;
        this.f11405d = str2;
        this.f11406e = f5;
        this.f11407f = i10;
        this.f11408g = i11;
        this.f11409h = str3;
        this.f11410i = z11;
    }

    @Override // com.google.android.gms.internal.ads.je2
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = (Bundle) obj;
        qo2.f(bundle, "smart_w", "full", this.f11402a.f24655q == -1);
        qo2.f(bundle, "smart_h", "auto", this.f11402a.f24652n == -2);
        qo2.g(bundle, "ene", true, this.f11402a.f24660v);
        qo2.f(bundle, "rafmt", "102", this.f11402a.f24663y);
        qo2.f(bundle, "rafmt", "103", this.f11402a.f24664z);
        qo2.f(bundle, "rafmt", "105", this.f11402a.A);
        qo2.g(bundle, "inline_adaptive_slot", true, this.f11410i);
        qo2.g(bundle, "interscroller_slot", true, this.f11402a.A);
        qo2.c(bundle, "format", this.f11403b);
        qo2.f(bundle, "fluid", "height", this.f11404c);
        qo2.f(bundle, "sz", this.f11405d, !TextUtils.isEmpty(r0));
        bundle.putFloat("u_sd", this.f11406e);
        bundle.putInt("sw", this.f11407f);
        bundle.putInt("sh", this.f11408g);
        String str = this.f11409h;
        qo2.f(bundle, "sc", str, true ^ TextUtils.isEmpty(str));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        k3.h4[] h4VarArr = this.f11402a.f24657s;
        if (h4VarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", this.f11402a.f24652n);
            bundle2.putInt("width", this.f11402a.f24655q);
            bundle2.putBoolean("is_fluid_height", this.f11402a.f24659u);
            arrayList.add(bundle2);
        } else {
            for (k3.h4 h4Var : h4VarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", h4Var.f24659u);
                bundle3.putInt("height", h4Var.f24652n);
                bundle3.putInt("width", h4Var.f24655q);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
