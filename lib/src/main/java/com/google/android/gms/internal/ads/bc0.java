package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* loaded from: classes.dex */
public final class bc0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final Context f6419a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f6420b;

    /* renamed from: c, reason: collision with root package name */
    private final m3.p1 f6421c;

    /* renamed from: d, reason: collision with root package name */
    private final ed0 f6422d;

    /* renamed from: e, reason: collision with root package name */
    private String f6423e = "-1";

    /* renamed from: f, reason: collision with root package name */
    private int f6424f = -1;

    bc0(Context context, m3.p1 p1Var, ed0 ed0Var) {
        this.f6420b = PreferenceManager.getDefaultSharedPreferences(context);
        this.f6421c = p1Var;
        this.f6419a = context;
        this.f6422d = ed0Var;
    }

    private final void b(String str, int i10) {
        Context context;
        boolean z10 = false;
        if (!((Boolean) k3.w.c().b(ir.f10110v0)).booleanValue() ? str.isEmpty() || str.charAt(0) != '1' : i10 == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1"))) {
            z10 = true;
        }
        if (((Boolean) k3.w.c().b(ir.f10088t0)).booleanValue()) {
            this.f6421c.z(z10);
            if (((Boolean) k3.w.c().b(ir.Q5)).booleanValue() && z10 && (context = this.f6419a) != null) {
                context.deleteDatabase("OfflineUpload.db");
            }
        }
        if (((Boolean) k3.w.c().b(ir.f10033o0)).booleanValue()) {
            this.f6422d.y();
        }
    }

    final void a() {
        SharedPreferences sharedPreferences;
        String str;
        this.f6420b.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(this.f6420b, "gad_has_consent_for_cookies");
        if (((Boolean) k3.w.c().b(ir.f10132x0)).booleanValue()) {
            onSharedPreferenceChanged(this.f6420b, "IABTCF_gdprApplies");
            sharedPreferences = this.f6420b;
            str = "IABTCF_TCString";
        } else {
            sharedPreferences = this.f6420b;
            str = "IABTCF_PurposeConsents";
        }
        onSharedPreferenceChanged(sharedPreferences, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onSharedPreferenceChanged(android.content.SharedPreferences r9, java.lang.String r10) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zq r0 = com.google.android.gms.internal.ads.ir.f10132x0
            com.google.android.gms.internal.ads.gr r1 = k3.w.c()
            java.lang.Object r0 = r1.b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "-1"
            java.lang.String r2 = "IABTCF_PurposeConsents"
            r3 = 1
            r4 = -1
            java.lang.String r5 = "gad_has_consent_for_cookies"
            if (r0 == 0) goto L7d
            boolean r0 = com.google.android.gms.internal.ads.ac0.a(r10, r5)
            if (r0 == 0) goto L4a
            com.google.android.gms.internal.ads.zq r10 = com.google.android.gms.internal.ads.ir.f10110v0
            com.google.android.gms.internal.ads.gr r0 = k3.w.c()
            java.lang.Object r10 = r0.b(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L33
            return
        L33:
            int r9 = r9.getInt(r5, r4)
            m3.p1 r10 = r8.f6421c
            int r10 = r10.b()
            if (r9 == r10) goto L44
            m3.p1 r10 = r8.f6421c
            r10.z(r3)
        L44:
            m3.p1 r10 = r8.f6421c
            r10.q(r9)
            return
        L4a:
            java.lang.String r0 = "IABTCF_gdprApplies"
            boolean r0 = com.google.android.gms.internal.ads.ac0.a(r10, r0)
            if (r0 != 0) goto L60
            java.lang.String r0 = "IABTCF_TCString"
            boolean r0 = com.google.android.gms.internal.ads.ac0.a(r10, r0)
            if (r0 != 0) goto L60
            boolean r0 = com.google.android.gms.internal.ads.ac0.a(r10, r2)
            if (r0 == 0) goto Ldf
        L60:
            java.lang.String r9 = r9.getString(r10, r1)
            if (r9 == 0) goto L77
            m3.p1 r0 = r8.f6421c
            java.lang.String r0 = r0.U(r10)
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L77
            m3.p1 r0 = r8.f6421c
            r0.z(r3)
        L77:
            m3.p1 r0 = r8.f6421c
            r0.x(r10, r9)
            return
        L7d:
            java.lang.String r0 = r9.getString(r2, r1)
            int r9 = r9.getInt(r5, r4)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            int r6 = r10.hashCode()
            r7 = -2004976699(0xffffffff887e7bc5, float:-7.6580835E-34)
            if (r6 == r7) goto La0
            r2 = -527267622(0xffffffffe09288da, float:-8.447143E19)
            if (r6 == r2) goto L98
            goto La8
        L98:
            boolean r10 = r10.equals(r5)
            if (r10 == 0) goto La8
            r10 = r3
            goto La9
        La0:
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto La8
            r10 = 0
            goto La9
        La8:
            r10 = r4
        La9:
            if (r10 == 0) goto Lcc
            if (r10 == r3) goto Lae
            return
        Lae:
            com.google.android.gms.internal.ads.zq r10 = com.google.android.gms.internal.ads.ir.f10110v0
            com.google.android.gms.internal.ads.gr r1 = k3.w.c()
            java.lang.Object r10 = r1.b(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Ldf
            if (r9 == r4) goto Ldf
            int r10 = r8.f6424f
            if (r10 == r9) goto Ldf
            r8.f6424f = r9
            r8.b(r0, r9)
            return
        Lcc:
            boolean r10 = r0.equals(r1)
            if (r10 != 0) goto Ldf
            java.lang.String r10 = r8.f6423e
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto Ldf
            r8.f6423e = r0
            r8.b(r0, r9)
        Ldf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bc0.onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String):void");
    }
}
