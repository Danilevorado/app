package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class k04 extends i04 {
    k04() {
    }

    @Override // com.google.android.gms.internal.ads.i04
    final /* synthetic */ int a(Object obj) {
        return ((j04) obj).a();
    }

    @Override // com.google.android.gms.internal.ads.i04
    final /* synthetic */ int b(Object obj) {
        return ((j04) obj).b();
    }

    @Override // com.google.android.gms.internal.ads.i04
    final /* bridge */ /* synthetic */ Object c(Object obj) {
        by3 by3Var = (by3) obj;
        j04 j04Var = by3Var.zzc;
        if (j04Var != j04.c()) {
            return j04Var;
        }
        j04 j04VarF = j04.f();
        by3Var.zzc = j04VarF;
        return j04VarF;
    }

    @Override // com.google.android.gms.internal.ads.i04
    final /* synthetic */ Object d(Object obj) {
        return ((by3) obj).zzc;
    }

    @Override // com.google.android.gms.internal.ads.i04
    final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2) {
        if (j04.c().equals(obj2)) {
            return obj;
        }
        j04 j04Var = (j04) obj2;
        if (j04.c().equals(obj)) {
            return j04.e((j04) obj, j04Var);
        }
        ((j04) obj).d(j04Var);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.i04
    final /* synthetic */ Object f() {
        return j04.f();
    }

    @Override // com.google.android.gms.internal.ads.i04
    final /* synthetic */ Object g(Object obj) {
        ((j04) obj).h();
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.i04
    final /* bridge */ /* synthetic */ void h(Object obj, int i10, int i11) {
        ((j04) obj).j((i10 << 3) | 5, Integer.valueOf(i11));
    }

    @Override // com.google.android.gms.internal.ads.i04
    final /* bridge */ /* synthetic */ void i(Object obj, int i10, long j10) {
        ((j04) obj).j((i10 << 3) | 1, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.ads.i04
    final /* bridge */ /* synthetic */ void j(Object obj, int i10, Object obj2) {
        ((j04) obj).j((i10 << 3) | 3, obj2);
    }

    @Override // com.google.android.gms.internal.ads.i04
    final /* bridge */ /* synthetic */ void k(Object obj, int i10, ww3 ww3Var) {
        ((j04) obj).j((i10 << 3) | 2, ww3Var);
    }

    @Override // com.google.android.gms.internal.ads.i04
    final /* bridge */ /* synthetic */ void l(Object obj, int i10, long j10) {
        ((j04) obj).j(i10 << 3, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.ads.i04
    final void m(Object obj) {
        ((by3) obj).zzc.h();
    }

    @Override // com.google.android.gms.internal.ads.i04
    final /* synthetic */ void n(Object obj, Object obj2) {
        ((by3) obj).zzc = (j04) obj2;
    }

    @Override // com.google.android.gms.internal.ads.i04
    final /* synthetic */ void o(Object obj, Object obj2) {
        ((by3) obj).zzc = (j04) obj2;
    }

    @Override // com.google.android.gms.internal.ads.i04
    final boolean q(uz3 uz3Var) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.i04
    final /* synthetic */ void r(Object obj, nx3 nx3Var) {
        ((j04) obj).k(nx3Var);
    }
}
