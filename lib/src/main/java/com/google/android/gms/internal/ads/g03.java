package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* loaded from: classes.dex */
public final class g03 extends d03 {

    /* renamed from: h, reason: collision with root package name */
    private static g03 f8547h;

    private g03(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final g03 j(Context context) {
        g03 g03Var;
        synchronized (g03.class) {
            if (f8547h == null) {
                f8547h = new g03(context);
            }
            g03Var = f8547h;
        }
        return g03Var;
    }

    public final c03 i(long j10, boolean z10) {
        synchronized (g03.class) {
            if (p()) {
                return b(null, null, j10, z10);
            }
            return new c03();
        }
    }

    public final void k() {
        synchronized (g03.class) {
            if (g(false)) {
                f(false);
            }
        }
    }

    public final void l() throws IOException {
        this.f7149f.e("paidv2_publisher_option");
    }

    public final void m() throws IOException {
        this.f7149f.e("paidv2_user_option");
    }

    public final void n(boolean z10) throws IOException {
        this.f7149f.d("paidv2_user_option", Boolean.valueOf(z10));
    }

    public final void o(boolean z10) throws IOException {
        this.f7149f.d("paidv2_publisher_option", Boolean.valueOf(z10));
        if (z10) {
            return;
        }
        k();
    }

    public final boolean p() {
        return this.f7149f.f("paidv2_publisher_option", true);
    }

    public final boolean q() {
        return this.f7149f.f("paidv2_user_option", true);
    }
}
