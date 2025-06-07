package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AdExperienceType;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.1u, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02681u {
    public int A00;
    public long A01;
    public RewardData A02;
    public JL A03;
    public String A04;
    public String A05;
    public boolean A06;
    public final C8Z A07;
    public final EnumC0681Je A08;
    public final EnumC0683Jg A09;
    public final String A0A;
    public final EnumSet<CacheFlag> A0B;
    public final int A0C;
    public final AdPlacementType A0D;

    public C02681u(String str, EnumC0683Jg enumC0683Jg, AdPlacementType adPlacementType, EnumC0681Je enumC0681Je, int i10, C8Z c8z) {
        this(str, enumC0683Jg, adPlacementType, enumC0681Je, i10, EnumSet.of(CacheFlag.NONE), c8z);
    }

    public C02681u(String str, EnumC0683Jg enumC0683Jg, AdPlacementType adPlacementType, EnumC0681Je enumC0681Je, int i10, EnumSet<CacheFlag> cacheFlags, C8Z c8z) {
        this.A0A = str;
        this.A0D = adPlacementType;
        this.A08 = enumC0681Je;
        this.A0C = i10;
        this.A0B = cacheFlags;
        this.A09 = enumC0683Jg;
        this.A00 = -1;
        this.A07 = c8z;
    }

    public final AdPlacementType A00() {
        AdPlacementType adPlacementType = this.A0D;
        if (adPlacementType != null) {
            return adPlacementType;
        }
        EnumC0681Je enumC0681Je = this.A08;
        if (enumC0681Je == null) {
            return AdPlacementType.NATIVE;
        }
        if (enumC0681Je == EnumC0681Je.A07) {
            return AdPlacementType.INTERSTITIAL;
        }
        return AdPlacementType.BANNER;
    }

    public final K1 A01(C1073Yn c1073Yn, C0688Jl c0688Jl, AdExperienceType adExperienceType) {
        String str = this.A0A;
        EnumC0681Je enumC0681Je = this.A08;
        return new K1(c1073Yn, str, enumC0681Je != null ? new LQ(enumC0681Je.A03(), this.A08.A02()) : null, this.A09, this.A0C, c0688Jl, LW.A01(C0662Ih.A0J(c1073Yn)), this.A04, adExperienceType != null ? adExperienceType.getAdExperienceType() : null, this.A07);
    }

    public final void A02(int i10) {
        this.A00 = i10;
    }

    public final void A03(long j10) {
        this.A01 = j10;
    }

    public final void A04(RewardData rewardData) {
        this.A02 = rewardData;
    }

    public final void A05(JL jl) {
        this.A03 = jl;
    }

    public final void A06(String str) {
        this.A04 = str;
    }

    public final void A07(String str) {
        this.A05 = str;
    }

    public final void A08(boolean z10) {
        this.A06 = z10;
    }
}
