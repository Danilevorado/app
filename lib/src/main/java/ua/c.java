package ua;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f27670d = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    private final int f27671a;

    /* renamed from: b, reason: collision with root package name */
    private final String f27672b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f27673c;

    private c(int i10, String str, byte[] bArr) {
        this.f27671a = i10;
        this.f27672b = str;
        this.f27673c = bArr;
    }

    public static c b(String str) {
        return new c(3, str, f27670d);
    }

    static c c(String str, byte[] bArr) {
        return new c(1, str, bArr);
    }

    public static c d(String str, byte[] bArr) {
        return new c(2, str, bArr);
    }

    public int a() {
        return this.f27671a;
    }

    public byte[] e() {
        return this.f27673c;
    }

    public String f() {
        return this.f27672b;
    }
}
