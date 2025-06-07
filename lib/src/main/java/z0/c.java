package z0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* loaded from: classes.dex */
public class c extends l {
    private static final String[] Y = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property Z = new b(PointF.class, "boundsOrigin");

    /* renamed from: a0, reason: collision with root package name */
    private static final Property f28630a0 = new C0217c(PointF.class, "topLeft");

    /* renamed from: b0, reason: collision with root package name */
    private static final Property f28631b0 = new d(PointF.class, "bottomRight");

    /* renamed from: c0, reason: collision with root package name */
    private static final Property f28632c0 = new e(PointF.class, "bottomRight");

    /* renamed from: d0, reason: collision with root package name */
    private static final Property f28633d0 = new f(PointF.class, "topLeft");

    /* renamed from: e0, reason: collision with root package name */
    private static final Property f28634e0 = new g(PointF.class, "position");

    /* renamed from: f0, reason: collision with root package name */
    private static z0.j f28635f0 = new z0.j();
    private int[] V = new int[2];
    private boolean W = false;
    private boolean X = false;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f28636a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ BitmapDrawable f28637b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f28638c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f28639d;

        a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f5) {
            this.f28636a = viewGroup;
            this.f28637b = bitmapDrawable;
            this.f28638c = view;
            this.f28639d = f5;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            y.b(this.f28636a).d(this.f28637b);
            y.g(this.f28638c, this.f28639d);
        }
    }

    static class b extends Property {

        /* renamed from: a, reason: collision with root package name */
        private Rect f28641a;

        b(Class cls, String str) {
            super(cls, str);
            this.f28641a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f28641a);
            Rect rect = this.f28641a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f28641a);
            this.f28641a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f28641a);
        }
    }

    /* renamed from: z0.c$c, reason: collision with other inner class name */
    static class C0217c extends Property {
        C0217c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    static class d extends Property {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    static class e extends Property {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            y.f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    static class f extends Property {
        f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            y.f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    static class g extends Property {
        g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            y.f(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    class h extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f28642a;
        private k mViewBounds;

        h(k kVar) {
            this.f28642a = kVar;
            this.mViewBounds = kVar;
        }
    }

    class i extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f28644a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f28645b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Rect f28646c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f28647d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f28648e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f28649f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f28650g;

        i(View view, Rect rect, int i10, int i11, int i12, int i13) {
            this.f28645b = view;
            this.f28646c = rect;
            this.f28647d = i10;
            this.f28648e = i11;
            this.f28649f = i12;
            this.f28650g = i13;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f28644a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f28644a) {
                return;
            }
            androidx.core.view.w.v0(this.f28645b, this.f28646c);
            y.f(this.f28645b, this.f28647d, this.f28648e, this.f28649f, this.f28650g);
        }
    }

    class j extends m {

        /* renamed from: a, reason: collision with root package name */
        boolean f28652a = false;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f28653b;

        j(ViewGroup viewGroup) {
            this.f28653b = viewGroup;
        }

        @Override // z0.m, z0.l.f
        public void a(l lVar) {
            v.c(this.f28653b, false);
            this.f28652a = true;
        }

        @Override // z0.l.f
        public void c(l lVar) {
            if (!this.f28652a) {
                v.c(this.f28653b, false);
            }
            lVar.W(this);
        }

        @Override // z0.m, z0.l.f
        public void d(l lVar) {
            v.c(this.f28653b, true);
        }

        @Override // z0.m, z0.l.f
        public void e(l lVar) {
            v.c(this.f28653b, false);
        }
    }

    private static class k {

        /* renamed from: a, reason: collision with root package name */
        private int f28655a;

        /* renamed from: b, reason: collision with root package name */
        private int f28656b;

        /* renamed from: c, reason: collision with root package name */
        private int f28657c;

        /* renamed from: d, reason: collision with root package name */
        private int f28658d;

        /* renamed from: e, reason: collision with root package name */
        private View f28659e;

        /* renamed from: f, reason: collision with root package name */
        private int f28660f;

        /* renamed from: g, reason: collision with root package name */
        private int f28661g;

        k(View view) {
            this.f28659e = view;
        }

        private void b() {
            y.f(this.f28659e, this.f28655a, this.f28656b, this.f28657c, this.f28658d);
            this.f28660f = 0;
            this.f28661g = 0;
        }

        void a(PointF pointF) {
            this.f28657c = Math.round(pointF.x);
            this.f28658d = Math.round(pointF.y);
            int i10 = this.f28661g + 1;
            this.f28661g = i10;
            if (this.f28660f == i10) {
                b();
            }
        }

        void c(PointF pointF) {
            this.f28655a = Math.round(pointF.x);
            this.f28656b = Math.round(pointF.y);
            int i10 = this.f28660f + 1;
            this.f28660f = i10;
            if (i10 == this.f28661g) {
                b();
            }
        }
    }

    private void j0(r rVar) {
        View view = rVar.f28739b;
        if (!androidx.core.view.w.S(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        rVar.f28738a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        rVar.f28738a.put("android:changeBounds:parent", rVar.f28739b.getParent());
        if (this.X) {
            rVar.f28739b.getLocationInWindow(this.V);
            rVar.f28738a.put("android:changeBounds:windowX", Integer.valueOf(this.V[0]));
            rVar.f28738a.put("android:changeBounds:windowY", Integer.valueOf(this.V[1]));
        }
        if (this.W) {
            rVar.f28738a.put("android:changeBounds:clip", androidx.core.view.w.u(view));
        }
    }

    private boolean k0(View view, View view2) {
        if (!this.X) {
            return true;
        }
        r rVarA = A(view, true);
        if (rVarA == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == rVarA.f28739b) {
            return true;
        }
        return false;
    }

    @Override // z0.l
    public String[] K() {
        return Y;
    }

    @Override // z0.l
    public void i(r rVar) {
        j0(rVar);
    }

    @Override // z0.l
    public void m(r rVar) {
        j0(rVar);
    }

    @Override // z0.l
    public Animator u(ViewGroup viewGroup, r rVar, r rVar2) {
        int i10;
        View view;
        int i11;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator animatorC;
        Path pathA;
        Property property;
        if (rVar == null || rVar2 == null) {
            return null;
        }
        Map map = rVar.f28738a;
        Map map2 = rVar2.f28738a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = rVar2.f28739b;
        if (!k0(viewGroup2, viewGroup3)) {
            int iIntValue = ((Integer) rVar.f28738a.get("android:changeBounds:windowX")).intValue();
            int iIntValue2 = ((Integer) rVar.f28738a.get("android:changeBounds:windowY")).intValue();
            int iIntValue3 = ((Integer) rVar2.f28738a.get("android:changeBounds:windowX")).intValue();
            int iIntValue4 = ((Integer) rVar2.f28738a.get("android:changeBounds:windowY")).intValue();
            if (iIntValue == iIntValue3 && iIntValue2 == iIntValue4) {
                return null;
            }
            viewGroup.getLocationInWindow(this.V);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
            view2.draw(new Canvas(bitmapCreateBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            float fC = y.c(view2);
            y.g(view2, 0.0f);
            y.b(viewGroup).b(bitmapDrawable);
            z0.g gVarC = C();
            int[] iArr = this.V;
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, z0.h.a(Z, gVarC.a(iIntValue - iArr[0], iIntValue2 - iArr[1], iIntValue3 - iArr[0], iIntValue4 - iArr[1])));
            objectAnimatorOfPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, fC));
            return objectAnimatorOfPropertyValuesHolder;
        }
        Rect rect2 = (Rect) rVar.f28738a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) rVar2.f28738a.get("android:changeBounds:bounds");
        int i12 = rect2.left;
        int i13 = rect3.left;
        int i14 = rect2.top;
        int i15 = rect3.top;
        int i16 = rect2.right;
        int i17 = rect3.right;
        int i18 = rect2.bottom;
        int i19 = rect3.bottom;
        int i20 = i16 - i12;
        int i21 = i18 - i14;
        int i22 = i17 - i13;
        int i23 = i19 - i15;
        Rect rect4 = (Rect) rVar.f28738a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) rVar2.f28738a.get("android:changeBounds:clip");
        if ((i20 == 0 || i21 == 0) && (i22 == 0 || i23 == 0)) {
            i10 = 0;
        } else {
            i10 = (i12 == i13 && i14 == i15) ? 0 : 1;
            if (i16 != i17 || i18 != i19) {
                i10++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i10++;
        }
        if (i10 <= 0) {
            return null;
        }
        if (this.W) {
            view = view2;
            y.f(view, i12, i14, Math.max(i20, i22) + i12, Math.max(i21, i23) + i14);
            ObjectAnimator objectAnimatorA = (i12 == i13 && i14 == i15) ? null : z0.f.a(view, f28634e0, C().a(i12, i14, i13, i15));
            if (rect4 == null) {
                i11 = 0;
                rect = new Rect(0, 0, i20, i21);
            } else {
                i11 = 0;
                rect = rect4;
            }
            Rect rect6 = rect5 == null ? new Rect(i11, i11, i22, i23) : rect5;
            if (rect.equals(rect6)) {
                objectAnimator = null;
            } else {
                androidx.core.view.w.v0(view, rect);
                z0.j jVar = f28635f0;
                Object[] objArr = new Object[2];
                objArr[i11] = rect;
                objArr[1] = rect6;
                ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", jVar, objArr);
                objectAnimatorOfObject.addListener(new i(view, rect5, i13, i15, i17, i19));
                objectAnimator = objectAnimatorOfObject;
            }
            animatorC = q.c(objectAnimatorA, objectAnimator);
        } else {
            view = view2;
            y.f(view, i12, i14, i16, i18);
            if (i10 == 2) {
                if (i20 == i22 && i21 == i23) {
                    pathA = C().a(i12, i14, i13, i15);
                    property = f28634e0;
                } else {
                    k kVar = new k(view);
                    ObjectAnimator objectAnimatorA2 = z0.f.a(kVar, f28630a0, C().a(i12, i14, i13, i15));
                    ObjectAnimator objectAnimatorA3 = z0.f.a(kVar, f28631b0, C().a(i16, i18, i17, i19));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                    animatorSet.addListener(new h(kVar));
                    animatorC = animatorSet;
                }
            } else if (i12 == i13 && i14 == i15) {
                pathA = C().a(i16, i18, i17, i19);
                property = f28632c0;
            } else {
                pathA = C().a(i12, i14, i13, i15);
                property = f28633d0;
            }
            animatorC = z0.f.a(view, property, pathA);
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            v.c(viewGroup4, true);
            a(new j(viewGroup4));
        }
        return animatorC;
    }
}
