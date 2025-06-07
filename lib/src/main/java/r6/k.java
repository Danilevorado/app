package r6;

import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final String f26628a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f26629b;

    /* renamed from: c, reason: collision with root package name */
    private final int f26630c;

    /* renamed from: d, reason: collision with root package name */
    private m[] f26631d;

    /* renamed from: e, reason: collision with root package name */
    private final a f26632e;

    /* renamed from: f, reason: collision with root package name */
    private Map f26633f;

    /* renamed from: g, reason: collision with root package name */
    private final long f26634g;

    public k(String str, byte[] bArr, int i10, m[] mVarArr, a aVar, long j10) {
        this.f26628a = str;
        this.f26629b = bArr;
        this.f26630c = i10;
        this.f26631d = mVarArr;
        this.f26632e = aVar;
        this.f26633f = null;
        this.f26634g = j10;
    }

    public k(String str, byte[] bArr, m[] mVarArr, a aVar) {
        this(str, bArr, mVarArr, aVar, System.currentTimeMillis());
    }

    public k(String str, byte[] bArr, m[] mVarArr, a aVar, long j10) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, mVarArr, aVar, j10);
    }

    public String a() {
        return this.f26628a;
    }

    public void b(l lVar, Object obj) {
        if (this.f26633f == null) {
            this.f26633f = new EnumMap(l.class);
        }
        this.f26633f.put(lVar, obj);
    }

    public String toString() {
        return this.f26628a;
    }
}
