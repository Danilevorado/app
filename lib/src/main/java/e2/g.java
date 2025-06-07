package e2;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.k;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import r1.l;

/* loaded from: classes.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    private final q1.a f23039a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f23040b;

    /* renamed from: c, reason: collision with root package name */
    private final List f23041c;

    /* renamed from: d, reason: collision with root package name */
    final k f23042d;

    /* renamed from: e, reason: collision with root package name */
    private final u1.d f23043e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f23044f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f23045g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f23046h;

    /* renamed from: i, reason: collision with root package name */
    private com.bumptech.glide.j f23047i;

    /* renamed from: j, reason: collision with root package name */
    private a f23048j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f23049k;

    /* renamed from: l, reason: collision with root package name */
    private a f23050l;

    /* renamed from: m, reason: collision with root package name */
    private Bitmap f23051m;

    /* renamed from: n, reason: collision with root package name */
    private l f23052n;

    /* renamed from: o, reason: collision with root package name */
    private a f23053o;

    /* renamed from: p, reason: collision with root package name */
    private d f23054p;

    /* renamed from: q, reason: collision with root package name */
    private int f23055q;

    /* renamed from: r, reason: collision with root package name */
    private int f23056r;

    /* renamed from: s, reason: collision with root package name */
    private int f23057s;

    static class a extends k2.c {

        /* renamed from: p, reason: collision with root package name */
        private final Handler f23058p;

        /* renamed from: q, reason: collision with root package name */
        final int f23059q;

        /* renamed from: r, reason: collision with root package name */
        private final long f23060r;

        /* renamed from: s, reason: collision with root package name */
        private Bitmap f23061s;

        a(Handler handler, int i10, long j10) {
            this.f23058p = handler;
            this.f23059q = i10;
            this.f23060r = j10;
        }

        @Override // k2.h
        public void g(Drawable drawable) {
            this.f23061s = null;
        }

        Bitmap i() {
            return this.f23061s;
        }

        @Override // k2.h
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void f(Bitmap bitmap, l2.b bVar) {
            this.f23061s = bitmap;
            this.f23058p.sendMessageAtTime(this.f23058p.obtainMessage(1, this), this.f23060r);
        }
    }

    public interface b {
        void a();
    }

    private class c implements Handler.Callback {
        c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                g.this.m((a) message.obj);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            g.this.f23042d.m((a) message.obj);
            return false;
        }
    }

    interface d {
        void a();
    }

    g(com.bumptech.glide.b bVar, q1.a aVar, int i10, int i11, l lVar, Bitmap bitmap) {
        this(bVar.f(), com.bumptech.glide.b.u(bVar.h()), aVar, null, i(com.bumptech.glide.b.u(bVar.h()), i10, i11), lVar, bitmap);
    }

    g(u1.d dVar, k kVar, q1.a aVar, Handler handler, com.bumptech.glide.j jVar, l lVar, Bitmap bitmap) {
        this.f23041c = new ArrayList();
        this.f23042d = kVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f23043e = dVar;
        this.f23040b = handler;
        this.f23047i = jVar;
        this.f23039a = aVar;
        o(lVar, bitmap);
    }

    private static r1.f g() {
        return new m2.b(Double.valueOf(Math.random()));
    }

    private static com.bumptech.glide.j i(k kVar, int i10, int i11) {
        return kVar.k().a(((j2.f) ((j2.f) j2.f.n0(t1.j.f27214b).l0(true)).g0(true)).X(i10, i11));
    }

    private void l() {
        if (!this.f23044f || this.f23045g) {
            return;
        }
        if (this.f23046h) {
            n2.k.a(this.f23053o == null, "Pending target must be null when starting from the first frame");
            this.f23039a.i();
            this.f23046h = false;
        }
        a aVar = this.f23053o;
        if (aVar != null) {
            this.f23053o = null;
            m(aVar);
            return;
        }
        this.f23045g = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + this.f23039a.e();
        this.f23039a.c();
        this.f23050l = new a(this.f23040b, this.f23039a.a(), jUptimeMillis);
        this.f23047i.a(j2.f.p0(g())).A0(this.f23039a).u0(this.f23050l);
    }

    private void n() {
        Bitmap bitmap = this.f23051m;
        if (bitmap != null) {
            this.f23043e.d(bitmap);
            this.f23051m = null;
        }
    }

    private void p() {
        if (this.f23044f) {
            return;
        }
        this.f23044f = true;
        this.f23049k = false;
        l();
    }

    private void q() {
        this.f23044f = false;
    }

    void a() {
        this.f23041c.clear();
        n();
        q();
        a aVar = this.f23048j;
        if (aVar != null) {
            this.f23042d.m(aVar);
            this.f23048j = null;
        }
        a aVar2 = this.f23050l;
        if (aVar2 != null) {
            this.f23042d.m(aVar2);
            this.f23050l = null;
        }
        a aVar3 = this.f23053o;
        if (aVar3 != null) {
            this.f23042d.m(aVar3);
            this.f23053o = null;
        }
        this.f23039a.clear();
        this.f23049k = true;
    }

    ByteBuffer b() {
        return this.f23039a.h().asReadOnlyBuffer();
    }

    Bitmap c() {
        a aVar = this.f23048j;
        return aVar != null ? aVar.i() : this.f23051m;
    }

    int d() {
        a aVar = this.f23048j;
        if (aVar != null) {
            return aVar.f23059q;
        }
        return -1;
    }

    Bitmap e() {
        return this.f23051m;
    }

    int f() {
        return this.f23039a.d();
    }

    int h() {
        return this.f23057s;
    }

    int j() {
        return this.f23039a.f() + this.f23055q;
    }

    int k() {
        return this.f23056r;
    }

    void m(a aVar) {
        d dVar = this.f23054p;
        if (dVar != null) {
            dVar.a();
        }
        this.f23045g = false;
        if (this.f23049k) {
            this.f23040b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f23044f) {
            if (this.f23046h) {
                this.f23040b.obtainMessage(2, aVar).sendToTarget();
                return;
            } else {
                this.f23053o = aVar;
                return;
            }
        }
        if (aVar.i() != null) {
            n();
            a aVar2 = this.f23048j;
            this.f23048j = aVar;
            for (int size = this.f23041c.size() - 1; size >= 0; size--) {
                ((b) this.f23041c.get(size)).a();
            }
            if (aVar2 != null) {
                this.f23040b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        l();
    }

    void o(l lVar, Bitmap bitmap) {
        this.f23052n = (l) n2.k.d(lVar);
        this.f23051m = (Bitmap) n2.k.d(bitmap);
        this.f23047i = this.f23047i.a(new j2.f().j0(lVar));
        this.f23055q = n2.l.g(bitmap);
        this.f23056r = bitmap.getWidth();
        this.f23057s = bitmap.getHeight();
    }

    void r(b bVar) {
        if (this.f23049k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.f23041c.contains(bVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = this.f23041c.isEmpty();
        this.f23041c.add(bVar);
        if (zIsEmpty) {
            p();
        }
    }

    void s(b bVar) {
        this.f23041c.remove(bVar);
        if (this.f23041c.isEmpty()) {
            q();
        }
    }
}
