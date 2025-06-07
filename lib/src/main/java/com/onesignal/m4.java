package com.onesignal;

/* loaded from: classes.dex */
class m4 extends h4 {
    m4(String str, boolean z10) {
        super("sms" + str, z10);
    }

    @Override // com.onesignal.h4
    protected void a() {
    }

    @Override // com.onesignal.h4
    h4 p(String str) {
        return new m4(str, false);
    }
}
