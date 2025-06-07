package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
final class qi4 {

    /* renamed from: a, reason: collision with root package name */
    private final jm2 f14347a = new jm2(32);

    /* renamed from: b, reason: collision with root package name */
    private pi4 f14348b;

    /* renamed from: c, reason: collision with root package name */
    private pi4 f14349c;

    /* renamed from: d, reason: collision with root package name */
    private pi4 f14350d;

    /* renamed from: e, reason: collision with root package name */
    private long f14351e;

    /* renamed from: f, reason: collision with root package name */
    private final hl4 f14352f;

    public qi4(hl4 hl4Var) {
        this.f14352f = hl4Var;
        pi4 pi4Var = new pi4(0L, 65536);
        this.f14348b = pi4Var;
        this.f14349c = pi4Var;
        this.f14350d = pi4Var;
    }

    private final int i(int i10) {
        pi4 pi4Var = this.f14350d;
        if (pi4Var.f13906c == null) {
            zk4 zk4VarB = this.f14352f.b();
            pi4 pi4Var2 = new pi4(this.f14350d.f13905b, 65536);
            pi4Var.f13906c = zk4VarB;
            pi4Var.f13907d = pi4Var2;
        }
        return Math.min(i10, (int) (this.f14350d.f13905b - this.f14351e));
    }

    private static pi4 j(pi4 pi4Var, long j10) {
        while (j10 >= pi4Var.f13905b) {
            pi4Var = pi4Var.f13907d;
        }
        return pi4Var;
    }

