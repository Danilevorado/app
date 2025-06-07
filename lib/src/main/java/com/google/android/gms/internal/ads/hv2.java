package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class hv2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f9426a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9427b;

    private hv2(String str, String str2) {
        this.f9426a = str;
        this.f9427b = str2;
    }

    public static hv2 a(String str, String str2) {
        fw2.a(str, "Name is null or empty");
        fw2.a(str2, "Version is null or empty");
        return new hv2(str, str2);
    }

    public final String b() {
        return this.f9426a;
    }

    public final String c() {
        return this.f9427b;
    }
}
