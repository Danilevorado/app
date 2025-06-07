package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class o33 extends u33 {

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ p33 f12971s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o33(p33 p33Var, w33 w33Var, CharSequence charSequence) {
        super(w33Var, charSequence);
        this.f12971s = p33Var;
    }

    @Override // com.google.android.gms.internal.ads.u33
    final int d(int i10) {
        return i10 + 1;
    }

    @Override // com.google.android.gms.internal.ads.u33
    final int e(int i10) {
        t23 t23Var = this.f12971s.f13538a;
        CharSequence charSequence = this.f16156o;
        int length = charSequence.length();
        i33.b(i10, length, "index");
        while (i10 < length) {
            if (t23Var.b(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }
}
