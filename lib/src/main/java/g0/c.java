package g0;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    protected int f23683a;

    /* renamed from: b, reason: collision with root package name */
    protected ByteBuffer f23684b;

    /* renamed from: c, reason: collision with root package name */
    private int f23685c;

    /* renamed from: d, reason: collision with root package name */
    private int f23686d;

    /* renamed from: e, reason: collision with root package name */
    d f23687e = d.a();

    protected int a(int i10) {
        return i10 + this.f23684b.getInt(i10);
    }

    protected int b(int i10) {
        if (i10 < this.f23686d) {
            return this.f23684b.getShort(this.f23685c + i10);
        }
        return 0;
    }

    protected void c(int i10, ByteBuffer byteBuffer) {
        short s10;
        this.f23684b = byteBuffer;
        if (byteBuffer != null) {
            this.f23683a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f23685c = i11;
            s10 = this.f23684b.getShort(i11);
        } else {
            s10 = 0;
            this.f23683a = 0;
            this.f23685c = 0;
        }
        this.f23686d = s10;
    }

    protected int d(int i10) {
        int i11 = i10 + this.f23683a;
        return i11 + this.f23684b.getInt(i11) + 4;
    }

    protected int e(int i10) {
        int i11 = i10 + this.f23683a;
        return this.f23684b.getInt(i11 + this.f23684b.getInt(i11));
    }
}
