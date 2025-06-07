package com.google.firebase.messaging;

import androidx.annotation.Keep;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements x5.i {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(x5.e eVar) {
        return new FirebaseMessaging((v5.d) eVar.a(v5.d.class), (g6.a) eVar.a(g6.a.class), eVar.c(q6.i.class), eVar.c(f6.k.class), (i6.d) eVar.a(i6.d.class), (p2.g) eVar.a(p2.g.class), (e6.d) eVar.a(e6.d.class));
    }

    @Override // x5.i
    @Keep
    public List<x5.d> getComponents() {
        return Arrays.asList(x5.d.c(FirebaseMessaging.class).b(x5.q.i(v5.d.class)).b(x5.q.g(g6.a.class)).b(x5.q.h(q6.i.class)).b(x5.q.h(f6.k.class)).b(x5.q.g(p2.g.class)).b(x5.q.i(i6.d.class)).b(x5.q.i(e6.d.class)).f(new x5.h() { // from class: com.google.firebase.messaging.a0
            @Override // x5.h
            public final Object a(x5.e eVar) {
                return FirebaseMessagingRegistrar.lambda$getComponents$0(eVar);
            }
        }).c().d(), q6.h.b("fire-fcm", "23.0.7"));
    }
}
