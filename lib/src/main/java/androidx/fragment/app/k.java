package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
class k implements LayoutInflater.Factory2 {

    /* renamed from: m, reason: collision with root package name */
    final m f2860m;

    class a implements View.OnAttachStateChangeListener {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ t f2861m;

        a(t tVar) {
            this.f2861m = tVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment fragmentK = this.f2861m.k();
            this.f2861m.m();
            b0.n((ViewGroup) fragmentK.T.getParent(), k.this.f2860m).j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    k(m mVar) {
        this.f2860m = mVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        t tVarV;
        StringBuilder sb2;
        String str2;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f2860m);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j0.c.f24369d);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(j0.c.f24370e);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(j0.c.f24371f, -1);
        String string = typedArrayObtainStyledAttributes.getString(j0.c.f24372g);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !i.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment fragmentH0 = resourceId != -1 ? this.f2860m.h0(resourceId) : null;
        if (fragmentH0 == null && string != null) {
            fragmentH0 = this.f2860m.i0(string);
        }
        if (fragmentH0 == null && id != -1) {
            fragmentH0 = this.f2860m.h0(id);
        }
        if (fragmentH0 == null) {
            fragmentH0 = this.f2860m.q0().a(context.getClassLoader(), attributeValue);
            fragmentH0.f2685z = true;
            fragmentH0.I = resourceId != 0 ? resourceId : id;
            fragmentH0.J = id;
            fragmentH0.K = string;
            fragmentH0.A = true;
            m mVar = this.f2860m;
            fragmentH0.E = mVar;
            fragmentH0.F = mVar.t0();
            fragmentH0.F0(this.f2860m.t0().h(), attributeSet, fragmentH0.f2673n);
            tVarV = this.f2860m.g(fragmentH0);
            if (m.F0(2)) {
                sb2 = new StringBuilder();
                sb2.append("Fragment ");
                sb2.append(fragmentH0);
                str2 = " has been inflated via the <fragment> tag: id=0x";
                sb2.append(str2);
                sb2.append(Integer.toHexString(resourceId));
                Log.v("FragmentManager", sb2.toString());
            }
        } else {
            if (fragmentH0.A) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            fragmentH0.A = true;
            m mVar2 = this.f2860m;
            fragmentH0.E = mVar2;
            fragmentH0.F = mVar2.t0();
            fragmentH0.F0(this.f2860m.t0().h(), attributeSet, fragmentH0.f2673n);
            tVarV = this.f2860m.v(fragmentH0);
            if (m.F0(2)) {
                sb2 = new StringBuilder();
                sb2.append("Retained Fragment ");
                sb2.append(fragmentH0);
                str2 = " has been re-attached via the <fragment> tag: id=0x";
                sb2.append(str2);
                sb2.append(Integer.toHexString(resourceId));
                Log.v("FragmentManager", sb2.toString());
            }
        }
        fragmentH0.S = (ViewGroup) view;
        tVarV.m();
        tVarV.j();
        View view2 = fragmentH0.T;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (fragmentH0.T.getTag() == null) {
            fragmentH0.T.setTag(string);
        }
        fragmentH0.T.addOnAttachStateChangeListener(new a(tVarV));
        return fragmentH0.T;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
