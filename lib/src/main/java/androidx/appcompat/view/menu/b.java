package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class b implements m {

    /* renamed from: m, reason: collision with root package name */
    protected Context f768m;

    /* renamed from: n, reason: collision with root package name */
    protected Context f769n;

    /* renamed from: o, reason: collision with root package name */
    protected g f770o;

    /* renamed from: p, reason: collision with root package name */
    protected LayoutInflater f771p;

    /* renamed from: q, reason: collision with root package name */
    protected LayoutInflater f772q;

    /* renamed from: r, reason: collision with root package name */
    private m.a f773r;

    /* renamed from: s, reason: collision with root package name */
    private int f774s;

    /* renamed from: t, reason: collision with root package name */
    private int f775t;

    /* renamed from: u, reason: collision with root package name */
    protected n f776u;

    /* renamed from: v, reason: collision with root package name */
    private int f777v;

    public b(Context context, int i10, int i11) {
        this.f768m = context;
        this.f771p = LayoutInflater.from(context);
        this.f774s = i10;
        this.f775t = i11;
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(g gVar, boolean z10) {
        m.a aVar = this.f773r;
        if (aVar != null) {
            aVar.a(gVar, z10);
        }
    }

    protected void b(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f776u).addView(view, i10);
    }

    @Override // androidx.appcompat.view.menu.m
    public void c(Context context, g gVar) {
        this.f769n = context;
        this.f772q = LayoutInflater.from(context);
        this.f770o = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.g] */
    @Override // androidx.appcompat.view.menu.m
    public boolean d(r rVar) {
        m.a aVar = this.f773r;
        r rVar2 = rVar;
        if (aVar == null) {
            return false;
        }
        if (rVar == null) {
            rVar2 = this.f770o;
        }
        return aVar.b(rVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.m
    public void e(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) this.f776u;
        if (viewGroup == null) {
            return;
        }
        g gVar = this.f770o;
        int i10 = 0;
        if (gVar != null) {
            gVar.r();
            ArrayList arrayListE = this.f770o.E();
            int size = arrayListE.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                i iVar = (i) arrayListE.get(i12);
                if (q(i11, iVar)) {
                    View childAt = viewGroup.getChildAt(i11);
                    i itemData = childAt instanceof n.a ? ((n.a) childAt).getItemData() : null;
                    View viewN = n(iVar, childAt, viewGroup);
                    if (iVar != itemData) {
                        viewN.setPressed(false);
                        viewN.jumpDrawablesToCurrentState();
                    }
                    if (viewN != childAt) {
                        b(viewN, i11);
                    }
                    i11++;
                }
            }
            i10 = i11;
        }
        while (i10 < viewGroup.getChildCount()) {
            if (!l(viewGroup, i10)) {
                i10++;
            }
        }
    }

    public abstract void f(i iVar, n.a aVar);

    @Override // androidx.appcompat.view.menu.m
    public boolean h(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean i(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void j(m.a aVar) {
        this.f773r = aVar;
    }

    public n.a k(ViewGroup viewGroup) {
        return (n.a) this.f771p.inflate(this.f775t, viewGroup, false);
    }

    protected boolean l(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    public m.a m() {
        return this.f773r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View n(i iVar, View view, ViewGroup viewGroup) {
        n.a aVarK = view instanceof n.a ? (n.a) view : k(viewGroup);
        f(iVar, aVarK);
        return (View) aVarK;
    }

    public n o(ViewGroup viewGroup) {
        if (this.f776u == null) {
            n nVar = (n) this.f771p.inflate(this.f774s, viewGroup, false);
            this.f776u = nVar;
            nVar.b(this.f770o);
            e(true);
        }
        return this.f776u;
    }

    public void p(int i10) {
        this.f777v = i10;
    }

    public abstract boolean q(int i10, i iVar);
}
