package a6;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f184a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f185b;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f186a;

        /* renamed from: b, reason: collision with root package name */
        private Map f187b = null;

        b(String str) {
            this.f186a = str;
        }

        public c a() {
            return new c(this.f186a, this.f187b == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.f187b)));
        }

        public b b(Annotation annotation) {
            if (this.f187b == null) {
                this.f187b = new HashMap();
            }
            this.f187b.put(annotation.annotationType(), annotation);
            return this;
        }
    }

    private c(String str, Map map) {
        this.f184a = str;
        this.f185b = map;
    }

    public static b a(String str) {
        return new b(str);
    }

    public static c d(String str) {
        return new c(str, Collections.emptyMap());
    }

    public String b() {
        return this.f184a;
    }

    public Annotation c(Class cls) {
        return (Annotation) this.f185b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f184a.equals(cVar.f184a) && this.f185b.equals(cVar.f185b);
    }

    public int hashCode() {
        return (this.f184a.hashCode() * 31) + this.f185b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f184a + ", properties=" + this.f185b.values() + "}";
    }
}
