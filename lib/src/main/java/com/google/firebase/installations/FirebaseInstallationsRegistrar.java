package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import f6.j;
import java.util.Arrays;
import java.util.List;
import x5.q;

@Keep
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements x5.i {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i6.d lambda$getComponents$0(x5.e eVar) {
        return new c((v5.d) eVar.a(v5.d.class), eVar.c(j.class));
    }

    @Override // x5.i
    public List<x5.d> getComponents() {
        return Arrays.asList(x5.d.c(i6.d.class).b(q.i(v5.d.class)).b(q.h(j.class)).f(new x5.h() { // from class: i6.e
            @Override // x5.h
            public final Object a(x5.e eVar) {
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(eVar);
            }
        }).d(), f6.i.a(), q6.h.b("fire-installations", "17.0.1"));
    }
}
