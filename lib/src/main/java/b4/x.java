package b4;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
abstract class x extends v {

    /* renamed from: o, reason: collision with root package name */
    private static final WeakReference f4448o = new WeakReference(null);

    /* renamed from: n, reason: collision with root package name */
    private WeakReference f4449n;

    x(byte[] bArr) {
        super(bArr);
        this.f4449n = f4448o;
    }

    @Override // b4.v
    final byte[] p1() {
        byte[] bArrW3;
        synchronized (this) {
            bArrW3 = (byte[]) this.f4449n.get();
            if (bArrW3 == null) {
                bArrW3 = w3();
                this.f4449n = new WeakReference(bArrW3);
            }
        }
        return bArrW3;
    }

    protected abstract byte[] w3();
}
