package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class w83 extends q83 {
    /* synthetic */ w83(d93 d93Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.q83
    final t83 a(b93 b93Var, t83 t83Var) {
        t83 t83Var2;
        synchronized (b93Var) {
            t83Var2 = b93Var.f6401n;
            if (t83Var2 != t83Var) {
                b93Var.f6401n = t83Var;
            }
        }
        return t83Var2;
    }

    @Override // com.google.android.gms.internal.ads.q83
    final a93 b(b93 b93Var, a93 a93Var) {
        a93 a93Var2;
        synchronized (b93Var) {
            a93Var2 = b93Var.f6402o;
            if (a93Var2 != a93Var) {
                b93Var.f6402o = a93Var;
            }
        }
        return a93Var2;
    }

    @Override // com.google.android.gms.internal.ads.q83
    final void c(a93 a93Var, a93 a93Var2) {
        a93Var.f6015b = a93Var2;
    }

    @Override // com.google.android.gms.internal.ads.q83
    final void d(a93 a93Var, Thread thread) {
        a93Var.f6014a = thread;
    }

    @Override // com.google.android.gms.internal.ads.q83
    final boolean e(b93 b93Var, t83 t83Var, t83 t83Var2) {
        synchronized (b93Var) {
            if (b93Var.f6401n != t83Var) {
                return false;
            }
            b93Var.f6401n = t83Var2;
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.q83
    final boolean f(b93 b93Var, Object obj, Object obj2) {
        synchronized (b93Var) {
            if (b93Var.f6400m != obj) {
                return false;
            }
            b93Var.f6400m = obj2;
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.q83
    final boolean g(b93 b93Var, a93 a93Var, a93 a93Var2) {
        synchronized (b93Var) {
            if (b93Var.f6402o != a93Var) {
                return false;
            }
            b93Var.f6402o = a93Var2;
            return true;
        }
    }
}
