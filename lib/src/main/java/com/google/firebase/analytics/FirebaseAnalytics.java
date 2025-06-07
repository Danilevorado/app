package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import b5.l;
import com.google.android.gms.internal.measurement.u2;
import com.google.firebase.installations.c;
import e4.p;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import x4.w;

/* loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* renamed from: b, reason: collision with root package name */
    private static volatile FirebaseAnalytics f21341b;

    /* renamed from: a, reason: collision with root package name */
    private final u2 f21342a;

    public FirebaseAnalytics(u2 u2Var) {
        p.l(u2Var);
        this.f21342a = u2Var;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f21341b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f21341b == null) {
                    f21341b = new FirebaseAnalytics(u2.s(context, null, null, null, null));
                }
            }
        }
        return f21341b;
    }

    @Keep
    public static w getScionFrontendApiImplementation(Context context, Bundle bundle) {
        u2 u2VarS = u2.s(context, null, null, null, bundle);
        if (u2VarS == null) {
            return null;
        }
        return new a(u2VarS);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) l.b(c.n().getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e5) {
            throw new IllegalStateException(e5);
        } catch (ExecutionException e10) {
            throw new IllegalStateException(e10.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f21342a.d(activity, str, str2);
    }
}
