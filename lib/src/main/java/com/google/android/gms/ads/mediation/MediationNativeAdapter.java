package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import o3.f;
import o3.r;
import o3.u;

@Deprecated
/* loaded from: classes.dex */
public interface MediationNativeAdapter extends f {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, r rVar, Bundle bundle, u uVar, Bundle bundle2);
}
