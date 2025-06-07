package t1;

import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.List;
import t1.f;
import x1.m;

/* loaded from: classes.dex */
class w implements f, d.a {

    /* renamed from: m, reason: collision with root package name */
    private final f.a f27301m;

    /* renamed from: n, reason: collision with root package name */
    private final g f27302n;

    /* renamed from: o, reason: collision with root package name */
    private int f27303o;

    /* renamed from: p, reason: collision with root package name */
    private int f27304p = -1;

    /* renamed from: q, reason: collision with root package name */
    private r1.f f27305q;

    /* renamed from: r, reason: collision with root package name */
    private List f27306r;

    /* renamed from: s, reason: collision with root package name */
    private int f27307s;

    /* renamed from: t, reason: collision with root package name */
    private volatile m.a f27308t;

    /* renamed from: u, reason: collision with root package name */
    private File f27309u;

    /* renamed from: v, reason: collision with root package name */
    private x f27310v;

    w(g gVar, f.a aVar) {
        this.f27302n = gVar;
        this.f27301m = aVar;
    }

    private boolean b() {
        return this.f27307s < this.f27306r.size();
    }

    @Override // t1.f
    public boolean a() {
        o2.b.a("ResourceCacheGenerator.startNext");
        try {
            List listC = this.f27302n.c();
            boolean z10 = false;
            if (listC.isEmpty()) {
                return false;
            }
            List listM = this.f27302n.m();
            if (listM.isEmpty()) {
                if (File.class.equals(this.f27302n.r())) {
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.f27302n.i() + " to " + this.f27302n.r());
            }
            while (true) {
                if (this.f27306r != null && b()) {
                    this.f27308t = null;
                    while (!z10 && b()) {
                        List list = this.f27306r;
                        int i10 = this.f27307s;
                        this.f27307s = i10 + 1;
                        this.f27308t = ((x1.m) list.get(i10)).a(this.f27309u, this.f27302n.t(), this.f27302n.f(), this.f27302n.k());
                        if (this.f27308t != null && this.f27302n.u(this.f27308t.f28182c.a())) {
                            this.f27308t.f28182c.f(this.f27302n.l(), this);
                            z10 = true;
                        }
                    }
                    return z10;
                }
                int i11 = this.f27304p + 1;
                this.f27304p = i11;
                if (i11 >= listM.size()) {
                    int i12 = this.f27303o + 1;
                    this.f27303o = i12;
                    if (i12 >= listC.size()) {
                        return false;
                    }
                    this.f27304p = 0;
                }
                r1.f fVar = (r1.f) listC.get(this.f27303o);
                Class cls = (Class) listM.get(this.f27304p);
                this.f27310v = new x(this.f27302n.b(), fVar, this.f27302n.p(), this.f27302n.t(), this.f27302n.f(), this.f27302n.s(cls), cls, this.f27302n.k());
                File fileB = this.f27302n.d().b(this.f27310v);
                this.f27309u = fileB;
                if (fileB != null) {
                    this.f27305q = fVar;
                    this.f27306r = this.f27302n.j(fileB);
                    this.f27307s = 0;
                }
            }
        } finally {
            o2.b.e();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(Exception exc) {
        this.f27301m.g(this.f27310v, exc, this.f27308t.f28182c, r1.a.RESOURCE_DISK_CACHE);
    }

    @Override // t1.f
    public void cancel() {
        m.a aVar = this.f27308t;
        if (aVar != null) {
            aVar.f28182c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void d(Object obj) {
        this.f27301m.d(this.f27305q, obj, this.f27308t.f28182c, r1.a.RESOURCE_DISK_CACHE, this.f27310v);
    }
}
