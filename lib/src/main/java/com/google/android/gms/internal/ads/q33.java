package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class q33 extends u33 {

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ r33 f14126s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q33(r33 r33Var, w33 w33Var, CharSequence charSequence) {
        super(w33Var, charSequence);
        this.f14126s = r33Var;
    }

    @Override // com.google.android.gms.internal.ads.u33
    public final int d(int i10) {
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.u33
    public final int e(int i10) {
        int i11 = i10 + 4000;
        if (i11 < this.f16156o.length()) {
            return i11;
        }
        return -1;
    }
}
