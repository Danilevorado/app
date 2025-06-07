package yb;

import java.io.Closeable;
import kb.e;

/* loaded from: classes2.dex */
public abstract class q extends c implements Closeable {

    /* renamed from: n, reason: collision with root package name */
    public static final a f28619n = new a(null);

    public static final class a extends kb.b {

        /* renamed from: yb.q$a$a, reason: collision with other inner class name */
        static final class C0216a extends rb.i implements qb.l {

            /* renamed from: n, reason: collision with root package name */
            public static final C0216a f28620n = new C0216a();

            C0216a() {
                super(1);
            }

            @Override // qb.l
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final q c(e.b bVar) {
                if (bVar instanceof q) {
                    return (q) bVar;
                }
                return null;
            }
        }

        private a() {
            super(c.f28599m, C0216a.f28620n);
        }

        public /* synthetic */ a(rb.f fVar) {
            this();
        }
    }
}
