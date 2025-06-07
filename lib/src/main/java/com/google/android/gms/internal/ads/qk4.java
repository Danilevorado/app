package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class qk4 {

    /* renamed from: a, reason: collision with root package name */
    public final j31 f14385a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f14386b;

    public qk4(j31 j31Var, int[] iArr, int i10) {
        if (iArr.length == 0) {
            ad2.c("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f14385a = j31Var;
        this.f14386b = iArr;
    }
}
