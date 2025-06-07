package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class xv1 extends y80 {

    /* renamed from: m, reason: collision with root package name */
    private final Context f17816m;

    /* renamed from: n, reason: collision with root package name */
    private final tf2 f17817n;

    /* renamed from: o, reason: collision with root package name */
    private final rf2 f17818o;

    /* renamed from: p, reason: collision with root package name */
    private final fw1 f17819p;

    /* renamed from: q, reason: collision with root package name */
    private final bb3 f17820q;

    /* renamed from: r, reason: collision with root package name */
    private final cw1 f17821r;

    /* renamed from: s, reason: collision with root package name */
    private final w90 f17822s;

    xv1(Context context, tf2 tf2Var, rf2 rf2Var, cw1 cw1Var, fw1 fw1Var, bb3 bb3Var, w90 w90Var) {
        this.f17816m = context;
        this.f17817n = tf2Var;
        this.f17818o = rf2Var;
        this.f17821r = cw1Var;
        this.f17819p = fw1Var;
        this.f17820q = bb3Var;
        this.f17822s = w90Var;
    }

    private final void M5(ab3 ab3Var, c90 c90Var) {
        qa3.q(qa3.m(ga3.D(ab3Var), new w93() { // from class: com.google.android.gms.internal.ads.pv1
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return qa3.h(ep2.a((InputStream) obj));
            }
        }, of0.f13186a), new wv1(this, c90Var), of0.f13191f);
    }

    @Override // com.google.android.gms.internal.ads.z80
    public final void K2(o80 o80Var, c90 c90Var) {
        int callingUid = Binder.getCallingUid();
        tf2 tf2Var = this.f17817n;
        tf2Var.a(new if2(o80Var, callingUid));
        final uf2 uf2VarB = tf2Var.b();
        ls2 ls2VarB = uf2VarB.b();
        qr2 qr2VarA = ls2VarB.b(fs2.GMS_SIGNALS, qa3.i()).f(new w93() { // from class: com.google.android.gms.internal.ads.uv1
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return uf2VarB.a().a(new JSONObject());
            }
        }).e(new nr2() { // from class: com.google.android.gms.internal.ads.tv1
            @Override // com.google.android.gms.internal.ads.nr2
            public final Object a(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                m3.n1.k("GMS AdRequest Signals: ");
                m3.n1.k(jSONObject.toString(2));
                return jSONObject;
            }
        }).f(new w93() { // from class: com.google.android.gms.internal.ads.sv1
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return qa3.h(new ByteArrayInputStream(((JSONObject) obj).toString().getBytes(StandardCharsets.UTF_8)));
            }
        }).a();
        M5(qr2VarA, c90Var);
        if (((Boolean) ct.f7059d.e()).booleanValue()) {
            final fw1 fw1Var = this.f17819p;
            fw1Var.getClass();
            qr2VarA.b(new Runnable() { // from class: com.google.android.gms.internal.ads.qv1
                @Override // java.lang.Runnable
                public final void run() {
                    fw1Var.b();
                }
            }, this.f17820q);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.ab3 L5(com.google.android.gms.internal.ads.s80 r9, int r10) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zv1 r7 = new com.google.android.gms.internal.ads.zv1
            java.lang.String r1 = r9.f15145m
            int r2 = r9.f15146n
            android.os.Bundle r0 = r9.f15147o
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            if (r0 == 0) goto L2d
            java.util.Set r4 = r0.keySet()
            java.util.Iterator r4 = r4.iterator()
        L17:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L2d
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = r0.getString(r5)
            if (r6 == 0) goto L17
            r3.put(r5, r6)
            goto L17
        L2d:
            byte[] r4 = r9.f15148p
            boolean r6 = r9.f15149q
            java.lang.String r5 = ""
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.google.android.gms.internal.ads.rf2 r0 = r8.f17818o
            com.google.android.gms.internal.ads.zg2 r1 = new com.google.android.gms.internal.ads.zg2
            r1.<init>(r9)
            r0.a(r1)
            com.google.android.gms.internal.ads.sf2 r0 = r0.b()
            boolean r1 = r7.f18779f
            if (r1 == 0) goto La5
            java.lang.String r9 = r9.f15145m
            com.google.android.gms.internal.ads.os r1 = com.google.android.gms.internal.ads.kt.f11215c
            java.lang.Object r1 = r1.e()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L5a
            goto La5
        L5a:
            android.net.Uri r9 = android.net.Uri.parse(r9)
            java.lang.String r9 = r9.getHost()
            boolean r2 = android.text.TextUtils.isEmpty(r9)
            if (r2 != 0) goto La5
            r2 = 59
            com.google.android.gms.internal.ads.t23 r2 = com.google.android.gms.internal.ads.t23.c(r2)
            com.google.android.gms.internal.ads.w33 r2 = com.google.android.gms.internal.ads.w33.c(r2)
            java.lang.Iterable r1 = r2.d(r1)
            java.util.Iterator r1 = r1.iterator()
        L7a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La5
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r9.endsWith(r2)
            if (r2 == 0) goto L7a
            com.google.android.gms.internal.ads.ne2 r9 = r0.a()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            com.google.android.gms.internal.ads.ab3 r9 = r9.a(r1)
            com.google.android.gms.internal.ads.vv1 r1 = new com.google.android.gms.internal.ads.vv1
            r1.<init>()
            com.google.android.gms.internal.ads.bb3 r2 = r8.f17820q
            com.google.android.gms.internal.ads.ab3 r9 = com.google.android.gms.internal.ads.qa3.l(r9, r1, r2)
            goto La9
        La5:
            com.google.android.gms.internal.ads.ab3 r9 = com.google.android.gms.internal.ads.qa3.h(r7)
        La9:
            com.google.android.gms.internal.ads.ls2 r0 = r0.b()
            android.content.Context r1 = r8.f17816m
            com.google.android.gms.internal.ads.w90 r2 = r8.f17822s
            com.google.android.gms.internal.ads.bw1 r3 = new com.google.android.gms.internal.ads.bw1
            java.lang.String r4 = ""
            r3.<init>(r1, r4, r2, r10)
            com.google.android.gms.internal.ads.fs2 r10 = com.google.android.gms.internal.ads.fs2.HTTP
            com.google.android.gms.internal.ads.cs2 r9 = r0.b(r10, r9)
            com.google.android.gms.internal.ads.cs2 r9 = r9.e(r3)
            com.google.android.gms.internal.ads.qr2 r9 = r9.a()
            com.google.android.gms.internal.ads.rv1 r10 = new com.google.android.gms.internal.ads.w93() { // from class: com.google.android.gms.internal.ads.rv1
                static {
                    /*
                        com.google.android.gms.internal.ads.rv1 r0 = new com.google.android.gms.internal.ads.rv1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.google.android.gms.internal.ads.rv1) com.google.android.gms.internal.ads.rv1.a com.google.android.gms.internal.ads.rv1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rv1.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rv1.<init>():void");
                }

                @Override // com.google.android.gms.internal.ads.w93
                public final com.google.android.gms.internal.ads.ab3 a(java.lang.Object r9) throws org.json.JSONException {
                    /*
                        r8 = this;
                        com.google.android.gms.internal.ads.aw1 r9 = (com.google.android.gms.internal.ads.aw1) r9
                        java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
                        org.json.JSONObject r1 = new org.json.JSONObject
                        r1.<init>()
                        java.lang.String r2 = "response"
                        int r3 = r9.f6271a     // Catch: org.json.JSONException -> L7b
                        r1.put(r2, r3)     // Catch: org.json.JSONException -> L7b
                        org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L7b
                        r2.<init>()     // Catch: org.json.JSONException -> L7b
                        java.util.Map r3 = r9.f6272b     // Catch: org.json.JSONException -> L7b
                        java.util.Set r3 = r3.keySet()     // Catch: org.json.JSONException -> L7b
                        java.util.Iterator r3 = r3.iterator()     // Catch: org.json.JSONException -> L7b
                    L1f:
                        boolean r4 = r3.hasNext()     // Catch: org.json.JSONException -> L7b
                        if (r4 == 0) goto L54
                        java.lang.Object r4 = r3.next()     // Catch: org.json.JSONException -> L7b
                        java.lang.String r4 = (java.lang.String) r4     // Catch: org.json.JSONException -> L7b
                        if (r4 == 0) goto L1f
                        java.util.Map r5 = r9.f6272b     // Catch: org.json.JSONException -> L7b
                        java.lang.Object r5 = r5.get(r4)     // Catch: org.json.JSONException -> L7b
                        java.util.List r5 = (java.util.List) r5     // Catch: org.json.JSONException -> L7b
                        org.json.JSONArray r6 = new org.json.JSONArray     // Catch: org.json.JSONException -> L7b
                        r6.<init>()     // Catch: org.json.JSONException -> L7b
                        java.util.Iterator r5 = r5.iterator()     // Catch: org.json.JSONException -> L7b
                    L3e:
                        boolean r7 = r5.hasNext()     // Catch: org.json.JSONException -> L7b
                        if (r7 == 0) goto L50
                        java.lang.Object r7 = r5.next()     // Catch: org.json.JSONException -> L7b
                        java.lang.String r7 = (java.lang.String) r7     // Catch: org.json.JSONException -> L7b
                        if (r7 == 0) goto L3e
                        r6.put(r7)     // Catch: org.json.JSONException -> L7b
                        goto L3e
                    L50:
                        r2.put(r4, r6)     // Catch: org.json.JSONException -> L7b
                        goto L1f
                    L54:
                        java.lang.String r3 = "headers"
                        r1.put(r3, r2)     // Catch: org.json.JSONException -> L7b
                        java.lang.String r2 = r9.f6273c     // Catch: org.json.JSONException -> L7b
                        if (r2 == 0) goto L62
                        java.lang.String r3 = "body"
                        r1.put(r3, r2)     // Catch: org.json.JSONException -> L7b
                    L62:
                        java.lang.String r2 = "latency"
                        long r3 = r9.f6274d     // Catch: org.json.JSONException -> L7b
                        r1.put(r2, r3)     // Catch: org.json.JSONException -> L7b
                        java.lang.String r9 = r1.toString()
                        java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
                        byte[] r9 = r9.getBytes(r1)
                        r0.<init>(r9)
                        com.google.android.gms.internal.ads.ab3 r9 = com.google.android.gms.internal.ads.qa3.h(r0)
                        return r9
                    L7b:
                        r9 = move-exception
                        java.lang.String r0 = r9.getMessage()
                        java.lang.String r0 = java.lang.String.valueOf(r0)
                        java.lang.String r1 = "Error converting response to JSONObject: "
                        java.lang.String r0 = r1.concat(r0)
                        com.google.android.gms.internal.ads.ze0.g(r0)
                        org.json.JSONException r0 = new org.json.JSONException
                        java.lang.Throwable r9 = r9.getCause()
                        java.lang.String r9 = java.lang.String.valueOf(r9)
                        java.lang.String r1 = "Parsing HTTP Response: "
                        java.lang.String r9 = r1.concat(r9)
                        r0.<init>(r9)
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rv1.a(java.lang.Object):com.google.android.gms.internal.ads.ab3");
                }
            }
            com.google.android.gms.internal.ads.bb3 r0 = r8.f17820q
            com.google.android.gms.internal.ads.ab3 r9 = com.google.android.gms.internal.ads.qa3.m(r9, r10, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xv1.L5(com.google.android.gms.internal.ads.s80, int):com.google.android.gms.internal.ads.ab3");
    }

    @Override // com.google.android.gms.internal.ads.z80
    public final void z4(s80 s80Var, c90 c90Var) {
        M5(L5(s80Var, Binder.getCallingUid()), c90Var);
    }
}
