package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public class oh0 extends IOException {

    /* renamed from: m, reason: collision with root package name */
    public final boolean f13247m;

    /* renamed from: n, reason: collision with root package name */
    public final int f13248n;

    protected oh0(String str, Throwable th, boolean z10, int i10) {
        super(str, th);
        this.f13247m = z10;
        this.f13248n = i10;
    }

    public static oh0 a(String str, Throwable th) {
        return new oh0(str, th, true, 1);
    }

    public static oh0 b(String str, Throwable th) {
        return new oh0(str, th, true, 0);
    }

    public static oh0 c(String str) {
        return new oh0(str, null, false, 1);
    }
}
