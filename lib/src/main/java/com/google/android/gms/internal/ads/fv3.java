package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class fv3 {

    /* renamed from: b, reason: collision with root package name */
    public static final fv3 f8456b = new fv3(new gv3());

    /* renamed from: c, reason: collision with root package name */
    public static final fv3 f8457c = new fv3(new kv3());

    /* renamed from: d, reason: collision with root package name */
    public static final fv3 f8458d = new fv3(new mv3());

    /* renamed from: e, reason: collision with root package name */
    public static final fv3 f8459e = new fv3(new lv3());

    /* renamed from: f, reason: collision with root package name */
    public static final fv3 f8460f = new fv3(new hv3());

    /* renamed from: g, reason: collision with root package name */
    public static final fv3 f8461g = new fv3(new jv3());

    /* renamed from: h, reason: collision with root package name */
    public static final fv3 f8462h = new fv3(new iv3());

    /* renamed from: a, reason: collision with root package name */
    private final ev3 f8463a;

    public fv3(nv3 nv3Var) {
        this.f8463a = zh3.b() ? new dv3(nv3Var, null) : xv3.a() ? new yu3(nv3Var, null) : new bv3(nv3Var, null);
    }

    public static List b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object a(String str) {
        return this.f8463a.o(str);
    }
}
