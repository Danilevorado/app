package b2;

import n2.k;
import t1.v;

/* loaded from: classes.dex */
public class b implements v {

    /* renamed from: m, reason: collision with root package name */
    private final byte[] f4388m;

    public b(byte[] bArr) {
        this.f4388m = (byte[]) k.d(bArr);
    }

    @Override // t1.v
    public int a() {
        return this.f4388m.length;
    }

    @Override // t1.v
    public Class b() {
        return byte[].class;
    }

    @Override // t1.v
    public void c() {
    }

    @Override // t1.v
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f4388m;
    }
}
