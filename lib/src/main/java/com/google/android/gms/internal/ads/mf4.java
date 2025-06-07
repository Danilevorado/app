package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: classes.dex */
public final class mf4 extends Exception {

    /* renamed from: m, reason: collision with root package name */
    public final String f12086m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f12087n;

    /* renamed from: o, reason: collision with root package name */
    public final kf4 f12088o;

    /* renamed from: p, reason: collision with root package name */
    public final String f12089p;

    /* renamed from: q, reason: collision with root package name */
    public final mf4 f12090q;

    public mf4(k9 k9Var, Throwable th, boolean z10, int i10) {
        this("Decoder init failed: [" + i10 + "], " + String.valueOf(k9Var), th, k9Var.f10898l, false, null, "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_neg_" + Math.abs(i10), null);
    }

    public mf4(k9 k9Var, Throwable th, boolean z10, kf4 kf4Var) {
        this("Decoder init failed: " + kf4Var.f11014a + ", " + String.valueOf(k9Var), th, k9Var.f10898l, false, kf4Var, (sv2.f15560a < 21 || !(th instanceof MediaCodec.CodecException)) ? null : ((MediaCodec.CodecException) th).getDiagnosticInfo(), null);
    }

    private mf4(String str, Throwable th, String str2, boolean z10, kf4 kf4Var, String str3, mf4 mf4Var) {
        super(str, th);
        this.f12086m = str2;
        this.f12087n = false;
        this.f12088o = kf4Var;
        this.f12089p = str3;
        this.f12090q = mf4Var;
    }

    static /* bridge */ /* synthetic */ mf4 a(mf4 mf4Var, mf4 mf4Var2) {
        return new mf4(mf4Var.getMessage(), mf4Var.getCause(), mf4Var.f12086m, false, mf4Var.f12088o, mf4Var.f12089p, mf4Var2);
    }
}
