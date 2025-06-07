package com.google.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.se0;
import d3.e;
import d3.f;
import d3.g;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import k3.m2;
import k3.t;
import o3.k;
import o3.p;
import o3.r;
import o3.u;
import o3.v;
import o3.x;

/* loaded from: classes.dex */
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter, v, x {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private d3.e adLoader;
    protected AdView mAdView;
    protected n3.a mInterstitialAd;

    f buildAdRequest(Context context, o3.e eVar, Bundle bundle, Bundle bundle2) {
        f.a aVar = new f.a();
        Date dateD = eVar.d();
        if (dateD != null) {
            aVar.e(dateD);
        }
        int iK = eVar.k();
        if (iK != 0) {
            aVar.f(iK);
        }
        Set setF = eVar.f();
        if (setF != null) {
            Iterator it = setF.iterator();
            while (it.hasNext()) {
                aVar.a((String) it.next());
            }
        }
        if (eVar.e()) {
            t.b();
            aVar.d(se0.A(context));
        }
        if (eVar.i() != -1) {
            aVar.h(eVar.i() == 1);
        }
        aVar.g(eVar.c());
        aVar.b(AdMobAdapter.class, buildExtrasBundle(bundle, bundle2));
        return aVar.c();
    }

    protected abstract Bundle buildExtrasBundle(Bundle bundle, Bundle bundle2);

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.mAdView;
    }

    @VisibleForTesting
    n3.a getInterstitialAd() {
        return this.mInterstitialAd;
    }

    @Override // o3.x
    public m2 getVideoController() {
        AdView adView = this.mAdView;
        if (adView != null) {
            return adView.e().b();
        }
        return null;
    }

    @VisibleForTesting
    e.a newAdLoader(Context context, String str) {
        return new e.a(context, str);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, o3.f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onDestroy() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.a();
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    @Override // o3.v
    public void onImmersiveModeUpdated(boolean z10) {
        n3.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.d(z10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, o3.f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onPause() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.c();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, o3.f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onResume() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.d();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, k kVar, Bundle bundle, g gVar, o3.e eVar, Bundle bundle2) {
        AdView adView = new AdView(context);
        this.mAdView = adView;
        adView.setAdSize(new g(gVar.c(), gVar.a()));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new b(this, kVar));
        this.mAdView.b(buildAdRequest(context, eVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, p pVar, Bundle bundle, o3.e eVar, Bundle bundle2) {
        n3.a.b(context, getAdUnitId(bundle), buildAdRequest(context, eVar, bundle2, bundle), new c(this, pVar));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, r rVar, Bundle bundle, u uVar, Bundle bundle2) {
        e eVar = new e(this, rVar);
        e.a aVarE = newAdLoader(context, bundle.getString(AD_UNIT_ID_PARAMETER)).e(eVar);
        aVarE.f(uVar.h());
        aVarE.g(uVar.g());
        if (uVar.j()) {
            aVarE.d(eVar);
        }
        if (uVar.b()) {
            for (String str : uVar.a().keySet()) {
                aVarE.b(str, eVar, true != ((Boolean) uVar.a().get(str)).booleanValue() ? null : eVar);
            }
        }
        d3.e eVarA = aVarE.a();
        this.adLoader = eVarA;
        eVarA.a(buildAdRequest(context, uVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        n3.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.e(null);
        }
    }
}
