package x1;

import java.util.Queue;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final n2.h f28174a;

    class a extends n2.h {
        a(long j10) {
            super(j10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // n2.h
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void j(b bVar, Object obj) {
            bVar.c();
        }
    }

    static final class b {

        /* renamed from: d, reason: collision with root package name */
        private static final Queue f28176d = n2.l.e(0);

        /* renamed from: a, reason: collision with root package name */
        private int f28177a;

        /* renamed from: b, reason: collision with root package name */
        private int f28178b;

        /* renamed from: c, reason: collision with root package name */
        private Object f28179c;

        private b() {
        }

        static b a(Object obj, int i10, int i11) {
            b bVar;
            Queue queue = f28176d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b();
            }
            bVar.b(obj, i10, i11);
            return bVar;
        }

        private void b(Object obj, int i10, int i11) {
            this.f28179c = obj;
            this.f28178b = i10;
            this.f28177a = i11;
        }

        public void c() {
            Queue queue = f28176d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f28178b == bVar.f28178b && this.f28177a == bVar.f28177a && this.f28179c.equals(bVar.f28179c);
        }

        public int hashCode() {
            return (((this.f28177a * 31) + this.f28178b) * 31) + this.f28179c.hashCode();
        }
    }

    public l(long j10) {
        this.f28174a = new a(j10);
    }

    public Object a(Object obj, int i10, int i11) {
        b bVarA = b.a(obj, i10, i11);
        Object objG = this.f28174a.g(bVarA);
        bVarA.c();
        return objG;
    }

    public void b(Object obj, int i10, int i11, Object obj2) {
        this.f28174a.k(b.a(obj, i10, i11), obj2);
    }
}
