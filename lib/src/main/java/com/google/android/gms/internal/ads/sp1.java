package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class sp1 {

    /* renamed from: a, reason: collision with root package name */
    private final bp1 f15525a;

    /* renamed from: b, reason: collision with root package name */
    private final nk1 f15526b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f15527c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final List f15528d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private boolean f15529e;

    sp1(bp1 bp1Var, nk1 nk1Var) {
        this.f15525a = bp1Var;
        this.f15526b = nk1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(List list) {
        mk1 mk1VarA;
        mk1 mk1VarA2;
        z50 z50Var;
        synchronized (this.f15527c) {
            if (this.f15529e) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                tz tzVar = (tz) it.next();
                String string = (!((Boolean) k3.w.c().b(ir.F8)).booleanValue() || (mk1VarA2 = this.f15526b.a(tzVar.f16101m)) == null || (z50Var = mk1VarA2.f12183c) == null) ? "" : z50Var.toString();
                boolean z10 = ((Boolean) k3.w.c().b(ir.G8)).booleanValue() && (mk1VarA = this.f15526b.a(tzVar.f16101m)) != null && mk1VarA.f12184d;
                List list2 = this.f15528d;
                String str = tzVar.f16101m;
                list2.add(new rp1(str, string, this.f15526b.c(str), tzVar.f16102n ? 1 : 0, tzVar.f16104p, tzVar.f16103o, z10));
            }
            this.f15529e = true;
        }
    }

    public final JSONArray a() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.f15527c) {
            if (!this.f15529e) {
                if (!this.f15525a.t()) {
                    c();
                    return jSONArray;
                }
                d(this.f15525a.g());
            }
            Iterator it = this.f15528d.iterator();
            while (it.hasNext()) {
                jSONArray.put(((rp1) it.next()).a());
            }
            return jSONArray;
        }
    }

    public final void c() {
        this.f15525a.s(new qp1(this));
    }
}
