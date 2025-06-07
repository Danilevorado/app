package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class yx3 extends fw3 {

    /* renamed from: m, reason: collision with root package name */
    private final by3 f18314m;

    /* renamed from: n, reason: collision with root package name */
    protected by3 f18315n;

    protected yx3(by3 by3Var) {
        this.f18314m = by3Var;
        if (by3Var.E()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f18315n = by3Var.k();
    }

    private static void g(Object obj, Object obj2) {
        rz3.a().b(obj.getClass()).e(obj, obj2);
    }

    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final yx3 clone() {
        yx3 yx3Var = (yx3) this.f18314m.H(5, null, null);
        yx3Var.f18315n = n();
        return yx3Var;
    }

    public final yx3 j(by3 by3Var) {
        if (!this.f18314m.equals(by3Var)) {
            if (!this.f18315n.E()) {
                t();
            }
            g(this.f18315n, by3Var);
        }
        return this;
    }

    public final yx3 k(byte[] bArr, int i10, int i11, qx3 qx3Var) throws ny3 {
        if (!this.f18315n.E()) {
            t();
        }
        try {
            rz3.a().b(this.f18315n.getClass()).i(this.f18315n, bArr, 0, i11, new jw3(qx3Var));
            return this;
        } catch (ny3 e5) {
            throw e5;
        } catch (IOException e10) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e10);
        } catch (IndexOutOfBoundsException unused) {
            throw ny3.k();
        }
    }

    public final by3 m() {
        by3 by3VarN = n();
        if (by3VarN.D()) {
            return by3VarN;
        }
        throw new h04(by3VarN);
    }

    @Override // com.google.android.gms.internal.ads.iz3
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public by3 n() {
        if (!this.f18315n.E()) {
            return this.f18315n;
        }
        this.f18315n.z();
        return this.f18315n;
    }

    protected final void s() {
        if (this.f18315n.E()) {
            return;
        }
        t();
    }

    protected void t() {
        by3 by3VarK = this.f18314m.k();
        g(by3VarK, this.f18315n);
        this.f18315n = by3VarK;
    }
}
