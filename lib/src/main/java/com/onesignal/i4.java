package com.onesignal;

/* loaded from: classes.dex */
class i4 extends h4 {
    i4(String str, boolean z10) {
        super("email" + str, z10);
    }

    @Override // com.onesignal.h4
    protected void a() {
    }

    @Override // com.onesignal.h4
    h4 p(String str) {
        return new i4(str, false);
    }
}
