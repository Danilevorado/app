package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: classes.dex */
public class if4 extends u44 {

    /* renamed from: m, reason: collision with root package name */
    public final kf4 f9720m;

    /* renamed from: n, reason: collision with root package name */
    public final String f9721n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public if4(Throwable th, kf4 kf4Var) {
        super("Decoder failed: ".concat(String.valueOf(kf4Var == null ? null : kf4Var.f11014a)), th);
        String diagnosticInfo = null;
        this.f9720m = kf4Var;
        if (sv2.f15560a >= 21 && (th instanceof MediaCodec.CodecException)) {
            diagnosticInfo = ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.f9721n = diagnosticInfo;
    }
}
