package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ow2 implements uv2 {

    /* renamed from: i, reason: collision with root package name */
    private static final ow2 f13428i = new ow2();

    /* renamed from: j, reason: collision with root package name */
    private static final Handler f13429j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    private static Handler f13430k = null;

    /* renamed from: l, reason: collision with root package name */
    private static final Runnable f13431l = new lw2();

    /* renamed from: m, reason: collision with root package name */
    private static final Runnable f13432m = new mw2();

    /* renamed from: b, reason: collision with root package name */
    private int f13434b;

    /* renamed from: h, reason: collision with root package name */
    private long f13440h;

    /* renamed from: a, reason: collision with root package name */
    private final List f13433a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f13435c = false;

    /* renamed from: d, reason: collision with root package name */
    private final List f13436d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final iw2 f13438f = new iw2();

    /* renamed from: e, reason: collision with root package name */
    private final wv2 f13437e = new wv2();

    /* renamed from: g, reason: collision with root package name */
    private final jw2 f13439g = new jw2(new rw2());

    ow2() {
    }

    public static ow2 d() {
        return f13428i;
    }

    static /* bridge */ /* synthetic */ void g(ow2 ow2Var) throws JSONException {
        ow2Var.f13434b = 0;
        ow2Var.f13436d.clear();
        ow2Var.f13435c = false;
        for (cv2 cv2Var : mv2.a().b()) {
        }
        ow2Var.f13440h = System.nanoTime();
        ow2Var.f13438f.i();
        long jNanoTime = System.nanoTime();
        vv2 vv2VarA = ow2Var.f13437e.a();
        if (ow2Var.f13438f.e().size() > 0) {
            Iterator it = ow2Var.f13438f.e().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject jSONObjectA = dw2.a(0, 0, 0, 0);
                View viewA = ow2Var.f13438f.a(str);
                vv2 vv2VarB = ow2Var.f13437e.b();
                String strC = ow2Var.f13438f.c(str);
                if (strC != null) {
                    JSONObject jSONObjectA2 = vv2VarB.a(viewA);
                    dw2.b(jSONObjectA2, str);
                    try {
                        jSONObjectA2.put("notVisibleReason", strC);
                    } catch (JSONException e5) {
                        ew2.a("Error with setting not visible reason", e5);
                    }
                    dw2.c(jSONObjectA, jSONObjectA2);
                }
                dw2.f(jSONObjectA);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                ow2Var.f13439g.c(jSONObjectA, hashSet, jNanoTime);
            }
        }
        if (ow2Var.f13438f.f().size() > 0) {
            JSONObject jSONObjectA3 = dw2.a(0, 0, 0, 0);
            ow2Var.k(null, vv2VarA, jSONObjectA3, 1, false);
            dw2.f(jSONObjectA3);
            ow2Var.f13439g.d(jSONObjectA3, ow2Var.f13438f.f(), jNanoTime);
        } else {
            ow2Var.f13439g.b();
        }
        ow2Var.f13438f.g();
        long jNanoTime2 = System.nanoTime() - ow2Var.f13440h;
        if (ow2Var.f13433a.size() > 0) {
            for (nw2 nw2Var : ow2Var.f13433a) {
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                nw2Var.b();
            }
        }
    }

    private final void k(View view, vv2 vv2Var, JSONObject jSONObject, int i10, boolean z10) {
        vv2Var.b(view, jSONObject, this, i10 == 1, z10);
    }

    private static final void l() {
        Handler handler = f13430k;
        if (handler != null) {
            handler.removeCallbacks(f13432m);
            f13430k = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.uv2
    public final void a(View view, vv2 vv2Var, JSONObject jSONObject, boolean z10) throws JSONException {
        int iK;
        boolean z11;
        if (gw2.b(view) != null || (iK = this.f13438f.k(view)) == 3) {
            return;
        }
        JSONObject jSONObjectA = vv2Var.a(view);
        dw2.c(jSONObject, jSONObjectA);
        String strD = this.f13438f.d(view);
        if (strD != null) {
            dw2.b(jSONObjectA, strD);
            try {
                jSONObjectA.put("hasWindowFocus", Boolean.valueOf(this.f13438f.j(view)));
            } catch (JSONException e5) {
                ew2.a("Error with setting not visible reason", e5);
            }
            this.f13438f.h();
        } else {
            hw2 hw2VarB = this.f13438f.b(view);
            if (hw2VarB != null) {
                ov2 ov2VarA = hw2VarB.a();
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayListB = hw2VarB.b();
                int size = arrayListB.size();
                for (int i10 = 0; i10 < size; i10++) {
                    jSONArray.put((String) arrayListB.get(i10));
                }
                try {
                    jSONObjectA.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectA.put("friendlyObstructionClass", ov2VarA.d());
                    jSONObjectA.put("friendlyObstructionPurpose", ov2VarA.a());
                    jSONObjectA.put("friendlyObstructionReason", ov2VarA.c());
                } catch (JSONException e10) {
                    ew2.a("Error with setting friendly obstruction", e10);
                }
                z11 = true;
            } else {
                z11 = false;
            }
            k(view, vv2Var, jSONObjectA, iK, z10 || z11);
        }
        this.f13434b++;
    }

    public final void h() {
        l();
    }

    public final void i() {
        if (f13430k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f13430k = handler;
            handler.post(f13431l);
            f13430k.postDelayed(f13432m, 200L);
        }
    }

    public final void j() {
        l();
        this.f13433a.clear();
        f13429j.post(new kw2(this));
    }
}
