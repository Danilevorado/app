package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class fg1 {

    /* renamed from: a, reason: collision with root package name */
    private final bb3 f8276a;

    /* renamed from: b, reason: collision with root package name */
    private final sg1 f8277b;

    /* renamed from: c, reason: collision with root package name */
    private final yg1 f8278c;

    public fg1(bb3 bb3Var, sg1 sg1Var, yg1 yg1Var) {
        this.f8276a = bb3Var;
        this.f8277b = sg1Var;
        this.f8278c = yg1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.ab3 a(final com.google.android.gms.internal.ads.un2 r16, final com.google.android.gms.internal.ads.hn2 r17, final org.json.JSONObject r18) {
        /*
            r15 = this;
            r12 = r15
            r0 = r16
            r1 = r17
            r7 = r18
            com.google.android.gms.internal.ads.bb3 r2 = r12.f8276a
            com.google.android.gms.internal.ads.dg1 r3 = new com.google.android.gms.internal.ads.dg1
            r3.<init>()
            com.google.android.gms.internal.ads.ab3 r2 = r2.g(r3)
            com.google.android.gms.internal.ads.sg1 r3 = r12.f8277b
            java.lang.String r4 = "images"
            com.google.android.gms.internal.ads.ab3 r3 = r3.f(r7, r4)
            com.google.android.gms.internal.ads.sg1 r5 = r12.f8277b
            com.google.android.gms.internal.ads.tn2 r6 = r0.f16413b
            com.google.android.gms.internal.ads.ln2 r6 = r6.f15924b
            com.google.android.gms.internal.ads.ab3 r9 = r5.g(r7, r4, r1, r6)
            com.google.android.gms.internal.ads.sg1 r4 = r12.f8277b
            java.lang.String r5 = "secondary_image"
            com.google.android.gms.internal.ads.ab3 r5 = r4.e(r7, r5)
            com.google.android.gms.internal.ads.sg1 r4 = r12.f8277b
            java.lang.String r6 = "app_icon"
            com.google.android.gms.internal.ads.ab3 r4 = r4.e(r7, r6)
            com.google.android.gms.internal.ads.sg1 r6 = r12.f8277b
            java.lang.String r8 = "attribution"
            com.google.android.gms.internal.ads.ab3 r6 = r6.d(r7, r8)
            com.google.android.gms.internal.ads.sg1 r8 = r12.f8277b
            com.google.android.gms.internal.ads.tn2 r0 = r0.f16413b
            com.google.android.gms.internal.ads.ln2 r0 = r0.f15924b
            com.google.android.gms.internal.ads.ab3 r8 = r8.h(r7, r1, r0)
            com.google.android.gms.internal.ads.yg1 r0 = r12.f8278c
            java.lang.String r1 = "custom_assets"
            com.google.android.gms.internal.ads.ab3 r11 = r0.a(r7, r1)
            com.google.android.gms.internal.ads.sg1 r0 = r12.f8277b
            java.lang.String r1 = "enable_omid"
            boolean r1 = r7.optBoolean(r1)
            r10 = 0
            if (r1 != 0) goto L5f
        L59:
            com.google.android.gms.internal.ads.ab3 r0 = com.google.android.gms.internal.ads.qa3.h(r10)
        L5d:
            r10 = r0
            goto L85
        L5f:
            java.lang.String r1 = "omid_settings"
            org.json.JSONObject r1 = r7.optJSONObject(r1)
            if (r1 != 0) goto L68
            goto L59
        L68:
            java.lang.String r13 = "omid_html"
            java.lang.String r1 = r1.optString(r13)
            boolean r13 = android.text.TextUtils.isEmpty(r1)
            if (r13 == 0) goto L75
            goto L59
        L75:
            com.google.android.gms.internal.ads.ab3 r10 = com.google.android.gms.internal.ads.qa3.h(r10)
            com.google.android.gms.internal.ads.hg1 r13 = new com.google.android.gms.internal.ads.hg1
            r13.<init>()
            com.google.android.gms.internal.ads.bb3 r0 = com.google.android.gms.internal.ads.of0.f13190e
            com.google.android.gms.internal.ads.ab3 r0 = com.google.android.gms.internal.ads.qa3.m(r10, r13, r0)
            goto L5d
        L85:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r2)
            r0.add(r3)
            r0.add(r9)
            r0.add(r5)
            r0.add(r4)
            r0.add(r6)
            r0.add(r8)
            r0.add(r11)
            com.google.android.gms.internal.ads.zq r1 = com.google.android.gms.internal.ads.ir.M4
            com.google.android.gms.internal.ads.gr r13 = k3.w.c()
            java.lang.Object r1 = r13.b(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto Lb7
            r0.add(r10)
        Lb7:
            com.google.android.gms.internal.ads.pa3 r13 = com.google.android.gms.internal.ads.qa3.a(r0)
            com.google.android.gms.internal.ads.eg1 r14 = new com.google.android.gms.internal.ads.eg1
            r0 = r14
            r1 = r15
            r7 = r18
            r0.<init>()
            com.google.android.gms.internal.ads.bb3 r0 = r12.f8276a
            com.google.android.gms.internal.ads.ab3 r0 = r13.a(r14, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fg1.a(com.google.android.gms.internal.ads.un2, com.google.android.gms.internal.ads.hn2, org.json.JSONObject):com.google.android.gms.internal.ads.ab3");
    }
}
