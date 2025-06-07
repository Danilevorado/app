package com.google.android.gms.internal.play_billing;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class y0 extends f0 {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f19688b = Logger.getLogger(y0.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f19689c = f4.C();

    /* renamed from: a, reason: collision with root package name */
    z0 f19690a;

    /* synthetic */ y0(x0 x0Var) {
    }

    static int t(int i10, u2 u2Var, f3 f3Var) {
        int iW = w(i10 << 3);
        return iW + iW + ((z) u2Var).b(f3Var);
    }

    static int u(u2 u2Var, f3 f3Var) {
        int iB = ((z) u2Var).b(f3Var);
        return w(iB) + iB;
    }

    public static int v(String str) {
        int length;
        try {
            length = k4.c(str);
        } catch (j4 unused) {
            length = str.getBytes(v1.f19659b).length;
        }
        return w(length) + length;
    }

    public static int w(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int x(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static y0 y(byte[] bArr, int i10, int i11) {
        return new v0(bArr, 0, i11);
    }

    final void a(String str, j4 j4Var) throws w0 {
        f19688b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) j4Var);
        byte[] bytes = str.getBytes(v1.f19659b);
        try {
            int length = bytes.length;
            q(length);
            m(bytes, 0, length);
        } catch (IndexOutOfBoundsException e5) {
            throw new w0(e5);
        }
    }

    public abstract int c();

    public abstract void d(byte b10);

    public abstract void e(int i10, boolean z10);

    public abstract void f(int i10, q0 q0Var);

    public abstract void g(int i10, int i11);

    public abstract void h(int i10);

    public abstract void i(int i10, long j10);

    public abstract void j(long j10);

    public abstract void k(int i10, int i11);

    public abstract void l(int i10);

    public abstract void m(byte[] bArr, int i10, int i11);

    public abstract void n(int i10, String str);

    public abstract void o(int i10, int i11);

    public abstract void p(int i10, int i11);

    public abstract void q(int i10);

    public abstract void r(int i10, long j10);

    public abstract void s(long j10);

    public final void z() {
        if (c() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }
}
