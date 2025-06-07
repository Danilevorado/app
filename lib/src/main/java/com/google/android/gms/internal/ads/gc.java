package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class gc extends i34 {

    /* renamed from: w, reason: collision with root package name */
    ByteBuffer f8670w;

    public gc(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.i34
    public final void d(ByteBuffer byteBuffer) {
        this.f8670w = byteBuffer;
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
