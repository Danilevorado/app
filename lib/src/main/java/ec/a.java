package ec;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public class a extends c {
    public a(i iVar, d dVar, long j10, int i10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(dVar.f23270a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j11 = j10 + (i10 * 8);
        this.f23268a = iVar.U(byteBufferAllocate, j11);
        this.f23269b = iVar.U(byteBufferAllocate, j11 + 4);
    }
}
