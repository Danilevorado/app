package ec;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public class k extends e {
    public k(i iVar, d dVar, long j10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(dVar.f23270a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j11 = dVar.f23272c + (j10 * dVar.f23274e);
        this.f23279a = iVar.U(byteBufferAllocate, j11);
        this.f23280b = iVar.x(byteBufferAllocate, 8 + j11);
        this.f23281c = iVar.x(byteBufferAllocate, 16 + j11);
        this.f23282d = iVar.x(byteBufferAllocate, j11 + 40);
    }
}
