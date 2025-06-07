package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class c03 {

    /* renamed from: a, reason: collision with root package name */
    private final String f6746a;

    /* renamed from: b, reason: collision with root package name */
    private final long f6747b;

    public c03() {
        this.f6746a = null;
        this.f6747b = -1L;
    }

    public c03(String str, long j10) {
        this.f6746a = str;
        this.f6747b = j10;
    }

    public final long a() {
        return this.f6747b;
    }

    public final String b() {
        return this.f6746a;
    }

    public final boolean c() {
        return this.f6746a != null && this.f6747b >= 0;
    }
}
