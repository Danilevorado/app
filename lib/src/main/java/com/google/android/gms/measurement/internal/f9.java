package com.google.android.gms.measurement.internal;

import java.util.Map;

/* loaded from: classes.dex */
final class f9 implements u3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f19907a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n9 f19908b;

    f9(n9 n9Var, String str) {
        this.f19908b = n9Var;
        this.f19907a = str;
    }

    @Override // com.google.android.gms.measurement.internal.u3
    public final void a(String str, int i10, Throwable th, byte[] bArr, Map map) {
        this.f19908b.n(i10, th, bArr, this.f19907a);
    }
}
