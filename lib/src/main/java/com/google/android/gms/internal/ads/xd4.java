package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;

/* loaded from: classes.dex */
public final class xd4 {

    /* renamed from: a, reason: collision with root package name */
    private ByteBuffer f17521a = zl1.f18622a;

    /* renamed from: c, reason: collision with root package name */
    private int f17523c = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f17522b = 2;

    public final void a(w44 w44Var) {
        ByteBuffer byteBuffer = w44Var.f16975c;
        Objects.requireNonNull(byteBuffer);
        if (byteBuffer.limit() - w44Var.f16975c.position() == 0) {
            return;
        }
        ByteBuffer byteBuffer2 = w44Var.f16975c;
        int iPosition = byteBuffer2.position();
        int iLimit = byteBuffer2.limit();
        int i10 = iLimit - iPosition;
        int i11 = (i10 + 255) / 255;
        int i12 = i11 + 27 + i10;
        if (this.f17521a.capacity() < i12) {
            this.f17521a = ByteBuffer.allocate(i12).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f17521a.clear();
        }
        ByteBuffer byteBuffer3 = this.f17521a;
        byteBuffer3.put((byte) 79);
        byteBuffer3.put((byte) 103);
        byteBuffer3.put((byte) 103);
        byteBuffer3.put((byte) 83);
        byteBuffer3.put((byte) 0);
        byteBuffer3.put((byte) 0);
        int iB = this.f17523c + j0.b(byteBuffer2);
        this.f17523c = iB;
        byteBuffer3.putLong(iB);
        byteBuffer3.putInt(0);
        byteBuffer3.putInt(this.f17522b);
        this.f17522b++;
        byteBuffer3.putInt(0);
        byteBuffer3.put((byte) i11);
        for (int i13 = 0; i13 < i11; i13++) {
            if (i10 >= 255) {
                byteBuffer3.put((byte) -1);
                i10 -= 255;
            } else {
                byteBuffer3.put((byte) i10);
                i10 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBuffer3.put(byteBuffer2.get(iPosition));
            iPosition++;
        }
        byteBuffer2.position(byteBuffer2.limit());
        byteBuffer3.flip();
        byteBuffer3.putInt(22, sv2.l(byteBuffer3.array(), byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0));
        byteBuffer3.position(0);
        this.f17521a = byteBuffer3;
        w44Var.b();
        w44Var.i(this.f17521a.remaining());
        w44Var.f16975c.put(this.f17521a);
        w44Var.j();
    }

    public final void b() {
        this.f17521a = zl1.f18622a;
        this.f17523c = 0;
        this.f17522b = 2;
    }
}
