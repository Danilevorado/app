package z0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class l implements Cloneable {
    private static final int[] S = {2, 1, 3, 4};
    private static final g T = new a();
    private static ThreadLocal U = new ThreadLocal();
    private ArrayList F;
    private ArrayList G;
    private e P;
    private q.a Q;

    /* renamed from: m, reason: collision with root package name */
    private String f28703m = getClass().getName();

    /* renamed from: n, reason: collision with root package name */
    private long f28704n = -1;

    /* renamed from: o, reason: collision with root package name */
    long f28705o = -1;

    /* renamed from: p, reason: collision with root package name */
    private TimeInterpolator f28706p = null;

    /* renamed from: q, reason: collision with root package name */
    ArrayList f28707q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    ArrayList f28708r = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    private ArrayList f28709s = null;

    /* renamed from: t, reason: collision with root package name */
    private ArrayList f28710t = null;

    /* renamed from: u, reason: collision with root package name */
    private ArrayList f28711u = null;

    /* renamed from: v, reason: collision with root package name */
    private ArrayList f28712v = null;

    /* renamed from: w, reason: collision with root package name */
    private ArrayList f28713w = null;

    /* renamed from: x, reason: collision with root package name */
    private ArrayList f28714x = null;

    /* renamed from: y, reason: collision with root package name */
    private ArrayList f28715y = null;

    /* renamed from: z, reason: collision with root package name */
    private ArrayList f28716z = null;
    private ArrayList A = null;
    private s B = new s();
    private s C = new s();
    p D = null;
    private int[] E = S;
    private ViewGroup H = null;
    boolean I = false;
    ArrayList J = new ArrayList();
    private int K = 0;
    private boolean L = false;
    private boolean M = false;
    private ArrayList N = null;
    private ArrayList O = new ArrayList();
    private g R = T;

    static class a extends g {
        a() {
        }

        @Override // z0.g
        public Path a(float f5, float f10, float f11, float f12) {
            Path path = new Path();
            path.moveTo(f5, f10);
            path.lineTo(f11, f12);
            return path;
        }
    }

    class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q.a f28717a;

        b(q.a aVar) {
            this.f28717a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f28717a.remove(animator);
            l.this.J.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            l.this.J.add(animator);
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            l.this.w();
            animator.removeListener(this);
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        View f28720a;

        /* renamed from: b, reason: collision with root package name */
        String f28721b;

        /* renamed from: c, reason: collision with root package name */
        r f28722c;

        /* renamed from: d, reason: collision with root package name */
        h0 f28723d;

        /* renamed from: e, reason: collision with root package name */
        l f28724e;

        d(View view, String str, l lVar, h0 h0Var, r rVar) {
            this.f28720a = view;
            this.f28721b = str;
            this.f28722c = rVar;
            this.f28723d = h0Var;
            this.f28724e = lVar;
        }
    }

    public static abstract class e {
    }

    public interface f {
        void a(l lVar);

        void b(l lVar);

        void c(l lVar);

        void d(l lVar);

        void e(l lVar);
    }

    private static q.a E() {
        q.a aVar = (q.a) U.get();
        if (aVar != null) {
            return aVar;
        }
        q.a aVar2 = new q.a();
        U.set(aVar2);
        return aVar2;
    }

    private static boolean O(r rVar, r rVar2, String str) {
        Object obj = rVar.f28738a.get(str);
        Object obj2 = rVar2.f28738a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    private void P(q.a aVar, q.a aVar2, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) sparseArray.valueAt(i10);
            if (view2 != null && N(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i10))) != null && N(view)) {
                r rVar = (r) aVar.get(view2);
                r rVar2 = (r) aVar2.get(view);
                if (rVar != null && rVar2 != null) {
                    this.F.add(rVar);
                    this.G.add(rVar2);
                    aVar.remove(view2);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void Q(q.a aVar, q.a aVar2) {
        r rVar;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View view = (View) aVar.i(size);
            if (view != null && N(view) && (rVar = (r) aVar2.remove(view)) != null && N(rVar.f28739b)) {
                this.F.add((r) aVar.k(size));
                this.G.add(rVar);
            }
        }
    }

    private void R(q.a aVar, q.a aVar2, q.d dVar, q.d dVar2) {
        View view;
        int iS = dVar.s();
        for (int i10 = 0; i10 < iS; i10++) {
            View view2 = (View) dVar.t(i10);
            if (view2 != null && N(view2) && (view = (View) dVar2.f(dVar.j(i10))) != null && N(view)) {
                r rVar = (r) aVar.get(view2);
                r rVar2 = (r) aVar2.get(view);
                if (rVar != null && rVar2 != null) {
                    this.F.add(rVar);
                    this.G.add(rVar2);
                    aVar.remove(view2);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void S(q.a aVar, q.a aVar2, q.a aVar3, q.a aVar4) {
        View view;
        int size = aVar3.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) aVar3.m(i10);
            if (view2 != null && N(view2) && (view = (View) aVar4.get(aVar3.i(i10))) != null && N(view)) {
                r rVar = (r) aVar.get(view2);
                r rVar2 = (r) aVar2.get(view);
                if (rVar != null && rVar2 != null) {
                    this.F.add(rVar);
                    this.G.add(rVar2);
                    aVar.remove(view2);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void T(s sVar, s sVar2) {
        q.a aVar = new q.a(sVar.f28741a);
        q.a aVar2 = new q.a(sVar2.f28741a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.E;
            if (i10 >= iArr.length) {
                c(aVar, aVar2);
                return;
            }
            int i11 = iArr[i10];
            if (i11 == 1) {
                Q(aVar, aVar2);
            } else if (i11 == 2) {
                S(aVar, aVar2, sVar.f28744d, sVar2.f28744d);
            } else if (i11 == 3) {
                P(aVar, aVar2, sVar.f28742b, sVar2.f28742b);
            } else if (i11 == 4) {
                R(aVar, aVar2, sVar.f28743c, sVar2.f28743c);
            }
            i10++;
        }
    }

    private void Z(Animator animator, q.a aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            f(animator);
        }
    }

    private void c(q.a aVar, q.a aVar2) {
        for (int i10 = 0; i10 < aVar.size(); i10++) {
            r rVar = (r) aVar.m(i10);
            if (N(rVar.f28739b)) {
                this.F.add(rVar);
                this.G.add(null);
            }
        }
        for (int i11 = 0; i11 < aVar2.size(); i11++) {
            r rVar2 = (r) aVar2.m(i11);
            if (N(rVar2.f28739b)) {
                this.G.add(rVar2);
                this.F.add(null);
            }
        }
    }

    private static void d(s sVar, View view, r rVar) {
        sVar.f28741a.put(view, rVar);
        int id = view.getId();
        if (id >= 0) {
            if (sVar.f28742b.indexOfKey(id) >= 0) {
                sVar.f28742b.put(id, null);
            } else {
                sVar.f28742b.put(id, view);
            }
        }
        String strJ = androidx.core.view.w.J(view);
        if (strJ != null) {
            if (sVar.f28744d.containsKey(strJ)) {
                sVar.f28744d.put(strJ, null);
            } else {
                sVar.f28744d.put(strJ, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (sVar.f28743c.i(itemIdAtPosition) < 0) {
                    androidx.core.view.w.x0(view, true);
                    sVar.f28743c.k(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) sVar.f28743c.f(itemIdAtPosition);
                if (view2 != null) {
                    androidx.core.view.w.x0(view2, false);
                    sVar.f28743c.k(itemIdAtPosition, null);
                }
            }
        }
    }

    private void j(View view, boolean z10) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList arrayList = this.f28711u;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList arrayList2 = this.f28712v;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList arrayList3 = this.f28713w;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (((Class) this.f28713w.get(i10)).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    r rVar = new r(view);
                    if (z10) {
                        m(rVar);
                    } else {
                        i(rVar);
                    }
                    rVar.f28740c.add(this);
                    k(rVar);
                    d(z10 ? this.B : this.C, view, rVar);
                }
                if (view instanceof ViewGroup) {
                    ArrayList arrayList4 = this.f28715y;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList arrayList5 = this.f28716z;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList arrayList6 = this.A;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    if (((Class) this.A.get(i11)).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                                j(viewGroup.getChildAt(i12), z10);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002e, code lost:
    
        if (r3 < 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0030, code lost:
    
        if (r8 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0032, code lost:
    
        r7 = r6.G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
    
        r7 = r6.F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003e, code lost:
    
        return (z0.r) r7.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    z0.r A(android.view.View r7, boolean r8) {
        /*
            r6 = this;
            z0.p r0 = r6.D
            if (r0 == 0) goto L9
            z0.r r7 = r0.A(r7, r8)
            return r7
        L9:
            if (r8 == 0) goto Le
            java.util.ArrayList r0 = r6.F
            goto L10
        Le:
            java.util.ArrayList r0 = r6.G
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = -1
            r4 = 0
        L1a:
            if (r4 >= r2) goto L2e
            java.lang.Object r5 = r0.get(r4)
            z0.r r5 = (z0.r) r5
            if (r5 != 0) goto L25
            return r1
        L25:
            android.view.View r5 = r5.f28739b
            if (r5 != r7) goto L2b
            r3 = r4
            goto L2e
        L2b:
            int r4 = r4 + 1
            goto L1a
        L2e:
            if (r3 < 0) goto L3e
            if (r8 == 0) goto L35
            java.util.ArrayList r7 = r6.G
            goto L37
        L35:
            java.util.ArrayList r7 = r6.F
        L37:
            java.lang.Object r7 = r7.get(r3)
            r1 = r7
            z0.r r1 = (z0.r) r1
        L3e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.l.A(android.view.View, boolean):z0.r");
    }

    public String B() {
        return this.f28703m;
    }

    public g C() {
        return this.R;
    }

    public o D() {
        return null;
    }

    public long F() {
        return this.f28704n;
    }

    public List G() {
        return this.f28707q;
    }

    public List H() {
        return this.f28709s;
    }

    public List I() {
        return this.f28710t;
    }

    public List J() {
        return this.f28708r;
    }

    public String[] K() {
        return null;
    }

    public r L(View view, boolean z10) {
        p pVar = this.D;
        if (pVar != null) {
            return pVar.L(view, z10);
        }
        return (r) (z10 ? this.B : this.C).f28741a.get(view);
    }

    public boolean M(r rVar, r rVar2) {
        if (rVar == null || rVar2 == null) {
            return false;
        }
        String[] strArrK = K();
        if (strArrK == null) {
            Iterator it = rVar.f28738a.keySet().iterator();
            while (it.hasNext()) {
                if (O(rVar, rVar2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrK) {
            if (!O(rVar, rVar2, str)) {
            }
        }
        return false;
        return true;
    }

    boolean N(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id = view.getId();
        ArrayList arrayList3 = this.f28711u;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList arrayList4 = this.f28712v;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.f28713w;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((Class) this.f28713w.get(i10)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f28714x != null && androidx.core.view.w.J(view) != null && this.f28714x.contains(androidx.core.view.w.J(view))) {
            return false;
        }
        if ((this.f28707q.size() == 0 && this.f28708r.size() == 0 && (((arrayList = this.f28710t) == null || arrayList.isEmpty()) && ((arrayList2 = this.f28709s) == null || arrayList2.isEmpty()))) || this.f28707q.contains(Integer.valueOf(id)) || this.f28708r.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.f28709s;
        if (arrayList6 != null && arrayList6.contains(androidx.core.view.w.J(view))) {
            return true;
        }
        if (this.f28710t != null) {
            for (int i11 = 0; i11 < this.f28710t.size(); i11++) {
                if (((Class) this.f28710t.get(i11)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void U(View view) {
        if (this.M) {
            return;
        }
        q.a aVarE = E();
        int size = aVarE.size();
        h0 h0VarD = y.d(view);
        for (int i10 = size - 1; i10 >= 0; i10--) {
            d dVar = (d) aVarE.m(i10);
            if (dVar.f28720a != null && h0VarD.equals(dVar.f28723d)) {
                z0.a.b((Animator) aVarE.i(i10));
            }
        }
        ArrayList arrayList = this.N;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.N.clone();
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((f) arrayList2.get(i11)).e(this);
            }
        }
        this.L = true;
    }

    void V(ViewGroup viewGroup) {
        d dVar;
        this.F = new ArrayList();
        this.G = new ArrayList();
        T(this.B, this.C);
        q.a aVarE = E();
        int size = aVarE.size();
        h0 h0VarD = y.d(viewGroup);
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = (Animator) aVarE.i(i10);
            if (animator != null && (dVar = (d) aVarE.get(animator)) != null && dVar.f28720a != null && h0VarD.equals(dVar.f28723d)) {
                r rVar = dVar.f28722c;
                View view = dVar.f28720a;
                r rVarL = L(view, true);
                r rVarA = A(view, true);
                if (rVarL == null && rVarA == null) {
                    rVarA = (r) this.C.f28741a.get(view);
                }
                if (!(rVarL == null && rVarA == null) && dVar.f28724e.M(rVar, rVarA)) {
                    if (animator.isRunning() || animator.isStarted()) {
                        animator.cancel();
                    } else {
                        aVarE.remove(animator);
                    }
                }
            }
        }
        v(viewGroup, this.B, this.C, this.F, this.G);
        a0();
    }

    public l W(f fVar) {
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.N.size() == 0) {
            this.N = null;
        }
        return this;
    }

    public l X(View view) {
        this.f28708r.remove(view);
        return this;
    }

    public void Y(View view) {
        if (this.L) {
            if (!this.M) {
                q.a aVarE = E();
                int size = aVarE.size();
                h0 h0VarD = y.d(view);
                for (int i10 = size - 1; i10 >= 0; i10--) {
                    d dVar = (d) aVarE.m(i10);
                    if (dVar.f28720a != null && h0VarD.equals(dVar.f28723d)) {
                        z0.a.c((Animator) aVarE.i(i10));
                    }
                }
                ArrayList arrayList = this.N;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.N.clone();
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        ((f) arrayList2.get(i11)).d(this);
                    }
                }
            }
            this.L = false;
        }
    }

    public l a(f fVar) {
        if (this.N == null) {
            this.N = new ArrayList();
        }
        this.N.add(fVar);
        return this;
    }

    protected void a0() {
        h0();
        q.a aVarE = E();
        Iterator it = this.O.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (aVarE.containsKey(animator)) {
                h0();
                Z(animator, aVarE);
            }
        }
        this.O.clear();
        w();
    }

    public l b(View view) {
        this.f28708r.add(view);
        return this;
    }

    public l b0(long j10) {
        this.f28705o = j10;
        return this;
    }

    public void c0(e eVar) {
        this.P = eVar;
    }

    public l d0(TimeInterpolator timeInterpolator) {
        this.f28706p = timeInterpolator;
        return this;
    }

    public void e0(g gVar) {
        if (gVar == null) {
            gVar = T;
        }
        this.R = gVar;
    }

    protected void f(Animator animator) {
        if (animator == null) {
            w();
            return;
        }
        if (x() >= 0) {
            animator.setDuration(x());
        }
        if (F() >= 0) {
            animator.setStartDelay(F() + animator.getStartDelay());
        }
        if (z() != null) {
            animator.setInterpolator(z());
        }
        animator.addListener(new c());
        animator.start();
    }

    public void f0(o oVar) {
    }

    protected void g() {
        for (int size = this.J.size() - 1; size >= 0; size--) {
            ((Animator) this.J.get(size)).cancel();
        }
        ArrayList arrayList = this.N;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.N.clone();
        int size2 = arrayList2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((f) arrayList2.get(i10)).a(this);
        }
    }

    public l g0(long j10) {
        this.f28704n = j10;
        return this;
    }

    protected void h0() {
        if (this.K == 0) {
            ArrayList arrayList = this.N;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.N.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((f) arrayList2.get(i10)).b(this);
                }
            }
            this.M = false;
        }
        this.K++;
    }

    public abstract void i(r rVar);

    String i0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f28705o != -1) {
            str2 = str2 + "dur(" + this.f28705o + ") ";
        }
        if (this.f28704n != -1) {
            str2 = str2 + "dly(" + this.f28704n + ") ";
        }
        if (this.f28706p != null) {
            str2 = str2 + "interp(" + this.f28706p + ") ";
        }
        if (this.f28707q.size() <= 0 && this.f28708r.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f28707q.size() > 0) {
            for (int i10 = 0; i10 < this.f28707q.size(); i10++) {
                if (i10 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f28707q.get(i10);
            }
        }
        if (this.f28708r.size() > 0) {
            for (int i11 = 0; i11 < this.f28708r.size(); i11++) {
                if (i11 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f28708r.get(i11);
            }
        }
        return str3 + ")";
    }

    void k(r rVar) {
    }

    public abstract void m(r rVar);

    void r(ViewGroup viewGroup, boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        q.a aVar;
        s(z10);
        if ((this.f28707q.size() > 0 || this.f28708r.size() > 0) && (((arrayList = this.f28709s) == null || arrayList.isEmpty()) && ((arrayList2 = this.f28710t) == null || arrayList2.isEmpty()))) {
            for (int i10 = 0; i10 < this.f28707q.size(); i10++) {
                View viewFindViewById = viewGroup.findViewById(((Integer) this.f28707q.get(i10)).intValue());
                if (viewFindViewById != null) {
                    r rVar = new r(viewFindViewById);
                    if (z10) {
                        m(rVar);
                    } else {
                        i(rVar);
                    }
                    rVar.f28740c.add(this);
                    k(rVar);
                    d(z10 ? this.B : this.C, viewFindViewById, rVar);
                }
            }
            for (int i11 = 0; i11 < this.f28708r.size(); i11++) {
                View view = (View) this.f28708r.get(i11);
                r rVar2 = new r(view);
                if (z10) {
                    m(rVar2);
                } else {
                    i(rVar2);
                }
                rVar2.f28740c.add(this);
                k(rVar2);
                d(z10 ? this.B : this.C, view, rVar2);
            }
        } else {
            j(viewGroup, z10);
        }
        if (z10 || (aVar = this.Q) == null) {
            return;
        }
        int size = aVar.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList3.add(this.B.f28744d.remove((String) this.Q.i(i12)));
        }
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = (View) arrayList3.get(i13);
            if (view2 != null) {
                this.B.f28744d.put((String) this.Q.m(i13), view2);
            }
        }
    }

    void s(boolean z10) {
        s sVar;
        if (z10) {
            this.B.f28741a.clear();
            this.B.f28742b.clear();
            sVar = this.B;
        } else {
            this.C.f28741a.clear();
            this.C.f28742b.clear();
            sVar = this.C;
        }
        sVar.f28743c.b();
    }

    @Override // 
    /* renamed from: t */
    public l clone() {
        try {
            l lVar = (l) super.clone();
            lVar.O = new ArrayList();
            lVar.B = new s();
            lVar.C = new s();
            lVar.F = null;
            lVar.G = null;
            return lVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public String toString() {
        return i0("");
    }

    public Animator u(ViewGroup viewGroup, r rVar, r rVar2) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void v(android.view.ViewGroup r20, z0.s r21, z0.s r22, java.util.ArrayList r23, java.util.ArrayList r24) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.l.v(android.view.ViewGroup, z0.s, z0.s, java.util.ArrayList, java.util.ArrayList):void");
    }

    protected void w() {
        int i10 = this.K - 1;
        this.K = i10;
        if (i10 == 0) {
            ArrayList arrayList = this.N;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.N.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((f) arrayList2.get(i11)).c(this);
                }
            }
            for (int i12 = 0; i12 < this.B.f28743c.s(); i12++) {
                View view = (View) this.B.f28743c.t(i12);
                if (view != null) {
                    androidx.core.view.w.x0(view, false);
                }
            }
            for (int i13 = 0; i13 < this.C.f28743c.s(); i13++) {
                View view2 = (View) this.C.f28743c.t(i13);
                if (view2 != null) {
                    androidx.core.view.w.x0(view2, false);
                }
            }
            this.M = true;
        }
    }

    public long x() {
        return this.f28705o;
    }

    public e y() {
        return this.P;
    }

    public TimeInterpolator z() {
        return this.f28706p;
    }
}
