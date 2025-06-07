package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class bp1 {

    /* renamed from: f, reason: collision with root package name */
    private final Context f6616f;

    /* renamed from: g, reason: collision with root package name */
    private final WeakReference f6617g;

    /* renamed from: h, reason: collision with root package name */
    private final qk1 f6618h;

    /* renamed from: i, reason: collision with root package name */
    private final Executor f6619i;

    /* renamed from: j, reason: collision with root package name */
    private final Executor f6620j;

    /* renamed from: k, reason: collision with root package name */
    private final ScheduledExecutorService f6621k;

    /* renamed from: l, reason: collision with root package name */
    private final hn1 f6622l;

    /* renamed from: m, reason: collision with root package name */
    private final ff0 f6623m;

    /* renamed from: o, reason: collision with root package name */
    private final h81 f6625o;

    /* renamed from: p, reason: collision with root package name */
    private final cu2 f6626p;

    /* renamed from: a, reason: collision with root package name */
    private boolean f6611a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f6612b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6613c = false;

    /* renamed from: e, reason: collision with root package name */
    private final tf0 f6615e = new tf0();

    /* renamed from: n, reason: collision with root package name */
    private final Map f6624n = new ConcurrentHashMap();

    /* renamed from: q, reason: collision with root package name */
    private boolean f6627q = true;

    /* renamed from: d, reason: collision with root package name */
    private final long f6614d = j3.t.b().b();

    public bp1(Executor executor, Context context, WeakReference weakReference, Executor executor2, qk1 qk1Var, ScheduledExecutorService scheduledExecutorService, hn1 hn1Var, ff0 ff0Var, h81 h81Var, cu2 cu2Var) {
        this.f6618h = qk1Var;
        this.f6616f = context;
        this.f6617g = weakReference;
        this.f6619i = executor2;
        this.f6621k = scheduledExecutorService;
        this.f6620j = executor;
        this.f6622l = hn1Var;
        this.f6623m = ff0Var;
        this.f6625o = h81Var;
        this.f6626p = cu2Var;
        v("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    static /* bridge */ /* synthetic */ void j(final bp1 bp1Var, String str) throws JSONException {
        int i10 = 5;
        final ot2 ot2VarA = nt2.a(bp1Var.f6616f, 5);
        ot2VarA.g();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                final String next = itKeys.next();
                final ot2 ot2VarA2 = nt2.a(bp1Var.f6616f, i10);
                ot2VarA2.g();
                ot2VarA2.W(next);
                final Object obj = new Object();
                final tf0 tf0Var = new tf0();
                ab3 ab3VarN = qa3.n(tf0Var, ((Long) k3.w.c().b(ir.G1)).longValue(), TimeUnit.SECONDS, bp1Var.f6621k);
                bp1Var.f6622l.c(next);
                bp1Var.f6625o.Y(next);
                final long jB = j3.t.b().b();
                ab3VarN.b(new Runnable() { // from class: com.google.android.gms.internal.ads.so1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f15459m.q(obj, tf0Var, next, jB, ot2VarA2);
                    }
                }, bp1Var.f6619i);
                arrayList.add(ab3VarN);
                final ap1 ap1Var = new ap1(bp1Var, obj, next, jB, ot2VarA2, tf0Var);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                final ArrayList arrayList2 = new ArrayList();
                if (jSONObjectOptJSONObject != null) {
                    try {
                        JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray("data");
                        int i11 = 0;
                        while (i11 < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                            String strOptString = jSONObject2.optString("format", "");
                            JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (jSONObjectOptJSONObject2 != null) {
                                Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                                while (itKeys2.hasNext()) {
                                    String next2 = itKeys2.next();
                                    bundle.putString(next2, jSONObjectOptJSONObject2.optString(next2, ""));
                                    jSONArray = jSONArray;
                                }
                            }
                            JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new c00(strOptString, bundle));
                            i11++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                bp1Var.v(next, false, "", 0);
                try {
                    try {
                        final ap2 ap2VarC = bp1Var.f6618h.c(next, new JSONObject());
                        bp1Var.f6620j.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.wo1
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f17223m.n(ap2VarC, ap1Var, arrayList2, next);
                            }
                        });
                    } catch (io2 unused2) {
                        ap1Var.s("Failed to create Adapter.");
                    }
                } catch (RemoteException e5) {
                    ze0.e("", e5);
                }
                i10 = 5;
            }
            qa3.a(arrayList).a(new Callable() { // from class: com.google.android.gms.internal.ads.to1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    this.f15996a.f(ot2VarA);
                    return null;
                }
            }, bp1Var.f6619i);
        } catch (JSONException e10) {
            m3.n1.l("Malformed CLD response", e10);
            bp1Var.f6625o.o("MalformedJson");
            bp1Var.f6622l.a("MalformedJson");
            bp1Var.f6615e.f(e10);
            j3.t.q().u(e10, "AdapterInitializer.updateAdapterStatus");
            cu2 cu2Var = bp1Var.f6626p;
            ot2VarA.D0(e10);
            ot2VarA.B0(false);
            cu2Var.b(ot2VarA.l());
        }
    }

    private final synchronized ab3 u() {
        String strC = j3.t.q().h().g().c();
        if (!TextUtils.isEmpty(strC)) {
            return qa3.h(strC);
        }
        final tf0 tf0Var = new tf0();
        j3.t.q().h().r(new Runnable() { // from class: com.google.android.gms.internal.ads.xo1
            @Override // java.lang.Runnable
            public final void run() {
                this.f17650m.o(tf0Var);
            }
        });
        return tf0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(String str, boolean z10, String str2, int i10) {
        this.f6624n.put(str, new tz(str, z10, i10, str2));
    }

    final /* synthetic */ Object f(ot2 ot2Var) {
        this.f6615e.e(Boolean.TRUE);
        cu2 cu2Var = this.f6626p;
        ot2Var.B0(true);
        cu2Var.b(ot2Var.l());
        return null;
    }

    public final List g() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f6624n.keySet()) {
            tz tzVar = (tz) this.f6624n.get(str);
            arrayList.add(new tz(str, tzVar.f16102n, tzVar.f16103o, tzVar.f16104p));
        }
        return arrayList;
    }

    public final void l() {
        this.f6627q = false;
    }

    final /* synthetic */ void m() {
        synchronized (this) {
            if (this.f6613c) {
                return;
            }
            v("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (j3.t.b().b() - this.f6614d));
            this.f6622l.b("com.google.android.gms.ads.MobileAds", "timeout");
            this.f6625o.v("com.google.android.gms.ads.MobileAds", "timeout");
            this.f6615e.f(new Exception());
        }
    }

    final /* synthetic */ void n(ap2 ap2Var, yz yzVar, List list, String str) {
        try {
            try {
                Context context = (Context) this.f6617g.get();
                if (context == null) {
                    context = this.f6616f;
                }
                ap2Var.n(context, yzVar, list);
            } catch (RemoteException e5) {
                ze0.e("", e5);
            }
        } catch (io2 unused) {
            yzVar.s("Failed to initialize adapter. " + str + " does not implement the initialize() method.");
        }
    }

    final /* synthetic */ void o(final tf0 tf0Var) {
        this.f6619i.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.qo1
            @Override // java.lang.Runnable
            public final void run() {
                tf0 tf0Var2 = tf0Var;
                String strC = j3.t.q().h().g().c();
                if (TextUtils.isEmpty(strC)) {
                    tf0Var2.f(new Exception());
                } else {
                    tf0Var2.e(strC);
                }
            }
        });
    }

    final /* synthetic */ void p() {
        this.f6622l.e();
        this.f6625o.c();
        this.f6612b = true;
    }

    final /* synthetic */ void q(Object obj, tf0 tf0Var, String str, long j10, ot2 ot2Var) {
        synchronized (obj) {
            if (!tf0Var.isDone()) {
                v(str, false, "Timeout.", (int) (j3.t.b().b() - j10));
                this.f6622l.b(str, "timeout");
                this.f6625o.v(str, "timeout");
                cu2 cu2Var = this.f6626p;
                ot2Var.Y("Timeout");
                ot2Var.B0(false);
                cu2Var.b(ot2Var.l());
                tf0Var.e(Boolean.FALSE);
            }
        }
    }

    public final void r() {
        if (!((Boolean) jt.f10693a.e()).booleanValue()) {
            if (this.f6623m.f8254o >= ((Integer) k3.w.c().b(ir.F1)).intValue() && this.f6627q) {
                if (this.f6611a) {
                    return;
                }
                synchronized (this) {
                    if (this.f6611a) {
                        return;
                    }
                    this.f6622l.f();
                    this.f6625o.e();
                    this.f6615e.b(new Runnable() { // from class: com.google.android.gms.internal.ads.ro1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f14870m.p();
                        }
                    }, this.f6619i);
                    this.f6611a = true;
                    ab3 ab3VarU = u();
                    this.f6621k.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.uo1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f16416m.m();
                        }
                    }, ((Long) k3.w.c().b(ir.H1)).longValue(), TimeUnit.SECONDS);
                    qa3.q(ab3VarU, new zo1(this), this.f6619i);
                    return;
                }
            }
        }
        if (this.f6611a) {
            return;
        }
        v("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.f6615e.e(Boolean.FALSE);
        this.f6611a = true;
        this.f6612b = true;
    }

    public final void s(final b00 b00Var) {
        this.f6615e.b(new Runnable() { // from class: com.google.android.gms.internal.ads.vo1
            @Override // java.lang.Runnable
            public final void run() {
                bp1 bp1Var = this.f16824m;
                try {
                    b00Var.e3(bp1Var.g());
                } catch (RemoteException e5) {
                    ze0.e("", e5);
                }
            }
        }, this.f6620j);
    }

    public final boolean t() {
        return this.f6612b;
    }
}
