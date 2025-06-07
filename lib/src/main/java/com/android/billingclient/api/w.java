package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.b6;
import com.google.android.gms.internal.play_billing.j5;
import com.google.android.gms.internal.play_billing.k5;
import com.google.android.gms.internal.play_billing.q4;
import com.google.android.gms.internal.play_billing.t5;
import com.google.android.gms.internal.play_billing.u4;
import com.google.android.gms.internal.play_billing.u5;

/* loaded from: classes.dex */
final class w implements u {

    /* renamed from: b, reason: collision with root package name */
    private k5 f5287b;

    /* renamed from: c, reason: collision with root package name */
    private final x f5288c;

    w(Context context, k5 k5Var) {
        this.f5288c = new x(context);
        this.f5287b = k5Var;
    }

    @Override // com.android.billingclient.api.u
    public final void a(q4 q4Var, int i10) {
        try {
            j5 j5Var = (j5) this.f5287b.i();
            j5Var.r(i10);
            this.f5287b = (k5) j5Var.e();
            d(q4Var);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.a0.j("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.u
    public final void b(b6 b6Var) {
        if (b6Var == null) {
            return;
        }
        try {
            t5 t5VarG = u5.G();
            t5VarG.t(this.f5287b);
            t5VarG.u(b6Var);
            this.f5288c.a((u5) t5VarG.e());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.a0.j("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.u
    public final void c(u4 u4Var, int i10) {
        try {
            j5 j5Var = (j5) this.f5287b.i();
            j5Var.r(i10);
            this.f5287b = (k5) j5Var.e();
            e(u4Var);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.a0.j("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.u
    public final void d(q4 q4Var) {
        if (q4Var == null) {
            return;
        }
        try {
            t5 t5VarG = u5.G();
            t5VarG.t(this.f5287b);
            t5VarG.r(q4Var);
            this.f5288c.a((u5) t5VarG.e());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.a0.j("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.u
    public final void e(u4 u4Var) {
        if (u4Var == null) {
            return;
        }
        try {
            t5 t5VarG = u5.G();
            t5VarG.t(this.f5287b);
            t5VarG.s(u4Var);
            this.f5288c.a((u5) t5VarG.e());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.a0.j("BillingLogger", "Unable to log.", th);
        }
    }
}
