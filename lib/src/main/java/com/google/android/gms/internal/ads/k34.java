package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class k34 extends i34 {

    /* renamed from: w, reason: collision with root package name */
    private int f10806w;

    protected k34(String str) {
        super("mvhd");
    }

    public final int g() {
        if (!this.f9521o) {
            f();
        }
        return this.f10806w;
    }

    protected final long h(ByteBuffer byteBuffer) {
        this.f10806w = bc.c(byteBuffer.get());
        bc.d(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
