package m8;

import com.google.firebase.messaging.FirebaseMessaging;
import k9.h;

/* loaded from: classes2.dex */
public class a implements y8.a {
    @Override // y8.a
    public boolean a() {
        try {
            int i10 = FirebaseMessaging.f21392s;
            return false;
        } catch (ClassNotFoundException e5) {
            h.k("You must add \"implementation 'com.google.firebase:firebase-messaging:+'\" line to your app build.gradle.\nCheck documentation for more info https://goo.gl/UVJKfp");
            throw new IllegalStateException("You must add \"implementation 'com.google.firebase:firebase-messaging:+'\" line to your app build.gradle.\nCheck documentation for more info https://goo.gl/UVJKfp", e5);
        }
    }
}
