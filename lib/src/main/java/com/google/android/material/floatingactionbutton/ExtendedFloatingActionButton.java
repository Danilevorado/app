package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.w;
import c5.j;
import c5.k;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
    private static final int F = j.f4812m;
    static final Property G = new a(Float.class, "width");
    static final Property H = new b(Float.class, "height");
    static final Property I = new c(Float.class, "paddingStart");
    static final Property J = new d(Float.class, "paddingEnd");

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c {

        /* renamed from: a, reason: collision with root package name */
        private Rect f20996a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f20997b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f20998c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f20997b = false;
            this.f20998c = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f5008y1);
            this.f20997b = typedArrayObtainStyledAttributes.getBoolean(k.f5016z1, false);
            this.f20998c = typedArrayObtainStyledAttributes.getBoolean(k.A1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        private static boolean G(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).e() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean J(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            throw null;
        }

        private boolean L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!J(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f20996a == null) {
                this.f20996a = new Rect();
            }
            Rect rect = this.f20996a;
            com.google.android.material.internal.c.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                K(extendedFloatingActionButton);
                return true;
            }
            E(extendedFloatingActionButton);
            return true;
        }

        private boolean M(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (J(view, extendedFloatingActionButton)) {
                throw null;
            }
            return false;
        }

        protected void E(ExtendedFloatingActionButton extendedFloatingActionButton) {
            ExtendedFloatingActionButton.l(extendedFloatingActionButton, this.f20998c ? ExtendedFloatingActionButton.m(extendedFloatingActionButton) : ExtendedFloatingActionButton.n(extendedFloatingActionButton), null);
        }

        public boolean F(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        public boolean H(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (!G(view)) {
                return false;
            }
            M(view, extendedFloatingActionButton);
            return false;
        }

        public boolean I(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i10) {
            List listR = coordinatorLayout.r(extendedFloatingActionButton);
            int size = listR.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = (View) listR.get(i11);
                if (!(view instanceof AppBarLayout)) {
                    if (G(view) && M(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.I(extendedFloatingActionButton, i10);
            return true;
        }

        protected void K(ExtendedFloatingActionButton extendedFloatingActionButton) {
            ExtendedFloatingActionButton.l(extendedFloatingActionButton, this.f20998c ? ExtendedFloatingActionButton.j(extendedFloatingActionButton) : ExtendedFloatingActionButton.k(extendedFloatingActionButton), null);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean b(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            a5.a.a(view);
            return F(coordinatorLayout, null, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void g(CoordinatorLayout.f fVar) {
            if (fVar.f2002h == 0) {
                fVar.f2002h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            a5.a.a(view);
            return H(coordinatorLayout, null, view2);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            a5.a.a(view);
            return I(coordinatorLayout, null, i10);
        }
    }

    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f5) {
            view.getLayoutParams().width = f5.intValue();
            view.requestLayout();
        }
    }

    class b extends Property {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f5) {
            view.getLayoutParams().height = f5.intValue();
            view.requestLayout();
        }
    }

    class c extends Property {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(w.G(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f5) {
            w.B0(view, f5.intValue(), view.getPaddingTop(), w.F(view), view.getPaddingBottom());
        }
    }

    class d extends Property {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(w.F(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f5) {
            w.B0(view, w.G(view), view.getPaddingTop(), f5.intValue(), view.getPaddingBottom());
        }
    }

    public static abstract class e {
    }

    static /* synthetic */ com.google.android.material.floatingactionbutton.a j(ExtendedFloatingActionButton extendedFloatingActionButton) {
        throw null;
    }

    static /* synthetic */ com.google.android.material.floatingactionbutton.a k(ExtendedFloatingActionButton extendedFloatingActionButton) {
        throw null;
    }

    static /* synthetic */ void l(ExtendedFloatingActionButton extendedFloatingActionButton, com.google.android.material.floatingactionbutton.a aVar, e eVar) {
        throw null;
    }

    static /* synthetic */ com.google.android.material.floatingactionbutton.a m(ExtendedFloatingActionButton extendedFloatingActionButton) {
        throw null;
    }

    static /* synthetic */ com.google.android.material.floatingactionbutton.a n(ExtendedFloatingActionButton extendedFloatingActionButton) {
        throw null;
    }
}
