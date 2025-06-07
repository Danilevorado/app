package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class e implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    static final ThreadLocal f3536q = new ThreadLocal();

    /* renamed from: r, reason: collision with root package name */
    static Comparator f3537r = new a();

    /* renamed from: n, reason: collision with root package name */
    long f3539n;

    /* renamed from: o, reason: collision with root package name */
    long f3540o;

    /* renamed from: m, reason: collision with root package name */
    ArrayList f3538m = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    private ArrayList f3541p = new ArrayList();

    static class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f3549d;
            if ((recyclerView == null) != (cVar2.f3549d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z10 = cVar.f3546a;
            if (z10 != cVar2.f3546a) {
                return z10 ? -1 : 1;
            }
            int i10 = cVar2.f3547b - cVar.f3547b;
            if (i10 != 0) {
                return i10;
            }
            int i11 = cVar.f3548c - cVar2.f3548c;
            if (i11 != 0) {
                return i11;
            }
            return 0;
        }
    }

    static class b implements RecyclerView.o.c {

        /* renamed from: a, reason: collision with root package name */
        int f3542a;

        /* renamed from: b, reason: collision with root package name */
        int f3543b;

        /* renamed from: c, reason: collision with root package name */
        int[] f3544c;

        /* renamed from: d, reason: collision with root package name */
        int f3545d;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o.c
        public void a(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i11 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i12 = this.f3545d * 2;
            int[] iArr = this.f3544c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f3544c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i12 >= iArr.length) {
                int[] iArr3 = new int[i12 * 2];
                this.f3544c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f3544c;
            iArr4[i12] = i10;
            iArr4[i12 + 1] = i11;
            this.f3545d++;
        }

        void b() {
            int[] iArr = this.f3544c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3545d = 0;
        }

        void c(RecyclerView recyclerView, boolean z10) {
            this.f3545d = 0;
            int[] iArr = this.f3544c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.o oVar = recyclerView.f3273y;
            if (recyclerView.f3271x == null || oVar == null || !oVar.u0()) {
                return;
            }
            if (z10) {
                if (!recyclerView.f3255p.p()) {
                    oVar.p(recyclerView.f3271x.c(), this);
                }
            } else if (!recyclerView.m0()) {
                oVar.o(this.f3542a, this.f3543b, recyclerView.f3264t0, this);
            }
            int i10 = this.f3545d;
            if (i10 > oVar.f3350m) {
                oVar.f3350m = i10;
                oVar.f3351n = z10;
                recyclerView.f3251n.K();
            }
        }

        boolean d(int i10) {
            if (this.f3544c != null) {
                int i11 = this.f3545d * 2;
                for (int i12 = 0; i12 < i11; i12 += 2) {
                    if (this.f3544c[i12] == i10) {
                        return true;
                    }
                }
            }
            return false;
        }

        void e(int i10, int i11) {
            this.f3542a = i10;
            this.f3543b = i11;
        }
    }

    static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f3546a;

        /* renamed from: b, reason: collision with root package name */
        public int f3547b;

        /* renamed from: c, reason: collision with root package name */
        public int f3548c;

        /* renamed from: d, reason: collision with root package name */
        public RecyclerView f3549d;

        /* renamed from: e, reason: collision with root package name */
        public int f3550e;

        c() {
        }

        public void a() {
            this.f3546a = false;
            this.f3547b = 0;
            this.f3548c = 0;
            this.f3549d = null;
            this.f3550e = 0;
        }
    }

    e() {
    }

    private void b() {
        c cVar;
        int size = this.f3538m.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView = (RecyclerView) this.f3538m.get(i11);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f3262s0.c(recyclerView, false);
                i10 += recyclerView.f3262s0.f3545d;
            }
        }
        this.f3541p.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f3538m.get(i13);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f3262s0;
                int iAbs = Math.abs(bVar.f3542a) + Math.abs(bVar.f3543b);
                for (int i14 = 0; i14 < bVar.f3545d * 2; i14 += 2) {
                    if (i12 >= this.f3541p.size()) {
                        cVar = new c();
                        this.f3541p.add(cVar);
                    } else {
                        cVar = (c) this.f3541p.get(i12);
                    }
                    int[] iArr = bVar.f3544c;
                    int i15 = iArr[i14 + 1];
                    cVar.f3546a = i15 <= iAbs;
                    cVar.f3547b = iAbs;
                    cVar.f3548c = i15;
                    cVar.f3549d = recyclerView2;
                    cVar.f3550e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f3541p, f3537r);
    }

    private void c(c cVar, long j10) {
        RecyclerView.d0 d0VarI = i(cVar.f3549d, cVar.f3550e, cVar.f3546a ? Long.MAX_VALUE : j10);
        if (d0VarI == null || d0VarI.f3306b == null || !d0VarI.s() || d0VarI.t()) {
            return;
        }
        h((RecyclerView) d0VarI.f3306b.get(), j10);
    }

    private void d(long j10) {
        for (int i10 = 0; i10 < this.f3541p.size(); i10++) {
            c cVar = (c) this.f3541p.get(i10);
            if (cVar.f3549d == null) {
                return;
            }
            c(cVar, j10);
            cVar.a();
        }
    }

    static boolean e(RecyclerView recyclerView, int i10) {
        int iJ = recyclerView.f3257q.j();
        for (int i11 = 0; i11 < iJ; i11++) {
            RecyclerView.d0 d0VarG0 = RecyclerView.g0(recyclerView.f3257q.i(i11));
            if (d0VarG0.f3307c == i10 && !d0VarG0.t()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j10) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.P && recyclerView.f3257q.j() != 0) {
            recyclerView.U0();
        }
        b bVar = recyclerView.f3262s0;
        bVar.c(recyclerView, true);
        if (bVar.f3545d != 0) {
            try {
                androidx.core.os.m.a("RV Nested Prefetch");
                recyclerView.f3264t0.f(recyclerView.f3271x);
                for (int i10 = 0; i10 < bVar.f3545d * 2; i10 += 2) {
                    i(recyclerView, bVar.f3544c[i10], j10);
                }
            } finally {
                androidx.core.os.m.b();
            }
        }
    }

    private RecyclerView.d0 i(RecyclerView recyclerView, int i10, long j10) {
        if (e(recyclerView, i10)) {
            return null;
        }
        RecyclerView.v vVar = recyclerView.f3251n;
        try {
            recyclerView.G0();
            RecyclerView.d0 d0VarI = vVar.I(i10, false, j10);
            if (d0VarI != null) {
                if (!d0VarI.s() || d0VarI.t()) {
                    vVar.a(d0VarI, false);
                } else {
                    vVar.B(d0VarI.f3305a);
                }
            }
            return d0VarI;
        } finally {
            recyclerView.I0(false);
        }
    }

    public void a(RecyclerView recyclerView) {
        this.f3538m.add(recyclerView);
    }

    void f(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow() && this.f3539n == 0) {
            this.f3539n = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f3262s0.e(i10, i11);
    }

    void g(long j10) {
        b();
        d(j10);
    }

    public void j(RecyclerView recyclerView) {
        this.f3538m.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            androidx.core.os.m.a("RV Prefetch");
            if (!this.f3538m.isEmpty()) {
                int size = this.f3538m.size();
                long jMax = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = (RecyclerView) this.f3538m.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f3540o);
                }
            }
        } finally {
            this.f3539n = 0L;
            androidx.core.os.m.b();
        }
    }
}
