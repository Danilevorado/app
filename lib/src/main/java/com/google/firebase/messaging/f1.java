package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.firebase.messaging.i1;

/* loaded from: classes.dex */
class f1 extends Binder {

    /* renamed from: m, reason: collision with root package name */
    private final a f21484m;

    interface a {
        b5.i a(Intent intent);
    }

    f1(a aVar) {
        this.f21484m = aVar;
    }

    void c(final i1.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        this.f21484m.a(aVar.f21509a).c(h.f21489m, new b5.d() { // from class: com.google.firebase.messaging.e1
            @Override // b5.d
            public final void a(b5.i iVar) {
                aVar.d();
            }
        });
    }
}
