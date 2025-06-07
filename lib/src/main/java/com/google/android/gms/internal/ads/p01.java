package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* loaded from: classes.dex */
public final class p01 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f13492a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f13493b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f13494c;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f13495d;

    /* renamed from: e, reason: collision with root package name */
    private final q44 f13496e;

    /* renamed from: f, reason: collision with root package name */
    private final q44 f13497f;

    /* renamed from: g, reason: collision with root package name */
    private final q44 f13498g;

    /* renamed from: h, reason: collision with root package name */
    private final q44 f13499h;

    /* renamed from: i, reason: collision with root package name */
    private final q44 f13500i;

    /* renamed from: j, reason: collision with root package name */
    private final q44 f13501j;

    /* renamed from: k, reason: collision with root package name */
    private final q44 f13502k;

    public p01(q44 q44Var, q44 q44Var2, q44 q44Var3, q44 q44Var4, q44 q44Var5, q44 q44Var6, q44 q44Var7, q44 q44Var8, q44 q44Var9, q44 q44Var10, q44 q44Var11) {
        this.f13492a = q44Var;
        this.f13493b = q44Var2;
        this.f13494c = q44Var3;
        this.f13495d = q44Var4;
        this.f13496e = q44Var5;
        this.f13497f = q44Var6;
        this.f13498g = q44Var7;
        this.f13499h = q44Var8;
        this.f13500i = q44Var9;
        this.f13501j = q44Var10;
        this.f13502k = q44Var11;
    }

    @Override // com.google.android.gms.internal.ads.q44
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final o01 b() {
        ls2 ls2Var = (ls2) this.f13492a.b();
        ff0 ff0VarA = ((cn0) this.f13493b).a();
        ApplicationInfo applicationInfoB = ((lr1) this.f13494c).b();
        String strB = ((rr1) this.f13495d).b();
        zq zqVar = ir.f9881a;
        return new o01(ls2Var, ff0VarA, applicationInfoB, strB, k3.w.a().a(), (PackageInfo) this.f13497f.b(), b44.a(this.f13498g), ((om0) this.f13499h).b(), (String) this.f13500i.b(), ((oe2) this.f13501j).b(), ((b11) this.f13502k).a());
    }
}
