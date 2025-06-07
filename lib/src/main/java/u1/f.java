package u1;

/* loaded from: classes.dex */
public final class f implements a {
    @Override // u1.a
    public String a() {
        return "ByteArrayPool";
    }

    @Override // u1.a
    public int c() {
        return 1;
    }

    @Override // u1.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int b(byte[] bArr) {
        return bArr.length;
    }

    @Override // u1.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public byte[] newArray(int i10) {
        return new byte[i10];
    }
}
