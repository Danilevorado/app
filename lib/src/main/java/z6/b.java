package z6;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b extends RecyclerView.g {

    /* renamed from: p, reason: collision with root package name */
    private ArrayList f28890p;

    /* renamed from: q, reason: collision with root package name */
    private d f28891q;

    /* renamed from: r, reason: collision with root package name */
    private e f28892r;

    /* renamed from: s, reason: collision with root package name */
    private f f28893s;

    /* renamed from: o, reason: collision with root package name */
    private ArrayList f28889o = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    private boolean f28894t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f28895u = false;

    /* renamed from: v, reason: collision with root package name */
    private boolean f28896v = false;

    /* renamed from: w, reason: collision with root package name */
    private boolean f28897w = false;

    /* renamed from: x, reason: collision with root package name */
    private int f28898x = -1;

    /* renamed from: y, reason: collision with root package name */
    private int f28899y = 0;

    /* renamed from: z, reason: collision with root package name */
    private f f28900z = new a();

    class a implements f {
        a() {
        }

        @Override // z6.b.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void i(RecyclerView.d0 d0Var, int i10) {
            int iIndexOf;
            if (b.this.f28897w && b.this.f28889o.size() > 0 && (iIndexOf = b.this.f28890p.indexOf(b.this.f28889o.get(0))) >= 0) {
                b.this.V(iIndexOf);
                b.this.T(iIndexOf);
            }
            if (b.this.f28898x > 0 && b.this.f28889o.size() >= b.this.f28898x) {
                h();
                return;
            }
            b.this.W(d0Var.f3305a, i10, true);
            if (b.this.f28893s != null) {
                b.this.f28893s.i(d0Var, i10);
            }
        }

        @Override // z6.b.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void d(RecyclerView.d0 d0Var, int i10) {
            b.this.W(d0Var.f3305a, i10, false);
            if (b.this.f28893s != null) {
                b.this.f28893s.d(d0Var, i10);
            }
        }

        @Override // z6.b.f
        public void h() {
            if (b.this.f28897w || b.this.f28893s == null) {
                return;
            }
            b.this.f28893s.h();
        }

        @Override // z6.b.f
        public void k() {
            b.this.f28894t = true;
            if (b.this.f28897w || b.this.f28893s == null) {
                return;
            }
            b.this.f28893s.k();
        }

        @Override // z6.b.f
        public void o() {
            b.this.f28894t = false;
            if (b.this.f28897w || b.this.f28893s == null) {
                return;
            }
            b.this.f28893s.o();
        }
    }

    /* renamed from: z6.b$b, reason: collision with other inner class name */
    class ViewOnClickListenerC0222b implements View.OnClickListener {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ RecyclerView.d0 f28902m;

        ViewOnClickListenerC0222b(RecyclerView.d0 d0Var) {
            this.f28902m = d0Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iJ = this.f28902m.j() - b.this.f28899y;
            if (b.this.f28895u && (b.this.f28894t || b.this.f28896v)) {
                if (b.this.f28889o.contains(b.this.f28890p.get(iJ))) {
                    b.this.f28900z.d(this.f28902m, iJ);
                    if (b.this.f28889o.isEmpty()) {
                        b.this.f28900z.o();
                    }
                } else {
                    b.this.f28900z.i(this.f28902m, iJ);
                }
            }
            if (b.this.f28891q != null) {
                b.this.f28891q.a(view, iJ);
            }
        }
    }

    class c implements View.OnLongClickListener {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ RecyclerView.d0 f28904m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ View f28905n;

        c(RecyclerView.d0 d0Var, View view) {
            this.f28904m = d0Var;
            this.f28905n = view;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            int iJ = this.f28904m.j() - b.this.f28899y;
            if (b.this.f28895u) {
                if (!b.this.f28894t) {
                    b.this.f28900z.k();
                    b.this.f28900z.i(this.f28904m, iJ);
                } else if (b.this.f28889o.size() <= 1 && b.this.f28889o.contains(b.this.f28890p.get(iJ))) {
                    b.this.f28900z.o();
                    b.this.f28900z.d(this.f28904m, iJ);
                }
            }
            return b.this.f28892r == null || b.this.f28892r.a(this.f28905n, iJ);
        }
    }

    public interface d {
        void a(View view, int i10);
    }

    public interface e {
        boolean a(View view, int i10);
    }

    public interface f {
        void d(Object obj, int i10);

        void h();

        void i(Object obj, int i10);

        void k();

        void o();
    }

    public b(ArrayList arrayList) {
        this.f28890p = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(int i10) {
        if (this.f28889o.remove(this.f28890p.get(i10)) && this.f28889o.isEmpty()) {
            this.f28900z.o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(View view, int i10, boolean z10) {
        ArrayList arrayList = this.f28889o;
        if (z10) {
            if (arrayList.contains(this.f28890p.get(i10))) {
                return;
            }
            this.f28889o.add(this.f28890p.get(i10));
        } else if (arrayList.remove(this.f28890p.get(i10)) && this.f28889o.isEmpty()) {
            this.f28900z.o();
        }
    }

    public void P(boolean z10) {
        this.f28895u = z10;
    }

    public void Q(boolean z10) {
        this.f28895u = z10 || this.f28895u;
        this.f28896v = z10;
    }

    public int R() {
        return this.f28889o.size();
    }

    public ArrayList S() {
        return this.f28889o;
    }

    public void T(int i10) {
        m(i10 + this.f28899y);
    }

    public boolean U(c7.a aVar) {
        return this.f28889o.contains(aVar);
    }

    public void X(int i10) {
        this.f28899y = i10;
    }

    public void Y(int i10) {
        this.f28898x = i10;
    }

    public void Z(f fVar) {
        this.f28893s = fVar;
    }

    public void a0(ArrayList arrayList) {
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.f28889o = arrayList;
    }

    public void b0(boolean z10) {
        this.f28897w = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void p(RecyclerView.d0 d0Var, int i10) {
        View view = d0Var.f3305a;
        view.setOnClickListener(new ViewOnClickListenerC0222b(d0Var));
        W(view, i10, this.f28889o.contains(this.f28890p.get(i10)));
        view.setOnLongClickListener(new c(d0Var, view));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void q(RecyclerView.d0 d0Var, int i10, List list) {
        super.q(d0Var, i10, list);
    }
}
