package o3;

import android.content.Context;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a {
    public abstract d3.v getSDKVersionInfo();

    public abstract d3.v getVersionInfo();

    public abstract void initialize(Context context, b bVar, List<l> list);

    public void loadAppOpenAd(h hVar, d dVar) {
        dVar.a(new d3.a(7, getClass().getSimpleName().concat(" does not support app open ads."), "com.google.android.gms.ads"));
    }

    public void loadBannerAd(j jVar, d dVar) {
        dVar.a(new d3.a(7, getClass().getSimpleName().concat(" does not support banner ads."), "com.google.android.gms.ads"));
    }

    public void loadInterscrollerAd(j jVar, d dVar) {
        dVar.a(new d3.a(7, getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads"));
    }

    public void loadInterstitialAd(o oVar, d dVar) {
        dVar.a(new d3.a(7, getClass().getSimpleName().concat(" does not support interstitial ads."), "com.google.android.gms.ads"));
    }

    public void loadNativeAd(q qVar, d dVar) {
        dVar.a(new d3.a(7, getClass().getSimpleName().concat(" does not support native ads."), "com.google.android.gms.ads"));
    }

    public void loadRewardedAd(t tVar, d dVar) {
        dVar.a(new d3.a(7, getClass().getSimpleName().concat(" does not support rewarded ads."), "com.google.android.gms.ads"));
    }

    public void loadRewardedInterstitialAd(t tVar, d dVar) {
        dVar.a(new d3.a(7, getClass().getSimpleName().concat(" does not support rewarded interstitial ads."), "com.google.android.gms.ads"));
    }
}
