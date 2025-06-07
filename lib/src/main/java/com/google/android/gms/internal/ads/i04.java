package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract class i04 {
    i04() {
    }

    abstract int a(Object obj);

    abstract int b(Object obj);

    abstract Object c(Object obj);

    abstract Object d(Object obj);

    abstract Object e(Object obj, Object obj2);

    abstract Object f();

    abstract Object g(Object obj);

    abstract void h(Object obj, int i10, int i11);

    abstract void i(Object obj, int i10, long j10);

    abstract void j(Object obj, int i10, Object obj2);

    abstract void k(Object obj, int i10, ww3 ww3Var);

    abstract void l(Object obj, int i10, long j10);

    abstract void m(Object obj);

    abstract void n(Object obj, Object obj2);

    abstract void o(Object obj, Object obj2);

    final boolean p(Object obj, uz3 uz3Var) throws ny3 {
        int iF = uz3Var.f();
        int i10 = iF >>> 3;
        int i11 = iF & 7;
        if (i11 == 0) {
            l(obj, i10, uz3Var.l());
            return true;
        }
        if (i11 == 1) {
            i(obj, i10, uz3Var.k());
            return true;
        }
        if (i11 == 2) {
            k(obj, i10, uz3Var.o());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw ny3.a();
            }
            h(obj, i10, uz3Var.e());
            return true;
        }
        Object objF = f();
        int i12 = i10 << 3;
        while (uz3Var.d() != Integer.MAX_VALUE && p(objF, uz3Var)) {
        }
        if ((4 | i12) != uz3Var.f()) {
            throw ny3.b();
        }
        g(objF);
        j(obj, i10, objF);
        return true;
    }

    abstract boolean q(uz3 uz3Var);

    abstract void r(Object obj, nx3 nx3Var);
}
