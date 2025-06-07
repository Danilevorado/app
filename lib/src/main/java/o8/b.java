package o8;

import e8.c;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final Object f25813a;

    /* renamed from: b, reason: collision with root package name */
    private final c f25814b;

    private b(Object obj, c cVar) {
        this.f25813a = obj;
        this.f25814b = cVar;
    }

    public static b a(Object obj, c cVar) {
        return new b(obj, cVar);
    }

    public static b b(Object obj) {
        return new b(obj, null);
    }

    public static b c(c cVar) {
        return new b(null, cVar);
    }

    public Object d() {
        return this.f25813a;
    }

    public c e() {
        return this.f25814b;
    }

    public boolean f() {
        return this.f25814b == null;
    }
}
