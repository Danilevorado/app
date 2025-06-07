package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ew {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f8000a;

    /* renamed from: c, reason: collision with root package name */
    public final List f8002c;

    /* renamed from: e, reason: collision with root package name */
    public final c63 f8004e;

    /* renamed from: f, reason: collision with root package name */
    public final List f8005f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f8006g;

    /* renamed from: b, reason: collision with root package name */
    public final String f8001b = null;

    /* renamed from: d, reason: collision with root package name */
    public final String f8003d = null;

    /* synthetic */ ew(Uri uri, String str, bq bqVar, qf qfVar, List list, String str2, c63 c63Var, Object obj, dv dvVar) {
        this.f8000a = uri;
        this.f8002c = list;
        this.f8004e = c63Var;
        z53 z53Var = new z53();
        if (c63Var.size() > 0) {
            a5.a.a(c63Var.get(0));
            throw null;
        }
        this.f8005f = z53Var.j();
        this.f8006g = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ew)) {
            return false;
        }
        ew ewVar = (ew) obj;
        return this.f8000a.equals(ewVar.f8000a) && sv2.b(null, null) && sv2.b(null, null) && sv2.b(null, null) && this.f8002c.equals(ewVar.f8002c) && sv2.b(null, null) && this.f8004e.equals(ewVar.f8004e) && sv2.b(null, null);
    }

    public final int hashCode() {
        return ((((this.f8000a.hashCode() * 923521) + this.f8002c.hashCode()) * 961) + this.f8004e.hashCode()) * 31;
    }
}
