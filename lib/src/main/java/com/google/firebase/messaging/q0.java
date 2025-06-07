package com.google.firebase.messaging;

import android.util.Log;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class q0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f21559a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f21560b = new q.a();

    interface a {
        b5.i start();
    }

    q0(Executor executor) {
        this.f21559a = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ b5.i c(String str, b5.i iVar) {
        synchronized (this) {
            this.f21560b.remove(str);
        }
        return iVar;
    }

    synchronized b5.i b(final String str, a aVar) {
        b5.i iVar = (b5.i) this.f21560b.get(str);
        if (iVar != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return iVar;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        b5.i iVarH = aVar.start().h(this.f21559a, new b5.a() { // from class: com.google.firebase.messaging.p0
            @Override // b5.a
            public final Object a(b5.i iVar2) {
                return this.f21556a.c(str, iVar2);
            }
        });
        this.f21560b.put(str, iVarH);
        return iVarH;
    }
}
