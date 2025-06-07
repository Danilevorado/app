package com.google.android.gms.internal.ads;

import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;

/* loaded from: classes.dex */
final class zm implements fy3 {

    /* renamed from: a, reason: collision with root package name */
    static final fy3 f18636a = new zm();

    private zm() {
    }

    @Override // com.google.android.gms.internal.ads.fy3
    public final boolean a(int i10) {
        an anVar = an.AD_INITIATER_UNSPECIFIED;
        switch (i10) {
            case 0:
                break;
            case 1:
                anVar = an.BANNER;
                break;
            case 2:
                anVar = an.DFP_BANNER;
                break;
            case 3:
                anVar = an.INTERSTITIAL;
                break;
            case 4:
                anVar = an.DFP_INTERSTITIAL;
                break;
            case 5:
                anVar = an.NATIVE_EXPRESS;
                break;
            case 6:
                anVar = an.AD_LOADER;
                break;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                anVar = an.REWARD_BASED_VIDEO_AD;
                break;
            case 8:
                anVar = an.BANNER_SEARCH_ADS;
                break;
            case 9:
                anVar = an.GOOGLE_MOBILE_ADS_SDK_ADAPTER;
                break;
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                anVar = an.APP_OPEN;
                break;
            case 11:
                anVar = an.REWARDED_INTERSTITIAL;
                break;
            default:
                anVar = null;
                break;
        }
        return anVar != null;
    }
}
