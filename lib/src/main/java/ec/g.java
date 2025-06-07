package ec;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public class g extends d {

    /* renamed from: j, reason: collision with root package name */
    private final i f23284j;

    public g(boolean z10, i iVar) {
        this.f23270a = z10;
        this.f23284j = iVar;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(z10 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f23271b = iVar.s(byteBufferAllocate, 16L);
        this.f23272c = iVar.U(byteBufferAllocate, 28L);
        this.f23273d = iVar.U(byteBufferAllocate, 32L);
        this.f23274e = iVar.s(byteBufferAllocate, 42L);
        this.f23275f = iVar.s(byteBufferAllocate, 44L);
        this.f23276g = iVar.s(byteBufferAllocate, 46L);
        this.f23277h = iVar.s(byteBufferAllocate, 48L);
        this.f23278i = iVar.s(byteBufferAllocate, 50L);
    }

    @Override // ec.d
    public c a(long j10, int i10) {
        return new a(this.f23284j, this, j10, i10);
    }

    @Override // ec.d
    public e b(long j10) {
        return new j(this.f23284j, this, j10);
    }

    @Override // ec.d
    public f c(int i10) {
        return new l(this.f23284j, this, i10);
    }
}
