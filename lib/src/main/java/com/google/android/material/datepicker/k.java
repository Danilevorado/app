package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class k<S> extends p {

    /* renamed from: o0, reason: collision with root package name */
    private int f20961o0;

    /* renamed from: p0, reason: collision with root package name */
    private d f20962p0;

    /* renamed from: q0, reason: collision with root package name */
    private com.google.android.material.datepicker.a f20963q0;

    class a extends o {
        a() {
        }

        @Override // com.google.android.material.datepicker.o
        public void a(Object obj) {
            Iterator it = k.this.f20986n0.iterator();
            while (it.hasNext()) {
                ((o) it.next()).a(obj);
            }
        }
    }

    static k N1(d dVar, int i10, com.google.android.material.datepicker.a aVar) {
        k kVar = new k();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("DATE_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        kVar.B1(bundle);
        return kVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void P0(Bundle bundle) {
        super.P0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f20961o0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f20962p0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f20963q0);
    }

    @Override // androidx.fragment.app.Fragment
    public void t0(Bundle bundle) {
        super.t0(bundle);
        if (bundle == null) {
            bundle = t();
        }
        this.f20961o0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f20962p0 = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f20963q0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f20962p0.u(layoutInflater.cloneInContext(new ContextThemeWrapper(v(), this.f20961o0)), viewGroup, bundle, this.f20963q0, new a());
    }
}
