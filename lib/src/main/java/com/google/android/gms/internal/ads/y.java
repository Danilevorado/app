package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public abstract class y implements l {

    /* renamed from: a, reason: collision with root package name */
    private final l f17843a;

    public y(l lVar) {
        this.f17843a = lVar;
    }

    @Override // com.google.android.gms.internal.ads.l
    public final void A(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        ((bo4) this.f17843a).C(bArr, i10, i11, false);
    }

    @Override // com.google.android.gms.internal.ads.l
    public final void B(byte[] bArr, int i10, int i11) {
        ((bo4) this.f17843a).E(bArr, i10, i11, false);
    }

    @Override // com.google.android.gms.internal.ads.l
    public final boolean C(byte[] bArr, int i10, int i11, boolean z10) {
        return this.f17843a.C(bArr, 0, 8, true);
    }

    @Override // com.google.android.gms.internal.ads.l
    public final int D(byte[] bArr, int i10, int i11) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.l
    public final boolean E(byte[] bArr, int i10, int i11, boolean z10) {
        return this.f17843a.E(bArr, 0, 8, true);
    }

    @Override // com.google.android.gms.internal.ads.l
    public long c() {
        return this.f17843a.c();
    }

    @Override // com.google.android.gms.internal.ads.l
    public long e() {
        return this.f17843a.e();
    }

    @Override // com.google.android.gms.internal.ads.l
    public long f() {
        return this.f17843a.f();
    }

    @Override // com.google.android.gms.internal.ads.l
    public final void j() {
        this.f17843a.j();
    }

    @Override // com.google.android.gms.internal.ads.l
    public final void w(int i10) throws EOFException, InterruptedIOException {
        ((bo4) this.f17843a).g(i10, false);
    }

    @Override // com.google.android.gms.internal.ads.l
    public final void x(int i10) throws EOFException, InterruptedIOException {
        ((bo4) this.f17843a).h(i10, false);
    }

    @Override // com.google.android.gms.internal.ads.l
    public final int y(int i10) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.l, com.google.android.gms.internal.ads.bh4
    public final int z(byte[] bArr, int i10, int i11) {
        return this.f17843a.z(bArr, i10, i11);
    }
}
