package hb;

import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class l implements Serializable {

    /* renamed from: m, reason: collision with root package name */
    public static final a f24171m = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(rb.f fVar) {
            this();
        }
    }

    public static final class b implements Serializable {

        /* renamed from: m, reason: collision with root package name */
        public final Throwable f24172m;

        public b(Throwable th) {
            rb.h.e(th, "exception");
            this.f24172m = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && rb.h.a(this.f24172m, ((b) obj).f24172m);
        }

        public int hashCode() {
            return this.f24172m.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f24172m + ')';
        }
    }

    public static Object a(Object obj) {
        return obj;
    }

    public static final boolean b(Object obj) {
        return obj instanceof b;
    }

    public static final boolean c(Object obj) {
        return !(obj instanceof b);
    }
}
