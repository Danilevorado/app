package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class m {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f21520c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static i1 f21521d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f21522a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f21523b = h.f21489m;

    public m(Context context) {
        this.f21522a = context;
    }

    private static b5.i d(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        if (s0.b().e(context)) {
            d1.f(context, e(context, "com.google.firebase.MESSAGING_EVENT"), intent);
        } else {
            e(context, "com.google.firebase.MESSAGING_EVENT").c(intent);
        }
        return b5.l.e(-1);
    }

    private static i1 e(Context context, String str) {
        i1 i1Var;
        synchronized (f21520c) {
            if (f21521d == null) {
                f21521d = new i1(context, str);
            }
            i1Var = f21521d;
        }
        return i1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer f(Context context, Intent intent) {
        return Integer.valueOf(s0.b().g(context, intent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer g(b5.i iVar) {
        return 403;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ b5.i h(Context context, Intent intent, b5.i iVar) {
        return (i4.m.i() && ((Integer) iVar.j()).intValue() == 402) ? d(context, intent).f(h.f21489m, new b5.a() { // from class: com.google.firebase.messaging.k
            @Override // b5.a
            public final Object a(b5.i iVar2) {
                return m.g(iVar2);
            }
        }) : iVar;
    }

    public b5.i i(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return j(this.f21522a, intent);
    }

    public b5.i j(final Context context, final Intent intent) {
        return (!(i4.m.i() && context.getApplicationInfo().targetSdkVersion >= 26) || ((intent.getFlags() & 268435456) != 0)) ? b5.l.c(this.f21523b, new Callable() { // from class: com.google.firebase.messaging.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return m.f(context, intent);
            }
        }).h(this.f21523b, new b5.a() { // from class: com.google.firebase.messaging.j
            @Override // b5.a
            public final Object a(b5.i iVar) {
                return m.h(context, intent, iVar);
            }
        }) : d(context, intent);
    }
}
