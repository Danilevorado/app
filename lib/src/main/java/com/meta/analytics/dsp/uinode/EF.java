package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;

/* loaded from: assets/audience_network.dex */
public final class EF {
    public final float A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final DownloadAction A04;
    public final Throwable A05;

    public EF(int i10, DownloadAction downloadAction, int i11, float f5, long j10, Throwable th) {
        this.A02 = i10;
        this.A04 = downloadAction;
        this.A01 = i11;
        this.A00 = f5;
        this.A03 = j10;
        this.A05 = th;
    }

    public /* synthetic */ EF(int i10, DownloadAction downloadAction, int i11, float f5, long j10, Throwable th, E5 e5) {
        this(i10, downloadAction, i11, f5, j10, th);
    }
}
