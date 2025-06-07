package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: classes.dex */
final class m34 {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f11921a;

    /* renamed from: b, reason: collision with root package name */
    private final MediaCodec.CryptoInfo.Pattern f11922b = new MediaCodec.CryptoInfo.Pattern(0, 0);

    static /* bridge */ /* synthetic */ void a(m34 m34Var, int i10, int i11) {
        m34Var.f11922b.set(i10, i11);
        m34Var.f11921a.setPattern(m34Var.f11922b);
    }
}
