package v;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d, reason: collision with root package name */
    p f27714d;

    /* renamed from: f, reason: collision with root package name */
    int f27716f;

    /* renamed from: g, reason: collision with root package name */
    public int f27717g;

    /* renamed from: a, reason: collision with root package name */
    public d f27711a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f27712b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f27713c = false;

    /* renamed from: e, reason: collision with root package name */
    a f27715e = a.UNKNOWN;

    /* renamed from: h, reason: collision with root package name */
    int f27718h = 1;

    /* renamed from: i, reason: collision with root package name */
    g f27719i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f27720j = false;

    /* renamed from: k, reason: collision with root package name */
    List f27721k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    List f27722l = new ArrayList();

    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f27714d = pVar;
    }

    @Override // v.d
    public void a(d dVar) {
        Iterator it = this.f27722l.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f27720j) {
                return;
            }
        }
        this.f27713c = true;
        d dVar2 = this.f27711a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f27712b) {
            this.f27714d.a(this);
            return;
        }
        f fVar = null;
        int i10 = 0;
        for (f fVar2 : this.f27722l) {
            if (!(fVar2 instanceof g)) {
                i10++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i10 == 1 && fVar.f27720j) {
            g gVar = this.f27719i;
            if (gVar != null) {
                if (!gVar.f27720j) {
                    return;
                } else {
                    this.f27716f = this.f27718h * gVar.f27717g;
                }
            }
            d(fVar.f27717g + this.f27716f);
        }
        d dVar3 = this.f27711a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f27721k.add(dVar);
        if (this.f27720j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f27722l.clear();
        this.f27721k.clear();
        this.f27720j = false;
        this.f27717g = 0;
        this.f27713c = false;
        this.f27712b = false;
    }

    public void d(int i10) {
        if (this.f27720j) {
            return;
        }
        this.f27720j = true;
        this.f27717g = i10;
        for (d dVar : this.f27721k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f27714d.f27765b.r());
        sb2.append(":");
        sb2.append(this.f27715e);
        sb2.append("(");
        sb2.append(this.f27720j ? Integer.valueOf(this.f27717g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f27722l.size());
        sb2.append(":d=");
        sb2.append(this.f27721k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
