package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import com.facebook.ads.AdError;
import java.net.URLDecoder;

/* loaded from: classes.dex */
public final class s33 extends sz2 {

    /* renamed from: e, reason: collision with root package name */
    private ib3 f15074e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f15075f;

    /* renamed from: g, reason: collision with root package name */
    private int f15076g;

    /* renamed from: h, reason: collision with root package name */
    private int f15077h;

    public s33() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final long a(ib3 ib3Var) throws t63, oh0 {
        h(ib3Var);
        this.f15074e = ib3Var;
        Uri uri = ib3Var.f9669a;
        String scheme = uri.getScheme();
        gt1.e("data".equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i10 = sv2.f15560a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw oh0.b("Unexpected URI format: ".concat(String.valueOf(uri)), null);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f15075f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e5) {
                throw oh0.b("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e5);
            }
        } else {
            this.f15075f = URLDecoder.decode(str, u23.f16140a.name()).getBytes(u23.f16142c);
        }
        long j10 = ib3Var.f9674f;
        int length = this.f15075f.length;
        if (j10 > length) {
            this.f15075f = null;
            throw new t63(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        int i11 = (int) j10;
        this.f15076g = i11;
        int i12 = length - i11;
        this.f15077h = i12;
        long j11 = ib3Var.f9675g;
        if (j11 != -1) {
            this.f15077h = (int) Math.min(i12, j11);
        }
        i(ib3Var);
        long j12 = ib3Var.f9675g;
        return j12 != -1 ? j12 : this.f15077h;
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final Uri d() {
        ib3 ib3Var = this.f15074e;
        if (ib3Var != null) {
            return ib3Var.f9669a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final void f() {
        if (this.f15075f != null) {
            this.f15075f = null;
            g();
        }
        this.f15074e = null;
    }

    @Override // com.google.android.gms.internal.ads.bh4
    public final int z(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f15077h;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        byte[] bArr2 = this.f15075f;
        int i13 = sv2.f15560a;
        System.arraycopy(bArr2, this.f15076g, bArr, i10, iMin);
        this.f15076g += iMin;
        this.f15077h -= iMin;
        w(iMin);
        return iMin;
    }
}
