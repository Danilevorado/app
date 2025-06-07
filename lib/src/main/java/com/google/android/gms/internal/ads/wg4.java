package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
final class wg4 implements t53 {

    /* renamed from: a, reason: collision with root package name */
    private final t53 f17124a;

    /* renamed from: b, reason: collision with root package name */
    private final int f17125b;

    /* renamed from: c, reason: collision with root package name */
    private final vg4 f17126c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f17127d;

    /* renamed from: e, reason: collision with root package name */
    private int f17128e;

    public wg4(t53 t53Var, int i10, vg4 vg4Var) {
        gt1.d(i10 > 0);
        this.f17124a = t53Var;
        this.f17125b = i10;
        this.f17126c = vg4Var;
        this.f17127d = new byte[1];
        this.f17128e = i10;
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final long a(ib3 ib3Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final void b(wy3 wy3Var) {
        Objects.requireNonNull(wy3Var);
        this.f17124a.b(wy3Var);
    }

    @Override // com.google.android.gms.internal.ads.t53, com.google.android.gms.internal.ads.zt3
    public final Map c() {
        return this.f17124a.c();
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final Uri d() {
        return this.f17124a.d();
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final void f() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.bh4
    public final int z(byte[] bArr, int i10, int i11) {
        int i12 = this.f17128e;
        if (i12 == 0) {
            int i13 = 0;
            if (this.f17124a.z(this.f17127d, 0, 1) != -1) {
                int i14 = (this.f17127d[0] & 255) << 4;
                if (i14 != 0) {
                    byte[] bArr2 = new byte[i14];
                    int i15 = i14;
                    while (i15 > 0) {
                        int iZ = this.f17124a.z(bArr2, i13, i15);
                        if (iZ != -1) {
                            i13 += iZ;
                            i15 -= iZ;
                        }
                    }
                    while (i14 > 0) {
                        int i16 = i14 - 1;
                        if (bArr2[i16] != 0) {
                            break;
                        }
                        i14 = i16;
                    }
                    if (i14 > 0) {
                        this.f17126c.a(new jm2(bArr2, i14));
                    }
                }
                i12 = this.f17125b;
                this.f17128e = i12;
            }
            return -1;
        }
        int iZ2 = this.f17124a.z(bArr, i10, Math.min(i12, i11));
        if (iZ2 != -1) {
            this.f17128e -= iZ2;
        }
        return iZ2;
    }
}
