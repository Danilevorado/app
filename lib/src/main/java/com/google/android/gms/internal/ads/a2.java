package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a2 implements k {

    /* renamed from: b, reason: collision with root package name */
    private n f5913b;

    /* renamed from: c, reason: collision with root package name */
    private int f5914c;

    /* renamed from: d, reason: collision with root package name */
    private int f5915d;

    /* renamed from: e, reason: collision with root package name */
    private int f5916e;

    /* renamed from: g, reason: collision with root package name */
    private z3 f5918g;

    /* renamed from: h, reason: collision with root package name */
    private l f5919h;

    /* renamed from: i, reason: collision with root package name */
    private d2 f5920i;

    /* renamed from: j, reason: collision with root package name */
    private x5 f5921j;

    /* renamed from: a, reason: collision with root package name */
    private final jm2 f5912a = new jm2(6);

    /* renamed from: f, reason: collision with root package name */
    private long f5917f = -1;

    private final int b(l lVar) {
        this.f5912a.c(2);
        ((bo4) lVar).E(this.f5912a.h(), 0, 2, false);
        return this.f5912a.w();
    }

    private final void c() {
        g(new kc0[0]);
        n nVar = this.f5913b;
        Objects.requireNonNull(nVar);
        nVar.Q();
        this.f5913b.R(new n0(-9223372036854775807L, 0L));
        this.f5914c = 6;
    }

    private final void g(kc0... kc0VarArr) {
        n nVar = this.f5913b;
        Objects.requireNonNull(nVar);
        s0 s0VarS = nVar.S(1024, 4);
        i7 i7Var = new i7();
        i7Var.h0("image/jpeg");
        i7Var.m(new ld0(-9223372036854775807L, kc0VarArr));
        s0VarS.b(i7Var.y());
    }

    @Override // com.google.android.gms.internal.ads.k
    public final boolean a(l lVar) throws EOFException, InterruptedIOException {
        if (b(lVar) != 65496) {
            return false;
        }
        int iB = b(lVar);
        this.f5915d = iB;
        if (iB == 65504) {
            this.f5912a.c(2);
            bo4 bo4Var = (bo4) lVar;
            bo4Var.E(this.f5912a.h(), 0, 2, false);
            bo4Var.g(this.f5912a.w() - 2, false);
            iB = b(lVar);
            this.f5915d = iB;
        }
        if (iB == 65505) {
            bo4 bo4Var2 = (bo4) lVar;
            bo4Var2.g(2, false);
            this.f5912a.c(6);
            bo4Var2.E(this.f5912a.h(), 0, 6, false);
            if (this.f5912a.A() == 1165519206 && this.f5912a.w() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.k
    public final void d(n nVar) {
        this.f5913b = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e0  */
    @Override // com.google.android.gms.internal.ads.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(com.google.android.gms.internal.ads.l r24, com.google.android.gms.internal.ads.l0 r25) throws com.google.android.gms.internal.ads.oh0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a2.e(com.google.android.gms.internal.ads.l, com.google.android.gms.internal.ads.l0):int");
    }

    @Override // com.google.android.gms.internal.ads.k
    public final void f(long j10, long j11) {
        if (j10 == 0) {
            this.f5914c = 0;
            this.f5921j = null;
        } else if (this.f5914c == 5) {
            x5 x5Var = this.f5921j;
            Objects.requireNonNull(x5Var);
            x5Var.f(j10, j11);
        }
    }
}
