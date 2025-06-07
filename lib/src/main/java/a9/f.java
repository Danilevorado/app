package a9;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    protected j f239a;

    class a extends f {

        /* renamed from: b, reason: collision with root package name */
        boolean f240b = false;

        /* renamed from: c, reason: collision with root package name */
        List f241c = new LinkedList();

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f243e;

        a(f fVar) {
            this.f243e = fVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(g gVar) {
            if (this.f240b) {
                b(gVar);
            } else {
                this.f241c.add(gVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(g gVar) {
            this.f240b = true;
            Iterator it = this.f241c.iterator();
            while (it.hasNext()) {
                b((g) it.next());
            }
        }

        @Override // a9.f
        public void a(j jVar) {
            super.a(jVar);
            f.this.a(new j() { // from class: a9.e
                @Override // a9.j
                public final void a(g gVar) {
                    this.f238a.g(gVar);
                }
            });
            this.f243e.a(new j() { // from class: a9.d
                @Override // a9.j
                public final void a(g gVar) {
                    this.f237a.h(gVar);
                }
            });
        }
    }

    class b extends f {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f244b;

        b(Class cls) {
            this.f244b = cls;
        }

        @Override // a9.f
        public void a(j jVar) {
            super.a(jVar);
            i.f(this.f244b, jVar);
        }
    }

    public static f c(Class cls) {
        return new b(cls);
    }

    public static f d(f fVar, f fVar2) {
        return fVar.new a(fVar2);
    }

    public void a(j jVar) {
        this.f239a = jVar;
    }

    protected void b(g gVar) {
        j jVar = this.f239a;
        if (jVar != null) {
            jVar.a(gVar);
        }
    }
}
