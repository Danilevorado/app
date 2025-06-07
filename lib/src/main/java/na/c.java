package na;

import android.view.View;
import android.view.animation.Animation;

/* loaded from: classes2.dex */
public abstract class c implements a {
    @Override // na.a
    public void a(View view, View view2) {
        Animation animationD = d(view2);
        if (animationD != null) {
            animationD.setDuration(300L);
            if (view != null) {
                view.startAnimation(animationD);
            }
        }
    }

    @Override // na.a
    public void b(View view, View view2, Animation.AnimationListener animationListener) {
        Animation animationC = c(view2);
        if (animationC != null) {
            animationC.setDuration(300L);
            animationC.setAnimationListener(animationListener);
            view.startAnimation(animationC);
        }
    }

    abstract Animation c(View view);

    abstract Animation d(View view);
}
