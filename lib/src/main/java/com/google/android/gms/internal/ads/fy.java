package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes.dex */
public abstract class fy {

    /* renamed from: a, reason: collision with root package name */
    public static final gy f8476a = new gy() { // from class: com.google.android.gms.internal.ads.jx
        @Override // com.google.android.gms.internal.ads.gy
        public final void a(Object obj, Map map) {
            pl0 pl0Var = (pl0) obj;
            gy gyVar = fy.f8476a;
            String str = (String) map.get("urls");
            if (TextUtils.isEmpty(str)) {
                ze0.g("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] strArrSplit = str.split(",");
            HashMap map2 = new HashMap();
            PackageManager packageManager = pl0Var.getContext().getPackageManager();
            for (String str2 : strArrSplit) {
                String[] strArrSplit2 = str2.split(";", 2);
                boolean z10 = true;
                if (packageManager.resolveActivity(new Intent(strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "android.intent.action.VIEW", Uri.parse(strArrSplit2[0].trim())), 65536) == null) {
                    z10 = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z10);
                map2.put(str2, boolValueOf);
                m3.n1.k("/canOpenURLs;" + str2 + ";" + boolValueOf);
            }
            ((p00) pl0Var).c("openableURLs", map2);
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public static final gy f8477b = new gy() { // from class: com.google.android.gms.internal.ads.kx
        @Override // com.google.android.gms.internal.ads.gy
        public final void a(Object obj, Map map) {
            pl0 pl0Var = (pl0) obj;
            gy gyVar = fy.f8476a;
            if (!((Boolean) k3.w.c().b(ir.H7)).booleanValue()) {
                ze0.g("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get("package_name");
            if (TextUtils.isEmpty(str)) {
                ze0.g("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap map2 = new HashMap();
            Boolean boolValueOf = Boolean.valueOf(pl0Var.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
            map2.put(str, boolValueOf);
            m3.n1.k("/canOpenApp;" + str + ";" + boolValueOf);
            ((p00) pl0Var).c("openableApp", map2);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    public static final gy f8478c = new gy() { // from class: com.google.android.gms.internal.ads.cx
        @Override // com.google.android.gms.internal.ads.gy
        public final void a(Object obj, Map map) throws JSONException, URISyntaxException {
            fy.b((pl0) obj, map);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    public static final gy f8479d = new wx();

    /* renamed from: e, reason: collision with root package name */
    public static final gy f8480e = new xx();

    /* renamed from: f, reason: collision with root package name */
    public static final gy f8481f = new gy() { // from class: com.google.android.gms.internal.ads.ix
        @Override // com.google.android.gms.internal.ads.gy
        public final void a(Object obj, Map map) {
            pl0 pl0Var = (pl0) obj;
            gy gyVar = fy.f8476a;
            String str = (String) map.get("u");
            if (str == null) {
                ze0.g("URL missing from httpTrack GMSG.");
            } else {
                new m3.a1(pl0Var.getContext(), ((yl0) pl0Var).m().f8252m, str).b();
            }
        }
    };

    /* renamed from: g, reason: collision with root package name */
    public static final gy f8482g = new yx();

    /* renamed from: h, reason: collision with root package name */
    public static final gy f8483h = new zx();

    /* renamed from: i, reason: collision with root package name */
    public static final gy f8484i = new gy() { // from class: com.google.android.gms.internal.ads.hx
        @Override // com.google.android.gms.internal.ads.gy
        public final void a(Object obj, Map map) throws NumberFormatException {
            xl0 xl0Var = (xl0) obj;
            gy gyVar = fy.f8476a;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int i10 = Integer.parseInt(str);
                int i11 = Integer.parseInt(str2);
                int i12 = Integer.parseInt(str3);
                bg bgVarL = xl0Var.L();
                if (bgVarL != null) {
                    bgVarL.c().f(i10, i11, i12);
                }
            } catch (NumberFormatException unused) {
                ze0.g("Could not parse touch parameters from gmsg.");
            }
        }
    };

    /* renamed from: j, reason: collision with root package name */
    public static final gy f8485j = new ay();

    /* renamed from: k, reason: collision with root package name */
    public static final gy f8486k = new by();

    /* renamed from: l, reason: collision with root package name */
    public static final gy f8487l = new li0();

    /* renamed from: m, reason: collision with root package name */
    public static final gy f8488m = new mi0();

    /* renamed from: n, reason: collision with root package name */
    public static final gy f8489n = new ax();

    /* renamed from: o, reason: collision with root package name */
    public static final uy f8490o = new uy();

    /* renamed from: p, reason: collision with root package name */
    public static final gy f8491p = new dy();

    /* renamed from: q, reason: collision with root package name */
    public static final gy f8492q = new ey();

    /* renamed from: r, reason: collision with root package name */
    public static final gy f8493r = new lx();

    /* renamed from: s, reason: collision with root package name */
    public static final gy f8494s = new mx();

    /* renamed from: t, reason: collision with root package name */
    public static final gy f8495t = new nx();

    /* renamed from: u, reason: collision with root package name */
    public static final gy f8496u = new ox();

    /* renamed from: v, reason: collision with root package name */
    public static final gy f8497v = new px();

    /* renamed from: w, reason: collision with root package name */
    public static final gy f8498w = new qx();

    /* renamed from: x, reason: collision with root package name */
    public static final gy f8499x = new rx();

    /* renamed from: y, reason: collision with root package name */
    public static final gy f8500y = new sx();

    /* renamed from: z, reason: collision with root package name */
    public static final gy f8501z = new tx();
    public static final gy A = new ux();

    public static ab3 a(nk0 nk0Var, String str) {
        Uri uriA = Uri.parse(str);
        try {
            bg bgVarL = nk0Var.L();
            if (bgVarL != null && bgVarL.f(uriA)) {
                uriA = bgVarL.a(uriA, nk0Var.getContext(), nk0Var.z(), nk0Var.i());
            }
        } catch (cg unused) {
            ze0.g("Unable to append parameter to URL: ".concat(str));
        }
        final String strB = gd0.b(uriA, nk0Var.getContext());
        long jLongValue = ((Long) bt.f6659e.e()).longValue();
        if (jLongValue <= 0 || jLongValue > 231004600) {
            return qa3.h(strB);
        }
        ga3 ga3VarD = ga3.D(nk0Var.l1());
        dx dxVar = new w23() { // from class: com.google.android.gms.internal.ads.dx
            @Override // com.google.android.gms.internal.ads.w23
            public final Object a(Object obj) {
                Throwable th = (Throwable) obj;
                gy gyVar = fy.f8476a;
                if (!((Boolean) bt.f6665k.e()).booleanValue()) {
                    return "failure_click_attok";
                }
                j3.t.q().u(th, "prepareClickUrl.attestation1");
                return "failure_click_attok";
            }
        };
        bb3 bb3Var = of0.f13191f;
        return qa3.e(qa3.l(qa3.e(ga3VarD, Throwable.class, dxVar, bb3Var), new w23() { // from class: com.google.android.gms.internal.ads.ex
            /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
            @Override // com.google.android.gms.internal.ads.w23
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.String r0 = r1
                    java.lang.String r6 = (java.lang.String) r6
                    com.google.android.gms.internal.ads.gy r1 = com.google.android.gms.internal.ads.fy.f8476a
                    if (r6 != 0) goto L9
                    goto L74
                L9:
                    com.google.android.gms.internal.ads.os r1 = com.google.android.gms.internal.ads.bt.f6660f
                    java.lang.Object r1 = r1.e()
                    java.lang.Boolean r1 = (java.lang.Boolean) r1
                    boolean r1 = r1.booleanValue()
                    if (r1 != 0) goto L18
                    goto L39
                L18:
                    java.lang.String r1 = ".doubleclick.net"
                    java.lang.String r2 = ".googleadservices.com"
                    java.lang.String r3 = ".googlesyndication.com"
                    java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3}
                    android.net.Uri r2 = android.net.Uri.parse(r0)
                    java.lang.String r2 = r2.getHost()
                    r3 = 0
                L2b:
                    r4 = 3
                    if (r3 >= r4) goto L74
                    r4 = r1[r3]
                    boolean r4 = r2.endsWith(r4)
                    if (r4 != 0) goto L39
                    int r3 = r3 + 1
                    goto L2b
                L39:
                    com.google.android.gms.internal.ads.os r1 = com.google.android.gms.internal.ads.bt.f6655a
                    java.lang.Object r1 = r1.e()
                    java.lang.String r1 = (java.lang.String) r1
                    com.google.android.gms.internal.ads.os r2 = com.google.android.gms.internal.ads.bt.f6656b
                    java.lang.Object r2 = r2.e()
                    java.lang.String r2 = (java.lang.String) r2
                    boolean r3 = android.text.TextUtils.isEmpty(r1)
                    if (r3 != 0) goto L53
                    java.lang.String r0 = r0.replace(r1, r6)
                L53:
                    boolean r1 = android.text.TextUtils.isEmpty(r2)
                    if (r1 != 0) goto L74
                    android.net.Uri r1 = android.net.Uri.parse(r0)
                    java.lang.String r3 = r1.getQueryParameter(r2)
                    boolean r3 = android.text.TextUtils.isEmpty(r3)
                    if (r3 == 0) goto L74
                    android.net.Uri$Builder r0 = r1.buildUpon()
                    android.net.Uri$Builder r6 = r0.appendQueryParameter(r2, r6)
                    java.lang.String r6 = r6.toString()
                    return r6
                L74:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ex.a(java.lang.Object):java.lang.Object");
            }
        }, bb3Var), Throwable.class, new w23() { // from class: com.google.android.gms.internal.ads.fx
            @Override // com.google.android.gms.internal.ads.w23
            public final Object a(Object obj) {
                String str2 = strB;
                Throwable th = (Throwable) obj;
                gy gyVar = fy.f8476a;
                if (((Boolean) bt.f6665k.e()).booleanValue()) {
                    j3.t.q().u(th, "prepareClickUrl.attestation2");
                }
                return str2;
            }
        }, bb3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ void b(com.google.android.gms.internal.ads.pl0 r16, java.util.Map r17) throws org.json.JSONException, java.net.URISyntaxException {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fy.b(com.google.android.gms.internal.ads.pl0, java.util.Map):void");
    }

    public static void c(Map map, f91 f91Var) {
        if (((Boolean) k3.w.c().b(ir.f9977i9)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && f91Var != null) {
            f91Var.r();
        }
    }
}
