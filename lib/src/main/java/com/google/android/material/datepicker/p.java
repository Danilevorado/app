package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
abstract class p extends Fragment {

    /* renamed from: n0, reason: collision with root package name */
    protected final LinkedHashSet f20986n0 = new LinkedHashSet();

    p() {
    }

    boolean L1(o oVar) {
        return this.f20986n0.add(oVar);
    }

    void M1() {
        this.f20986n0.clear();
    }
}
