package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class jd2 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final bb3 f10433a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f10434b;

    /* renamed from: c, reason: collision with root package name */
    private final l52 f10435c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f10436d;

    /* renamed from: e, reason: collision with root package name */
    private final do2 f10437e;

    /* renamed from: f, reason: collision with root package name */
    private final h52 f10438f;

    /* renamed from: g, reason: collision with root package name */
    private final qk1 f10439g;

    /* renamed from: h, reason: collision with root package name */
    private final ep1 f10440h;

    /* renamed from: i, reason: collision with root package name */
    final String f10441i;

    public jd2(bb3 bb3Var, ScheduledExecutorService scheduledExecutorService, String str, l52 l52Var, Context context, do2 do2Var, h52 h52Var, qk1 qk1Var, ep1 ep1Var) {
        this.f10433a = bb3Var;
        this.f10434b = scheduledExecutorService;
        this.f10441i = str;
        this.f10435c = l52Var;
        this.f10436d = context;
        this.f10437e = do2Var;
        this.f10438f = h52Var;
        this.f10439g = qk1Var;
        this.f10440h = ep1Var;
    }

    public static /* synthetic */ ab3 c(jd2 jd2Var) {
        Map mapA = jd2Var.f10435c.a(jd2Var.f10441i, ((Boolean) k3.w.c().b(ir.f10021m9)).booleanValue() ? jd2Var.f10437e.f7447f.toLowerCase(Locale.ROOT) : jd2Var.f10437e.f7447f);
        final Bundle bundleA = ((Boolean) k3.w.c().b(ir.f10144y1)).booleanValue() ? jd2Var.f10440h.a() : new Bundle();
        final ArrayList arrayList = new ArrayList();
        Iterator it = ((f63) mapA).entrySet().iterator();
        while (true) {
            Bundle bundle = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            Bundle bundle2 = jd2Var.f10437e.f7445d.f24626y;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(str);
            }
            arrayList.add(jd2Var.f(str, list, bundle, true, true));
        }
        Iterator it2 = ((f63) jd2Var.f10435c.b()).entrySet().iterator();
        while (it2.hasNext()) {
            p52 p52Var = (p52) ((Map.Entry) it2.next()).getValue();
            String str2 = p52Var.f13593a;
            Bundle bundle3 = jd2Var.f10437e.f7445d.f24626y;
            arrayList.add(jd2Var.f(str2, Collections.singletonList(p52Var.f13596d), bundle3 != null ? bundle3.getBundle(str2) : null, p52Var.f13594b, p52Var.f13595c));
        }
        return qa3.b(arrayList).a(new Callable() { // from class: com.google.android.gms.internal.ads.gd2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<ab3> list2 = arrayList;
                Bundle bundle4 = bundleA;
                JSONArray jSONArray = new JSONArray();
                for (ab3 ab3Var : list2) {
                    if (((JSONObject) ab3Var.get()) != null) {
                        jSONArray.put(ab3Var.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new kd2(jSONArray.toString(), bundle4);
            }
        }, jd2Var.f10433a);
    }

    private final ga3 f(final String str, final List list, final Bundle bundle, final boolean z10, final boolean z11) {
        ga3 ga3VarD = ga3.D(qa3.k(new v93() { // from class: com.google.android.gms.internal.ads.hd2
            @Override // com.google.android.gms.internal.ads.v93
            public final ab3 a() {
                return this.f9104a.d(str, list, bundle, z10, z11);
            }
        }, this.f10433a));
        if (!((Boolean) k3.w.c().b(ir.f10100u1)).booleanValue()) {
            ga3VarD = (ga3) qa3.n(ga3VarD, ((Long) k3.w.c().b(ir.f10024n1)).longValue(), TimeUnit.MILLISECONDS, this.f10434b);
        }
        return (ga3) qa3.e(ga3VarD, Throwable.class, new w23() { // from class: com.google.android.gms.internal.ads.id2
            @Override // com.google.android.gms.internal.ads.w23
            public final Object a(Object obj) {
                ze0.d("Error calling adapter: ".concat(String.valueOf(str)));
                return null;
            }
        }, this.f10433a);
    }

    private final void g(l50 l50Var, Bundle bundle, List list, o52 o52Var) {
        l50Var.n3(l4.b.p1(this.f10436d), this.f10441i, bundle, (Bundle) list.get(0), this.f10437e.f7446e, o52Var);
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        return qa3.k(new v93() { // from class: com.google.android.gms.internal.ads.dd2
            @Override // com.google.android.gms.internal.ads.v93
            public final ab3 a() {
                return jd2.c(this.f7265a);
            }
        }, this.f10433a);
    }

    final /* synthetic */ ab3 d(String str, final List list, final Bundle bundle, boolean z10, boolean z11) {
        l50 l50VarB;
        final tf0 tf0Var = new tf0();
        if (z11) {
            this.f10438f.b(str);
            l50VarB = this.f10438f.a(str);
        } else {
            try {
                l50VarB = this.f10439g.b(str);
            } catch (RemoteException e5) {
                ze0.e("Couldn't create RTB adapter : ", e5);
                l50VarB = null;
            }
        }
        if (l50VarB == null) {
            if (!((Boolean) k3.w.c().b(ir.f10045p1)).booleanValue()) {
                throw null;
            }
            o52.L5(str, tf0Var);
        } else {
            final o52 o52Var = new o52(str, l50VarB, tf0Var, j3.t.b().b());
            if (((Boolean) k3.w.c().b(ir.f10100u1)).booleanValue()) {
                this.f10434b.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.ed2
                    @Override // java.lang.Runnable
                    public final void run() {
                        o52Var.d();
                    }
                }, ((Long) k3.w.c().b(ir.f10024n1)).longValue(), TimeUnit.MILLISECONDS);
            }
            if (z10) {
                if (((Boolean) k3.w.c().b(ir.f10155z1)).booleanValue()) {
                    final l50 l50Var = l50VarB;
                    this.f10433a.s(new Runnable() { // from class: com.google.android.gms.internal.ads.fd2
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f8229m.e(l50Var, bundle, list, o52Var, tf0Var);
                        }
                    });
                } else {
                    g(l50VarB, bundle, list, o52Var);
                }
            } else {
                o52Var.f();
            }
        }
        return tf0Var;
    }

    final /* synthetic */ void e(l50 l50Var, Bundle bundle, List list, o52 o52Var, tf0 tf0Var) {
        try {
            g(l50Var, bundle, list, o52Var);
        } catch (RemoteException e5) {
            tf0Var.f(e5);
        }
    }
}
