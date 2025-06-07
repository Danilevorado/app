package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.w;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class c extends m {

    /* renamed from: s, reason: collision with root package name */
    private static TimeInterpolator f3454s;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList f3455h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f3456i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private ArrayList f3457j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private ArrayList f3458k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    ArrayList f3459l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    ArrayList f3460m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    ArrayList f3461n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    ArrayList f3462o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    ArrayList f3463p = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    ArrayList f3464q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    ArrayList f3465r = new ArrayList();

    class a implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ ArrayList f3466m;

        a(ArrayList arrayList) {
            this.f3466m = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f3466m.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                c.this.S(jVar.f3500a, jVar.f3501b, jVar.f3502c, jVar.f3503d, jVar.f3504e);
            }
            this.f3466m.clear();
            c.this.f3460m.remove(this.f3466m);
        }
    }

    class b implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ ArrayList f3468m;

        b(ArrayList arrayList) {
            this.f3468m = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f3468m.iterator();
            while (it.hasNext()) {
                c.this.R((i) it.next());
            }
            this.f3468m.clear();
            c.this.f3461n.remove(this.f3468m);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$c, reason: collision with other inner class name */
    class RunnableC0054c implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ ArrayList f3470m;

        RunnableC0054c(ArrayList arrayList) {
            this.f3470m = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f3470m.iterator();
            while (it.hasNext()) {
                c.this.Q((RecyclerView.d0) it.next());
            }
            this.f3470m.clear();
            c.this.f3459l.remove(this.f3470m);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.d0 f3472a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f3473b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f3474c;

        d(RecyclerView.d0 d0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3472a = d0Var;
            this.f3473b = viewPropertyAnimator;
            this.f3474c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3473b.setListener(null);
            this.f3474c.setAlpha(1.0f);
            c.this.G(this.f3472a);
            c.this.f3464q.remove(this.f3472a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.H(this.f3472a);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.d0 f3476a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f3477b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f3478c;

        e(RecyclerView.d0 d0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3476a = d0Var;
            this.f3477b = view;
            this.f3478c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3477b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3478c.setListener(null);
            c.this.A(this.f3476a);
            c.this.f3462o.remove(this.f3476a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.B(this.f3476a);
        }
    }

    class f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.d0 f3480a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f3481b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f3482c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f3483d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f3484e;

        f(RecyclerView.d0 d0Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3480a = d0Var;
            this.f3481b = i10;
            this.f3482c = view;
            this.f3483d = i11;
            this.f3484e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f3481b != 0) {
                this.f3482c.setTranslationX(0.0f);
            }
            if (this.f3483d != 0) {
                this.f3482c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3484e.setListener(null);
            c.this.E(this.f3480a);
            c.this.f3463p.remove(this.f3480a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.F(this.f3480a);
        }
    }

    class g extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f3486a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f3487b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f3488c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3486a = iVar;
            this.f3487b = viewPropertyAnimator;
            this.f3488c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3487b.setListener(null);
            this.f3488c.setAlpha(1.0f);
            this.f3488c.setTranslationX(0.0f);
            this.f3488c.setTranslationY(0.0f);
            c.this.C(this.f3486a.f3494a, true);
            c.this.f3465r.remove(this.f3486a.f3494a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.D(this.f3486a.f3494a, true);
        }
    }

    class h extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f3490a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f3491b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f3492c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3490a = iVar;
            this.f3491b = viewPropertyAnimator;
            this.f3492c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3491b.setListener(null);
            this.f3492c.setAlpha(1.0f);
            this.f3492c.setTranslationX(0.0f);
            this.f3492c.setTranslationY(0.0f);
            c.this.C(this.f3490a.f3495b, false);
            c.this.f3465r.remove(this.f3490a.f3495b);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.D(this.f3490a.f3495b, false);
        }
    }

    private static class i {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.d0 f3494a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView.d0 f3495b;

        /* renamed from: c, reason: collision with root package name */
        public int f3496c;

        /* renamed from: d, reason: collision with root package name */
        public int f3497d;

        /* renamed from: e, reason: collision with root package name */
        public int f3498e;

        /* renamed from: f, reason: collision with root package name */
        public int f3499f;

        private i(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2) {
            this.f3494a = d0Var;
            this.f3495b = d0Var2;
        }

        i(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i10, int i11, int i12, int i13) {
            this(d0Var, d0Var2);
            this.f3496c = i10;
            this.f3497d = i11;
            this.f3498e = i12;
            this.f3499f = i13;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f3494a + ", newHolder=" + this.f3495b + ", fromX=" + this.f3496c + ", fromY=" + this.f3497d + ", toX=" + this.f3498e + ", toY=" + this.f3499f + '}';
        }
    }

    private static class j {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.d0 f3500a;

        /* renamed from: b, reason: collision with root package name */
        public int f3501b;

        /* renamed from: c, reason: collision with root package name */
        public int f3502c;

        /* renamed from: d, reason: collision with root package name */
        public int f3503d;

        /* renamed from: e, reason: collision with root package name */
        public int f3504e;

        j(RecyclerView.d0 d0Var, int i10, int i11, int i12, int i13) {
            this.f3500a = d0Var;
            this.f3501b = i10;
            this.f3502c = i11;
            this.f3503d = i12;
            this.f3504e = i13;
        }
    }

    private void T(RecyclerView.d0 d0Var) {
        View view = d0Var.f3305a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f3464q.add(d0Var);
        viewPropertyAnimatorAnimate.setDuration(o()).alpha(0.0f).setListener(new d(d0Var, viewPropertyAnimatorAnimate, view)).start();
    }

    private void W(List list, RecyclerView.d0 d0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = (i) list.get(size);
            if (Y(iVar, d0Var) && iVar.f3494a == null && iVar.f3495b == null) {
                list.remove(iVar);
            }
        }
    }

    private void X(i iVar) {
        RecyclerView.d0 d0Var = iVar.f3494a;
        if (d0Var != null) {
            Y(iVar, d0Var);
        }
        RecyclerView.d0 d0Var2 = iVar.f3495b;
        if (d0Var2 != null) {
            Y(iVar, d0Var2);
        }
    }

    private boolean Y(i iVar, RecyclerView.d0 d0Var) {
        boolean z10 = false;
        if (iVar.f3495b == d0Var) {
            iVar.f3495b = null;
        } else {
            if (iVar.f3494a != d0Var) {
                return false;
            }
            iVar.f3494a = null;
            z10 = true;
        }
        d0Var.f3305a.setAlpha(1.0f);
        d0Var.f3305a.setTranslationX(0.0f);
        d0Var.f3305a.setTranslationY(0.0f);
        C(d0Var, z10);
        return true;
    }

    private void Z(RecyclerView.d0 d0Var) {
        if (f3454s == null) {
            f3454s = new ValueAnimator().getInterpolator();
        }
        d0Var.f3305a.animate().setInterpolator(f3454s);
        j(d0Var);
    }

    void Q(RecyclerView.d0 d0Var) {
        View view = d0Var.f3305a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f3462o.add(d0Var);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(l()).setListener(new e(d0Var, view, viewPropertyAnimatorAnimate)).start();
    }

    void R(i iVar) {
        RecyclerView.d0 d0Var = iVar.f3494a;
        View view = d0Var == null ? null : d0Var.f3305a;
        RecyclerView.d0 d0Var2 = iVar.f3495b;
        View view2 = d0Var2 != null ? d0Var2.f3305a : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.f3465r.add(iVar.f3494a);
            duration.translationX(iVar.f3498e - iVar.f3496c);
            duration.translationY(iVar.f3499f - iVar.f3497d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f3465r.add(iVar.f3495b);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    void S(RecyclerView.d0 d0Var, int i10, int i11, int i12, int i13) {
        View view = d0Var.f3305a;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f3463p.add(d0Var);
        viewPropertyAnimatorAnimate.setDuration(n()).setListener(new f(d0Var, i14, view, i15, viewPropertyAnimatorAnimate)).start();
    }

    void U(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((RecyclerView.d0) list.get(size)).f3305a.animate().cancel();
        }
    }

    void V() {
        if (p()) {
            return;
        }
        i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean g(RecyclerView.d0 d0Var, List list) {
        return !list.isEmpty() || super.g(d0Var, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void j(RecyclerView.d0 d0Var) {
        View view = d0Var.f3305a;
        view.animate().cancel();
        int size = this.f3457j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((j) this.f3457j.get(size)).f3500a == d0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                E(d0Var);
                this.f3457j.remove(size);
            }
        }
        W(this.f3458k, d0Var);
        if (this.f3455h.remove(d0Var)) {
            view.setAlpha(1.0f);
            G(d0Var);
        }
        if (this.f3456i.remove(d0Var)) {
            view.setAlpha(1.0f);
            A(d0Var);
        }
        for (int size2 = this.f3461n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f3461n.get(size2);
            W(arrayList, d0Var);
            if (arrayList.isEmpty()) {
                this.f3461n.remove(size2);
            }
        }
        for (int size3 = this.f3460m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f3460m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((j) arrayList2.get(size4)).f3500a == d0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    E(d0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f3460m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f3459l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f3459l.get(size5);
            if (arrayList3.remove(d0Var)) {
                view.setAlpha(1.0f);
                A(d0Var);
                if (arrayList3.isEmpty()) {
                    this.f3459l.remove(size5);
                }
            }
        }
        this.f3464q.remove(d0Var);
        this.f3462o.remove(d0Var);
        this.f3465r.remove(d0Var);
        this.f3463p.remove(d0Var);
        V();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void k() {
        int size = this.f3457j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = (j) this.f3457j.get(size);
            View view = jVar.f3500a.f3305a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            E(jVar.f3500a);
            this.f3457j.remove(size);
        }
        for (int size2 = this.f3455h.size() - 1; size2 >= 0; size2--) {
            G((RecyclerView.d0) this.f3455h.get(size2));
            this.f3455h.remove(size2);
        }
        int size3 = this.f3456i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.d0 d0Var = (RecyclerView.d0) this.f3456i.get(size3);
            d0Var.f3305a.setAlpha(1.0f);
            A(d0Var);
            this.f3456i.remove(size3);
        }
        for (int size4 = this.f3458k.size() - 1; size4 >= 0; size4--) {
            X((i) this.f3458k.get(size4));
        }
        this.f3458k.clear();
        if (p()) {
            for (int size5 = this.f3460m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f3460m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList.get(size6);
                    View view2 = jVar2.f3500a.f3305a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    E(jVar2.f3500a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f3460m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f3459l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f3459l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.d0 d0Var2 = (RecyclerView.d0) arrayList2.get(size8);
                    d0Var2.f3305a.setAlpha(1.0f);
                    A(d0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f3459l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f3461n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f3461n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    X((i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f3461n.remove(arrayList3);
                    }
                }
            }
            U(this.f3464q);
            U(this.f3463p);
            U(this.f3462o);
            U(this.f3465r);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean p() {
        return (this.f3456i.isEmpty() && this.f3458k.isEmpty() && this.f3457j.isEmpty() && this.f3455h.isEmpty() && this.f3463p.isEmpty() && this.f3464q.isEmpty() && this.f3462o.isEmpty() && this.f3465r.isEmpty() && this.f3460m.isEmpty() && this.f3459l.isEmpty() && this.f3461n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void u() {
        boolean z10 = !this.f3455h.isEmpty();
        boolean z11 = !this.f3457j.isEmpty();
        boolean z12 = !this.f3458k.isEmpty();
        boolean z13 = !this.f3456i.isEmpty();
        if (z10 || z11 || z13 || z12) {
            Iterator it = this.f3455h.iterator();
            while (it.hasNext()) {
                T((RecyclerView.d0) it.next());
            }
            this.f3455h.clear();
            if (z11) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f3457j);
                this.f3460m.add(arrayList);
                this.f3457j.clear();
                a aVar = new a(arrayList);
                if (z10) {
                    w.h0(((j) arrayList.get(0)).f3500a.f3305a, aVar, o());
                } else {
                    aVar.run();
                }
            }
            if (z12) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f3458k);
                this.f3461n.add(arrayList2);
                this.f3458k.clear();
                b bVar = new b(arrayList2);
                if (z10) {
                    w.h0(((i) arrayList2.get(0)).f3494a.f3305a, bVar, o());
                } else {
                    bVar.run();
                }
            }
            if (z13) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f3456i);
                this.f3459l.add(arrayList3);
                this.f3456i.clear();
                RunnableC0054c runnableC0054c = new RunnableC0054c(arrayList3);
                if (z10 || z11 || z12) {
                    w.h0(((RecyclerView.d0) arrayList3.get(0)).f3305a, runnableC0054c, (z10 ? o() : 0L) + Math.max(z11 ? n() : 0L, z12 ? m() : 0L));
                } else {
                    runnableC0054c.run();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.m
    public boolean w(RecyclerView.d0 d0Var) {
        Z(d0Var);
        d0Var.f3305a.setAlpha(0.0f);
        this.f3456i.add(d0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    public boolean x(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i10, int i11, int i12, int i13) {
        if (d0Var == d0Var2) {
            return y(d0Var, i10, i11, i12, i13);
        }
        float translationX = d0Var.f3305a.getTranslationX();
        float translationY = d0Var.f3305a.getTranslationY();
        float alpha = d0Var.f3305a.getAlpha();
        Z(d0Var);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        d0Var.f3305a.setTranslationX(translationX);
        d0Var.f3305a.setTranslationY(translationY);
        d0Var.f3305a.setAlpha(alpha);
        if (d0Var2 != null) {
            Z(d0Var2);
            d0Var2.f3305a.setTranslationX(-i14);
            d0Var2.f3305a.setTranslationY(-i15);
            d0Var2.f3305a.setAlpha(0.0f);
        }
        this.f3458k.add(new i(d0Var, d0Var2, i10, i11, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    public boolean y(RecyclerView.d0 d0Var, int i10, int i11, int i12, int i13) {
        View view = d0Var.f3305a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) d0Var.f3305a.getTranslationY());
        Z(d0Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            E(d0Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f3457j.add(new j(d0Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    public boolean z(RecyclerView.d0 d0Var) {
        Z(d0Var);
        this.f3455h.add(d0Var);
        return true;
    }
}
