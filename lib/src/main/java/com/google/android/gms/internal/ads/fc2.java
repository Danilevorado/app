package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

/* loaded from: classes.dex */
public final class fc2 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f8220a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f8221b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f8222c;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f8223d;

    public fc2(q44 q44Var, q44 q44Var2, q44 q44Var3, q44 q44Var4) {
        this.f8220a = q44Var;
        this.f8221b = q44Var2;
        this.f8222c = q44Var3;
        this.f8223d = q44Var4;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        return new dc2(bb3Var, ((b11) this.f8221b).a(), (PackageInfo) this.f8222c.b(), ((om0) this.f8223d).b());
    }
}
