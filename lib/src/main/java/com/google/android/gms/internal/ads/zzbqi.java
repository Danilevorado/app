package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import n.d;

/* loaded from: classes.dex */
public final class zzbqi implements MediationInterstitialAdapter {

    /* renamed from: a, reason: collision with root package name */
    private Activity f18820a;

    /* renamed from: b, reason: collision with root package name */
    private o3.p f18821b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f18822c;

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onDestroy() {
        ze0.b("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onPause() {
        ze0.b("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onResume() {
        ze0.b("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, o3.p pVar, Bundle bundle, o3.e eVar, Bundle bundle2) {
        this.f18821b = pVar;
        if (pVar == null) {
            ze0.g("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            ze0.g("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f18821b.c(this, 0);
            return;
        }
        if (!ks.g(context)) {
            ze0.g("Default browser does not support custom tabs. Bailing out.");
            this.f18821b.c(this, 0);
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            ze0.g("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            this.f18821b.c(this, 0);
        } else {
            this.f18820a = (Activity) context;
            this.f18822c = Uri.parse(string);
            this.f18821b.j(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        n.d dVarA = new d.a().a();
        dVarA.f25427a.setData(this.f18822c);
        m3.b2.f25197i.post(new c60(this, new AdOverlayInfoParcel(new l3.i(dVarA.f25427a, null), null, new b60(this), null, new ff0(0, 0, false, false, false), null, null)));
        j3.t.q().p();
    }
}
