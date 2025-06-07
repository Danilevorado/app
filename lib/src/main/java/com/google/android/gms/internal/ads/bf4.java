package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class bf4 extends w44 {

    /* renamed from: h, reason: collision with root package name */
    private long f6458h;

    /* renamed from: i, reason: collision with root package name */
    private int f6459i;

    /* renamed from: j, reason: collision with root package name */
    private int f6460j;

    public bf4() {
        super(2, 0);
        this.f6460j = 32;
    }

    @Override // com.google.android.gms.internal.ads.w44, com.google.android.gms.internal.ads.k14
    public final void b() {
        super.b();
        this.f6459i = 0;
    }

    public final int m() {
        return this.f6459i;
    }

    public final long n() {
        return this.f6458h;
    }

    public final void o(int i10) {
        this.f6460j = i10;
    }

    public final boolean p(w44 w44Var) {
        ByteBuffer byteBuffer;
        gt1.d(!w44Var.d(1073741824));
        gt1.d(!w44Var.d(268435456));
        gt1.d(!w44Var.d(4));
        if (q()) {
            if (this.f6459i >= this.f6460j || w44Var.d(Integer.MIN_VALUE) != d(Integer.MIN_VALUE)) {
                return false;
            }
            ByteBuffer byteBuffer2 = w44Var.f16975c;
            if (byteBuffer2 != null && (byteBuffer = this.f16975c) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                return false;
            }
        }
        int i10 = this.f6459i;
        this.f6459i = i10 + 1;
        if (i10 == 0) {
            this.f16977e = w44Var.f16977e;
            if (w44Var.d(1)) {
                c(1);
            }
        }
        if (w44Var.d(Integer.MIN_VALUE)) {
            c(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer3 = w44Var.f16975c;
        if (byteBuffer3 != null) {
            i(byteBuffer3.remaining());
            this.f16975c.put(byteBuffer3);
        }
        this.f6458h = w44Var.f16977e;
        return true;
    }

    public final boolean q() {
        return this.f6459i > 0;
    }
}
