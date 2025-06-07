package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class e implements m, AdapterView.OnItemClickListener {

    /* renamed from: m, reason: collision with root package name */
    Context f804m;

    /* renamed from: n, reason: collision with root package name */
    LayoutInflater f805n;

    /* renamed from: o, reason: collision with root package name */
    g f806o;

    /* renamed from: p, reason: collision with root package name */
    ExpandedMenuView f807p;

    /* renamed from: q, reason: collision with root package name */
    int f808q;

    /* renamed from: r, reason: collision with root package name */
    int f809r;

    /* renamed from: s, reason: collision with root package name */
    int f810s;

    /* renamed from: t, reason: collision with root package name */
    private m.a f811t;

    /* renamed from: u, reason: collision with root package name */
    a f812u;

    private class a extends BaseAdapter {

        /* renamed from: m, reason: collision with root package name */
        private int f813m = -1;

        public a() {
            a();
        }

        void a() {
            i iVarV = e.this.f806o.v();
            if (iVarV != null) {
                ArrayList arrayListZ = e.this.f806o.z();
                int size = arrayListZ.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (((i) arrayListZ.get(i10)) == iVarV) {
                        this.f813m = i10;
                        return;
                    }
                }
            }
            this.f813m = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i getItem(int i10) {
            ArrayList arrayListZ = e.this.f806o.z();
            int i11 = i10 + e.this.f808q;
            int i12 = this.f813m;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return (i) arrayListZ.get(i11);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = e.this.f806o.z().size() - e.this.f808q;
            return this.f813m < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                e eVar = e.this;
                view = eVar.f805n.inflate(eVar.f810s, viewGroup, false);
            }
            ((n.a) view).f(getItem(i10), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(int i10, int i11) {
        this.f810s = i10;
        this.f809r = i11;
    }

    public e(Context context, int i10) {
        this(i10, 0);
        this.f804m = context;
        this.f805n = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(g gVar, boolean z10) {
        m.a aVar = this.f811t;
        if (aVar != null) {
            aVar.a(gVar, z10);
        }
    }

    public ListAdapter b() {
        if (this.f812u == null) {
            this.f812u = new a();
        }
        return this.f812u;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.view.menu.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(android.content.Context r3, androidx.appcompat.view.menu.g r4) {
        /*
            r2 = this;
            int r0 = r2.f809r
            if (r0 == 0) goto L14
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.f809r
            r0.<init>(r3, r1)
            r2.f804m = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
        L11:
            r2.f805n = r3
            goto L23
        L14:
            android.content.Context r0 = r2.f804m
            if (r0 == 0) goto L23
            r2.f804m = r3
            android.view.LayoutInflater r0 = r2.f805n
            if (r0 != 0) goto L23
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            goto L11
        L23:
            r2.f806o = r4
            androidx.appcompat.view.menu.e$a r3 = r2.f812u
            if (r3 == 0) goto L2c
            r3.notifyDataSetChanged()
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.c(android.content.Context, androidx.appcompat.view.menu.g):void");
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean d(r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        new h(rVar).d(null);
        m.a aVar = this.f811t;
        if (aVar == null) {
            return true;
        }
        aVar.b(rVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.m
    public void e(boolean z10) {
        a aVar = this.f812u;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public n f(ViewGroup viewGroup) {
        if (this.f807p == null) {
            this.f807p = (ExpandedMenuView) this.f805n.inflate(f.g.f23394g, viewGroup, false);
            if (this.f812u == null) {
                this.f812u = new a();
            }
            this.f807p.setAdapter((ListAdapter) this.f812u);
            this.f807p.setOnItemClickListener(this);
        }
        return this.f807p;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean g() {
        return false;
    }

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
        this.f811t = aVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        this.f806o.M(this.f812u.getItem(i10), this, 0);
    }
}
