package x1;

import com.bumptech.glide.load.data.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import x1.m;

/* loaded from: classes.dex */
class p implements m {

    /* renamed from: a, reason: collision with root package name */
    private final List f28187a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.core.util.e f28188b;

    static class a implements com.bumptech.glide.load.data.d, d.a {

        /* renamed from: m, reason: collision with root package name */
        private final List f28189m;

        /* renamed from: n, reason: collision with root package name */
        private final androidx.core.util.e f28190n;

        /* renamed from: o, reason: collision with root package name */
        private int f28191o;

        /* renamed from: p, reason: collision with root package name */
        private com.bumptech.glide.g f28192p;

        /* renamed from: q, reason: collision with root package name */
        private d.a f28193q;

        /* renamed from: r, reason: collision with root package name */
        private List f28194r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f28195s;

        a(List list, androidx.core.util.e eVar) {
            this.f28190n = eVar;
            n2.k.c(list);
            this.f28189m = list;
            this.f28191o = 0;
        }

        private void g() {
            if (this.f28195s) {
                return;
            }
            if (this.f28191o < this.f28189m.size() - 1) {
                this.f28191o++;
                f(this.f28192p, this.f28193q);
            } else {
                n2.k.d(this.f28194r);
                this.f28193q.c(new t1.q("Fetch failed", new ArrayList(this.f28194r)));
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return ((com.bumptech.glide.load.data.d) this.f28189m.get(0)).a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            List list = this.f28194r;
            if (list != null) {
                this.f28190n.a(list);
            }
            this.f28194r = null;
            Iterator it = this.f28189m.iterator();
            while (it.hasNext()) {
                ((com.bumptech.glide.load.data.d) it.next()).b();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(Exception exc) {
            ((List) n2.k.d(this.f28194r)).add(exc);
            g();
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f28195s = true;
            Iterator it = this.f28189m.iterator();
            while (it.hasNext()) {
                ((com.bumptech.glide.load.data.d) it.next()).cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void d(Object obj) {
            if (obj != null) {
                this.f28193q.d(obj);
            } else {
                g();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public r1.a e() {
            return ((com.bumptech.glide.load.data.d) this.f28189m.get(0)).e();
        }

        @Override // com.bumptech.glide.load.data.d
        public void f(com.bumptech.glide.g gVar, d.a aVar) {
            this.f28192p = gVar;
            this.f28193q = aVar;
            this.f28194r = (List) this.f28190n.b();
            ((com.bumptech.glide.load.data.d) this.f28189m.get(this.f28191o)).f(gVar, this);
            if (this.f28195s) {
                cancel();
            }
        }
    }

    p(List list, androidx.core.util.e eVar) {
        this.f28187a = list;
        this.f28188b = eVar;
    }

    @Override // x1.m
    public m.a a(Object obj, int i10, int i11, r1.h hVar) {
        m.a aVarA;
        int size = this.f28187a.size();
        ArrayList arrayList = new ArrayList(size);
        r1.f fVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            m mVar = (m) this.f28187a.get(i12);
            if (mVar.b(obj) && (aVarA = mVar.a(obj, i10, i11, hVar)) != null) {
                fVar = aVarA.f28180a;
                arrayList.add(aVarA.f28182c);
            }
        }
        if (arrayList.isEmpty() || fVar == null) {
            return null;
        }
        return new m.a(fVar, new a(arrayList, this.f28188b));
    }

    @Override // x1.m
    public boolean b(Object obj) {
        Iterator it = this.f28187a.iterator();
        while (it.hasNext()) {
            if (((m) it.next()).b(obj)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f28187a.toArray()) + '}';
    }
}
