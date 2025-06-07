package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class wa2 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f17035a;

    /* renamed from: b, reason: collision with root package name */
    private final bb3 f17036b;

    public wa2(Context context, bb3 bb3Var) {
        this.f17035a = context;
        this.f17036b = bb3Var;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 19;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        return this.f17036b.g(new Callable() { // from class: com.google.android.gms.internal.ads.va2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String strJ;
                String strK;
                String strE;
                j3.t.r();
                nk nkVarH = j3.t.q().h().h();
                Bundle bundle = null;
                if (nkVarH != null && (!j3.t.q().h().V() || !j3.t.q().h().G())) {
                    if (nkVarH.h()) {
                        nkVarH.g();
                    }
                    dk dkVarA = nkVarH.a();
                    if (dkVarA != null) {
                        strJ = dkVarA.d();
                        strE = dkVarA.e();
                        strK = dkVarA.f();
                        if (strJ != null) {
                            j3.t.q().h().D(strJ);
                        }
                        if (strK != null) {
                            j3.t.q().h().v(strK);
                        }
                    } else {
                        strJ = j3.t.q().h().j();
                        strK = j3.t.q().h().k();
                        strE = null;
                    }
                    Bundle bundle2 = new Bundle(1);
                    if (!j3.t.q().h().G()) {
                        if (strK == null || TextUtils.isEmpty(strK)) {
                            strK = "no_hash";
                        }
                        bundle2.putString("v_fp_vertical", strK);
                    }
                    if (strJ != null && !j3.t.q().h().V()) {
                        bundle2.putString("fingerprint", strJ);
                        if (!strJ.equals(strE)) {
                            bundle2.putString("v_fp", strE);
                        }
                    }
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                }
                return new xa2(bundle);
            }
        });
    }
}
