package ec;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public class l extends f {
    public l(i iVar, d dVar, int i10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(dVar.f23270a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f23283a = iVar.U(byteBufferAllocate, dVar.f23273d + (i10 * dVar.f23276g) + 28);
    }
}
