package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class ud2 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final ed0 f16294a;

    /* renamed from: b, reason: collision with root package name */
    private final bb3 f16295b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f16296c;

    public ud2(ed0 ed0Var, bb3 bb3Var, Context context) {
        this.f16294a = ed0Var;
        this.f16295b = bb3Var;
        this.f16296c = context;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 34;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        return this.f16295b.g(new Callable() { // from class: com.google.android.gms.internal.ads.td2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f15789a.c();
            }
        });
    }

    final /* synthetic */ vd2 c() throws NoSuchMethodException, SecurityException {
        if (!this.f16294a.z(this.f16296c)) {
            return new vd2(null, null, null, null, null);
        }
        String strJ = this.f16294a.j(this.f16296c);
        String str = strJ == null ? "" : strJ;
        String strH = this.f16294a.h(this.f16296c);
        String str2 = strH == null ? "" : strH;
        String strF = this.f16294a.f(this.f16296c);
        String str3 = strF == null ? "" : strF;
        String strG = this.f16294a.g(this.f16296c);
        return new vd2(str, str2, str3, strG == null ? "" : strG, "TIME_OUT".equals(str2) ? (Long) k3.w.c().b(ir.f9936f0) : null);
    }
}
