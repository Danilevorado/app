package na;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

/* loaded from: classes2.dex */
public class b extends c {
    @Override // na.c
    public Animation c(View view) {
        return new TranslateAnimation(0.0f, 0.0f, 0.0f, view.getHeight());
    }

    @Override // na.c
    public Animation d(View view) {
        return new TranslateAnimation(0.0f, 0.0f, view.getHeight(), 0.0f);
    }
}
