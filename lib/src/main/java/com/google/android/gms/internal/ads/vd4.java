package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class vd4 implements pc4 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ wd4 f16663a;

    /* synthetic */ vd4(wd4 wd4Var, ud4 ud4Var) {
        this.f16663a = wd4Var;
    }

    @Override // com.google.android.gms.internal.ads.pc4
    public final void a(Exception exc) {
        ad2.c("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.f16663a.A0.b(exc);
    }

    @Override // com.google.android.gms.internal.ads.pc4
    public final void b() {
        wd4 wd4Var = this.f16663a;
        if (wd4Var.J0 != null) {
            wd4Var.J0.b();
        }
    }
}
