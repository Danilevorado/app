package d5;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import q.g;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final g f22937a = new g();

    /* renamed from: b, reason: collision with root package name */
    private final g f22938b = new g();

    private static void a(d dVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            dVar.g(objectAnimator.getPropertyName(), objectAnimator.getValues());
            dVar.h(objectAnimator.getPropertyName(), e.b(objectAnimator));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    public static d b(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return c(context, resourceId);
    }

    public static d c(Context context, int i10) throws Resources.NotFoundException {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i10);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return d(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return d(arrayList);
        } catch (Exception e5) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i10), e5);
            return null;
        }
    }

    private static d d(List list) {
        d dVar = new d();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            a(dVar, (Animator) list.get(i10));
        }
        return dVar;
    }

    public e e(String str) {
        if (f(str)) {
            return (e) this.f22937a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return this.f22937a.equals(((d) obj).f22937a);
        }
        return false;
    }

    public boolean f(String str) {
        return this.f22937a.get(str) != null;
    }

    public void g(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f22938b.put(str, propertyValuesHolderArr);
    }

    public void h(String str, e eVar) {
        this.f22937a.put(str, eVar);
    }

    public int hashCode() {
        return this.f22937a.hashCode();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f22937a + "}\n";
    }
}
