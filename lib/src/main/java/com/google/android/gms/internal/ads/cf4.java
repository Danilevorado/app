package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes.dex */
final class cf4 {

    /* renamed from: a, reason: collision with root package name */
    private long f6904a;

    /* renamed from: b, reason: collision with root package name */
    private long f6905b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6906c;

    cf4() {
    }

    private final long d(long j10) {
        return this.f6904a + Math.max(0L, ((this.f6905b - 529) * 1000000) / j10);
    }

    public final long a(k9 k9Var) {
        return d(k9Var.f10912z);
    }

    public final long b(k9 k9Var, w44 w44Var) {
        if (this.f6905b == 0) {
            this.f6904a = w44Var.f16977e;
        }
        if (this.f6906c) {
            return w44Var.f16977e;
        }
        ByteBuffer byteBuffer = w44Var.f16975c;
        Objects.requireNonNull(byteBuffer);
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            i10 = (i10 << 8) | (byteBuffer.get(i11) & 255);
        }
        int iC = f0.c(i10);
        if (iC != -1) {
            long jD = d(k9Var.f10912z);
            this.f6905b += iC;
            return jD;
        }
        this.f6906c = true;
        this.f6905b = 0L;
        this.f6904a = w44Var.f16977e;
        ad2.e("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
        return w44Var.f16977e;
    }

    public final void c() {
        this.f6904a = 0L;
        this.f6905b = 0L;
        this.f6906c = false;
    }
}
