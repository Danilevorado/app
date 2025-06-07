package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.w;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.h;

/* loaded from: classes.dex */
class n extends RecyclerView.g {

    /* renamed from: o, reason: collision with root package name */
    private final com.google.android.material.datepicker.a f20978o;

    /* renamed from: p, reason: collision with root package name */
    private final d f20979p;

    /* renamed from: q, reason: collision with root package name */
    private final h.l f20980q;

    /* renamed from: r, reason: collision with root package name */
    private final int f20981r;

    class a implements AdapterView.OnItemClickListener {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ MaterialCalendarGridView f20982m;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f20982m = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            if (this.f20982m.getAdapter().n(i10)) {
                n.this.f20980q.a(this.f20982m.getAdapter().getItem(i10).longValue());
            }
        }
    }

    public static class b extends RecyclerView.d0 {

        /* renamed from: t, reason: collision with root package name */
        final TextView f20984t;

        /* renamed from: u, reason: collision with root package name */
        final MaterialCalendarGridView f20985u;

        b(LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(c5.f.f4757t);
            this.f20984t = textView;
            w.p0(textView, true);
            this.f20985u = (MaterialCalendarGridView) linearLayout.findViewById(c5.f.f4753p);
            if (z10) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    n(Context context, d dVar, com.google.android.material.datepicker.a aVar, h.l lVar) {
        l lVarM = aVar.m();
        l lVarG = aVar.g();
        l lVarJ = aVar.j();
        if (lVarM.compareTo(lVarJ) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (lVarJ.compareTo(lVarG) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f20981r = (m.f20972r * h.a2(context)) + (i.r2(context) ? h.a2(context) : 0);
        this.f20978o = aVar;
        this.f20979p = dVar;
        this.f20980q = lVar;
        y(true);
    }

    l B(int i10) {
        return this.f20978o.m().z(i10);
    }

    CharSequence C(int i10) {
        return B(i10).x();
    }

    int D(l lVar) {
        return this.f20978o.m().A(lVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void p(b bVar, int i10) {
        l lVarZ = this.f20978o.m().z(i10);
        bVar.f20984t.setText(lVarZ.x());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f20985u.findViewById(c5.f.f4753p);
        if (materialCalendarGridView.getAdapter() == null || !lVarZ.equals(materialCalendarGridView.getAdapter().f20973m)) {
            m mVar = new m(lVarZ, this.f20979p, this.f20978o);
            materialCalendarGridView.setNumColumns(lVarZ.f20968p);
            materialCalendarGridView.setAdapter((ListAdapter) mVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().m(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public b r(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(c5.h.f4779n, viewGroup, false);
        if (!i.r2(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.p(-1, this.f20981r));
        return new b(linearLayout, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int c() {
        return this.f20978o.h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long e(int i10) {
        return this.f20978o.m().z(i10).y();
    }
}
