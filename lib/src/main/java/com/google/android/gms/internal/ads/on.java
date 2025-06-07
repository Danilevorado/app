package com.google.android.gms.internal.ads;

import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;

/* loaded from: classes.dex */
public enum on implements dy3 {
    AD_FORMAT_TYPE_UNSPECIFIED(0),
    BANNER(1),
    INTERSTITIAL(2),
    NATIVE_EXPRESS(3),
    NATIVE_CONTENT(4),
    NATIVE_APP_INSTALL(5),
    NATIVE_CUSTOM_TEMPLATE(6),
    DFP_BANNER(7),
    DFP_INTERSTITIAL(8),
    REWARD_BASED_VIDEO_AD(9),
    BANNER_SEARCH_ADS(10);


    /* renamed from: y, reason: collision with root package name */
    private static final ey3 f13335y = new ey3() { // from class: com.google.android.gms.internal.ads.mn
    };

    /* renamed from: m, reason: collision with root package name */
    private final int f13337m;

    on(int i10) {
        this.f13337m = i10;
    }

    public static on b(int i10) {
        switch (i10) {
            case 0:
                return AD_FORMAT_TYPE_UNSPECIFIED;
            case 1:
                return BANNER;
            case 2:
                return INTERSTITIAL;
            case 3:
                return NATIVE_EXPRESS;
            case 4:
                return NATIVE_CONTENT;
            case 5:
                return NATIVE_APP_INSTALL;
            case 6:
                return NATIVE_CUSTOM_TEMPLATE;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                return DFP_BANNER;
            case 8:
                return DFP_INTERSTITIAL;
            case 9:
                return REWARD_BASED_VIDEO_AD;
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                return BANNER_SEARCH_ADS;
            default:
                return null;
        }
    }

    public final int a() {
        return this.f13337m;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f13337m);
    }
}
