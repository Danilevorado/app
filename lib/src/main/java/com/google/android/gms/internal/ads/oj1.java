package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class oj1 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f13286a;

    public oj1(q44 q44Var) {
        this.f13286a = q44Var;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        an anVar = ((b11) this.f13286a).a().f7456o.f14418a == 3 ? an.REWARDED_INTERSTITIAL : an.REWARD_BASED_VIDEO_AD;
        k44.b(anVar);
        return anVar;
    }
}
