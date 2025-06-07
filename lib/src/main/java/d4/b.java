package d4;

import com.google.android.gms.common.api.a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f22891a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.common.api.a f22892b;

    /* renamed from: c, reason: collision with root package name */
    private final a.d f22893c;

    /* renamed from: d, reason: collision with root package name */
    private final String f22894d;

    private b(com.google.android.gms.common.api.a aVar, a.d dVar, String str) {
        this.f22892b = aVar;
        this.f22893c = dVar;
        this.f22894d = str;
        this.f22891a = e4.o.b(aVar, dVar, str);
    }

    public static b a(com.google.android.gms.common.api.a aVar, a.d dVar, String str) {
        return new b(aVar, dVar, str);
    }

    public final String b() {
        return this.f22892b.d();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return e4.o.a(this.f22892b, bVar.f22892b) && e4.o.a(this.f22893c, bVar.f22893c) && e4.o.a(this.f22894d, bVar.f22894d);
    }

    public final int hashCode() {
        return this.f22891a;
    }
}
