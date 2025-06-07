package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class ps0 implements fs0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f14031a;

    /* renamed from: b, reason: collision with root package name */
    private final m3.p1 f14032b = j3.t.q().h();

    public ps0(Context context) {
        this.f14031a = context;
    }

    @Override // com.google.android.gms.internal.ads.fs0
    public final void a(Map map) {
        if (map.isEmpty()) {
            return;
        }
        String str = (String) map.get("gad_idless");
        if (str != null) {
            boolean z10 = Boolean.parseBoolean(str);
            map.remove("gad_idless");
            if (z10) {
                try {
                    if (((Boolean) k3.w.c().b(ir.B2)).booleanValue()) {
                        f03.k(this.f14031a).l();
                    }
                    if (((Boolean) k3.w.c().b(ir.K2)).booleanValue()) {
                        f03.k(this.f14031a).m();
                    }
                    if (((Boolean) k3.w.c().b(ir.C2)).booleanValue()) {
                        g03.j(this.f14031a).k();
                        if (((Boolean) k3.w.c().b(ir.G2)).booleanValue()) {
                            g03.j(this.f14031a).l();
                        }
                        if (((Boolean) k3.w.c().b(ir.H2)).booleanValue()) {
                            g03.j(this.f14031a).m();
                        }
                    }
                } catch (IOException e5) {
                    j3.t.q().u(e5, "SetAppMeasurementConsentConfig.run");
                }
            }
            if (((Boolean) k3.w.c().b(ir.f10088t0)).booleanValue()) {
                this.f14032b.z(z10);
                if (((Boolean) k3.w.c().b(ir.Q5)).booleanValue() && z10) {
                    this.f14031a.deleteDatabase("OfflineUpload.db");
                }
            }
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        if (((Boolean) k3.w.c().b(ir.f10033o0)).booleanValue()) {
            j3.t.p().w(bundle);
        }
    }
}
