package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class nz3 implements d04 {

    /* renamed from: a, reason: collision with root package name */
    private final jz3 f12923a;

    /* renamed from: b, reason: collision with root package name */
    private final i04 f12924b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f12925c;

    /* renamed from: d, reason: collision with root package name */
    private final rx3 f12926d;

    private nz3(i04 i04Var, rx3 rx3Var, jz3 jz3Var) {
        this.f12924b = i04Var;
        this.f12925c = rx3Var.h(jz3Var);
        this.f12926d = rx3Var;
        this.f12923a = jz3Var;
    }

    static nz3 k(i04 i04Var, rx3 rx3Var, jz3 jz3Var) {
        return new nz3(i04Var, rx3Var, jz3Var);
    }

    @Override // com.google.android.gms.internal.ads.d04
    public final int a(Object obj) {
        i04 i04Var = this.f12924b;
        int iB = i04Var.b(i04Var.d(obj));
        if (!this.f12925c) {
            return iB;
        }
        this.f12926d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.d04
    public final int b(Object obj) {
        int iHashCode = this.f12924b.d(obj).hashCode();
        if (!this.f12925c) {
            return iHashCode;
        }
        this.f12926d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.d04
    public final Object c() {
        jz3 jz3Var = this.f12923a;
        return jz3Var instanceof by3 ? ((by3) jz3Var).k() : jz3Var.d().n();
    }

    @Override // com.google.android.gms.internal.ads.d04
    public final void d(Object obj) {
        this.f12924b.m(obj);
        this.f12926d.e(obj);
    }

    @Override // com.google.android.gms.internal.ads.d04
    public final void e(Object obj, Object obj2) {
        f04.d(this.f12924b, obj, obj2);
        if (this.f12925c) {
            this.f12926d.a(obj2);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.d04
    public final boolean f(Object obj, Object obj2) {
        if (!this.f12924b.d(obj).equals(this.f12924b.d(obj2))) {
            return false;
        }
        if (!this.f12925c) {
            return true;
        }
        this.f12926d.a(obj);
        this.f12926d.a(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.d04
    public final boolean g(Object obj) {
        this.f12926d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.d04
    public final void h(Object obj, nx3 nx3Var) {
        this.f12926d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.d04
    public final void i(Object obj, byte[] bArr, int i10, int i11, jw3 jw3Var) {
        by3 by3Var = (by3) obj;
        if (by3Var.zzc == j04.c()) {
            by3Var.zzc = j04.f();
        }
        a5.a.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.d04
    public final void j(Object obj, uz3 uz3Var, qx3 qx3Var) {
        boolean zI;
        i04 i04Var = this.f12924b;
        rx3 rx3Var = this.f12926d;
        Object objC = i04Var.c(obj);
        rx3Var.b(obj);
        while (uz3Var.d() != Integer.MAX_VALUE) {
            try {
                int iF = uz3Var.f();
                if (iF != 11) {
                    if ((iF & 7) == 2) {
                        Object objC2 = rx3Var.c(qx3Var, this.f12923a, iF >>> 3);
                        if (objC2 != null) {
                            rx3Var.f(uz3Var, objC2, qx3Var, null);
                        } else {
                            zI = i04Var.p(objC, uz3Var);
                        }
                    } else {
                        zI = uz3Var.I();
                    }
                    if (!zI) {
                        return;
                    }
                } else {
                    int iJ = 0;
                    Object objC3 = null;
                    ww3 ww3VarO = null;
                    while (uz3Var.d() != Integer.MAX_VALUE) {
                        int iF2 = uz3Var.f();
                        if (iF2 == 16) {
                            iJ = uz3Var.j();
                            objC3 = rx3Var.c(qx3Var, this.f12923a, iJ);
                        } else if (iF2 == 26) {
                            if (objC3 != null) {
                                rx3Var.f(uz3Var, objC3, qx3Var, null);
                            } else {
                                ww3VarO = uz3Var.o();
                            }
                        } else if (!uz3Var.I()) {
                            break;
                        }
                    }
                    if (uz3Var.f() != 12) {
                        throw ny3.b();
                    }
                    if (ww3VarO != null) {
                        if (objC3 != null) {
                            rx3Var.g(ww3VarO, objC3, qx3Var, null);
                        } else {
                            i04Var.k(objC, iJ, ww3VarO);
                        }
                    }
                }
            } finally {
                i04Var.n(obj, objC);
            }
        }
    }
}
