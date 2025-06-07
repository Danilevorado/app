package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.h;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
class t extends RecyclerView.g {

    /* renamed from: o, reason: collision with root package name */
    private final h f20992o;

    class a implements View.OnClickListener {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f20993m;

        a(int i10) {
            this.f20993m = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t.this.f20992o.f2(t.this.f20992o.W1().e(l.d(this.f20993m, t.this.f20992o.Y1().f20966n)));
            t.this.f20992o.g2(h.k.DAY);
        }
    }

    public static class b extends RecyclerView.d0 {

        /* renamed from: t, reason: collision with root package name */
        final TextView f20995t;

        b(TextView textView) {
            super(textView);
            this.f20995t = textView;
        }
    }

    t(h hVar) {
        this.f20992o = hVar;
    }

    private View.OnClickListener B(int i10) {
        return new a(i10);
    }

    int C(int i10) {
        return i10 - this.f20992o.W1().m().f20967o;
    }

    int D(int i10) {
        return this.f20992o.W1().m().f20967o + i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void p(b bVar, int i10) {
        int iD = D(i10);
        String string = bVar.f20995t.getContext().getString(c5.i.f4794k);
        bVar.f20995t.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(iD)));
        bVar.f20995t.setContentDescription(String.format(string, Integer.valueOf(iD)));
        c cVarX1 = this.f20992o.X1();
        Calendar calendarI = s.i();
        com.google.android.material.datepicker.b bVar2 = calendarI.get(1) == iD ? cVarX1.f20912f : cVarX1.f20910d;
        Iterator it = this.f20992o.Z1().q().iterator();
        while (it.hasNext()) {
            calendarI.setTimeInMillis(((Long) it.next()).longValue());
            if (calendarI.get(1) == iD) {
                bVar2 = cVarX1.f20911e;
            }
        }
        bVar2.d(bVar.f20995t);
        bVar.f20995t.setOnClickListener(B(iD));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public b r(ViewGroup viewGroup, int i10) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(c5.h.f4781p, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int c() {
        return this.f20992o.W1().r();
    }
}
