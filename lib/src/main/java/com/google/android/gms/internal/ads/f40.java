package com.google.android.gms.internal.ads;

import android.location.Location;
import java.util.Date;
import java.util.Set;

/* loaded from: classes.dex */
public final class f40 implements o3.e {

    /* renamed from: a, reason: collision with root package name */
    private final Date f8099a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8100b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f8101c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f8102d;

    /* renamed from: e, reason: collision with root package name */
    private final Location f8103e;

    /* renamed from: f, reason: collision with root package name */
    private final int f8104f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f8105g;

    /* renamed from: h, reason: collision with root package name */
    private final String f8106h;

    public f40(Date date, int i10, Set set, Location location, boolean z10, int i11, boolean z11, int i12, String str) {
        this.f8099a = date;
        this.f8100b = i10;
        this.f8101c = set;
        this.f8103e = location;
        this.f8102d = z10;
        this.f8104f = i11;
        this.f8105g = z11;
        this.f8106h = str;
    }

    @Override // o3.e
    public final boolean c() {
        return this.f8105g;
    }

    @Override // o3.e
    public final Date d() {
        return this.f8099a;
    }

    @Override // o3.e
    public final boolean e() {
        return this.f8102d;
    }

    @Override // o3.e
    public final Set f() {
        return this.f8101c;
    }

    @Override // o3.e
    public final int i() {
        return this.f8104f;
    }

    @Override // o3.e
    public final int k() {
        return this.f8100b;
    }
}
