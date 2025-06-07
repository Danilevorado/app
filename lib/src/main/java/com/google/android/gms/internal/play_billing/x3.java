package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
final class x3 extends v3 {
    x3() {
    }

    @Override // com.google.android.gms.internal.play_billing.v3
    final /* synthetic */ int a(Object obj) {
        return ((w3) obj).a();
    }

    @Override // com.google.android.gms.internal.play_billing.v3
    final /* synthetic */ int b(Object obj) {
        return ((w3) obj).b();
    }

    @Override // com.google.android.gms.internal.play_billing.v3
    final /* bridge */ /* synthetic */ Object c(Object obj) {
        n1 n1Var = (n1) obj;
        w3 w3Var = n1Var.zzc;
        if (w3Var != w3.c()) {
            return w3Var;
        }
        w3 w3VarF = w3.f();
        n1Var.zzc = w3VarF;
        return w3VarF;
    }

    @Override // com.google.android.gms.internal.play_billing.v3
    final /* synthetic */ Object d(Object obj) {
        return ((n1) obj).zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.v3
    final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2) {
        if (w3.c().equals(obj2)) {
            return obj;
        }
        w3 w3Var = (w3) obj2;
        if (w3.c().equals(obj)) {
            return w3.e((w3) obj, w3Var);
        }
        ((w3) obj).d(w3Var);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.v3
    final /* bridge */ /* synthetic */ void f(Object obj, int i10, long j10) {
        ((w3) obj).j(i10 << 3, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.play_billing.v3
    final void g(Object obj) {
        ((n1) obj).zzc.h();
    }

    @Override // com.google.android.gms.internal.play_billing.v3
    final /* synthetic */ void h(Object obj, Object obj2) {
        ((n1) obj).zzc = (w3) obj2;
    }

    @Override // com.google.android.gms.internal.play_billing.v3
    final /* synthetic */ void i(Object obj, n4 n4Var) {
        ((w3) obj).k(n4Var);
    }

    @Override // com.google.android.gms.internal.play_billing.v3
    final /* synthetic */ void j(Object obj, n4 n4Var) {
        ((w3) obj).l(n4Var);
    }
}
