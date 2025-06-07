package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import o3.u;
import p3.d;

@Deprecated
/* loaded from: classes.dex */
public interface CustomEventNative extends p3.a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, d dVar, String str, u uVar, Bundle bundle);
}
