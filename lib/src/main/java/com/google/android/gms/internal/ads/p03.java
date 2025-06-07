package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.facebook.ads.AdError;
import java.util.Objects;

/* loaded from: classes.dex */
public final class p03 extends sz2 {

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f13507e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f13508f;

    /* renamed from: g, reason: collision with root package name */
    private int f13509g;

    /* renamed from: h, reason: collision with root package name */
    private int f13510h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f13511i;

    public p03(byte[] bArr) {
        super(false);
        Objects.requireNonNull(bArr);
        gt1.d(bArr.length > 0);
        this.f13507e = bArr;
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final long a(ib3 ib3Var) throws t63 {
        this.f13508f = ib3Var.f9669a;
        h(ib3Var);
        long j10 = ib3Var.f9674f;
        int length = this.f13507e.length;
        if (j10 > length) {
            throw new t63(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        int i10 = (int) j10;
        this.f13509g = i10;
        int i11 = length - i10;
        this.f13510h = i11;
        long j11 = ib3Var.f9675g;
        if (j11 != -1) {
            this.f13510h = (int) Math.min(i11, j11);
        }
        this.f13511i = true;
        i(ib3Var);
        long j12 = ib3Var.f9675g;
        return j12 != -1 ? j12 : this.f13510h;
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final Uri d() {
        return this.f13508f;
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final void f() {
        if (this.f13511i) {
            this.f13511i = false;
            g();
        }
        this.f13508f = null;
    }

    @Override // com.google.android.gms.internal.ads.bh4
    public final int z(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f13510h;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        System.arraycopy(this.f13507e, this.f13509g, bArr, i10, iMin);
        this.f13509g += iMin;
        this.f13510h -= iMin;
        w(iMin);
        return iMin;
    }
}
