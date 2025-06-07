package com.google.android.gms.internal.measurement;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class f8 extends m7 {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f18943b = Logger.getLogger(f8.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f18944c = za.C();

    /* renamed from: a, reason: collision with root package name */
    g8 f18945a;

    /* synthetic */ f8(e8 e8Var) {
    }

    static int A(y9 y9Var, ja jaVar) {
        h7 h7Var = (h7) y9Var;
        int iB = h7Var.b();
        if (iB == -1) {
            iB = jaVar.a(h7Var);
            h7Var.d(iB);
        }
        return a(iB) + iB;
    }

    public static int B(String str) {
        int length;
        try {
            length = fb.c(str);
        } catch (eb unused) {
            length = str.getBytes(b9.f18840b).length;
        }
        return a(length) + length;
    }

    public static int C(int i10) {
        return a(i10 << 3);
    }

    public static int a(int i10) {
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

    public static int b(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static f8 c(byte[] bArr) {
        return new c8(bArr, 0, bArr.length);
    }

    public static int x(x7 x7Var) {
        int iH = x7Var.h();
        return a(iH) + iH;
    }

    static int y(int i10, y9 y9Var, ja jaVar) {
        int iA = a(i10 << 3);
        int i11 = iA + iA;
        h7 h7Var = (h7) y9Var;
        int iB = h7Var.b();
        if (iB == -1) {
            iB = jaVar.a(h7Var);
            h7Var.d(iB);
        }
        return i11 + iB;
    }

    public static int z(int i10) {
        if (i10 >= 0) {
            return a(i10);
        }
        return 10;
    }

    public final void d() {
        if (g() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void e(String str, eb ebVar) throws d8 {
        f18943b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) ebVar);
        byte[] bytes = str.getBytes(b9.f18840b);
        try {
            int length = bytes.length;
            u(length);
            q(bytes, 0, length);
        } catch (IndexOutOfBoundsException e5) {
            throw new d8(e5);
        }
    }

    public abstract int g();

    public abstract void h(byte b10);

    public abstract void i(int i10, boolean z10);

    public abstract void j(int i10, x7 x7Var);

    public abstract void k(int i10, int i11);

    public abstract void l(int i10);

    public abstract void m(int i10, long j10);

    public abstract void n(long j10);

    public abstract void o(int i10, int i11);

    public abstract void p(int i10);

    public abstract void q(byte[] bArr, int i10, int i11);

    public abstract void r(int i10, String str);

    public abstract void s(int i10, int i11);

    public abstract void t(int i10, int i11);

    public abstract void u(int i10);

    public abstract void v(int i10, long j10);

    public abstract void w(long j10);
}
