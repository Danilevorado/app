package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;

/* renamed from: com.facebook.ads.redexgen.X.9w, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04639w {
    public final int A00;
    public final long A01;
    public final long A02;
    public final AH A03;
    public final C0569Eo A04;
    public final TrackGroupArray A05;
    public final C0614Gk A06;
    public final Object A07;
    public final boolean A08;
    public volatile long A09;
    public volatile long A0A;

    public C04639w(AH ah, long j10, TrackGroupArray trackGroupArray, C0614Gk c0614Gk) {
        this(ah, null, new C0569Eo(0), j10, -9223372036854775807L, 1, false, trackGroupArray, c0614Gk);
    }

    public C04639w(AH ah, Object obj, C0569Eo c0569Eo, long j10, long j11, int i10, boolean z10, TrackGroupArray trackGroupArray, C0614Gk c0614Gk) {
        this.A03 = ah;
        this.A07 = obj;
        this.A04 = c0569Eo;
        this.A02 = j10;
        this.A01 = j11;
        this.A0A = j10;
        this.A09 = j10;
        this.A00 = i10;
        this.A08 = z10;
        this.A05 = trackGroupArray;
        this.A06 = c0614Gk;
    }

    public static void A00(C04639w c04639w, C04639w c04639w2) {
        c04639w2.A0A = c04639w.A0A;
        c04639w2.A09 = c04639w.A09;
    }

    public final C04639w A01(int i10) {
        C04639w c04639w = new C04639w(this.A03, this.A07, this.A04.A00(i10), this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, c04639w);
        return c04639w;
    }

    public final C04639w A02(int i10) {
        C04639w playbackInfo = new C04639w(this.A03, this.A07, this.A04, this.A02, this.A01, i10, this.A08, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C04639w A03(AH ah, Object obj) {
        C04639w playbackInfo = new C04639w(ah, obj, this.A04, this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C04639w A04(C0569Eo c0569Eo, long j10, long j11) {
        long j12 = j11;
        AH ah = this.A03;
        Object obj = this.A07;
        if (!c0569Eo.A01()) {
            j12 = -9223372036854775807L;
        }
        return new C04639w(ah, obj, c0569Eo, j10, j12, this.A00, this.A08, this.A05, this.A06);
    }

    public final C04639w A05(TrackGroupArray trackGroupArray, C0614Gk c0614Gk) {
        C04639w playbackInfo = new C04639w(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, this.A08, trackGroupArray, c0614Gk);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C04639w A06(boolean z10) {
        C04639w playbackInfo = new C04639w(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, z10, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }
}
