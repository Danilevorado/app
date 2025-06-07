package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class yq1 extends Exception {

    /* renamed from: m, reason: collision with root package name */
    private final int f18247m;

    public yq1(int i10) {
        this.f18247m = i10;
    }

    public yq1(int i10, String str) {
        super(str);
        this.f18247m = i10;
    }

    public yq1(int i10, String str, Throwable th) {
        super(str, th);
        this.f18247m = 1;
    }

    public final int a() {
        return this.f18247m;
    }
}
