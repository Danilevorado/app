package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class t23 implements j33 {
    protected t23() {
    }

    public static t23 c(char c10) {
        return new p23(c10);
    }

    @Override // com.google.android.gms.internal.ads.j33
    public final /* synthetic */ boolean a(Object obj) {
        return b(((Character) obj).charValue());
    }

    public abstract boolean b(char c10);
}
