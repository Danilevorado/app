package n0;

import java.util.LinkedHashMap;
import java.util.Map;
import rb.h;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private final Map f25445a = new LinkedHashMap();

    /* renamed from: n0.a$a, reason: collision with other inner class name */
    public static final class C0164a extends a {

        /* renamed from: b, reason: collision with root package name */
        public static final C0164a f25446b = new C0164a();

        private C0164a() {
        }

        @Override // n0.a
        public Object a(b bVar) {
            h.e(bVar, "key");
            return null;
        }
    }

    public interface b {
    }

    public abstract Object a(b bVar);

    public final Map b() {
        return this.f25445a;
    }
}
