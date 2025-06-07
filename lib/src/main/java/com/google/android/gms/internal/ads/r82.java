package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class r82 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final bb3 f14679a;

    /* renamed from: b, reason: collision with root package name */
    private final qk1 f14680b;

    /* renamed from: c, reason: collision with root package name */
    private final bp1 f14681c;

    /* renamed from: d, reason: collision with root package name */
    private final u82 f14682d;

    public r82(bb3 bb3Var, qk1 qk1Var, bp1 bp1Var, u82 u82Var) {
        this.f14679a = bb3Var;
        this.f14680b = qk1Var;
        this.f14681c = bp1Var;
        this.f14682d = u82Var;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        if (y33.d((String) k3.w.c().b(ir.f10013m1)) || this.f14682d.b() || !this.f14681c.t()) {
            return qa3.h(new t82(new Bundle(), null));
        }
        this.f14682d.a(true);
        return this.f14679a.g(new Callable() { // from class: com.google.android.gms.internal.ads.q82
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f14189a.c();
            }
        });
    }

    final /* synthetic */ t82 c() {
        List<String> listAsList = Arrays.asList(((String) k3.w.c().b(ir.f10013m1)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : listAsList) {
            try {
                ap2 ap2VarC = this.f14680b.c(str, new JSONObject());
                ap2VarC.c();
                Bundle bundle2 = new Bundle();
                try {
                    z50 z50VarK = ap2VarC.k();
                    if (z50VarK != null) {
                        bundle2.putString("sdk_version", z50VarK.toString());
                    }
                } catch (io2 unused) {
                }
                try {
                    z50 z50VarJ = ap2VarC.j();
                    if (z50VarJ != null) {
                        bundle2.putString("adapter_version", z50VarJ.toString());
                    }
                } catch (io2 unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (io2 unused3) {
            }
        }
        return new t82(bundle, null);
    }
}
