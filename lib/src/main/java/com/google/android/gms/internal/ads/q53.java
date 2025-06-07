package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class q53 {

    /* renamed from: a, reason: collision with root package name */
    private static final q53 f14153a = new n53();

    /* renamed from: b, reason: collision with root package name */
    private static final q53 f14154b = new o53(-1);

    /* renamed from: c, reason: collision with root package name */
    private static final q53 f14155c = new o53(1);

    /* synthetic */ q53(p53 p53Var) {
    }

    public static q53 i() {
        return f14153a;
    }

    public abstract int a();

    public abstract q53 b(int i10, int i11);

    public abstract q53 c(Object obj, Object obj2, Comparator comparator);

    public abstract q53 d(boolean z10, boolean z11);

    public abstract q53 e(boolean z10, boolean z11);
}
