package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.w;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class k extends androidx.core.view.a {

    /* renamed from: d, reason: collision with root package name */
    final RecyclerView f3575d;

    /* renamed from: e, reason: collision with root package name */
    private final a f3576e;

    public static class a extends androidx.core.view.a {

        /* renamed from: d, reason: collision with root package name */
        final k f3577d;

        /* renamed from: e, reason: collision with root package name */
        private Map f3578e = new WeakHashMap();

        public a(k kVar) {
            this.f3577d = kVar;
        }

        @Override // androidx.core.view.a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = (androidx.core.view.a) this.f3578e.get(view);
            return aVar != null ? aVar.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public androidx.core.view.accessibility.e b(View view) {
            androidx.core.view.a aVar = (androidx.core.view.a) this.f3578e.get(view);
            return aVar != null ? aVar.b(view) : super.b(view);
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = (androidx.core.view.a) this.f3578e.get(view);
            if (aVar != null) {
                aVar.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.accessibility.d dVar) {
            if (!this.f3577d.o() && this.f3577d.f3575d.getLayoutManager() != null) {
                this.f3577d.f3575d.getLayoutManager().O0(view, dVar);
                androidx.core.view.a aVar = (androidx.core.view.a) this.f3578e.get(view);
                if (aVar != null) {
                    aVar.g(view, dVar);
                    return;
                }
            }
            super.g(view, dVar);
        }

        @Override // androidx.core.view.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = (androidx.core.view.a) this.f3578e.get(view);
            if (aVar != null) {
                aVar.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = (androidx.core.view.a) this.f3578e.get(viewGroup);
            return aVar != null ? aVar.i(viewGroup, view, accessibilityEvent) : super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (this.f3577d.o() || this.f3577d.f3575d.getLayoutManager() == null) {
                return super.j(view, i10, bundle);
            }
            androidx.core.view.a aVar = (androidx.core.view.a) this.f3578e.get(view);
            if (aVar != null) {
                if (aVar.j(view, i10, bundle)) {
                    return true;
                }
            } else if (super.j(view, i10, bundle)) {
                return true;
            }
            return this.f3577d.f3575d.getLayoutManager().i1(view, i10, bundle);
        }

        @Override // androidx.core.view.a
        public void l(View view, int i10) {
            androidx.core.view.a aVar = (androidx.core.view.a) this.f3578e.get(view);
            if (aVar != null) {
                aVar.l(view, i10);
            } else {
                super.l(view, i10);
            }
        }

        @Override // androidx.core.view.a
        public void m(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = (androidx.core.view.a) this.f3578e.get(view);
            if (aVar != null) {
                aVar.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        androidx.core.view.a n(View view) {
            return (androidx.core.view.a) this.f3578e.remove(view);
        }

        void o(View view) {
            androidx.core.view.a aVarL = w.l(view);
            if (aVarL == null || aVarL == this) {
                return;
            }
            this.f3578e.put(view, aVarL);
        }
    }

    public k(RecyclerView recyclerView) {
        this.f3575d = recyclerView;
        androidx.core.view.a aVarN = n();
        this.f3576e = (aVarN == null || !(aVarN instanceof a)) ? new a(this) : (a) aVarN;
    }

    @Override // androidx.core.view.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().K0(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.a
    public void g(View view, androidx.core.view.accessibility.d dVar) {
        super.g(view, dVar);
        if (o() || this.f3575d.getLayoutManager() == null) {
            return;
        }
        this.f3575d.getLayoutManager().M0(dVar);
    }

    @Override // androidx.core.view.a
    public boolean j(View view, int i10, Bundle bundle) {
        if (super.j(view, i10, bundle)) {
            return true;
        }
        if (o() || this.f3575d.getLayoutManager() == null) {
            return false;
        }
        return this.f3575d.getLayoutManager().g1(i10, bundle);
    }

    public androidx.core.view.a n() {
        return this.f3576e;
    }

    boolean o() {
        return this.f3575d.m0();
    }
}
