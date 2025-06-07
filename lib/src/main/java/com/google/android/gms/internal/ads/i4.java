package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
final class i4 implements k4 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f9528a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque f9529b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private final r4 f9530c = new r4();

    /* renamed from: d, reason: collision with root package name */
    private j4 f9531d;

    /* renamed from: e, reason: collision with root package name */
    private int f9532e;

    /* renamed from: f, reason: collision with root package name */
    private int f9533f;

    /* renamed from: g, reason: collision with root package name */
    private long f9534g;

    private final long a(l lVar, int i10) throws EOFException, InterruptedIOException {
        ((bo4) lVar).C(this.f9528a, 0, i10, false);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (this.f9528a[i11] & 255);
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.k4
    public final void b() {
        this.f9532e = 0;
        this.f9529b.clear();
        this.f9530c.e();
    }

    @Override // com.google.android.gms.internal.ads.k4
    public final void c(j4 j4Var) {
        this.f9531d = j4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2 A[LOOP:0: B:3:0x0005->B:36:0x00b2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016b A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.k4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(com.google.android.gms.internal.ads.l r14) throws com.google.android.gms.internal.ads.oh0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i4.d(com.google.android.gms.internal.ads.l):boolean");
    }
}
