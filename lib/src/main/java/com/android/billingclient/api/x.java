package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.u5;

/* loaded from: classes.dex */
final class x {

    /* renamed from: a, reason: collision with root package name */
    private boolean f5289a;

    /* renamed from: b, reason: collision with root package name */
    private p2.f f5290b;

    x(Context context) {
        try {
            r2.t.f(context);
            this.f5290b = r2.t.c().g(com.google.android.datatransport.cct.a.f5506g).a("PLAY_BILLING_LIBRARY", u5.class, p2.b.b("proto"), new p2.e() { // from class: k1.u
                @Override // p2.e
                public final Object a(Object obj) {
                    return ((u5) obj).c();
                }
            });
        } catch (Throwable unused) {
            this.f5289a = true;
        }
    }

    public final void a(u5 u5Var) {
        String str;
        if (this.f5289a) {
            str = "Skipping logging since initialization failed.";
        } else {
            try {
                this.f5290b.a(p2.c.d(u5Var));
                return;
            } catch (Throwable unused) {
                str = "logging failed.";
            }
        }
        com.google.android.gms.internal.play_billing.a0.i("BillingLogger", str);
    }
}
