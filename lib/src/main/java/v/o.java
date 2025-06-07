package v;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class o {

    /* renamed from: g, reason: collision with root package name */
    static int f27749g;

    /* renamed from: b, reason: collision with root package name */
    int f27751b;

    /* renamed from: d, reason: collision with root package name */
    int f27753d;

    /* renamed from: a, reason: collision with root package name */
    ArrayList f27750a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    boolean f27752c = false;

    /* renamed from: e, reason: collision with root package name */
    ArrayList f27754e = null;

    /* renamed from: f, reason: collision with root package name */
    private int f27755f = -1;

    class a {

        /* renamed from: a, reason: collision with root package name */
        WeakReference f27756a;

        /* renamed from: b, reason: collision with root package name */
        int f27757b;

        /* renamed from: c, reason: collision with root package name */
        int f27758c;

        /* renamed from: d, reason: collision with root package name */
        int f27759d;

        /* renamed from: e, reason: collision with root package name */
        int f27760e;

        /* renamed from: f, reason: collision with root package name */
        int f27761f;

        /* renamed from: g, reason: collision with root package name */
        int f27762g;

        public a(u.e eVar, r.d dVar, int i10) {
            this.f27756a = new WeakReference(eVar);
            this.f27757b = dVar.x(eVar.O);
            this.f27758c = dVar.x(eVar.P);
            this.f27759d = dVar.x(eVar.Q);
            this.f27760e = dVar.x(eVar.R);
            this.f27761f = dVar.x(eVar.S);
            this.f27762g = i10;
        }
    }

    public o(int i10) {
        int i11 = f27749g;
        f27749g = i11 + 1;
        this.f27751b = i11;
        this.f27753d = i10;
    }

    private String e() {
        int i10 = this.f27753d;
        return i10 == 0 ? "Horizontal" : i10 == 1 ? "Vertical" : i10 == 2 ? "Both" : "Unknown";
    }

    private int j(r.d dVar, ArrayList arrayList, int i10) {
        int iX;
        u.d dVar2;
        u.f fVar = (u.f) ((u.e) arrayList.get(0)).I();
        dVar.D();
        fVar.g(dVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((u.e) arrayList.get(i11)).g(dVar, false);
        }
        if (i10 == 0 && fVar.W0 > 0) {
            u.b.b(fVar, dVar, arrayList, 0);
        }
        if (i10 == 1 && fVar.X0 > 0) {
            u.b.b(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.z();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        this.f27754e = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f27754e.add(new a((u.e) arrayList.get(i12), dVar, i10));
        }
        if (i10 == 0) {
            iX = dVar.x(fVar.O);
            dVar2 = fVar.Q;
        } else {
            iX = dVar.x(fVar.P);
            dVar2 = fVar.R;
        }
        int iX2 = dVar.x(dVar2);
        dVar.D();
        return iX2 - iX;
    }

    public boolean a(u.e eVar) {
        if (this.f27750a.contains(eVar)) {
            return false;
        }
        this.f27750a.add(eVar);
        return true;
    }

    public void b(ArrayList arrayList) {
        int size = this.f27750a.size();
        if (this.f27755f != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                o oVar = (o) arrayList.get(i10);
                if (this.f27755f == oVar.f27751b) {
                    g(this.f27753d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.f27751b;
    }

    public int d() {
        return this.f27753d;
    }

    public int f(r.d dVar, int i10) {
        if (this.f27750a.size() == 0) {
            return 0;
        }
        return j(dVar, this.f27750a, i10);
    }

    public void g(int i10, o oVar) {
        Iterator it = this.f27750a.iterator();
        while (it.hasNext()) {
            u.e eVar = (u.e) it.next();
            oVar.a(eVar);
            int iC = oVar.c();
            if (i10 == 0) {
                eVar.I0 = iC;
            } else {
                eVar.J0 = iC;
            }
        }
        this.f27755f = oVar.f27751b;
    }

    public void h(boolean z10) {
        this.f27752c = z10;
    }

    public void i(int i10) {
        this.f27753d = i10;
    }

    public String toString() {
        String str = e() + " [" + this.f27751b + "] <";
        Iterator it = this.f27750a.iterator();
        while (it.hasNext()) {
            str = str + " " + ((u.e) it.next()).r();
        }
        return str + " >";
    }
}
