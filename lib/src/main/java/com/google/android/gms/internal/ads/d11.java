package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class d11 extends k3.i2 {

    /* renamed from: m, reason: collision with root package name */
    private final String f7150m;

    /* renamed from: n, reason: collision with root package name */
    private final String f7151n;

    /* renamed from: o, reason: collision with root package name */
    private final String f7152o;

    /* renamed from: p, reason: collision with root package name */
    private final String f7153p;

    /* renamed from: q, reason: collision with root package name */
    private final List f7154q;

    /* renamed from: r, reason: collision with root package name */
    private final long f7155r;

    /* renamed from: s, reason: collision with root package name */
    private final String f7156s;

    /* renamed from: t, reason: collision with root package name */
    private final fz1 f7157t;

    /* renamed from: u, reason: collision with root package name */
    private final Bundle f7158u;

    public d11(hn2 hn2Var, String str, fz1 fz1Var, ln2 ln2Var, String str2) throws JSONException {
        String string = null;
        this.f7151n = hn2Var == null ? null : hn2Var.f9241c0;
        this.f7152o = str2;
        this.f7153p = ln2Var == null ? null : ln2Var.f11674b;
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                string = hn2Var.f9275w.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.f7150m = string != null ? string : str;
        this.f7154q = fz1Var.c();
        this.f7157t = fz1Var;
        this.f7155r = j3.t.b().a() / 1000;
        this.f7158u = (!((Boolean) k3.w.c().b(ir.f10138x6)).booleanValue() || ln2Var == null) ? new Bundle() : ln2Var.f11682j;
        this.f7156s = (!((Boolean) k3.w.c().b(ir.C8)).booleanValue() || ln2Var == null || TextUtils.isEmpty(ln2Var.f11680h)) ? "" : ln2Var.f11680h;
    }

    @Override // k3.j2
    public final Bundle c() {
        return this.f7158u;
    }

    public final long d() {
        return this.f7155r;
    }

    @Override // k3.j2
    public final k3.l4 e() {
        fz1 fz1Var = this.f7157t;
        if (fz1Var != null) {
            return fz1Var.a();
        }
        return null;
    }

    public final String f() {
        return this.f7156s;
    }

    @Override // k3.j2
    public final String g() {
        return this.f7152o;
    }

    @Override // k3.j2
    public final String h() {
        return this.f7150m;
    }

    @Override // k3.j2
    public final String i() {
        return this.f7151n;
    }

    @Override // k3.j2
    public final List j() {
        return this.f7154q;
    }

    public final String k() {
        return this.f7153p;
    }
}
