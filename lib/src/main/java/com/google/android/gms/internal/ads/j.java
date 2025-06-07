package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class j implements s0 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f10231a = new byte[4096];

    @Override // com.google.android.gms.internal.ads.s0
    public final /* synthetic */ void a(jm2 jm2Var, int i10) {
        q0.b(this, jm2Var, i10);
    }

    @Override // com.google.android.gms.internal.ads.s0
    public final void b(k9 k9Var) {
    }

    @Override // com.google.android.gms.internal.ads.s0
    public final int c(bh4 bh4Var, int i10, boolean z10, int i11) throws EOFException {
        int iZ = bh4Var.z(this.f10231a, 0, Math.min(4096, i10));
        if (iZ != -1) {
            return iZ;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.s0
    public final void d(jm2 jm2Var, int i10, int i11) {
        jm2Var.g(i10);
    }

    @Override // com.google.android.gms.internal.ads.s0
    public final void e(long j10, int i10, int i11, int i12, r0 r0Var) {
    }

    @Override // com.google.android.gms.internal.ads.s0
    public final /* synthetic */ int f(bh4 bh4Var, int i10, boolean z10) {
        return q0.a(this, bh4Var, i10, z10);
    }
}
