package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
public abstract class yu2 {
    public static yu2 a(zu2 zu2Var, av2 av2Var) {
        if (wu2.b()) {
            return new cv2(zu2Var, av2Var);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public abstract void b(View view, ev2 ev2Var, String str);

    public abstract void c();

    public abstract void d(View view);

    public abstract void e();
}
