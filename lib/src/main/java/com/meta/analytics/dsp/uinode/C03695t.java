package com.meta.analytics.dsp.uinode;

import android.content.Context;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.RewardedInterstitialAd;
import com.facebook.ads.internal.api.RewardedInterstitialAdApi;
import com.facebook.ads.internal.context.Repairable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5t, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03695t implements RewardedInterstitialAdApi, Repairable {
    public static byte[] A01;
    public static String[] A02 = {"3NmEwDZbIt", "O8AdKP", "F3ALGhsyO3", "0MHUDKJg5DuGWh7rPRyim2f5Q3jzHAIy", "HXUpQ47Mk3E2sR2m", "8jXe5NRPzLqsvVidOiIerBtc23OceItu", "2ZUtk7q5pb8vSbqEv1qAEyjXWKkByt40", "lRwzP9ChqND6LzN"};
    public final C03735x A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 126);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {69, 68, 69, 21, 67, 68, 68, 21, 122, 125, 121, 124, 114, 45, 124, Byte.MAX_VALUE, 11, 12, 89, 7, 9, 6, 91, 7, 49, 100, 55, 97, 54, 55, 100, 63, 36, 19, 1, 23, 4, 18, 19, 18, 86, 31, 24, 2, 19, 4, 5, 2, 31, 2, 31, 23, 26, 86, 23, 18, 86, 18, 19, 5, 2, 4, 25, 15, 19, 18, 6, 49, 35, 53, 38, 48, 49, 48, 116, 61, 58, 32, 49, 38, 39, 32, 61, 32, 61, 53, 56, 116, 53, 48, 116, 56, 59, 53, 48, 116, 38, 49, 37, 33, 49, 39, 32, 49, 48, 36, 19, 1, 23, 4, 18, 19, 18, 86, 31, 24, 2, 19, 4, 5, 2, 31, 2, 31, 23, 26, 86, 23, 18, 86, 5, 30, 25, 1, 86, 21, 23, 26, 26, 19, 18, 73, 72, 94, 89, 95, 66, 84, 50, 49, 63, 58, 31, 58, 6, 29, 26, 2};
        if (A02[4].length() == 1) {
            throw new RuntimeException();
        }
        A02[7] = "xXnNwnRRjThYq22";
        A01 = bArr;
    }

    static {
        A01();
    }

    public C03695t(Context context, String str, RewardedInterstitialAd rewardedInterstitialAd) {
        this.A00 = new C03735x(context, str, rewardedInterstitialAd);
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.FullScreenAd
    public final RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder buildLoadAdConfig() {
        return new C03715v(this.A00.buildLoadAdConfig());
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.FullScreenAd
    public final RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder buildShowAdConfig() {
        return new C03725w(this.A00.buildShowAdConfig());
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.Ad
    public final void destroy() {
        AbstractC0692Jp.A05(A00(141, 7, 83), A00(32, 34, 8), A00(24, 8, 121));
        this.A00.A04();
    }

    public final void finalize() {
        this.A00.finalize();
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.Ad
    public final String getPlacementId() {
        return this.A00.getPlacementId();
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi
    public final int getVideoDuration() {
        return this.A00.getVideoDuration();
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        return this.A00.isAdInvalidated();
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi
    public final boolean isAdLoaded() {
        return this.A00.isAdLoaded();
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.Ad
    public final void loadAd() {
        AbstractC0692Jp.A05(A00(148, 6, 32), A00(66, 39, 42), A00(16, 8, 65));
        this.A00.A07(null, AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED_INTERSTITIAL, true);
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi
    public final void loadAd(RewardedInterstitialAd.RewardedInterstitialLoadAdConfig rewardedInterstitialLoadAdConfig) {
        ((C03715v) rewardedInterstitialLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th) {
        this.A00.repair(th);
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.Ad
    @Deprecated
    public final void setExtraHints(ExtraHints extraHints) {
        this.A00.setExtraHints(extraHints);
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.FullScreenAd
    public final boolean show() {
        AbstractC0692Jp.A05(A00(154, 4, 11), A00(105, 36, 8), A00(8, 8, 53));
        return this.A00.A08(new C03755z().withAppOrientation(-1).build());
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi
    public final boolean show(RewardedInterstitialAd.RewardedInterstitialShowAdConfig rewardedInterstitialShowAdConfig) {
        AbstractC0692Jp.A05(A00(154, 4, 11), A00(105, 36, 8), A00(0, 8, 10));
        return this.A00.A08(((C03725w) rewardedInterstitialShowAdConfig).A00());
    }
}
