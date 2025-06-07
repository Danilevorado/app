package s6;

import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f27051a;

    /* renamed from: b, reason: collision with root package name */
    private int f27052b;

    /* renamed from: c, reason: collision with root package name */
    private final String f27053c;

    /* renamed from: d, reason: collision with root package name */
    private final List f27054d;

    /* renamed from: e, reason: collision with root package name */
    private final String f27055e;

    /* renamed from: f, reason: collision with root package name */
    private Object f27056f;

    /* renamed from: g, reason: collision with root package name */
    private final int f27057g;

    /* renamed from: h, reason: collision with root package name */
    private final int f27058h;

    public d(byte[] bArr, String str, List list, String str2, int i10, int i11) {
        this.f27051a = bArr;
        this.f27052b = bArr == null ? 0 : bArr.length * 8;
        this.f27053c = str;
        this.f27054d = list;
        this.f27055e = str2;
        this.f27057g = i11;
        this.f27058h = i10;
    }

    public List a() {
        return this.f27054d;
    }

    public String b() {
        return this.f27055e;
    }

    public Object c() {
        return this.f27056f;
    }

    public byte[] d() {
        return this.f27051a;
    }

    public int e() {
        return this.f27057g;
    }

    public int f() {
        return this.f27058h;
    }

    public String g() {
        return this.f27053c;
    }

    public boolean h() {
        return this.f27057g >= 0 && this.f27058h >= 0;
    }

    public void i(Object obj) {
        this.f27056f = obj;
    }
}
