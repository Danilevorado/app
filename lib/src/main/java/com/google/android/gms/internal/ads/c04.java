package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class c04 extends ww3 {

    /* renamed from: v, reason: collision with root package name */
    static final int[] f6748v = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: q, reason: collision with root package name */
    private final int f6749q;

    /* renamed from: r, reason: collision with root package name */
    private final ww3 f6750r;

    /* renamed from: s, reason: collision with root package name */
    private final ww3 f6751s;

    /* renamed from: t, reason: collision with root package name */
    private final int f6752t;

    /* renamed from: u, reason: collision with root package name */
    private final int f6753u;

    private c04(ww3 ww3Var, ww3 ww3Var2) {
        this.f6750r = ww3Var;
        this.f6751s = ww3Var2;
        int iN = ww3Var.n();
        this.f6752t = iN;
        this.f6749q = iN + ww3Var2.n();
        this.f6753u = Math.max(ww3Var.p(), ww3Var2.p()) + 1;
    }

    static ww3 O(ww3 ww3Var, ww3 ww3Var2) {
        if (ww3Var2.n() == 0) {
            return ww3Var;
        }
        if (ww3Var.n() == 0) {
            return ww3Var2;
        }
        int iN = ww3Var.n() + ww3Var2.n();
        if (iN < 128) {
            return P(ww3Var, ww3Var2);
        }
        if (ww3Var instanceof c04) {
            c04 c04Var = (c04) ww3Var;
            if (c04Var.f6751s.n() + ww3Var2.n() < 128) {
                return new c04(c04Var.f6750r, P(c04Var.f6751s, ww3Var2));
            }
            if (c04Var.f6750r.p() > c04Var.f6751s.p() && c04Var.f6753u > ww3Var2.p()) {
                return new c04(c04Var.f6750r, new c04(c04Var.f6751s, ww3Var2));
            }
        }
        return iN >= Q(Math.max(ww3Var.p(), ww3Var2.p()) + 1) ? new c04(ww3Var, ww3Var2) : yz3.a(new yz3(null), ww3Var, ww3Var2);
    }

    private static ww3 P(ww3 ww3Var, ww3 ww3Var2) {
        int iN = ww3Var.n();
        int iN2 = ww3Var2.n();
        byte[] bArr = new byte[iN + iN2];
        ww3Var.M(bArr, 0, 0, iN);
        ww3Var2.M(bArr, 0, iN, iN2);
        return new sw3(bArr);
    }

    static int Q(int i10) {
        int[] iArr = f6748v;
        int length = iArr.length;
        if (i10 >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i10];
    }

    @Override // com.google.android.gms.internal.ads.ww3
    public final boolean A() {
        int iT = this.f6750r.t(0, 0, this.f6752t);
        ww3 ww3Var = this.f6751s;
        return ww3Var.t(iT, 0, ww3Var.n()) == 0;
    }

    @Override // com.google.android.gms.internal.ads.ww3
    /* renamed from: E */
    public final qw3 iterator() {
        return new vz3(this);
    }

    @Override // com.google.android.gms.internal.ads.ww3
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ww3)) {
            return false;
        }
        ww3 ww3Var = (ww3) obj;
        if (this.f6749q != ww3Var.n()) {
            return false;
        }
        if (this.f6749q == 0) {
            return true;
        }
        int iD = D();
        int iD2 = ww3Var.D();
        if (iD != 0 && iD2 != 0 && iD != iD2) {
            return false;
        }
        zz3 zz3Var = null;
        a04 a04Var = new a04(this, zz3Var);
        rw3 rw3VarB = a04Var.next();
        a04 a04Var2 = new a04(ww3Var, zz3Var);
        rw3 rw3VarB2 = a04Var2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int iN = rw3VarB.n() - i10;
            int iN2 = rw3VarB2.n() - i11;
            int iMin = Math.min(iN, iN2);
            if (!(i10 == 0 ? rw3VarB.N(rw3VarB2, i11, iMin) : rw3VarB2.N(rw3VarB, i10, iMin))) {
                return false;
            }
            i12 += iMin;
            int i13 = this.f6749q;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iN) {
                rw3VarB = a04Var.next();
                i10 = 0;
            } else {
                i10 += iMin;
                rw3VarB = rw3VarB;
            }
            if (iMin == iN2) {
                rw3VarB2 = a04Var2.next();
                i11 = 0;
            } else {
                i11 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ww3
    public final byte h(int i10) {
        ww3.L(i10, this.f6749q);
        return k(i10);
    }

    @Override // com.google.android.gms.internal.ads.ww3, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new vz3(this);
    }

    @Override // com.google.android.gms.internal.ads.ww3
    final byte k(int i10) {
        int i11 = this.f6752t;
        return i10 < i11 ? this.f6750r.k(i10) : this.f6751s.k(i10 - i11);
    }

    @Override // com.google.android.gms.internal.ads.ww3
    public final int n() {
        return this.f6749q;
    }

    @Override // com.google.android.gms.internal.ads.ww3
    protected final void o(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.f6752t;
        if (i13 <= i14) {
            this.f6750r.o(bArr, i10, i11, i12);
        } else {
            if (i10 >= i14) {
                this.f6751s.o(bArr, i10 - i14, i11, i12);
                return;
            }
            int i15 = i14 - i10;
            this.f6750r.o(bArr, i10, i11, i15);
            this.f6751s.o(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    @Override // com.google.android.gms.internal.ads.ww3
    protected final int p() {
        return this.f6753u;
    }

    @Override // com.google.android.gms.internal.ads.ww3
    protected final boolean q() {
        return this.f6749q >= Q(this.f6753u);
    }

    @Override // com.google.android.gms.internal.ads.ww3
    protected final int s(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f6752t;
        if (i13 <= i14) {
            return this.f6750r.s(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f6751s.s(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f6751s.s(this.f6750r.s(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.android.gms.internal.ads.ww3
    protected final int t(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f6752t;
        if (i13 <= i14) {
            return this.f6750r.t(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f6751s.t(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f6751s.t(this.f6750r.t(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.android.gms.internal.ads.ww3
    public final ww3 u(int i10, int i11) {
        int iB = ww3.B(i10, i11, this.f6749q);
        if (iB == 0) {
            return ww3.f17284n;
        }
        if (iB == this.f6749q) {
            return this;
        }
        int i12 = this.f6752t;
        if (i11 <= i12) {
            return this.f6750r.u(i10, i11);
        }
        if (i10 >= i12) {
            return this.f6751s.u(i10 - i12, i11 - i12);
        }
        ww3 ww3Var = this.f6750r;
        return new c04(ww3Var.u(i10, ww3Var.n()), this.f6751s.u(0, i11 - this.f6752t));
    }

    @Override // com.google.android.gms.internal.ads.ww3
    public final fx3 v() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        byte b10 = 0;
        a04 a04Var = new a04(this, null);
        while (a04Var.hasNext()) {
            arrayList.add(a04Var.next().y());
        }
        int i10 = fx3.f8472e;
        int i11 = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            iRemaining += byteBuffer.remaining();
            i11 = byteBuffer.hasArray() ? i11 | 1 : byteBuffer.isDirect() ? i11 | 2 : i11 | 4;
        }
        return i11 == 2 ? new ax3(arrayList, iRemaining, true, b10 == true ? 1 : 0) : fx3.g(new oy3(arrayList), 4096);
    }

    @Override // com.google.android.gms.internal.ads.ww3
    protected final String x(Charset charset) {
        return new String(f(), charset);
    }

    @Override // com.google.android.gms.internal.ads.ww3
    final void z(lw3 lw3Var) {
        this.f6750r.z(lw3Var);
        this.f6751s.z(lw3Var);
    }
}
