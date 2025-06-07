package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class x90 extends z90 {

    /* renamed from: m, reason: collision with root package name */
    private final String f17481m;

    /* renamed from: n, reason: collision with root package name */
    private final int f17482n;

    public x90(String str, int i10) {
        this.f17481m = str;
        this.f17482n = i10;
    }

    @Override // com.google.android.gms.internal.ads.aa0
    public final int b() {
        return this.f17482n;
    }

    @Override // com.google.android.gms.internal.ads.aa0
    public final String d() {
        return this.f17481m;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof x90)) {
            x90 x90Var = (x90) obj;
            if (e4.o.a(this.f17481m, x90Var.f17481m) && e4.o.a(Integer.valueOf(this.f17482n), Integer.valueOf(x90Var.f17482n))) {
                return true;
            }
        }
        return false;
    }
}
