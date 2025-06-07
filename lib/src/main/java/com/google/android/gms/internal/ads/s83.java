package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class s83 {

    /* renamed from: b, reason: collision with root package name */
    static final s83 f15152b = new s83(new a("Failure occurred while trying to finish a future."));

    /* renamed from: a, reason: collision with root package name */
    final Throwable f15153a;

    class a extends Throwable {
        a(String str) {
            super("Failure occurred while trying to finish a future.");
        }

        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    s83(Throwable th) {
        Objects.requireNonNull(th);
        this.f15153a = th;
    }
}
