package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Map f21009a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Set f21010b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private b f21011c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f21012d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f21013e;

    /* renamed from: com.google.android.material.internal.a$a, reason: collision with other inner class name */
    class C0100a implements h.a {
        C0100a() {
        }

        @Override // com.google.android.material.internal.h.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(h hVar, boolean z10) {
            if (!z10) {
                a aVar = a.this;
                if (!aVar.r(hVar, aVar.f21013e)) {
                    return;
                }
            } else if (!a.this.g(hVar)) {
                return;
            }
            a.this.m();
        }
    }

    public interface b {
        void a(Set set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(h hVar) {
        int id = hVar.getId();
        if (this.f21010b.contains(Integer.valueOf(id))) {
            return false;
        }
        h hVar2 = (h) this.f21009a.get(Integer.valueOf(k()));
        if (hVar2 != null) {
            r(hVar2, false);
        }
        boolean zAdd = this.f21010b.add(Integer.valueOf(id));
        if (!hVar.isChecked()) {
            hVar.setChecked(true);
        }
        return zAdd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        b bVar = this.f21011c;
        if (bVar != null) {
            bVar.a(i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r(h hVar, boolean z10) {
        int id = hVar.getId();
        if (!this.f21010b.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z10 && this.f21010b.size() == 1 && this.f21010b.contains(Integer.valueOf(id))) {
            hVar.setChecked(true);
            return false;
        }
        boolean zRemove = this.f21010b.remove(Integer.valueOf(id));
        if (hVar.isChecked()) {
            hVar.setChecked(false);
        }
        return zRemove;
    }

    public void e(h hVar) {
        this.f21009a.put(Integer.valueOf(hVar.getId()), hVar);
        if (hVar.isChecked()) {
            g(hVar);
        }
        hVar.setInternalOnCheckedChangeListener(new C0100a());
    }

    public void f(int i10) {
        h hVar = (h) this.f21009a.get(Integer.valueOf(i10));
        if (hVar != null && g(hVar)) {
            m();
        }
    }

    public void h() {
        boolean z10 = !this.f21010b.isEmpty();
        Iterator it = this.f21009a.values().iterator();
        while (it.hasNext()) {
            r((h) it.next(), false);
        }
        if (z10) {
            m();
        }
    }

    public Set i() {
        return new HashSet(this.f21010b);
    }

    public List j(ViewGroup viewGroup) {
        Set setI = i();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof h) && setI.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public int k() {
        if (!this.f21012d || this.f21010b.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f21010b.iterator().next()).intValue();
    }

    public boolean l() {
        return this.f21012d;
    }

    public void n(h hVar) {
        hVar.setInternalOnCheckedChangeListener(null);
        this.f21009a.remove(Integer.valueOf(hVar.getId()));
        this.f21010b.remove(Integer.valueOf(hVar.getId()));
    }

    public void o(b bVar) {
        this.f21011c = bVar;
    }

    public void p(boolean z10) {
        this.f21013e = z10;
    }

    public void q(boolean z10) {
        if (this.f21012d != z10) {
            this.f21012d = z10;
            h();
        }
    }
}
