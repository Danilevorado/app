package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class mx3 extends lw3 {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f12289b = Logger.getLogger(mx3.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f12290c = t04.a();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f12291d = 0;

    /* renamed from: a, reason: collision with root package name */
    nx3 f12292a;

    /* synthetic */ mx3(lx3 lx3Var) {
    }

    public static int A(int i10) {
        if (i10 >= 0) {
            return b(i10);
        }
        return 10;
    }

    static int B(jz3 jz3Var, d04 d04Var) {
        int iE = ((gw3) jz3Var).e(d04Var);
        return b(iE) + iE;
    }

    public static int C(String str) {
        int length;
        try {
            length = y04.e(str);
        } catch (x04 unused) {
            length = str.getBytes(ly3.f11869b).length;
        }
        return b(length) + length;
    }

    public static int b(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int c(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            i10 = 6;
            j10 >>>= 28;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            j10 >>>= 14;
            i10 += 2;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static mx3 d(byte[] bArr, int i10, int i11) {
        return new ix3(bArr, 0, i11);
    }

    static int z(int i10, jz3 jz3Var, d04 d04Var) {
        int iE = ((gw3) jz3Var).e(d04Var);
        int iB = b(i10 << 3);
        return iB + iB + iE;
    }

    @Override // com.google.android.gms.internal.ads.lw3
    public abstract void a(byte[] bArr, int i10, int i11);

    public final void e() {
        if (l() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void f(String str, x04 x04Var) throws jx3 {
        f12289b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) x04Var);
        byte[] bytes = str.getBytes(ly3.f11869b);
        try {
            int length = bytes.length;
            w(length);
            a(bytes, 0, length);
        } catch (IndexOutOfBoundsException e5) {
            throw new jx3(e5);
        }
    }

    public abstract void h();

    public abstract void i(byte b10);

    public abstract void j(int i10, boolean z10);

    public abstract void k(int i10, ww3 ww3Var);

    public abstract int l();

    public abstract void m(int i10, int i11);

    public abstract void n(int i10);

    public abstract void o(int i10, long j10);

    public abstract void p(long j10);

    public abstract void q(int i10, int i11);

    public abstract void r(int i10);

    abstract void s(int i10, jz3 jz3Var, d04 d04Var);

    public abstract void t(int i10, String str);

    public abstract void u(int i10, int i11);

    public abstract void v(int i10, int i11);

    public abstract void w(int i10);

    public abstract void x(int i10, long j10);

    public abstract void y(long j10);
}
