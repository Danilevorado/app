package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class ou2 {

    /* renamed from: a, reason: collision with root package name */
    private final t22 f13394a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13395b;

    /* renamed from: c, reason: collision with root package name */
    private final String f13396c;

    /* renamed from: d, reason: collision with root package name */
    private final String f13397d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f13398e;

    /* renamed from: f, reason: collision with root package name */
    private final vn2 f13399f;

    /* renamed from: g, reason: collision with root package name */
    private final wn2 f13400g;

    /* renamed from: h, reason: collision with root package name */
    private final i4.e f13401h;

    /* renamed from: i, reason: collision with root package name */
    private final bg f13402i;

    public ou2(t22 t22Var, ff0 ff0Var, String str, String str2, Context context, vn2 vn2Var, wn2 wn2Var, i4.e eVar, bg bgVar) {
        this.f13394a = t22Var;
        this.f13395b = ff0Var.f8252m;
        this.f13396c = str;
        this.f13397d = str2;
        this.f13398e = context;
        this.f13399f = vn2Var;
        this.f13400g = wn2Var;
        this.f13401h = eVar;
        this.f13402i = bgVar;
    }

    public static final List f(int i10, int i11, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(i((String) it.next(), "@gw_mpe@", "2." + i11));
        }
        return arrayList;
    }

    public static final List g(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(i((String) it.next(), "@gw_adnetstatus@", str));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String h(String str) {
        return TextUtils.isEmpty(str) ? "" : ye0.k() ? "fakeForAdDebugLog" : str;
    }

    private static String i(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final List c(un2 un2Var, hn2 hn2Var, List list) {
        return d(un2Var, hn2Var, false, "", "", list);
    }

    public final List d(un2 un2Var, hn2 hn2Var, boolean z10, String str, String str2, List list) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z11 = true;
            String strI = i(i(i((String) it.next(), "@gw_adlocid@", un2Var.f16412a.f14851a.f7447f), "@gw_adnetrefresh@", true != z10 ? "0" : "1"), "@gw_sdkver@", this.f13395b);
            if (hn2Var != null) {
                strI = gd0.c(i(i(i(strI, "@gw_qdata@", hn2Var.f9278z), "@gw_adnetid@", hn2Var.f9277y), "@gw_allocid@", hn2Var.f9276x), this.f13398e, hn2Var.X);
            }
            String strI2 = i(i(i(strI, "@gw_adnetstatus@", this.f13394a.f()), "@gw_seqnum@", this.f13396c), "@gw_sessid@", this.f13397d);
            boolean z12 = false;
            if (((Boolean) k3.w.c().b(ir.f9918d3)).booleanValue() && !TextUtils.isEmpty(str)) {
                z12 = true;
            }
            boolean z13 = !TextUtils.isEmpty(str2);
            if (z12) {
                z11 = z13;
            } else {
                if (z13) {
                }
                arrayList.add(strI2);
            }
            if (this.f13402i.f(Uri.parse(strI2))) {
                Uri.Builder builderBuildUpon = Uri.parse(strI2).buildUpon();
                if (z12) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("ms", str);
                }
                if (z11) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("attok", str2);
                }
                strI2 = builderBuildUpon.build().toString();
            }
            arrayList.add(strI2);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f A[LOOP:0: B:13:0x0059->B:15:0x005f, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List e(com.google.android.gms.internal.ads.hn2 r10, java.util.List r11, com.google.android.gms.internal.ads.aa0 r12) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            i4.e r1 = r9.f13401h
            long r1 = r1.a()
            java.lang.String r3 = r12.d()     // Catch: android.os.RemoteException -> La8
            int r12 = r12.b()     // Catch: android.os.RemoteException -> La8
            java.lang.String r12 = java.lang.Integer.toString(r12)     // Catch: android.os.RemoteException -> La8
            com.google.android.gms.internal.ads.zq r4 = com.google.android.gms.internal.ads.ir.f9929e3
            com.google.android.gms.internal.ads.gr r5 = k3.w.c()
            java.lang.Object r4 = r5.b(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L35
            com.google.android.gms.internal.ads.wn2 r4 = r9.f13400g
            if (r4 != 0) goto L32
            com.google.android.gms.internal.ads.e33 r4 = com.google.android.gms.internal.ads.e33.c()
            goto L3b
        L32:
            com.google.android.gms.internal.ads.vn2 r4 = r4.f17213a
            goto L37
        L35:
            com.google.android.gms.internal.ads.vn2 r4 = r9.f13399f
        L37:
            com.google.android.gms.internal.ads.e33 r4 = com.google.android.gms.internal.ads.e33.d(r4)
        L3b:
            com.google.android.gms.internal.ads.mu2 r5 = new com.google.android.gms.internal.ads.w23() { // from class: com.google.android.gms.internal.ads.mu2
                static {
                    /*
                        com.google.android.gms.internal.ads.mu2 r0 = new com.google.android.gms.internal.ads.mu2
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.google.android.gms.internal.ads.mu2) com.google.android.gms.internal.ads.mu2.a com.google.android.gms.internal.ads.mu2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mu2.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mu2.<init>():void");
                }

                @Override // com.google.android.gms.internal.ads.w23
                public final java.lang.Object a(java.lang.Object r1) {
                    /*
                        r0 = this;
                        com.google.android.gms.internal.ads.vn2 r1 = (com.google.android.gms.internal.ads.vn2) r1
                        java.lang.String r1 = com.google.android.gms.internal.ads.ou2.a(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mu2.a(java.lang.Object):java.lang.Object");
                }
            }
            com.google.android.gms.internal.ads.e33 r5 = r4.a(r5)
            java.lang.String r6 = ""
            java.lang.Object r5 = r5.b(r6)
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.nu2 r7 = new com.google.android.gms.internal.ads.w23() { // from class: com.google.android.gms.internal.ads.nu2
                static {
                    /*
                        com.google.android.gms.internal.ads.nu2 r0 = new com.google.android.gms.internal.ads.nu2
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.google.android.gms.internal.ads.nu2) com.google.android.gms.internal.ads.nu2.a com.google.android.gms.internal.ads.nu2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nu2.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nu2.<init>():void");
                }

                @Override // com.google.android.gms.internal.ads.w23
                public final java.lang.Object a(java.lang.Object r1) {
                    /*
                        r0 = this;
                        com.google.android.gms.internal.ads.vn2 r1 = (com.google.android.gms.internal.ads.vn2) r1
                        java.lang.String r1 = com.google.android.gms.internal.ads.ou2.b(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nu2.a(java.lang.Object):java.lang.Object");
                }
            }
            com.google.android.gms.internal.ads.e33 r4 = r4.a(r7)
            java.lang.Object r4 = r4.b(r6)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Iterator r11 = r11.iterator()
        L59:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto La7
            java.lang.Object r6 = r11.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = android.net.Uri.encode(r5)
            java.lang.String r8 = "@gw_rwd_userid@"
            java.lang.String r6 = i(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r4)
            java.lang.String r8 = "@gw_rwd_custom_data@"
            java.lang.String r6 = i(r6, r8, r7)
            java.lang.String r7 = java.lang.Long.toString(r1)
            java.lang.String r8 = "@gw_tmstmp@"
            java.lang.String r6 = i(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r3)
            java.lang.String r8 = "@gw_rwd_itm@"
            java.lang.String r6 = i(r6, r8, r7)
            java.lang.String r7 = "@gw_rwd_amt@"
            java.lang.String r6 = i(r6, r7, r12)
            java.lang.String r7 = r9.f13395b
            java.lang.String r8 = "@gw_sdkver@"
            java.lang.String r6 = i(r6, r8, r7)
            android.content.Context r7 = r9.f13398e
            boolean r8 = r10.X
            java.lang.String r6 = com.google.android.gms.internal.ads.gd0.c(r6, r7, r8)
            r0.add(r6)
            goto L59
        La7:
            return r0
        La8:
            r10 = move-exception
            java.lang.String r11 = "Unable to determine award type and amount."
            com.google.android.gms.internal.ads.ze0.e(r11, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ou2.e(com.google.android.gms.internal.ads.hn2, java.util.List, com.google.android.gms.internal.ads.aa0):java.util.List");
    }
}