    private static pi4 k(pi4 pi4Var, long j10, ByteBuffer byteBuffer, int i10) {
        pi4 pi4VarJ = j(pi4Var, j10);
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (pi4VarJ.f13905b - j10));
            byteBuffer.put(pi4VarJ.f13906c.f18620a, pi4VarJ.a(j10), iMin);
            i10 -= iMin;
            j10 += iMin;
            if (j10 == pi4VarJ.f13905b) {
                pi4VarJ = pi4VarJ.f13907d;
            }
        }
        return pi4VarJ;
    }

    private static pi4 l(pi4 pi4Var, long j10, byte[] bArr, int i10) {
        pi4 pi4VarJ = j(pi4Var, j10);
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (pi4VarJ.f13905b - j10));
            System.arraycopy(pi4VarJ.f13906c.f18620a, pi4VarJ.a(j10), bArr, i10 - i11, iMin);
            i11 -= iMin;
            j10 += iMin;
            if (j10 == pi4VarJ.f13905b) {
                pi4VarJ = pi4VarJ.f13907d;
            }
        }
        return pi4VarJ;
    }

    private static pi4 m(pi4 pi4Var, w44 w44Var, si4 si4Var, jm2 jm2Var) {
        pi4 pi4VarL;
        if (w44Var.k()) {
            long j10 = si4Var.f15283b;
            int iW = 1;
            jm2Var.c(1);
            pi4 pi4VarL2 = l(pi4Var, j10, jm2Var.h(), 1);
            long j11 = j10 + 1;
            byte b10 = jm2Var.h()[0];
            int i10 = b10 & 128;
            int i11 = b10 & Byte.MAX_VALUE;
            n44 n44Var = w44Var.f16974b;
            byte[] bArr = n44Var.f12413a;
            if (bArr == null) {
                n44Var.f12413a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z10 = i10 != 0;
            pi4VarL = l(pi4VarL2, j11, n44Var.f12413a, i11);
            long j12 = j11 + i11;
            if (z10) {
                jm2Var.c(2);
                pi4VarL = l(pi4VarL, j12, jm2Var.h(), 2);
                j12 += 2;
                iW = jm2Var.w();
            }
            int i12 = iW;
            int[] iArr = n44Var.f12416d;
            if (iArr == null || iArr.length < i12) {
                iArr = new int[i12];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = n44Var.f12417e;
            if (iArr3 == null || iArr3.length < i12) {
                iArr3 = new int[i12];
            }
            int[] iArr4 = iArr3;
            if (z10) {
                int i13 = i12 * 6;
                jm2Var.c(i13);
                pi4VarL = l(pi4VarL, j12, jm2Var.h(), i13);
                j12 += i13;
                jm2Var.f(0);
                for (int i14 = 0; i14 < i12; i14++) {
                    iArr2[i14] = jm2Var.w();
                    iArr4[i14] = jm2Var.v();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = si4Var.f15282a - ((int) (j12 - si4Var.f15283b));
            }
            r0 r0Var = si4Var.f15284c;
            int i15 = sv2.f15560a;
            n44Var.c(i12, iArr2, iArr4, r0Var.f14562b, n44Var.f12413a, r0Var.f14561a, r0Var.f14563c, r0Var.f14564d);
            long j13 = si4Var.f15283b;
            int i16 = (int) (j12 - j13);
            si4Var.f15283b = j13 + i16;
            si4Var.f15282a -= i16;
        } else {
            pi4VarL = pi4Var;
        }
        if (!w44Var.e()) {
            w44Var.i(si4Var.f15282a);
            return k(pi4VarL, si4Var.f15283b, w44Var.f16975c, si4Var.f15282a);
        }
        jm2Var.c(4);
        pi4 pi4VarL3 = l(pi4VarL, si4Var.f15283b, jm2Var.h(), 4);
        int iV = jm2Var.v();
        si4Var.f15283b += 4;
        si4Var.f15282a -= 4;
        w44Var.i(iV);
        pi4 pi4VarK = k(pi4VarL3, si4Var.f15283b, w44Var.f16975c, iV);
        si4Var.f15283b += iV;
        int i17 = si4Var.f15282a - iV;
        si4Var.f15282a = i17;
        ByteBuffer byteBuffer = w44Var.f16978f;
        if (byteBuffer == null || byteBuffer.capacity() < i17) {
            w44Var.f16978f = ByteBuffer.allocate(i17);
        } else {
            w44Var.f16978f.clear();
        }
        return k(pi4VarK, si4Var.f15283b, w44Var.f16978f, si4Var.f15282a);
    }

    private final void n(int i10) {
        long j10 = this.f14351e + i10;
        this.f14351e = j10;
        pi4 pi4Var = this.f14350d;
        if (j10 == pi4Var.f13905b) {
            this.f14350d = pi4Var.f13907d;
        }
    }

    public final int a(bh4 bh4Var, int i10, boolean z10) throws EOFException {
        int i11 = i(i10);
        pi4 pi4Var = this.f14350d;
        int iZ = bh4Var.z(pi4Var.f13906c.f18620a, pi4Var.a(this.f14351e), i11);
        if (iZ != -1) {
            n(iZ);
            return iZ;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    public final long b() {
        return this.f14351e;
    }

    public final void c(long j10) {
        pi4 pi4Var;
        if (j10 != -1) {
            while (true) {
                pi4Var = this.f14348b;
                if (j10 < pi4Var.f13905b) {
                    break;
                }
                this.f14352f.c(pi4Var.f13906c);
                this.f14348b = this.f14348b.b();
            }
            if (this.f14349c.f13904a < pi4Var.f13904a) {
                this.f14349c = pi4Var;
            }
        }
    }

    public final void d(w44 w44Var, si4 si4Var) {
        m(this.f14349c, w44Var, si4Var, this.f14347a);
    }

    public final void e(w44 w44Var, si4 si4Var) {
        this.f14349c = m(this.f14349c, w44Var, si4Var, this.f14347a);
    }

    public final void f() {
        pi4 pi4Var = this.f14348b;
        if (pi4Var.f13906c != null) {
            this.f14352f.d(pi4Var);
            pi4Var.b();
        }
        this.f14348b.c(0L, 65536);
        pi4 pi4Var2 = this.f14348b;
        this.f14349c = pi4Var2;
        this.f14350d = pi4Var2;
        this.f14351e = 0L;
        this.f14352f.g();
    }

    public final void g() {
        this.f14349c = this.f14348b;
    }

    public final void h(jm2 jm2Var, int i10) {
        while (i10 > 0) {
            int i11 = i(i10);
            pi4 pi4Var = this.f14350d;
            jm2Var.b(pi4Var.f13906c.f18620a, pi4Var.a(this.f14351e), i11);
            i10 -= i11;
            n(i11);
        }
    }
}
