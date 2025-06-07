package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class f03 extends d03 {

    /* renamed from: h, reason: collision with root package name */
    private static f03 f8073h;

    private f03(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final f03 k(Context context) {
        f03 f03Var;
        synchronized (f03.class) {
            if (f8073h == null) {
                f8073h = new f03(context);
            }
            f03Var = f8073h;
        }
        return f03Var;
    }

    public final c03 i(long j10, boolean z10) {
        c03 c03VarB;
        synchronized (f03.class) {
            c03VarB = b(null, null, j10, z10);
        }
        return c03VarB;
    }

    public final c03 j(String str, String str2, long j10, boolean z10) {
        c03 c03VarB;
        synchronized (f03.class) {
            c03VarB = b(str, str2, j10, z10);
        }
        return c03VarB;
    }

    public final void l() {
        synchronized (f03.class) {
            f(false);
        }
    }

    public final void m() {
        synchronized (f03.class) {
            f(true);
        }
    }
}
