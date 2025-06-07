package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.PushbackInputStream;

/* loaded from: classes.dex */
final class im extends PushbackInputStream {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ jm f9792m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    im(jm jmVar, InputStream inputStream, int i10) {
        super(inputStream, 1);
        this.f9792m = jmVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        lm.e(this.f9792m.f10579o);
        super.close();
    }
}
