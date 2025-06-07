package com.google.android.gms.internal.ads;

import android.location.Location;
import g3.e;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class r40 implements o3.u {

    /* renamed from: a, reason: collision with root package name */
    private final Date f14610a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14611b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f14612c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f14613d;

    /* renamed from: e, reason: collision with root package name */
    private final Location f14614e;

    /* renamed from: f, reason: collision with root package name */
    private final int f14615f;

    /* renamed from: g, reason: collision with root package name */
    private final eu f14616g;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f14618i;

    /* renamed from: k, reason: collision with root package name */
    private final String f14620k;

    /* renamed from: h, reason: collision with root package name */
    private final List f14617h = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private final Map f14619j = new HashMap();

    public r40(Date date, int i10, Set set, Location location, boolean z10, int i11, eu euVar, List list, boolean z11, int i12, String str) {
        Map map;
        String str2;
        Boolean bool;
        this.f14610a = date;
        this.f14611b = i10;
        this.f14612c = set;
        this.f14614e = location;
        this.f14613d = z10;
        this.f14615f = i11;
        this.f14616g = euVar;
        this.f14618i = z11;
        this.f14620k = str;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (str3.startsWith("custom:")) {
                    String[] strArrSplit = str3.split(":", 3);
                    if (strArrSplit.length == 3) {
                        if ("true".equals(strArrSplit[2])) {
                            map = this.f14619j;
                            str2 = strArrSplit[1];
                            bool = Boolean.TRUE;
                        } else if ("false".equals(strArrSplit[2])) {
                            map = this.f14619j;
                            str2 = strArrSplit[1];
                            bool = Boolean.FALSE;
                        }
                        map.put(str2, bool);
                    }
                } else {
                    this.f14617h.add(str3);
                }
            }
        }
    }

    @Override // o3.u
    public final Map a() {
        return this.f14619j;
    }

    @Override // o3.u
    public final boolean b() {
        return this.f14617h.contains("3");
    }

    @Override // o3.e
    public final boolean c() {
        return this.f14618i;
    }

    @Override // o3.e
    public final Date d() {
        return this.f14610a;
    }

    @Override // o3.e
    public final boolean e() {
        return this.f14613d;
    }

    @Override // o3.e
    public final Set f() {
        return this.f14612c;
    }

    @Override // o3.u
    public final r3.d g() {
        return eu.f(this.f14616g);
    }

    @Override // o3.u
    public final g3.e h() {
        eu euVar = this.f14616g;
        e.a aVar = new e.a();
        if (euVar != null) {
            int i10 = euVar.f7970m;
            if (i10 == 2) {
                aVar.b(euVar.f7974q);
                aVar.g(euVar.f7971n);
                aVar.c(euVar.f7972o);
                aVar.f(euVar.f7973p);
            } else {
                if (i10 != 3) {
                    if (i10 == 4) {
                        aVar.e(euVar.f7976s);
                        aVar.d(euVar.f7977t);
                    }
                    aVar.g(euVar.f7971n);
                    aVar.c(euVar.f7972o);
                    aVar.f(euVar.f7973p);
                }
                k3.v3 v3Var = euVar.f7975r;
                if (v3Var != null) {
                    aVar.h(new d3.x(v3Var));
                }
                aVar.b(euVar.f7974q);
                aVar.g(euVar.f7971n);
                aVar.c(euVar.f7972o);
                aVar.f(euVar.f7973p);
            }
        }
        return aVar.a();
    }

    @Override // o3.e
    public final int i() {
        return this.f14615f;
    }

    @Override // o3.u
    public final boolean j() {
        return this.f14617h.contains("6");
    }

    @Override // o3.e
    public final int k() {
        return this.f14611b;
    }
}
