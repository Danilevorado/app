package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class hy implements gy {

    /* renamed from: a, reason: collision with root package name */
    private final iy f9452a;

    public hy(iy iyVar) {
        this.f9452a = iyVar;
    }

    @Override // com.google.android.gms.internal.ads.gy
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) throws NumberFormatException {
        nk0 nk0Var = (nk0) obj;
        boolean zEquals = "1".equals(map.get("transparentBackground"));
        boolean zEquals2 = "1".equals(map.get("blur"));
        float f5 = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f5 = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e5) {
            ze0.e("Fail to parse float", e5);
        }
        this.f9452a.c(zEquals);
        this.f9452a.b(zEquals2, f5);
        nk0Var.N0(zEquals);
    }
}
