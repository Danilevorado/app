package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final int f17309a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17310b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17311c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17312d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17313e;

    /* renamed from: f, reason: collision with root package name */
    public final int f17314f;

    /* renamed from: g, reason: collision with root package name */
    public final int f17315g;

    /* renamed from: h, reason: collision with root package name */
    public final int f17316h;

    /* renamed from: i, reason: collision with root package name */
    public final int f17317i;

    /* renamed from: j, reason: collision with root package name */
    public final long f17318j;

    /* renamed from: k, reason: collision with root package name */
    public final w f17319k;

    /* renamed from: l, reason: collision with root package name */
    private final ld0 f17320l;

    private x(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, w wVar, ld0 ld0Var) {
        this.f17309a = i10;
        this.f17310b = i11;
        this.f17311c = i12;
        this.f17312d = i13;
        this.f17313e = i14;
        this.f17314f = i(i14);
        this.f17315g = i15;
        this.f17316h = i16;
        this.f17317i = h(i16);
        this.f17318j = j10;
        this.f17319k = wVar;
        this.f17320l = ld0Var;
    }

    public x(byte[] bArr, int i10) {
        il2 il2Var = new il2(bArr, bArr.length);
        il2Var.j(i10 * 8);
        this.f17309a = il2Var.d(16);
        this.f17310b = il2Var.d(16);
        this.f17311c = il2Var.d(24);
        this.f17312d = il2Var.d(24);
        int iD = il2Var.d(20);
        this.f17313e = iD;
        this.f17314f = i(iD);
        this.f17315g = il2Var.d(3) + 1;
        int iD2 = il2Var.d(5) + 1;
        this.f17316h = iD2;
        this.f17317i = h(iD2);
        int iD3 = il2Var.d(4);
        int iD4 = il2Var.d(32);
        int i11 = sv2.f15560a;
        this.f17318j = ((iD3 & 4294967295L) << 32) | (iD4 & 4294967295L);
        this.f17319k = null;
        this.f17320l = null;
    }

    private static int h(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 != 20) {
            return i10 != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int i(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long a() {
        long j10 = this.f17318j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / this.f17313e;
    }

    public final long b(long j10) {
        return Math.max(0L, Math.min((j10 * this.f17313e) / 1000000, this.f17318j - 1));
    }

    public final k9 c(byte[] bArr, ld0 ld0Var) {
        bArr[4] = Byte.MIN_VALUE;
        int i10 = this.f17312d;
        if (i10 <= 0) {
            i10 = -1;
        }
        ld0 ld0VarD = d(ld0Var);
        i7 i7Var = new i7();
        i7Var.s("audio/flac");
        i7Var.l(i10);
        i7Var.e0(this.f17315g);
        i7Var.t(this.f17313e);
        i7Var.i(Collections.singletonList(bArr));
        i7Var.m(ld0VarD);
        return i7Var.y();
    }

    public final ld0 d(ld0 ld0Var) {
        ld0 ld0Var2 = this.f17320l;
        return ld0Var2 == null ? ld0Var : ld0Var2.d(ld0Var);
    }

    public final x e(List list) {
        return new x(this.f17309a, this.f17310b, this.f17311c, this.f17312d, this.f17313e, this.f17315g, this.f17316h, this.f17318j, this.f17319k, d(new ld0(list)));
    }

    public final x f(w wVar) {
        return new x(this.f17309a, this.f17310b, this.f17311c, this.f17312d, this.f17313e, this.f17315g, this.f17316h, this.f17318j, wVar, this.f17320l);
    }

    public final x g(List list) {
        return new x(this.f17309a, this.f17310b, this.f17311c, this.f17312d, this.f17313e, this.f17315g, this.f17316h, this.f17318j, this.f17319k, d(y0.b(list)));
    }
}
