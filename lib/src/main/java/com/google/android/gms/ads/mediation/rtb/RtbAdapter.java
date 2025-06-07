package com.google.android.gms.ads.mediation.rtb;

import javax.annotation.ParametersAreNonnullByDefault;
import o3.a;
import o3.d;
import o3.h;
import o3.j;
import o3.o;
import o3.q;
import o3.t;
import q3.b;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public abstract class RtbAdapter extends a {
    public abstract void collectSignals(q3.a aVar, b bVar);

    public void loadRtbAppOpenAd(h hVar, d dVar) {
        loadAppOpenAd(hVar, dVar);
    }

    public void loadRtbBannerAd(j jVar, d dVar) {
        loadBannerAd(jVar, dVar);
    }

    public void loadRtbInterscrollerAd(j jVar, d dVar) {
        dVar.a(new d3.a(7, getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads"));
    }

    public void loadRtbInterstitialAd(o oVar, d dVar) {
        loadInterstitialAd(oVar, dVar);
    }

    public void loadRtbNativeAd(q qVar, d dVar) {
        loadNativeAd(qVar, dVar);
    }

    public void loadRtbRewardedAd(t tVar, d dVar) {
        loadRewardedAd(tVar, dVar);
    }

    public void loadRtbRewardedInterstitialAd(t tVar, d dVar) {
        loadRewardedInterstitialAd(tVar, dVar);
    }
}
