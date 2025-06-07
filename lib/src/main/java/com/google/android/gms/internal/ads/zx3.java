package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zx3 implements t53 {

    /* renamed from: a, reason: collision with root package name */
    private final t53 f18797a;

    /* renamed from: b, reason: collision with root package name */
    private long f18798b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f18799c;

    /* renamed from: d, reason: collision with root package name */
    private Map f18800d;

    public zx3(t53 t53Var) {
        Objects.requireNonNull(t53Var);
        this.f18797a = t53Var;
        this.f18799c = Uri.EMPTY;
        this.f18800d = Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final long a(ib3 ib3Var) {
        this.f18799c = ib3Var.f9669a;
        this.f18800d = Collections.emptyMap();
        long jA = this.f18797a.a(ib3Var);
        Uri uriD = d();
        Objects.requireNonNull(uriD);
        this.f18799c = uriD;
        this.f18800d = c();
        return jA;
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final void b(wy3 wy3Var) {
        Objects.requireNonNull(wy3Var);
        this.f18797a.b(wy3Var);
    }

    @Override // com.google.android.gms.internal.ads.t53, com.google.android.gms.internal.ads.zt3
    public final Map c() {
        return this.f18797a.c();
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final Uri d() {
        return this.f18797a.d();
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final void f() {
        this.f18797a.f();
    }

    public final long g() {
        return this.f18798b;
    }

    public final Uri h() {
        return this.f18799c;
    }

    public final Map i() {
        return this.f18800d;
    }

    @Override // com.google.android.gms.internal.ads.bh4
    public final int z(byte[] bArr, int i10, int i11) {
        int iZ = this.f18797a.z(bArr, i10, i11);
        if (iZ != -1) {
            this.f18798b += iZ;
        }
        return iZ;
    }
}
