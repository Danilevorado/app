package com.pushwoosh.firebase;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.n0;
import h8.b;

/* loaded from: classes2.dex */
public class PushFcmIntentService extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void q(n0 n0Var) {
        super.q(n0Var);
        b.b(getApplicationContext(), n0Var);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void s(String str) {
        super.s(str);
        b.c(str);
    }
}
