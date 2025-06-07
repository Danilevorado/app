package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class w44 extends k14 {

    /* renamed from: b, reason: collision with root package name */
    public final n44 f16974b = new n44();

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer f16975c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16976d;

    /* renamed from: e, reason: collision with root package name */
    public long f16977e;

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f16978f;

    /* renamed from: g, reason: collision with root package name */
    private final int f16979g;

    static {
        u40.b("media3.decoder");
    }

    public w44(int i10, int i11) {
        this.f16979g = i10;
    }

    private final ByteBuffer l(int i10) {
        int i11 = this.f16979g;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f16975c;
        throw new v44(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    @Override // com.google.android.gms.internal.ads.k14
    public void b() {
        super.b();
        ByteBuffer byteBuffer = this.f16975c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f16978f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f16976d = false;
    }

    public final void i(int i10) {
        ByteBuffer byteBuffer = this.f16975c;
        if (byteBuffer == null) {
            this.f16975c = l(i10);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i11 = i10 + iPosition;
        if (iCapacity >= i11) {
            this.f16975c = byteBuffer;
            return;
        }
        ByteBuffer byteBufferL = l(i11);
        byteBufferL.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferL.put(byteBuffer);
        }
        this.f16975c = byteBufferL;
    }

    public final void j() {
        ByteBuffer byteBuffer = this.f16975c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f16978f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean k() {
        return d(1073741824);
    }
}
