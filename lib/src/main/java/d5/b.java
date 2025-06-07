package d5;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b {
    public static void a(AnimatorSet animatorSet, List list) {
        int size = list.size();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = (Animator) list.get(i10);
            jMax = Math.max(jMax, animator.getStartDelay() + animator.getDuration());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        list.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(list);
    }
}
