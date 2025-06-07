package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class hx2 extends ex2 {

    /* renamed from: a, reason: collision with root package name */
    private String f9444a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f9445b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9446c;

    /* renamed from: d, reason: collision with root package name */
    private byte f9447d;

    hx2() {
    }

    @Override // com.google.android.gms.internal.ads.ex2
    public final ex2 a(String str) {
        Objects.requireNonNull(str, "Null clientVersion");
        this.f9444a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ex2
    public final ex2 b(boolean z10) {
        this.f9446c = true;
        this.f9447d = (byte) (this.f9447d | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ex2
    public final ex2 c(boolean z10) {
        this.f9445b = z10;
        this.f9447d = (byte) (this.f9447d | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ex2
    public final fx2 d() {
        String str;
        if (this.f9447d == 3 && (str = this.f9444a) != null) {
            return new jx2(str, this.f9445b, this.f9446c, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f9444a == null) {
            sb2.append(" clientVersion");
        }
        if ((this.f9447d & 1) == 0) {
            sb2.append(" shouldGetAdvertisingId");
        }
        if ((this.f9447d & 2) == 0) {
            sb2.append(" isGooglePlayServicesAvailable");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
