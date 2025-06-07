package r6;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private final int f26618a;

    /* renamed from: b, reason: collision with root package name */
    private final int f26619b;

    protected g(int i10, int i11) {
        this.f26618a = i10;
        this.f26619b = i11;
    }

    public final int a() {
        return this.f26619b;
    }

    public abstract byte[] b();

    public abstract byte[] c(int i10, byte[] bArr);

    public final int d() {
        return this.f26618a;
    }

    public final String toString() {
        int i10 = this.f26618a;
        byte[] bArrC = new byte[i10];
        StringBuilder sb2 = new StringBuilder(this.f26619b * (i10 + 1));
        for (int i11 = 0; i11 < this.f26619b; i11++) {
            bArrC = c(i11, bArrC);
            for (int i12 = 0; i12 < this.f26618a; i12++) {
                int i13 = bArrC[i12] & 255;
                sb2.append(i13 < 64 ? '#' : i13 < 128 ? '+' : i13 < 192 ? '.' : ' ');
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
