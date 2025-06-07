package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class rb1 implements hx0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f14722a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f14723b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f14724c;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f14725d;

    /* renamed from: e, reason: collision with root package name */
    private final ae1 f14726e;

    rb1(Map map, Map map2, Map map3, q44 q44Var, ae1 ae1Var) {
        this.f14722a = map;
        this.f14723b = map2;
        this.f14724c = map3;
        this.f14725d = q44Var;
        this.f14726e = ae1Var;
    }

    @Override // com.google.android.gms.internal.ads.hx0
    public final az1 a(int i10, String str) {
        az1 az1VarA;
        az1 az1Var = (az1) this.f14722a.get(str);
        if (az1Var != null) {
            return az1Var;
        }
        if (i10 == 1) {
            if (this.f14726e.e() == null || (az1VarA = ((hx0) this.f14725d.b()).a(i10, str)) == null) {
                return null;
            }
            return lx0.a(az1VarA);
        }
        if (i10 != 4) {
            return null;
        }
        r12 r12Var = (r12) this.f14724c.get(str);
        if (r12Var != null) {
            return new bz1(r12Var, new w23() { // from class: com.google.android.gms.internal.ads.jx0
                @Override // com.google.android.gms.internal.ads.w23
                public final Object a(Object obj) {
                    return new lx0((List) obj);
                }
            });
        }
        az1 az1Var2 = (az1) this.f14723b.get(str);
        if (az1Var2 == null) {
            return null;
        }
        return lx0.a(az1Var2);
    }
}
