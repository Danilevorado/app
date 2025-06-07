package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ub0 implements zb0 {

    /* renamed from: m, reason: collision with root package name */
    private static final List f16259m = Collections.synchronizedList(new ArrayList());

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f16260n = 0;

    /* renamed from: a, reason: collision with root package name */
    private final n14 f16261a;

    /* renamed from: b, reason: collision with root package name */
    private final LinkedHashMap f16262b;

    /* renamed from: e, reason: collision with root package name */
    private final Context f16265e;

    /* renamed from: f, reason: collision with root package name */
    boolean f16266f;

    /* renamed from: g, reason: collision with root package name */
    private final wb0 f16267g;

    /* renamed from: l, reason: collision with root package name */
    private final vb0 f16272l;

    /* renamed from: c, reason: collision with root package name */
    private final List f16263c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final List f16264d = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final Object f16268h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private HashSet f16269i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    private boolean f16270j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f16271k = false;

    public ub0(Context context, ff0 ff0Var, wb0 wb0Var, String str, vb0 vb0Var) {
        e4.p.m(wb0Var, "SafeBrowsing config is not present.");
        this.f16265e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f16262b = new LinkedHashMap();
        this.f16272l = vb0Var;
        this.f16267g = wb0Var;
        Iterator it = wb0Var.f17044q.iterator();
        while (it.hasNext()) {
            this.f16269i.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.f16269i.remove("cookie".toLowerCase(Locale.ENGLISH));
        n14 n14VarK = x24.K();
        n14VarK.I(9);
        n14VarK.E(str);
        n14VarK.C(str);
        o14 o14VarK = p14.K();
        String str2 = this.f16267g.f17040m;
        if (str2 != null) {
            o14VarK.u(str2);
        }
        n14VarK.B((p14) o14VarK.m());
        s24 s24VarK = t24.K();
        s24VarK.w(k4.c.a(this.f16265e).g());
        String str3 = ff0Var.f8252m;
        if (str3 != null) {
            s24VarK.u(str3);
        }
        long jB = b4.f.h().b(this.f16265e);
        if (jB > 0) {
            s24VarK.v(jB);
        }
        n14VarK.A((t24) s24VarK.m());
        this.f16261a = n14VarK;
    }

    @Override // com.google.android.gms.internal.ads.zb0
    public final void Z(String str) {
        synchronized (this.f16268h) {
            if (str == null) {
                this.f16261a.y();
            } else {
                this.f16261a.z(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zb0
    public final wb0 a() {
        return this.f16267g;
    }

    @Override // com.google.android.gms.internal.ads.zb0
    public final void b(String str, Map map, int i10) {
        synchronized (this.f16268h) {
            if (i10 == 3) {
                this.f16271k = true;
            }
            if (this.f16262b.containsKey(str)) {
                if (i10 == 3) {
                    ((q24) this.f16262b.get(str)).z(4);
                }
                return;
            }
            q24 q24VarL = r24.L();
            int iA = p24.a(i10);
            if (iA != 0) {
                q24VarL.z(iA);
            }
            q24VarL.v(this.f16262b.size());
            q24VarL.y(str);
            a24 a24VarK = d24.K();
            if (!this.f16269i.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.f16269i.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        y14 y14VarK = z14.K();
                        y14VarK.u(ww3.J(str2));
                        y14VarK.v(ww3.J(str3));
                        a24VarK.u((z14) y14VarK.m());
                    }
                }
            }
            q24VarL.w((d24) a24VarK.m());
            this.f16262b.put(str, q24VarL);
        }
    }

    @Override // com.google.android.gms.internal.ads.zb0
    public final void c() {
        synchronized (this.f16268h) {
            this.f16262b.keySet();
            ab3 ab3VarH = qa3.h(Collections.emptyMap());
            w93 w93Var = new w93() { // from class: com.google.android.gms.internal.ads.rb0
                @Override // com.google.android.gms.internal.ads.w93
                public final ab3 a(Object obj) {
                    return this.f14721a.e((Map) obj);
                }
            };
            bb3 bb3Var = of0.f13191f;
            ab3 ab3VarM = qa3.m(ab3VarH, w93Var, bb3Var);
            ab3 ab3VarN = qa3.n(ab3VarM, 10L, TimeUnit.SECONDS, of0.f13189d);
            qa3.q(ab3VarM, new tb0(this, ab3VarN), bb3Var);
            f16259m.add(ab3VarN);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zb0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(android.view.View r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.wb0 r0 = r7.f16267g
            boolean r0 = r0.f17042o
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r7.f16270j
            if (r0 == 0) goto Lc
            return
        Lc:
            j3.t.r()
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L14
            goto L6d
        L14:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch: java.lang.RuntimeException -> L2d
            r8.setDrawingCacheEnabled(r0)     // Catch: java.lang.RuntimeException -> L2d
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch: java.lang.RuntimeException -> L2d
            if (r3 == 0) goto L26
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch: java.lang.RuntimeException -> L2d
            goto L27
        L26:
            r3 = r1
        L27:
            r8.setDrawingCacheEnabled(r2)     // Catch: java.lang.RuntimeException -> L2b
            goto L34
        L2b:
            r2 = move-exception
            goto L2f
        L2d:
            r2 = move-exception
            r3 = r1
        L2f:
            java.lang.String r4 = "Fail to capture the web view"
            com.google.android.gms.internal.ads.ze0.e(r4, r2)
        L34:
            if (r3 != 0) goto L6c
            int r2 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L65
            int r3 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L65
            if (r2 == 0) goto L5f
            if (r3 != 0) goto L43
            goto L5f
        L43:
            int r4 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L65
            int r5 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.RuntimeException -> L65
            r5.<init>(r4)     // Catch: java.lang.RuntimeException -> L65
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch: java.lang.RuntimeException -> L65
            r8.draw(r5)     // Catch: java.lang.RuntimeException -> L65
            r1 = r4
            goto L6d
        L5f:
            java.lang.String r8 = "Width or height of view is zero"
            com.google.android.gms.internal.ads.ze0.g(r8)     // Catch: java.lang.RuntimeException -> L65
            goto L6d
        L65:
            r8 = move-exception
            java.lang.String r2 = "Fail to capture the webview"
            com.google.android.gms.internal.ads.ze0.e(r2, r8)
            goto L6d
        L6c:
            r1 = r3
        L6d:
            if (r1 != 0) goto L75
            java.lang.String r8 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.yb0.a(r8)
            return
        L75:
            r7.f16270j = r0
            com.google.android.gms.internal.ads.sb0 r8 = new com.google.android.gms.internal.ads.sb0
            r8.<init>()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 == r1) goto L8e
            r8.run()
            return
        L8e:
            com.google.android.gms.internal.ads.bb3 r0 = com.google.android.gms.internal.ads.of0.f13186a
            r0.execute(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ub0.d(android.view.View):void");
    }

    final /* synthetic */ ab3 e(Map map) {
        q24 q24Var;
        ab3 ab3VarL;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (jSONArrayOptJSONArray != null) {
                        synchronized (this.f16268h) {
                            int length = jSONArrayOptJSONArray.length();
                            synchronized (this.f16268h) {
                                q24Var = (q24) this.f16262b.get(str);
                            }
                            if (q24Var == null) {
                                yb0.a("Cannot find the corresponding resource object for " + str);
                            } else {
                                for (int i10 = 0; i10 < length; i10++) {
                                    q24Var.u(jSONArrayOptJSONArray.getJSONObject(i10).getString("threat_type"));
                                }
                                this.f16266f = (length > 0) | this.f16266f;
                            }
                        }
                    }
                }
            } catch (JSONException e5) {
                if (((Boolean) lt.f11843b.e()).booleanValue()) {
                    ze0.c("Failed to get SafeBrowsing metadata", e5);
                }
                return qa3.g(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.f16266f) {
            synchronized (this.f16268h) {
                this.f16261a.I(10);
            }
        }
        boolean z10 = this.f16266f;
        if (!(z10 && this.f16267g.f17046s) && (!(this.f16271k && this.f16267g.f17045r) && (z10 || !this.f16267g.f17043p))) {
            return qa3.h(null);
        }
        synchronized (this.f16268h) {
            Iterator it = this.f16262b.values().iterator();
            while (it.hasNext()) {
                this.f16261a.w((r24) ((q24) it.next()).m());
            }
            this.f16261a.u(this.f16263c);
            this.f16261a.v(this.f16264d);
            if (yb0.b()) {
                StringBuilder sb2 = new StringBuilder("Sending SB report\n  url: " + this.f16261a.G() + "\n  clickUrl: " + this.f16261a.F() + "\n  resources: \n");
                for (r24 r24Var : this.f16261a.H()) {
                    sb2.append("    [");
                    sb2.append(r24Var.K());
                    sb2.append("] ");
                    sb2.append(r24Var.N());
                }
                yb0.a(sb2.toString());
            }
            ab3 ab3VarB = new m3.q0(this.f16265e).b(1, this.f16267g.f17041n, null, ((x24) this.f16261a.m()).x());
            if (yb0.b()) {
                ab3VarB.b(new Runnable() { // from class: com.google.android.gms.internal.ads.pb0
                    @Override // java.lang.Runnable
                    public final void run() {
                        yb0.a("Pinged SB successfully.");
                    }
                }, of0.f13186a);
            }
            ab3VarL = qa3.l(ab3VarB, new w23() { // from class: com.google.android.gms.internal.ads.qb0
                @Override // com.google.android.gms.internal.ads.w23
                public final Object a(Object obj) {
                    int i11 = ub0.f16260n;
                    return null;
                }
            }, of0.f13191f);
        }
        return ab3VarL;
    }

    final /* synthetic */ void g(Bitmap bitmap) {
        tw3 tw3VarF = ww3.F();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, tw3VarF);
        synchronized (this.f16268h) {
            n14 n14Var = this.f16261a;
            i24 i24VarK = k24.K();
            i24VarK.u(tw3VarF.c());
            i24VarK.v("image/png");
            i24VarK.w(2);
            n14Var.D((k24) i24VarK.m());
        }
    }

    @Override // com.google.android.gms.internal.ads.zb0
    public final boolean i() {
        return i4.m.d() && this.f16267g.f17042o && !this.f16270j;
    }
}
