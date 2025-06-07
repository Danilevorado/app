package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
class m extends BaseAdapter {

    /* renamed from: r, reason: collision with root package name */
    static final int f20972r = s.k().getMaximum(4);

    /* renamed from: m, reason: collision with root package name */
    final l f20973m;

    /* renamed from: n, reason: collision with root package name */
    final d f20974n;

    /* renamed from: o, reason: collision with root package name */
    private Collection f20975o;

    /* renamed from: p, reason: collision with root package name */
    c f20976p;

    /* renamed from: q, reason: collision with root package name */
    final a f20977q;

    m(l lVar, d dVar, a aVar) {
        this.f20973m = lVar;
        this.f20974n = dVar;
        this.f20977q = aVar;
        this.f20975o = dVar.q();
    }

    private void e(Context context) {
        if (this.f20976p == null) {
            this.f20976p = new c(context);
        }
    }

    private boolean h(long j10) {
        Iterator it = this.f20974n.q().iterator();
        while (it.hasNext()) {
            if (s.a(j10) == s.a(((Long) it.next()).longValue())) {
                return true;
            }
        }
        return false;
    }

    private void k(TextView textView, long j10) {
        b bVar;
        if (textView == null) {
            return;
        }
        if (this.f20977q.f().n(j10)) {
            textView.setEnabled(true);
            bVar = h(j10) ? this.f20976p.f20908b : s.i().getTimeInMillis() == j10 ? this.f20976p.f20909c : this.f20976p.f20907a;
        } else {
            textView.setEnabled(false);
            bVar = this.f20976p.f20913g;
        }
        bVar.d(textView);
    }

    private void l(MaterialCalendarGridView materialCalendarGridView, long j10) {
        if (l.g(j10).equals(this.f20973m)) {
            k((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(this.f20973m.w(j10)) - materialCalendarGridView.getFirstVisiblePosition()), j10);
        }
    }

    int a(int i10) {
        return b() + (i10 - 1);
    }

    int b() {
        return this.f20973m.r();
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i10) {
        if (i10 < this.f20973m.r() || i10 > i()) {
            return null;
        }
        return Long.valueOf(this.f20973m.v(j(i10)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    @Override // android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.e(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = c5.h.f4776k
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L72
            com.google.android.material.datepicker.l r8 = r5.f20973m
            int r2 = r8.f20969q
            if (r7 < r2) goto L2d
            goto L72
        L2d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            com.google.android.material.datepicker.l r8 = r5.f20973m
            long r7 = r8.v(r7)
            com.google.android.material.datepicker.l r3 = r5.f20973m
            int r3 = r3.f20967o
            com.google.android.material.datepicker.l r4 = com.google.android.material.datepicker.l.m()
            int r4 = r4.f20967o
            if (r3 != r4) goto L64
            java.lang.String r7 = com.google.android.material.datepicker.e.a(r7)
            goto L68
        L64:
            java.lang.String r7 = com.google.android.material.datepicker.e.d(r7)
        L68:
            r0.setContentDescription(r7)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L7a
        L72:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L7a:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L81
            return r0
        L81:
            long r6 = r6.longValue()
            r5.k(r0, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.m.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    boolean f(int i10) {
        return i10 % this.f20973m.f20968p == 0;
    }

    boolean g(int i10) {
        return (i10 + 1) % this.f20973m.f20968p == 0;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f20973m.f20969q + b();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10 / this.f20973m.f20968p;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    int i() {
        return (this.f20973m.r() + this.f20973m.f20969q) - 1;
    }

    int j(int i10) {
        return (i10 - this.f20973m.r()) + 1;
    }

    public void m(MaterialCalendarGridView materialCalendarGridView) {
        Iterator it = this.f20975o.iterator();
        while (it.hasNext()) {
            l(materialCalendarGridView, ((Long) it.next()).longValue());
        }
        d dVar = this.f20974n;
        if (dVar != null) {
            Iterator it2 = dVar.q().iterator();
            while (it2.hasNext()) {
                l(materialCalendarGridView, ((Long) it2.next()).longValue());
            }
            this.f20975o = this.f20974n.q();
        }
    }

    boolean n(int i10) {
        return i10 >= b() && i10 <= i();
    }
}
