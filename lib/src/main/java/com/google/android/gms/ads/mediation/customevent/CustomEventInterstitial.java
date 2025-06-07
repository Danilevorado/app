package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import o3.e;

@Deprecated
/* loaded from: classes.dex */
public interface CustomEventInterstitial extends p3.a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, p3.c cVar, String str, e eVar, Bundle bundle);

    void showInterstitial();
}
