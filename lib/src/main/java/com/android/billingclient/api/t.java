package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.a5;
import com.google.android.gms.internal.play_billing.p4;
import com.google.android.gms.internal.play_billing.q4;
import com.google.android.gms.internal.play_billing.t4;
import com.google.android.gms.internal.play_billing.u4;
import com.google.android.gms.internal.play_billing.w4;

/* loaded from: classes.dex */
public abstract /* synthetic */ class t {
    static {
        com.google.android.gms.internal.play_billing.m mVar = u.f5260a;
    }

    public static q4 a(int i10, int i11, d dVar) {
        try {
            p4 p4VarF = q4.F();
            w4 w4VarG = a5.G();
            w4VarG.t(dVar.b());
            w4VarG.s(dVar.a());
            w4VarG.u(i10);
            p4VarF.r(w4VarG);
            p4VarF.s(i11);
            return (q4) p4VarF.e();
        } catch (Exception e5) {
            com.google.android.gms.internal.play_billing.a0.j("BillingLogger", "Unable to create logging payload", e5);
            return null;
        }
    }

    public static q4 b(int i10, int i11, d dVar, String str) {
        try {
            w4 w4VarG = a5.G();
            w4VarG.t(dVar.b());
            w4VarG.s(dVar.a());
            w4VarG.u(i10);
            if (str != null) {
                w4VarG.r(str);
            }
            p4 p4VarF = q4.F();
            p4VarF.r(w4VarG);
            p4VarF.s(i11);
            return (q4) p4VarF.e();
        } catch (Exception e5) {
            com.google.android.gms.internal.play_billing.a0.j("BillingLogger", "Unable to create logging payload", e5);
            return null;
        }
    }

    public static u4 c(int i10) {
        try {
            t4 t4VarC = u4.C();
            t4VarC.r(i10);
            return (u4) t4VarC.e();
        } catch (Exception e5) {
            com.google.android.gms.internal.play_billing.a0.j("BillingLogger", "Unable to create logging payload", e5);
            return null;
        }
    }
}
