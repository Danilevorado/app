package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ac extends n34 {

    /* renamed from: u, reason: collision with root package name */
    private static final u34 f6034u = u34.b(ac.class);

    public ac(o34 o34Var, zb zbVar) {
        s(o34Var, o34Var.d(), zbVar);
    }

    @Override // com.google.android.gms.internal.ads.n34, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.n34
    public final String toString() {
        String string = this.f12391n.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 7);
        sb2.append("model(");
        sb2.append(string);
        sb2.append(")");
        return sb2.toString();
    }
}
