package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import o3.e;
import o3.f;
import o3.p;

@Deprecated
/* loaded from: classes.dex */
public interface MediationInterstitialAdapter extends f {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, p pVar, Bundle bundle, e eVar, Bundle bundle2);

    void showInterstitial();
}
