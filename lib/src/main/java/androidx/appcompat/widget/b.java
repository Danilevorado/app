package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
class b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    final ActionBarContainer f1100a;

    private static class a {
        public static void a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public b(ActionBarContainer actionBarContainer) {
        this.f1100a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f1100a;
        if (actionBarContainer.f926t) {
            Drawable drawable = actionBarContainer.f925s;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f923q;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f1100a;
        Drawable drawable3 = actionBarContainer2.f924r;
        if (drawable3 == null || !actionBarContainer2.f927u) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f1100a;
        if (!actionBarContainer.f926t) {
            drawable = actionBarContainer.f923q;
            if (drawable == null) {
                return;
            }
        } else if (actionBarContainer.f925s == null) {
            return;
        } else {
            drawable = actionBarContainer.f923q;
        }
        a.a(drawable, outline);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
