package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* loaded from: classes.dex */
public final class cu extends pu {

    /* renamed from: m, reason: collision with root package name */
    private final Drawable f7067m;

    /* renamed from: n, reason: collision with root package name */
    private final Uri f7068n;

    /* renamed from: o, reason: collision with root package name */
    private final double f7069o;

    /* renamed from: p, reason: collision with root package name */
    private final int f7070p;

    /* renamed from: q, reason: collision with root package name */
    private final int f7071q;

    public cu(Drawable drawable, Uri uri, double d10, int i10, int i11) {
        this.f7067m = drawable;
        this.f7068n = uri;
        this.f7069o = d10;
        this.f7070p = i10;
        this.f7071q = i11;
    }

    @Override // com.google.android.gms.internal.ads.qu
    public final double b() {
        return this.f7069o;
    }

    @Override // com.google.android.gms.internal.ads.qu
    public final Uri c() {
        return this.f7068n;
    }

    @Override // com.google.android.gms.internal.ads.qu
    public final int d() {
        return this.f7071q;
    }

    @Override // com.google.android.gms.internal.ads.qu
    public final l4.a e() {
        return l4.b.p1(this.f7067m);
    }

    @Override // com.google.android.gms.internal.ads.qu
    public final int f() {
        return this.f7070p;
    }
}
