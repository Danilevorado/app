package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class fz1 {

    /* renamed from: c, reason: collision with root package name */
    private final String f8510c;

    /* renamed from: d, reason: collision with root package name */
    private ln2 f8511d = null;

    /* renamed from: e, reason: collision with root package name */
    private hn2 f8512e = null;

    /* renamed from: f, reason: collision with root package name */
    private k3.l4 f8513f = null;

    /* renamed from: b, reason: collision with root package name */
    private final Map f8509b = Collections.synchronizedMap(new HashMap());

    /* renamed from: a, reason: collision with root package name */
    private final List f8508a = Collections.synchronizedList(new ArrayList());

    public fz1(String str) {
        this.f8510c = str;
    }

    private final synchronized void i(hn2 hn2Var, int i10) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = ((Boolean) k3.w.c().b(ir.f9949g3)).booleanValue() ? hn2Var.f9269q0 : hn2Var.f9276x;
        if (this.f8509b.containsKey(str5)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = hn2Var.f9275w.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, hn2Var.f9275w.getString(next));
            } catch (JSONException unused) {
            }
        }
        if (((Boolean) k3.w.c().b(ir.f10116v6)).booleanValue()) {
            str = hn2Var.G;
            str2 = hn2Var.H;
            str3 = hn2Var.I;
            str4 = hn2Var.J;
        } else {
            str = "";
            str2 = "";
            str3 = "";
            str4 = "";
        }
        k3.l4 l4Var = new k3.l4(hn2Var.F, 0L, null, bundle, str, str2, str3, str4);
        try {
            this.f8508a.add(i10, l4Var);
        } catch (IndexOutOfBoundsException e5) {
            j3.t.q().u(e5, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.f8509b.put(str5, l4Var);
    }

    private final void j(hn2 hn2Var, long j10, k3.w2 w2Var, boolean z10) {
        String str = ((Boolean) k3.w.c().b(ir.f9949g3)).booleanValue() ? hn2Var.f9269q0 : hn2Var.f9276x;
        if (this.f8509b.containsKey(str)) {
            if (this.f8512e == null) {
                this.f8512e = hn2Var;
            }
            k3.l4 l4Var = (k3.l4) this.f8509b.get(str);
            l4Var.f24692n = j10;
            l4Var.f24693o = w2Var;
            if (((Boolean) k3.w.c().b(ir.f10127w6)).booleanValue() && z10) {
                this.f8513f = l4Var;
            }
        }
    }

    public final k3.l4 a() {
        return this.f8513f;
    }

    public final d11 b() {
        return new d11(this.f8512e, "", this, this.f8511d, this.f8510c);
    }

    public final List c() {
        return this.f8508a;
    }

    public final void d(hn2 hn2Var) {
        i(hn2Var, this.f8508a.size());
    }

    public final void e(hn2 hn2Var, long j10, k3.w2 w2Var) {
        j(hn2Var, j10, w2Var, false);
    }

    public final void f(hn2 hn2Var, long j10, k3.w2 w2Var) {
        j(hn2Var, j10, null, true);
    }

    public final synchronized void g(String str, List list) {
        if (this.f8509b.containsKey(str)) {
            int iIndexOf = this.f8508a.indexOf((k3.l4) this.f8509b.get(str));
            try {
                this.f8508a.remove(iIndexOf);
            } catch (IndexOutOfBoundsException e5) {
                j3.t.q().u(e5, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
            }
            this.f8509b.remove(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i((hn2) it.next(), iIndexOf);
                iIndexOf++;
            }
        }
    }

    public final void h(ln2 ln2Var) {
        this.f8511d = ln2Var;
    }
}
