package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class nm {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f12695a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f12696b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f12697c;

    /* renamed from: d, reason: collision with root package name */
    private final long f12698d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f12699e;

    private nm(InputStream inputStream, boolean z10, boolean z11, long j10, boolean z12) {
        this.f12695a = inputStream;
        this.f12696b = z10;
        this.f12697c = z11;
        this.f12698d = j10;
        this.f12699e = z12;
    }

    public static nm b(InputStream inputStream, boolean z10, boolean z11, long j10, boolean z12) {
        return new nm(inputStream, z10, z11, j10, z12);
    }

    public final long a() {
        return this.f12698d;
    }

    public final InputStream c() {
        return this.f12695a;
    }

    public final boolean d() {
        return this.f12696b;
    }

    public final boolean e() {
        return this.f12699e;
    }

    public final boolean f() {
        return this.f12697c;
    }
}
