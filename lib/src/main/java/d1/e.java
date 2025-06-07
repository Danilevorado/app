package d1;

import b1.j;
import e1.c;
import e1.g;
import f1.o;
import g1.v;
import hb.q;
import java.util.ArrayList;
import java.util.List;
import rb.h;

/* loaded from: classes.dex */
public final class e implements d, c.a {

    /* renamed from: a, reason: collision with root package name */
    private final c f22807a;

    /* renamed from: b, reason: collision with root package name */
    private final e1.c[] f22808b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f22809c;

    public e(c cVar, e1.c[] cVarArr) {
        h.e(cVarArr, "constraintControllers");
        this.f22807a = cVar;
        this.f22808b = cVarArr;
        this.f22809c = new Object();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(o oVar, c cVar) {
        this(cVar, new e1.c[]{new e1.a(oVar.a()), new e1.b(oVar.b()), new e1.h(oVar.d()), new e1.d(oVar.c()), new g(oVar.c()), new e1.f(oVar.c()), new e1.e(oVar.c())});
        h.e(oVar, "trackers");
    }

    @Override // d1.d
    public void a(Iterable iterable) {
        h.e(iterable, "workSpecs");
        synchronized (this.f22809c) {
            for (e1.c cVar : this.f22808b) {
                cVar.g(null);
            }
            for (e1.c cVar2 : this.f22808b) {
                cVar2.e(iterable);
            }
            for (e1.c cVar3 : this.f22808b) {
                cVar3.g(this);
            }
            q qVar = q.f24177a;
        }
    }

    @Override // e1.c.a
    public void b(List list) {
        h.e(list, "workSpecs");
        synchronized (this.f22809c) {
            ArrayList<v> arrayList = new ArrayList();
            for (Object obj : list) {
                if (e(((v) obj).f23739a)) {
                    arrayList.add(obj);
                }
            }
            for (v vVar : arrayList) {
                j.e().a(f.f22810a, "Constraints met for " + vVar);
            }
            c cVar = this.f22807a;
            if (cVar != null) {
                cVar.e(arrayList);
                q qVar = q.f24177a;
            }
        }
    }

    @Override // e1.c.a
    public void c(List list) {
        h.e(list, "workSpecs");
        synchronized (this.f22809c) {
            c cVar = this.f22807a;
            if (cVar != null) {
                cVar.c(list);
                q qVar = q.f24177a;
            }
        }
    }

    @Override // d1.d
    public void d() {
        synchronized (this.f22809c) {
            for (e1.c cVar : this.f22808b) {
                cVar.f();
            }
            q qVar = q.f24177a;
        }
    }

    public final boolean e(String str) {
        e1.c cVar;
        boolean z10;
        h.e(str, "workSpecId");
        synchronized (this.f22809c) {
            e1.c[] cVarArr = this.f22808b;
            int length = cVarArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    cVar = null;
                    break;
                }
                cVar = cVarArr[i10];
                if (cVar.d(str)) {
                    break;
                }
                i10++;
            }
            if (cVar != null) {
                j.e().a(f.f22810a, "Work " + str + " constrained by " + cVar.getClass().getSimpleName());
            }
            z10 = cVar == null;
        }
        return z10;
    }
}
