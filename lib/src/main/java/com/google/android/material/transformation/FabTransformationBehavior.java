package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.w;
import d5.c;
import d5.d;
import d5.e;
import d5.f;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c, reason: collision with root package name */
    private final Rect f21323c;

    /* renamed from: d, reason: collision with root package name */
    private final RectF f21324d;

    /* renamed from: e, reason: collision with root package name */
    private final RectF f21325e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f21326f;

    /* renamed from: g, reason: collision with root package name */
    private float f21327g;

    /* renamed from: h, reason: collision with root package name */
    private float f21328h;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f21329a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f21330b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f21331c;

        a(boolean z10, View view, View view2) {
            this.f21329a = z10;
            this.f21330b = view;
            this.f21331c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f21329a) {
                return;
            }
            this.f21330b.setVisibility(4);
            this.f21331c.setAlpha(1.0f);
            this.f21331c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f21329a) {
                this.f21330b.setVisibility(0);
                this.f21331c.setAlpha(0.0f);
                this.f21331c.setVisibility(4);
            }
        }
    }

    protected static class b {

        /* renamed from: a, reason: collision with root package name */
        public d f21333a;

        /* renamed from: b, reason: collision with root package name */
        public f f21334b;

        protected b() {
        }
    }

    public FabTransformationBehavior() {
        this.f21323c = new Rect();
        this.f21324d = new RectF();
        this.f21325e = new RectF();
        this.f21326f = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21323c = new Rect();
        this.f21324d = new RectF();
        this.f21325e = new RectF();
        this.f21326f = new int[2];
    }

    private ViewGroup K(View view) {
        View viewFindViewById = view.findViewById(c5.f.A);
        return viewFindViewById != null ? a0(viewFindViewById) : a0(view);
    }

    private void L(View view, b bVar, e eVar, e eVar2, float f5, float f10, float f11, float f12, RectF rectF) {
        float fQ = Q(bVar, eVar, f5, f11);
        float fQ2 = Q(bVar, eVar2, f10, f12);
        Rect rect = this.f21323c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f21324d;
        rectF2.set(rect);
        RectF rectF3 = this.f21325e;
        R(view, rectF3);
        rectF3.offset(fQ, fQ2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private void M(View view, RectF rectF) {
        R(view, rectF);
        rectF.offset(this.f21327g, this.f21328h);
    }

    private Pair N(float f5, float f10, boolean z10, b bVar) {
        e eVarE;
        d dVar;
        String str;
        if (f5 == 0.0f || f10 == 0.0f) {
            eVarE = bVar.f21333a.e("translationXLinear");
            dVar = bVar.f21333a;
            str = "translationYLinear";
        } else if ((!z10 || f10 >= 0.0f) && (z10 || f10 <= 0.0f)) {
            eVarE = bVar.f21333a.e("translationXCurveDownwards");
            dVar = bVar.f21333a;
            str = "translationYCurveDownwards";
        } else {
            eVarE = bVar.f21333a.e("translationXCurveUpwards");
            dVar = bVar.f21333a;
            str = "translationYCurveUpwards";
        }
        return new Pair(eVarE, dVar.e(str));
    }

    private float O(View view, View view2, f fVar) {
        float fCenterX;
        float fCenterX2;
        float f5;
        RectF rectF = this.f21324d;
        RectF rectF2 = this.f21325e;
        M(view, rectF);
        R(view2, rectF2);
        int i10 = fVar.f22944a & 7;
        if (i10 == 1) {
            fCenterX = rectF2.centerX();
            fCenterX2 = rectF.centerX();
        } else if (i10 == 3) {
            fCenterX = rectF2.left;
            fCenterX2 = rectF.left;
        } else {
            if (i10 != 5) {
                f5 = 0.0f;
                return f5 + fVar.f22945b;
            }
            fCenterX = rectF2.right;
            fCenterX2 = rectF.right;
        }
        f5 = fCenterX - fCenterX2;
        return f5 + fVar.f22945b;
    }

    private float P(View view, View view2, f fVar) {
        float fCenterY;
        float fCenterY2;
        float f5;
        RectF rectF = this.f21324d;
        RectF rectF2 = this.f21325e;
        M(view, rectF);
        R(view2, rectF2);
        int i10 = fVar.f22944a & 112;
        if (i10 == 16) {
            fCenterY = rectF2.centerY();
            fCenterY2 = rectF.centerY();
        } else if (i10 == 48) {
            fCenterY = rectF2.top;
            fCenterY2 = rectF.top;
        } else {
            if (i10 != 80) {
                f5 = 0.0f;
                return f5 + fVar.f22946c;
            }
            fCenterY = rectF2.bottom;
            fCenterY2 = rectF.bottom;
        }
        f5 = fCenterY - fCenterY2;
        return f5 + fVar.f22946c;
    }

    private float Q(b bVar, e eVar, float f5, float f10) {
        long jC = eVar.c();
        long jD = eVar.d();
        e eVarE = bVar.f21333a.e("expansion");
        return d5.a.a(f5, f10, eVar.e().getInterpolation((((eVarE.c() + eVarE.d()) + 17) - jC) / jD));
    }

    private void R(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f21326f);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    private void S(View view, View view2, boolean z10, boolean z11, b bVar, List list, List list2) {
        ViewGroup viewGroupK;
        ObjectAnimator objectAnimatorOfFloat;
        if ((view2 instanceof ViewGroup) && (viewGroupK = K(view2)) != null) {
            if (z10) {
                if (!z11) {
                    c.f22936a.set(viewGroupK, Float.valueOf(0.0f));
                }
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupK, (Property<ViewGroup, Float>) c.f22936a, 1.0f);
            } else {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupK, (Property<ViewGroup, Float>) c.f22936a, 0.0f);
            }
            bVar.f21333a.e("contentFade").a(objectAnimatorOfFloat);
            list.add(objectAnimatorOfFloat);
        }
    }

    private void T(View view, View view2, boolean z10, boolean z11, b bVar, List list, List list2) {
    }

    private void U(View view, View view2, boolean z10, b bVar, List list) {
        float fO = O(view, view2, bVar.f21334b);
        float fP = P(view, view2, bVar.f21334b);
        Pair pairN = N(fO, fP, z10, bVar);
        e eVar = (e) pairN.first;
        e eVar2 = (e) pairN.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z10) {
            fO = this.f21327g;
        }
        fArr[0] = fO;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z10) {
            fP = this.f21328h;
        }
        fArr2[0] = fP;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        eVar.a(objectAnimatorOfFloat);
        eVar2.a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    private void V(View view, View view2, boolean z10, boolean z11, b bVar, List list, List list2) {
        ObjectAnimator objectAnimatorOfFloat;
        float fW = w.w(view2) - w.w(view);
        if (z10) {
            if (!z11) {
                view2.setTranslationZ(-fW);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -fW);
        }
        bVar.f21333a.e("elevation").a(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    private void W(View view, View view2, boolean z10, boolean z11, b bVar, float f5, float f10, List list, List list2) {
    }

    private void X(View view, View view2, boolean z10, boolean z11, b bVar, List list, List list2) {
    }

    private void Y(View view, View view2, boolean z10, boolean z11, b bVar, List list, List list2, RectF rectF) {
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        float fO = O(view, view2, bVar.f21334b);
        float fP = P(view, view2, bVar.f21334b);
        Pair pairN = N(fO, fP, z10, bVar);
        e eVar = (e) pairN.first;
        e eVar2 = (e) pairN.second;
        if (z10) {
            if (!z11) {
                view2.setTranslationX(-fO);
                view2.setTranslationY(-fP);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            L(view2, bVar, eVar, eVar2, -fO, -fP, 0.0f, 0.0f, rectF);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fO);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fP);
        }
        eVar.a(objectAnimatorOfFloat);
        eVar2.a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    private ViewGroup a0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    protected AnimatorSet J(View view, View view2, boolean z10, boolean z11) {
        b bVarZ = Z(view2.getContext(), z10);
        if (z10) {
            this.f21327g = view.getTranslationX();
            this.f21328h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        V(view, view2, z10, z11, bVarZ, arrayList, arrayList2);
        RectF rectF = this.f21324d;
        Y(view, view2, z10, z11, bVarZ, arrayList, arrayList2, rectF);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        U(view, view2, z10, bVarZ, arrayList);
        X(view, view2, z10, z11, bVarZ, arrayList, arrayList2);
        W(view, view2, z10, z11, bVarZ, fWidth, fHeight, arrayList, arrayList2);
        T(view, view2, z10, z11, bVarZ, arrayList, arrayList2);
        S(view, view2, z10, z11, bVarZ, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        d5.b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z10, view2, view));
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i10));
        }
        return animatorSet;
    }

    protected abstract b Z(Context context, boolean z10);

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        if (fVar.f2002h == 0) {
            fVar.f2002h = 80;
        }
    }
}
