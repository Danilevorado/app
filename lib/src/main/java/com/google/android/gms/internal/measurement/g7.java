package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public abstract class g7 implements x9 {
    protected abstract g7 b(h7 h7Var);

    public abstract g7 c(byte[] bArr, int i10, int i11);

    public abstract g7 d(byte[] bArr, int i10, int i11, j8 j8Var);

    @Override // com.google.android.gms.internal.measurement.x9
    public final /* synthetic */ x9 l(byte[] bArr, j8 j8Var) {
        return d(bArr, 0, bArr.length, j8Var);
    }

    @Override // com.google.android.gms.internal.measurement.x9
    public final /* synthetic */ x9 o(byte[] bArr) {
        return c(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.measurement.x9
    public final /* bridge */ /* synthetic */ x9 q(y9 y9Var) {
        if (a().getClass().isInstance(y9Var)) {
            return b((h7) y9Var);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
