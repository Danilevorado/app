package ec;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public class h extends d {

    /* renamed from: j, reason: collision with root package name */
    private final i f23285j;

    public h(boolean z10, i iVar) {
        this.f23270a = z10;
        this.f23285j = iVar;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(z10 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f23271b = iVar.s(byteBufferAllocate, 16L);
        this.f23272c = iVar.x(byteBufferAllocate, 32L);
        this.f23273d = iVar.x(byteBufferAllocate, 40L);
        this.f23274e = iVar.s(byteBufferAllocate, 54L);
        this.f23275f = iVar.s(byteBufferAllocate, 56L);
        this.f23276g = iVar.s(byteBufferAllocate, 58L);
        this.f23277h = iVar.s(byteBufferAllocate, 60L);
        this.f23278i = iVar.s(byteBufferAllocate, 62L);
    }

    @Override // ec.d
    public c a(long j10, int i10) {
        return new b(this.f23285j, this, j10, i10);
    }

    @Override // ec.d
    public e b(long j10) {
        return new k(this.f23285j, this, j10);
    }

    @Override // ec.d
    public f c(int i10) {
        return new m(this.f23285j, this, i10);
    }
}
