package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* loaded from: classes.dex */
final class cg4 implements yf4 {

    /* renamed from: a, reason: collision with root package name */
    private final int f6914a;

    /* renamed from: b, reason: collision with root package name */
    private MediaCodecInfo[] f6915b;

    public cg4(boolean z10, boolean z11) {
        int i10 = 1;
        if (!z10 && !z11) {
            i10 = 0;
        }
        this.f6914a = i10;
    }

    private final void e() {
        if (this.f6915b == null) {
            this.f6915b = new MediaCodecList(this.f6914a).getCodecInfos();
        }
    }

    @Override // com.google.android.gms.internal.ads.yf4
    public final MediaCodecInfo K(int i10) {
        e();
        return this.f6915b[i10];
    }

    @Override // com.google.android.gms.internal.ads.yf4
    public final int a() {
        e();
        return this.f6915b.length;
    }

    @Override // com.google.android.gms.internal.ads.yf4
    public final boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.google.android.gms.internal.ads.yf4
    public final boolean c() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.yf4
    public final boolean d(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }
}
