package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class x8 {

    /* renamed from: a, reason: collision with root package name */
    private final String f17467a;

    /* renamed from: b, reason: collision with root package name */
    private final int f17468b;

    /* renamed from: c, reason: collision with root package name */
    private final int f17469c;

    /* renamed from: d, reason: collision with root package name */
    private int f17470d;

    /* renamed from: e, reason: collision with root package name */
    private String f17471e;

    public x8(int i10, int i11, int i12) {
        String str;
        if (i10 != Integer.MIN_VALUE) {
            str = i10 + "/";
        } else {
            str = "";
        }
        this.f17467a = str;
        this.f17468b = i11;
        this.f17469c = i12;
        this.f17470d = Integer.MIN_VALUE;
        this.f17471e = "";
    }

    private final void d() {
        if (this.f17470d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public final int a() {
        d();
        return this.f17470d;
    }

    public final String b() {
        d();
        return this.f17471e;
    }

    public final void c() {
        int i10 = this.f17470d;
        int i11 = i10 == Integer.MIN_VALUE ? this.f17468b : i10 + this.f17469c;
        this.f17470d = i11;
        this.f17471e = this.f17467a + i11;
    }
}
