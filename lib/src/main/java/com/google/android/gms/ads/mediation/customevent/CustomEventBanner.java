package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import d3.g;
import o3.e;

@Deprecated
/* loaded from: classes.dex */
public interface CustomEventBanner extends p3.a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(Context context, p3.b bVar, String str, g gVar, e eVar, Bundle bundle);
}
