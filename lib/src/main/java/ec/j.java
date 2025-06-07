package ec;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public class j extends e {
    public j(i iVar, d dVar, long j10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(dVar.f23270a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j11 = dVar.f23272c + (j10 * dVar.f23274e);
        this.f23279a = iVar.U(byteBufferAllocate, j11);
        this.f23280b = iVar.U(byteBufferAllocate, 4 + j11);
        this.f23281c = iVar.U(byteBufferAllocate, 8 + j11);
        this.f23282d = iVar.U(byteBufferAllocate, j11 + 20);
    }
}
