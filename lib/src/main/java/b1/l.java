package b1;

import androidx.work.OverwritingInputMerger;
import b1.v;

/* loaded from: classes.dex */
public final class l extends v {

    /* renamed from: e, reason: collision with root package name */
    public static final b f4362e = new b(null);

    public static final class a extends v.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class cls) {
            super(cls);
            rb.h.e(cls, "workerClass");
            h().f23742d = OverwritingInputMerger.class.getName();
        }

        @Override // b1.v.a
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public l c() {
            if ((d() && h().f23748j.h()) ? false : true) {
                return new l(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
        }

        @Override // b1.v.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public a g() {
            return this;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(rb.f fVar) {
            this();
        }

        public final l a(Class cls) {
            rb.h.e(cls, "workerClass");
            return (l) new a(cls).b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(a aVar) {
        super(aVar.e(), aVar.h(), aVar.f());
        rb.h.e(aVar, "builder");
    }

    public static final l e(Class cls) {
        return f4362e.a(cls);
    }
}
