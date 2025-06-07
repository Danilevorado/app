package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class ta2 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f15751a;

    /* renamed from: b, reason: collision with root package name */
    private final bb3 f15752b;

    ta2(Context context, bb3 bb3Var) {
        this.f15751a = context;
        this.f15752b = bb3Var;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 18;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        return this.f15752b.g(new Callable() { // from class: com.google.android.gms.internal.ads.qa2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f14208a.c();
            }
        });
    }

    final /* synthetic */ sa2 c() {
        Bundle bundle;
        j3.t.r();
        String string = !((Boolean) k3.w.c().b(ir.J5)).booleanValue() ? "" : this.f15751a.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
        String string2 = ((Boolean) k3.w.c().b(ir.L5)).booleanValue() ? this.f15751a.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
        j3.t.r();
        Context context = this.f15751a;
        if (((Boolean) k3.w.c().b(ir.K5)).booleanValue()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i10 = 0; i10 < 4; i10++) {
                String str = strArr[i10];
                if (defaultSharedPreferences.contains(str)) {
                    bundle.putString(str, defaultSharedPreferences.getString(str, null));
                }
            }
        } else {
            bundle = null;
        }
        return new sa2(string, string2, bundle, null);
    }
}
