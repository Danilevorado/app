package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class bo4 implements l {

    /* renamed from: b, reason: collision with root package name */
    private final bh4 f6605b;

    /* renamed from: c, reason: collision with root package name */
    private final long f6606c;

    /* renamed from: d, reason: collision with root package name */
    private long f6607d;

    /* renamed from: f, reason: collision with root package name */
    private int f6609f;

    /* renamed from: g, reason: collision with root package name */
    private int f6610g;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f6608e = new byte[65536];

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f6604a = new byte[4096];

    static {
        u40.b("media3.extractor");
    }

    public bo4(bh4 bh4Var, long j10, long j11) {
        this.f6605b = bh4Var;
        this.f6607d = j10;
        this.f6606c = j11;
    }

    private final int i(byte[] bArr, int i10, int i11) {
        int i12 = this.f6610g;
        if (i12 == 0) {
            return 0;
        }
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f6608e, 0, bArr, i10, iMin);
        o(iMin);
        return iMin;
    }

    private final int k(byte[] bArr, int i10, int i11, int i12, boolean z10) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iZ = this.f6605b.z(bArr, i10 + i12, i11 - i12);
        if (iZ != -1) {
            return i12 + iZ;
        }
        if (i12 == 0 && z10) {
            return -1;
        }
        throw new EOFException();
    }

    private final int l(int i10) {
        int iMin = Math.min(this.f6610g, i10);
        o(iMin);
        return iMin;
    }

    private final void m(int i10) {
        if (i10 != -1) {
            this.f6607d += i10;
        }
    }

    private final void n(int i10) {
        int i11 = this.f6609f + i10;
        int length = this.f6608e.length;
        if (i11 > length) {
            this.f6608e = Arrays.copyOf(this.f6608e, Math.max(65536 + i11, Math.min(length + length, i11 + 524288)));
        }
    }

    private final void o(int i10) {
        int i11 = this.f6610g - i10;
        this.f6610g = i11;
        this.f6609f = 0;
        byte[] bArr = this.f6608e;
        byte[] bArr2 = i11 < bArr.length + (-524288) ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f6608e = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.l
    public final void A(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        C(bArr, i10, i11, false);
    }

    @Override // com.google.android.gms.internal.ads.l
    public final void B(byte[] bArr, int i10, int i11) {
        E(bArr, i10, i11, false);
    }

    @Override // com.google.android.gms.internal.ads.l
    public final boolean C(byte[] bArr, int i10, int i11, boolean z10) throws EOFException, InterruptedIOException {
        int i12 = i(bArr, i10, i11);
        while (i12 < i11 && i12 != -1) {
            i12 = k(bArr, i10, i11, i12, z10);
        }
        m(i12);
        return i12 != -1;
    }

    @Override // com.google.android.gms.internal.ads.l
    public final int D(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        int iMin;
        n(i11);
        int i12 = this.f6610g;
        int i13 = this.f6609f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            iMin = k(this.f6608e, i13, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.f6610g += iMin;
        } else {
            iMin = Math.min(i11, i14);
        }
        System.arraycopy(this.f6608e, this.f6609f, bArr, i10, iMin);
        this.f6609f += iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.l
    public final boolean E(byte[] bArr, int i10, int i11, boolean z10) {
        if (!g(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f6608e, this.f6609f - i11, bArr, i10, i11);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.l
    public final long c() {
        return this.f6607d + this.f6609f;
    }

    @Override // com.google.android.gms.internal.ads.l
    public final long e() {
        return this.f6607d;
    }

    @Override // com.google.android.gms.internal.ads.l
    public final long f() {
        return this.f6606c;
    }

    public final boolean g(int i10, boolean z10) throws EOFException, InterruptedIOException {
        n(i10);
        int iK = this.f6610g - this.f6609f;
        while (iK < i10) {
            iK = k(this.f6608e, this.f6609f, i10, iK, z10);
            if (iK == -1) {
                return false;
            }
            this.f6610g = this.f6609f + iK;
        }
        this.f6609f += i10;
        return true;
    }

    public final boolean h(int i10, boolean z10) throws EOFException, InterruptedIOException {
        int iL = l(i10);
        while (iL < i10 && iL != -1) {
            iL = k(this.f6604a, -iL, Math.min(i10, iL + 4096), iL, false);
        }
        m(iL);
        return iL != -1;
    }

    @Override // com.google.android.gms.internal.ads.l
    public final void j() {
        this.f6609f = 0;
    }

    @Override // com.google.android.gms.internal.ads.l
    public final void w(int i10) throws EOFException, InterruptedIOException {
        g(i10, false);
    }

    @Override // com.google.android.gms.internal.ads.l
    public final void x(int i10) throws EOFException, InterruptedIOException {
        h(i10, false);
    }

    @Override // com.google.android.gms.internal.ads.l
    public final int y(int i10) throws EOFException, InterruptedIOException {
        int iL = l(1);
        if (iL == 0) {
            iL = k(this.f6604a, 0, Math.min(1, 4096), 0, true);
        }
        m(iL);
        return iL;
    }

    @Override // com.google.android.gms.internal.ads.l, com.google.android.gms.internal.ads.bh4
    public final int z(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        int i12 = i(bArr, i10, i11);
        if (i12 == 0) {
            i12 = k(bArr, i10, i11, 0, true);
        }
        m(i12);
        return i12;
    }
}
