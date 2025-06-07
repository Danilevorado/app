package ec;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public class b extends c {
    public b(i iVar, d dVar, long j10, int i10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(dVar.f23270a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j11 = j10 + (i10 * 16);
        this.f23268a = iVar.x(byteBufferAllocate, j11);
        this.f23269b = iVar.x(byteBufferAllocate, j11 + 8);
    }
}
