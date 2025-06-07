package d6;

import java.io.OutputStream;

/* loaded from: classes.dex */
final class b extends OutputStream {

    /* renamed from: m, reason: collision with root package name */
    private long f22951m = 0;

    b() {
    }

    long a() {
        return this.f22951m;
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        this.f22951m++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f22951m += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > bArr.length || i11 < 0 || (i12 = i10 + i11) > bArr.length || i12 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f22951m += i11;
    }
}
