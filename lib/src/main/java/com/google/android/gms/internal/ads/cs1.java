package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* loaded from: classes.dex */
final class cs1 implements ma3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ds1 f7049a;

    cs1(ds1 ds1Var) {
        this.f7049a = ds1Var;
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final void a(Throwable th) {
        if (((Boolean) k3.w.c().b(ir.Q5)).booleanValue()) {
            Matcher matcher = ds1.f7486h.matcher(th.getMessage());
            if (matcher.matches()) {
                this.f7049a.f7491e.i(Integer.parseInt(matcher.group(1)));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        un2 un2Var = (un2) obj;
        if (((Boolean) k3.w.c().b(ir.Q5)).booleanValue()) {
            this.f7049a.f7491e.i(un2Var.f16413b.f15924b.f11677e);
            this.f7049a.f7491e.j(un2Var.f16413b.f15924b.f11678f);
        }
    }
}
